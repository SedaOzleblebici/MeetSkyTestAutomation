package com.meetSky.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

    public static void clickButtonWithText(String buttonText) {
        CommonMethods.click(By.xpath("//button[contains(text(),'" + buttonText + "')]"));
    }

    public static void click(By by) {
        try {
            Driver.getDriver().findElement(by).click();

        } catch (NoSuchElementException e) {
            Assert.fail("FAIL - Element click is FAILING!!");
        }

    }

    public static void click(WebElement element) {
        try {
            element.click();

        } catch (NoSuchElementException e) {
            Assert.fail("FAIL - Element click is FAILING!!");
        }

    }

    public static void navigateToUrl(String url){
        Driver.getDriver().navigate().to(url);
        System.out.println("Navigated to: "+ url);
    }

    public static void waitForTitle(String title){
        long longWait = Integer.parseInt(ConfigurationReader.getProperty("longWait"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),longWait);

        wait.until(ExpectedConditions.titleIs(title));
    }

    public static void clickLinkWithText(String text){
        click(Driver.getDriver().findElement(By.linkText(text)));
    }

    public static void clickOnNavigateBack(){
        Driver.getDriver().navigate().back();
        System.out.println("INFO - Navigated previous page");
    }

}
