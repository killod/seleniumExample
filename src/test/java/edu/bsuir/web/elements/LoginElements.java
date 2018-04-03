package edu.bsuir.web.elements;

import org.openqa.selenium.By;

public class LoginElements {

    public static final String URL = "http://testing.cld.iba.by/";
    public static final By USERNAME = By.xpath("//input[@id='_58_login']");
    public static final By PASSWORD = By.xpath("//input[@id='_58_password']");
    public static final By LOGIN_BUTTON = By.xpath("//div[@class= 'button-holder ']");
    public static final By USERNAMETEXT = By.xpath("//div[@class='float-box']//div//h3");
    public static By getLoginButton(String name){
        return  By.xpath("//button[text()=' "+name+" ']");
    }
}
