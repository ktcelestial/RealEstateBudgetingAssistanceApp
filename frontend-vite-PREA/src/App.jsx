/*
  Order of HTTP Request testing
  (1) Open Postman to test endpoints
  (2) Start up server for database listening (dir> node app.js)
    - "Database Connected"
  - 
*/

// app setup essentials
const express = require("express");
require("dotenv").config();
const { Sequelize, DataTypes } = require("sequelize");

// app exclusive
const app = express();
const port = process.env.PORT || 3000; // custom port, 3000 is fall back port
app.use(express.json());

// directories and dependencies
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

// sequelize initialization 
const sequelize = new Sequelize(process.env.PREA_DB_URL, {
  // what does Sequelize need?
  dialect: "sqlite",
  storage: "./database.sqlite",
  logging: false
});

// .sync() is a Promise, must handle.
sequelize
  .sync()
  .then(() => {
    console.log("Error on sequelize sync function."); 
  })
    .catch((err) => {
      console.log(err)
    });

const post = sequelize.define("post", {
  title: {
    type:DataTypes.STRING,
    allowNull: false,
  }, 
  content: {
    type: DataTypes.STRING,
    allowNull: false,
  },
});

// express based - get
app.get("/", (req, res) => {
  res.send("app.get() function initialized!");
});

// express based - post
app.post("/create-post", async (req, res) => {
  const {title , content } =  req.body;
  try {
    const newPost = await post.create( {title, content });
    res.json(newPost);
  } catch (err) {
    console.log(err);
  }
});

app.listen(port, () => {
  console.log('Project App listening...');
});

app.get("/get-posts", async (req, res) => {
  try {
    const allPosts = await post.findAll();
    res.json(allPosts);
  } catch (err) {
    console.log(err);
  }
})


// BEFORE ===================

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
