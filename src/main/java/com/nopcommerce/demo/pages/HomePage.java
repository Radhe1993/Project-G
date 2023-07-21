package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement login;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;


    public void clickOnLoginLink()
    {
        clickOnElement(login);
    }

    public void clickOnRegisterLink()
    {
        clickOnElement(registerLink);
    }
}
