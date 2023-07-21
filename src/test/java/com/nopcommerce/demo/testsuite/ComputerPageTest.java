package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.runners.TestData;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest
{

    ComputerPage computerPage ;
    BuildYourOwnComputerPage ownComputer;

    @BeforeMethod
    public void iNit()
    {
        computerPage = new ComputerPage();
        ownComputer = new BuildYourOwnComputerPage();
    }

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully()
    {
        computerPage.setClickOnComputer();
        computerPage.setComputerText();
        String expected = "Computers";
        String actual = getTextFromElement(By.xpath("//h1[contains(text(),'Computers')]"));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully()
    {
        computerPage.mouseHoverOnComputer();
        computerPage.clickOnDeskTopLink();
        computerPage.getDeskTopText();
        String expected  = "Desktops";
        String actual = getTextFromElement(By.xpath("//h1[contains(text(),'Desktops')]"));
        Assert.assertEquals(actual,expected);
    }

    @Test(dataProvider = "Credentials",dataProviderClass = TestData.class)
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,String hdd, String os, String software) throws InterruptedException {
        ownComputer.mouseHoverOnComputer();
        ownComputer.clickOnDeskTopLink();
        Thread.sleep(2000);
        ownComputer.clickOnBuildComputer();
        Thread.sleep(2000);
        ownComputer.dataSet( processor,ram,hdd,os, software);
        ownComputer.setAddToCart();
        ownComputer.getText();



    }
}
