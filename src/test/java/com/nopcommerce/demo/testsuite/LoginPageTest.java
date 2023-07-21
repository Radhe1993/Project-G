package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest
{

    HomePage homePage ;
    LoginPage loginPage;

    @BeforeMethod
    public void iNit()
    {
        homePage = new HomePage();
        loginPage = new LoginPage();

    }
    @Test
    public void userShouldNavigateToLoginPageSuccessFully()
    {
        homePage. clickOnLoginLink();
        loginPage.setText();

    }
    @Test
    public void verifyTheErrorMessageWithInValidCredentials()
    {
        homePage. clickOnLoginLink();
        loginPage. enterEmail("radhakrishna@gmail.com");
        loginPage.enterPassWord("rk@112233");
        loginPage.setClickOnLoginButton();
        loginPage.getText2();
        String expected = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actual = getTextFromElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));
        Assert.assertEquals(actual,expected);

    }




}
