// src/BitcoinPrice.js
import React, { useState, useEffect } from 'react';

const BitcoinPrice = () => {
  const [price, setPrice] = useState(null);
  const [error, setError] = useState(null);

  useEffect(() => {
    // Create a new WebSocket connection
    const ws = new WebSocket('wss://stream.binance.com:9443/ws/btcusdt@trade');

    // WebSocket event handlers
    ws.onmessage = (event) => {
      try {
        const data = JSON.parse(event.data);
        setPrice(data.p); // `data.p` contains the price of the most recent trade
      } catch (err) {
        setError('Error parsing WebSocket message: ' + err.message);
      }
    };

    ws.onerror = (event) => {
      setError('WebSocket error: ' + event.message);
    };

    ws.onclose = () => {
      console.log('WebSocket connection closed');
    };

    // Cleanup function to close WebSocket connection when component unmounts
    return () => {
      ws.close();
    };
  }, []); // Empty dependency array ensures this effect runs only once (on mount)

  return (
    <div>
      <h1>Bitcoin Price (BTC/USDT)</h1>
      {error && <p style={{ color: 'red' }}>{error}</p>}
      {price !== null ? (
        <p>Current Price: ${parseFloat(price).toFixed(2)}</p>
      ) : (
        <p>Loading...</p>
      )}
    </div>
  );
};

export default BitcoinPrice;