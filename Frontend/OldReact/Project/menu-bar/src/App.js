import { useState } from 'react'
import './App.css';

function App() {
  const [menuBar, setMenuBar] = useState(false);
  const [showPassword, setShowPassword] = useState(false);
  const [showForm, setShowForm] = useState(false);

  return (<>
    {/* header  */}
    <header>
      <a href="#"><h2>Logo</h2></a>
      <ul className="navbar">
        <li>Home</li>
        <li>About</li>
        <li>Gallery</li>
        <li>Contact Us</li>
      </ul>
      <button className="header-btn" onClick={() => setShowForm(true)}>Login</button>
      <span onClick={() => setMenuBar(!menuBar)}>&#8801;</span>
    </header>

    {/* menu bar popup */}
    <div className={`menu-bar ${menuBar ? 'showMenuBar' : ''}`}>
      <ul className="menu-list">
        <li>Home</li>
        <li>About</li>
        <li>Gallery</li>
        <li>Contact Us</li>
      </ul>
      <button className="menu-btn" onClick={() => setShowForm(true)}>Login</button>
    </div>

    {/* login form */}
    <div className={`background ${showForm ? 'showBgc' : ''}`} onClick={() => setShowForm(false)}></div>
    <div className={`login-popup ${showForm ? 'showLf' : ''}`} >
      <form action="#">
        <h4>LogIn</h4> <p className="close-icon" onClick={() => setShowForm(false)}>&times;</p>
        <input className='input-btn' type="text" placeholder='Username' />
        <input className='input-btn' type={showPassword ? 'text' : 'password'} placeholder='Password' />
        <div className='check-text'><input className='check' type="checkbox" onClick={() => setShowPassword(!showPassword)} /> Show</div>
        <button type='submit'>Submit</button>
      </form>
    </div>

  </>
  );
}

export default App;
