import { useState } from 'react'
import btnModule from './Button.module.css'
import './App.css';
import questions from './FAQ'
import 'react-notifications/lib/notifications.css';
import {NotificationContainer, NotificationManager} from 'react-notifications'

function App() {
  const [status, setStatus] = useState(false);
  const [pstatus, setPstatus] = useState(false);
  const [menu, setMenu] = useState(false);
  const [modal, setModal] = useState(false);
  const [showAns, setShowAns] = useState(questions[0].id);

  let showNotification = () => {
    // NotificationManager.info("Welcome React")
    // NotificationManager.success('Success', 'Title here');
    // NotificationManager.warning('Warning message', 'Close after 3000ms', 3000);
    NotificationManager.error('Error message');
  }

  return (
    <div className="App">

      {/* Notification popup 1st install -> npm i react-notifications*/}
      {/* import notification where you want to add file => import 'react-notifications/lib/notification.css' */}
      <NotificationContainer/>
      <button onClick={showNotification}>Save</button>

      <button className='en' onClick={() => setModal(true)}>Enquery Now</button>

      <div onClick={() => setModal(false)} className={`modalOverly ${modal ? "modalShow" : ''}`}></div>
      <div className={`modaldiv ${modal ? "showModalDiv" : ''}`}>
        <h3>Enquery Now <span onClick={() => setModal(false)} >&times;</span></h3>
      </div>


      {/* menu bar */}
      <button className='micon' onClick={() => setMenu(!menu)}>
        {menu ? <span>&times;</span> : <span>&#9776;</span>}
      </button>
      <div className={`menu ${menu ? 'activeMenu' : ''}`}>
        <ul>
          <li>Home</li>
          <li>About</li>
          <li>Services</li>
          <li>Contact Us</li>
        </ul>
      </div>

      {/* css module */}
      <button className={btnModule.error}>Error</button>
      <button className={btnModule.warning}>Warning</button>


      {/* ternary operator */}
      <button onClick={() => setStatus(!status)}>
        {status ? 'Hide' : 'Show'}
      </button>
      {
        (status) ? <p className="TO">Ternary Operator</p> : ''
      }

      {/* Show password using ternary */}
      <div>
        <input className={btnModule.m} type={pstatus ? 'text' : 'password'} />

        <button className={btnModule.m} onClick={() => setPstatus(!pstatus)}>{pstatus ? 'Hide' : 'Show'}</button>
      </div>

      {/* FAQ  */}

      <div className="">
        <h2>Frequently Asked Questions (FAQs)</h2>
        <div className="faqOuter">
          {questions.map((v,i) => {
            return(
              <div className="faqItems" key={i}>  
              <h2 onClick={() => setShowAns(v.id)}>{v.question}</h2>
              <p className={showAns === v.id ? 'activeAns' : ''}>{v.answer}</p>
            </div>
            )
          })}
          
        </div>
      </div>
    </div>
  );
}

export default App;
