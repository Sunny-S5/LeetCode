import React, { useState, useEffect } from 'react';
import { Line } from 'react-chartjs-2';
import { Chart as ChartJS, CategoryScale, LinearScale, LineElement, PointElement, Filler } from 'chart.js';

// Register the required components
ChartJS.register(
  CategoryScale,
  LinearScale,
  LineElement,
  PointElement,
  Filler // Register filler for area chart
);

const BitcoinPrice = () => {
  const [price, setPrice] = useState(null);
  const [error, setError] = useState(null);
  const [priceHistory, setPriceHistory] = useState([]);
  const [timeLabels, setTimeLabels] = useState([]);

  useEffect(() => {
    // Create a new WebSocket connection
    const ws = new WebSocket('wss://stream.binance.com:9443/ws/btcusdt@trade');

    // WebSocket event handlers
    ws.onmessage = (event) => {
      try {
        const data = JSON.parse(event.data);
        const newPrice = parseFloat(data.p);

        // Update price and history
        setPrice(newPrice);
        setPriceHistory((prevHistory) => [...prevHistory, newPrice]);
        setTimeLabels((prevLabels) => [
          ...prevLabels,
          new Date().toLocaleTimeString()
        ]);
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

  const data = {
    labels: timeLabels,
    datasets: [
      {
        label: 'Price',
        data: priceHistory,
        borderColor: 'rgba(255, 0, 0, 1.0)', // Red line
        borderWidth: 2, // Thicker line
        fill: true, // Fill area below the line
        backgroundColor: 'rgba(255, 0, 0, 0.1)', // Light red fill
        pointRadius: 0, // Hide points
      },
    ],
  };

  const options = {
    responsive: true,
    plugins: {
      legend: {
        display: false, // Hide the legend
      },
    },
    scales: {
      x: {
        title: {
          display: false,
        },
        ticks: {
          maxTicksLimit: 6, // Limit the number of time labels
        },
      },
      y: {
        title: {
          display: false,
        },
        beginAtZero: false,
        ticks: {
          maxTicksLimit: 5, // Limit the number of price labels
        },
      },
    },
  };

  return (
    <div>
      <h1>Bitcoin Price (BTC/USDT)</h1>
      {error && <p style={{ color: 'red' }}>{error}</p>}
      {price !== null ? (
        <p>Current Price: ${price.toFixed(2)}</p>
      ) : (
        <p>Loading...</p>
      )}
      <Line data={data} options={options} />
    </div>
  );
};

export default BitcoinPrice;
