import './App.css';
import {useState} from 'react'
function App() {
  let [count , setCount] = useState(10);
  let [show , setShow] = useState(false);

  //Count program
  function Increase(){
    if(count >= 0){
      setCount(count + 1)
    }
  }

  function Decrease(){
    if(count > 0){
      setCount(() => count - 1)
    }
  }

// visibile program using consition
let template;
  if(show){
    template = <p className='bg-primary'>I'm visible</p>
  }
  else{
    template = ''
  }


  return (
    <div className="App">
      <h3>{count}</h3>
      <button onClick={Increase}>Increase</button>
      <button onClick={Decrease}>Decrease</button>
      <div>
        <button onClick={() => setShow(!show)}>Click Me</button>
      </div>
      {template}
    </div>
  );
}

export default App;
