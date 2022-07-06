package com.meetSky.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

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


}
