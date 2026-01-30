package com.automation.SeleniumPOMFramework.tests;

import com.automation.SeleniumPOMFramework.base.BaseTest;
import com.automation.SeleniumPOMFramework.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest extends BaseTest {

    @Test
    public void verifyLogin() throws InterruptedException {
        // Use the Page Object
        LoginPage loginPage = new LoginPage(driver);
        
        // Perform actions
        loginPage.login("standard_user", "secret_sauce");
        
        // Verify result
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory"), "Login failed!");
    }
}