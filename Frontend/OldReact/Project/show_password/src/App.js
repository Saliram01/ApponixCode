import './App.css';
import { useState } from 'react'

function App() {
  const [showPassword, setShowPassword] = useState(false);

  return (
    <div className="App">
      <header className="App-header">
        <input type={showPassword ? 'text' : 'password'} />
        <button onClick={() => setShowPassword(!showPassword)}>{showPassword ? 'Hide' : 'Show'}</button>
      </header>
    </div>
  );
}

export default App;
