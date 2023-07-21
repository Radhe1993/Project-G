package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility
{

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement text;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement clickOnLoginButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement text2;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement text3;

    public void setText()
    {
        getTextFromElement(text);
    }

    public void enterEmail(String email1)
    {
        sendTextToElement(email,email1);
    }

    public void enterPassWord(String password1)
    {
        sendTextToElement(password,password1);
    }

    public void setClickOnLoginButton()
    {
        clickOnElement(clickOnLoginButton);
    }

    public void getText2()
    {
        getTextFromElement(text2);
    }

    public void getText3()
    {
        getTextFromElement(text3);
    }
}
