package com.automation.SeleniumPOMFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // 1. Locators (Storing them in one place)
    private By loginTitle = By.className("login_logo");
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    // 2. Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // 3. Page Actions
    public String getPageTitleText() {
        return driver.findElement(loginTitle).getText();
    }

    public void login(String user, String pass) throws InterruptedException {
        driver.findElement(usernameField).sendKeys(user);
        driver.findElement(passwordField).sendKeys(pass);
        Thread.sleep(5000);
        driver.findElement(loginButton).click();
    }
}