// src/GoldPrice.js
import React, { useState, useEffect } from 'react';
import axios from 'axios';

const API_URL = 'https://www.goldapi.io/api/XAU/USD';
const API_KEY = 'goldapi-5t5asm0iiivtt-io'; // Your GoldAPI key

const GoldPrice = () => {
  const [price, setPrice] = useState(null);
  const [error, setError] = useState(null);

  const fetchPrice = async () => {
    try {
      const response = await axios.get(API_URL, {
        headers: {
          'x-access-token': API_KEY,
        },
      });
      setPrice(response.data.price); // Adjust according to the actual response format
    } catch (err) {
      setError('Error fetching data: ' + err.message);
    }
  };

  useEffect(() => {
    fetchPrice();
    const intervalId = setInterval(fetchPrice, 60000); // Fetch price every minute
    return () => clearInterval(intervalId); // Cleanup on unmount
  }, []);

  return (
    <div>
      <h1>Gold Price (XAU/USD)</h1>
      {error && <p style={{ color: 'red' }}>{error}</p>}
      {price !== null ? (
        <p>Current Price: ${price}</p>
      ) : (
        <p>Loading...</p>
      )}
    </div>
  );
};

export default GoldPrice;
