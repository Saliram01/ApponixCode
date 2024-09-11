import { useState } from 'react'
import './App.css';

function App() {
  let [todoList, setTodolList] = useState([]);

  const saveTodoList = (event) => {
    
    let toname = event.target.toname.value;
    
    if (todoList.includes(toname)) {
      let finaltodoList = [...todoList, toname];
      setTodolList(finaltodoList);
    }
    else {
      alert("Already exist !");
    }
    
    event.preventDefault();
  }

  let list = todoList.map((value, i) => {
    return (
      <ListItem value={value} key={i}/>
    )

  })

  return (
    <div className="App">
      <h4 className="">Todo_List</h4>
      <form action="#" onSubmit={saveTodoList}>
        <input type="text" name="toname" /> <button>Save</button>
      </form>
      <div className="outerDiv">
        <ul>
          {list}
        </ul>
      </div>
    </div>
  );
}

export default App;

// component
function ListItem({ value }) {
  return (
    <li> {value} <span>&times;</span> </li>
  )
}
