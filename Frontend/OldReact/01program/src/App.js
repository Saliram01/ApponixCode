import React from 'react'
import Header from './Header'
import "./App.css"
import Footer from './Footer'
function App() {
  return (
    <>
        <Header />
       <div className='card-container'>
            <Card/>
            <Card/>
            <Card/>
            <Card/>
            <Card/>
            <Card/>
            <Card/>
            <Card/>
       </div>
       <Footer/>
    </>
  )
}

export default App


function Card() {
  return (
    <div className='card'>Card Box</div>
  )
}


