import './App.css';
import { useState } from 'react'

function App() {
  const [eShow, setEshow] = useState(false);

  return (
    <div className="App">
      <button className="btn" onClick={() => setEshow(!eShow)}>{eShow ? 'Hide' : 'Show'}</button>
      {eShow ? <div> <b>Paragraph Hide and Show </b></div> : ''}
    </div>
  );
}

export default App;
