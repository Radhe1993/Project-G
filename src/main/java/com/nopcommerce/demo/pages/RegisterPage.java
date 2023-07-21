package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility
{

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement message;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement clickOnRegisterButton;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement errorMessageFirstName;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement errorMessageLastName;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement errorMessageEmail;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement errorMessagePassword;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement errorMessageConformPassword;

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement gender;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement enterLastName;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement selectDay;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement selectMonth;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement selectYear;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement enterEmail;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement enterConfirmPassword;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement getClickOnRegisterButton;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement message1;


    public void getMessage()
    {
        getTextFromElement(message);
    }

    public void setClickOnRegisterButton()
    {
        clickOnElement(clickOnRegisterButton);
    }

    public void firstNameRequired()
    {
        getTextFromElement(errorMessageFirstName);
    }

    public void lastNameRequired()
    {
        getTextFromElement(errorMessageLastName);
    }

    public void  emailRequired()
    {
        getTextFromElement(errorMessageEmail);
    }
    public void passwordRequired()
    {
        getTextFromElement(errorMessagePassword);
    }
    public void conformPasswordRequired()
    {
        getTextFromElement(errorMessageConformPassword);
    }


    //__________________________________________________

    public void selectGender()
    {
        clickOnElement(gender);
    }

    public void setEnterFirstName(String enterFirstName1)
    {
        sendTextToElement(enterFirstName,enterFirstName1);
    }

    public void setEnterLastName(String enterLastName1)
    {
        sendTextToElement(enterLastName,enterLastName1);
    }

    public void setSelectDay(String day)
    {
        selectByValueFromDropDown(selectDay,day);
        //"5"
    }

    public void setSelectMonth(String month)
    {
        selectByVisibleTextFromDropDown(selectMonth,month);
        //August
    }
    public void setSelectYear(String year)
    {
        selectByValueFromDropDown(selectYear,year);
        //"2001"
    }
    public void setEnterEmail(String enterEmail1)
    {
        sendTextToElement(enterEmail,enterEmail1);
    }
    public void setEnterPassword(String enterPassword1)
    {
        sendTextToElement(enterPassword,enterPassword1);
    }

    public void setEnterConfirmPassword(String enterConfirmPassword1)
    {
        sendTextToElement(enterConfirmPassword,enterConfirmPassword1);
    }

    public void ClickOnRegisterButton()
    {
        clickOnElement(getClickOnRegisterButton);
    }

    public void getText()
    {
        getTextFromElement(message1);
    }
}
