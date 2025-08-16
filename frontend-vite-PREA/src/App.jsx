/*
  we have /pages with /home, /about, etc.

*/

import NavBar from './components/NavBar'
import ListPropertiesComponent from './components/ListPropertiesComponent'

import Home from "./pages/Home/Home"
import About from "./pages/About/About"
import Login from "./pages/Login/Login"
import SignUp from "./pages/SignUp/SignUp"
import TrendingProps from "./pages/TrendingProps/Trending"

import './App.css'

function App() {

  let component
  switch (window.location.pathname) {
    case "/": // default branch
      component = <Home/>
      break
    case "/about":
      component = <About/>
      break
    case "/signup":
      component = <SignUp/>
      break
    case "/trending":
      component = <TrendingProps/>
      break
    case "/login":
      component = <Login/>
      break
  }

  return (
    <>
      <NavBar/>
      <ListPropertiesComponent />
    </>
  )
}

export default App
