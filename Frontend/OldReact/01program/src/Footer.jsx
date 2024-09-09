import React from "react";

function Footer() {
  const userName = "Using js & html in jsx ";
  const array = [20, 40, 60, 80];
  return (
    <div className="footer-container">
      <p>Footer</p>
      <p>{userName}</p>
      <p>Sum : {20 + 100}</p>
      <p>
        {array.map((v) => {
          return <div>Array element : {v}</div>;
        })}
      </p>
    </div>
  );
}

export default Footer;
