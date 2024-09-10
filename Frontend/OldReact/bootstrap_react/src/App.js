import React from 'react';
import Card from './components/Card';
import Footer from './components/Footer';
import Header from './components/Header';
import { imgData } from './data';
import './App.css';
import Carausal from './components/Carausal';


function App() {
  const cardInfo = {
    title: "iPhone 15 pro",
    brand: "Apple",
  }
  return (
    <>
      <Header title="5">
        {/* <p>Children</p> */}
      </Header>
      <Carausal/>
      <Card cardInfo={cardInfo} cname="Saliram" />
      <div className="container">
        <div className="row">
          {imgData.map((items, i) => {
            return (
              <ProductItems data={items} key={i} />
            )
          })}
        </div>
      </div>
      <Footer email="saliramchaudhary0@gmail.com" phone="6362570266" copy=" ©Copyright" />
    </>
  );
}

export default App;

// card components
function ProductItems({ data }) {
  return (
    <div className='col-lg-3 text-center py-4' key={data.key}>
      <div className="card">
        <div className="card-body">
          <h5 className="card-title"></h5>
          <p className="card-text">{data.title}</p>
          <button className="btn btn-primary">Go somewhere</button>
        </div>
      </div>
    </div>
  )
}
