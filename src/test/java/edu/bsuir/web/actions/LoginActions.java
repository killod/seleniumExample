package edu.bsuir.web.actions;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.elements.LoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginActions {

    WebDriver driver = WebDriverSingleton.getInstance();

    public void enterLoginPage(){
        driver.get(LoginElements.URL);
    }

    public void inputUsername(String username){
        WebElement element = driver.findElement(LoginElements.USERNAME);
        element.clear();
        element.sendKeys(username);
    }

    public void inputPassword(String password){
        WebElement element = driver.findElement(LoginElements.PASSWORD);
        element.clear();
        element.sendKeys(password);
    }

    public void pressLoginButton(){
        WebElement element = driver.findElement(LoginElements.LOGIN_BUTTON);
        element.click();
    }

    public String findUsernameText(){
         return driver.findElement(LoginElements.USERNAMETEXT).getText();
    }

    public void destroy(){
        driver=null;
    }
}
