/*
  What is react-able in this application?
  - Properties available
  - User account log in / guest
  - 
*/

import NavBar from './components/NavBar'
import ListPropertiesComponent from './components/ListPropertiesComponent'

import Home from "./pages/Home/Home"
import About from "./pages/About/About"
import Login from "./pages/Login/Login"
import SignUp from "./pages/SignUp/SignUp"
import TrendingProps from "./pages/TrendingProps/Trending"

import './App.css'
import React, { Component } from 'react'
import axios from 'axios'

const api = axios.create({
  baseURL: "http://localhost:3000/trending"
  /* header for additional inits or authentications; example: 
  headers: {
    'X-auth-key': "token123"
  } */
})

class App extends Component {

  // state of properties holder
  state = {
    properties: []
  }

  // constructor for App of Component
  constructor() {
    super();
    this.getProperties();
  }

  // try catch loop for async/await functions
  getProperties = async () => {
    try {
      let data = await api.get('/', {
        params: {
          _limit: 10 // limit to 10 properties to fetch, so page isn't cluttered
        }
      }).then(({data}) => data);
      this.setState({ properties: data }) // update properties state
    } catch (err) {
      console.log(err)
    }
  }
  
  // to create a new property through json format
  //  example create function
  createProperty = async () => {
    let res = await api.post('/', { "id": 45,
            "propertyAddress": "Testing Road, Practical, TS 49000",
            "propertyType": "House",
            "propertySubType": "Single Family",
            "PPTonSale": "Yes",
            "PPTavailType": "Sale",
            "PPTprice": 455550,
            "PPTBeds": 4,
            "PPTBath": 3,
            "PPTEstimatePerMonth": 3700,
            "PPTsqftSize": 3973,
            "PPTsqftLot": 0.23,
            "PPTYearBuilt": 2019,
            "PricePerSqft": 190}).catch(err => console.log(err))
    console.log(res)
    this.getProperties();
  }

  deleteProperty = async () => {
    api.delete(`/${id}`)
    this.getProperties();
  }

  updateProperty = async () => {
    api.patch(`/${id}`, { propertyType: Condo })
    this.getProperties();
  }

  render() {
    return(
      <>
        <NavBar/>
        <ListPropertiesComponent />
      
      </>
    )
  }
  
}

export default App
