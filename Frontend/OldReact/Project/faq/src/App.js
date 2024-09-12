import './App.css';
import faq from './faqData'
import {useState} from 'react'

function App() {
  const [showAns , setShowAns] = useState(true);
  return (
    <div className="App">
      <header className="App-header">
        <h3>Frequently Asked Questions (FAQ)</h3>
        <div className="faqbox">
          {faq.map((v, i) => {
            return (
              <div className="faqItems" key={v.id}>
                <h4 onClick={() => setShowAns(v.id)}>{v.question}</h4>
                <p className={showAns === v.id ? 'showAns' : ''}>{v.answer}</p>
              </div>
            )
          })}
        </div>
      </header>
    </div>
  );
}

export default App;
