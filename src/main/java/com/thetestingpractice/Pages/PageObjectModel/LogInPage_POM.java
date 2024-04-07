package com.thetestingpractice.Pages.PageObjectModel;

import org.openqa.selenium.By;

public class LogInPage_POM {

    //PageLocators

    By username= By.id("login-username");
    By password= By.id("login-password");
    By signInbutton= By.id("js-login-btn");
    By error_message= By.id("js-notification-box-msg");



    //Page Actions

    public String logIntoVWONegative(){
        return null;
    }
}
