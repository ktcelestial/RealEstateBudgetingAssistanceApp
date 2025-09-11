import React from "react"
import "./NavBar.css"

// images 
import logo_light from '../assets/icons/ktbnoglowwhite.png'
import image_town from '../assets/icons/new ktb overview town.jpg'

const NavBar = () => {
    return (
        <div className="navbar">
            <div class="container flex lead">
            
            <img src={logo_light} alt="" className="logolight"/>

            <ul>
                <li>Home</li>
                <li>About</li>
                <li>Trending</li>
                <li>Log In</li>
                <li>Sign Up</li>
            </ul>
            
            </div>
        </div>
    )

}

export default NavBar