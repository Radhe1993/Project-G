package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest
{

        HomePage homePage;
        RegisterPage registerPage;

        @BeforeMethod
         public void init()
        {
            homePage = new HomePage();
            registerPage = new RegisterPage();
        }

        @Test
         public void verifyUserShouldNavigateToRegisterPageSuccessfully()
        {
            homePage.clickOnRegisterLink();
            registerPage. getMessage();
            registerPage.setClickOnRegisterButton();
            registerPage.firstNameRequired();
            String expected = "First name is required.";
            String actual = getTextFromElement(By.xpath("//span[@id='FirstName-error']"));
            Assert.assertEquals(actual,expected);
            registerPage.lastNameRequired();
            String expected1 = "Last name is required.";
            String actual1 = getTextFromElement(By.xpath("//span[@id='LastName-error']"));
            Assert.assertEquals(actual1,expected1);
            registerPage. emailRequired();
            String expected2 = "Email is required.";
            String actual2 = getTextFromElement(By.xpath("//span[@id='Email-error']"));
            Assert.assertEquals(actual2,expected2);
            registerPage.  passwordRequired();
            String expected3 = "Password is required.";
            String actual3 = getTextFromElement(By.xpath("//span[@id='Password-error']"));
            Assert.assertEquals(actual3,expected3);
            registerPage.conformPasswordRequired();
            String expected4 = "Password is required.";
            String actual4 = getTextFromElement(By.xpath("//span[@id='ConfirmPassword-error']"));
            Assert.assertEquals(actual4,expected4);
        }

        @Test
    public void VerifyThatUserShouldCreateAccountSuccessfully()
        {
            homePage.clickOnRegisterLink();
            registerPage.selectGender();
            registerPage. setEnterFirstName("Radha");
            registerPage.setEnterLastName("Krishna");
            registerPage.setSelectDay("5");
            registerPage. setSelectMonth("August");
            registerPage.setSelectYear("2001");
            registerPage.setEnterEmail("radhakrishna22@gmail.com");
            registerPage.setEnterPassword("rk@112233");
            registerPage.setEnterConfirmPassword("rk@112233");
            registerPage. ClickOnRegisterButton();
            registerPage.getText();
            String expected = "Your registration completed";
            String actual = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
            Assert.assertEquals(actual,expected);
        }


}
