import './App.css';
import {useState} from 'react'



function App() {

  let names = ['jawad', 'rawad', 'miahi']

  names = names.map(
    (name) => {
      return name + "1"
    } 
  )

  return (
    <div className="App">
      <div>{names[1]}</div>
    </div>
  );
}

export default App;
