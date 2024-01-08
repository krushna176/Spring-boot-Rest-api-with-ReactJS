import './App.css';
import {BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Header from './Components/header';
import ListOfEmployees from './Components/ListOfEmployees';
import AddEmployee from './Components/AddEmployee';

function App() {
  return (
    <div>
      <Router>
        <Header />
        <div className= "container">
          <Routes>
              <Route exact path = "/" element = {<ListOfEmployees/>}></Route>
              <Route path = "/employees" element = {<ListOfEmployees/>}></Route>
              <Route path = "/add-employee" element = {<AddEmployee/>} ></Route>
              <Route path = "/edit-employee/:id" element = {<AddEmployee/>}></Route>
            </Routes>
        </div>
        </Router>
    </div>
  );
}

export default App;
