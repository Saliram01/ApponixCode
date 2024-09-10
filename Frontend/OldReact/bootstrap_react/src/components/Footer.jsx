import React from 'react'

function Footer(props) {
  return (
    <div className='py-4 border-top'>
      <h3 className='text-center fs-3'>Footer Section</h3>
      <p className='text-center'>{props.email} | {props.phone}</p>
      <p className='text-center'>{props.copy}</p>
    </div>
  )
}

export default Footer