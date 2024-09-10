import React from "react";

function Display(message){
  alert(message);
}

function Card({ cardInfo, cname }) {
  // destructuring

  // destructuring
  // const {cardInfo , cname} = props;
  // console.log(cardInfo);
  // console.log(cname);

  // console.log(props.cardInfo.title);
  // console.log(props.cardInfo.brand);
  return (
    <div className="container-fluid py-5">
      <div className="container">
        <div className="row">
          <div className="col-12 text-center fs-2 fw-bold text-secondary">
            Our Services
          </div>
        </div>
        <div className="row">
          <div className="col-lg-3 col-sm-6 text-center py-5">
            <div className="card">
              <div className="card-body">
                <h5 className="card-title">{cardInfo.title}</h5>
                <p className="card-text">
                  Some quick example text to build on the{" "}
                  <strong>{cardInfo.brand}</strong> and make up the bulk of the
                  card's content.
                </p>
                <button className="btn btn-primary" onClick={() => Display("Im Clicked")}>Click Me</button>
              </div>
            </div>
          </div>
          <div className="col-lg-3 col-sm-6 text-center py-5">
            <div className="card">
              <div className="card-body">
                <h5 className="card-title">Card title</h5>
                <p className="card-text">
                  Some quick example text to build on the card title and make up
                  the bulk of the card's content.
                </p>
                <button className="btn btn-primary">Go somewhere</button>
              </div>
            </div>
          </div>
          <div className="col-lg-3 col-sm-6 text-center py-5">
            <div className="card">
              <div className="card-body">
                <h5 className="card-title">Card title</h5>
                <p className="card-text">
                  Some quick example text to build on the card title and make up
                  the bulk of the card's content.
                </p>
                <button className="btn btn-primary">Go somewhere</button>
              </div>
            </div>
          </div>
          <div className="col-lg-3 col-sm-6 text-center py-5">
            <div className="card">
              <div className="card-body">
                <h5 className="card-title">Card title</h5>
                <p className="card-text">
                  Some quick example text to build on the card title and make up
                  the bulk of the card's content.
                </p>
                <button className="btn btn-primary">Go somewhere</button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Card;
