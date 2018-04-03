package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.actions.LoginActions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

public class LoginTest {
    public WebDriver driver = WebDriverSingleton.getInstance();

    LoginActions la = new LoginActions();

    @Test
    public void ShouldLoginCorrectly()throws Exception{
        la.enterLoginPage();
        la.inputUsername("kabanov@tc.by");
        la.inputPassword("welcome");
        la.pressLoginButton();
        Assert.assertEquals("Александр Евгеньевич Кабанов", la.findUsernameText());
    }
    @After
    public void shutDown(){
        driver.quit();
    }
}