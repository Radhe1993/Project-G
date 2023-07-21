package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement clickOnComputer;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computerText;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopText;

    public void setClickOnComputer()
    {
        clickOnElement(clickOnComputer);
    }

    public void setComputerText()
    {
        getTextFromElement(computerText);
    }

    //__________________________________________________

    public void mouseHoverOnComputer()
    {
        mouseHoverToElement(clickOnComputer);
    }

    public void clickOnDeskTopLink()
    {
        clickOnElement(desktopLink);
    }

    public void getDeskTopText()
    {
        getTextFromElement(desktopText);
    }



}
