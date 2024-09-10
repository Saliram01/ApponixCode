import React from "react";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faSearch } from "@fortawesome/free-solid-svg-icons";

function Header({ title, children }) {
  return (
    <div className="py-3 fw-bold shadow-sm container">
      <div className=" fs-4 text-center">
        Welcome React Bootstrap {title}
        <p>{children}</p>
        <div>
          {/* <FontAwesomeIcon icon={faSearch} /> */}
        </div>
      </div>
    </div>
  );
}

export default Header;
