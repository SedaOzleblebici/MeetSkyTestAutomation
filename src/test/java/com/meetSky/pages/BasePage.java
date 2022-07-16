package com.meetSky.pages;

import com.meetSky.utilities.CommonMethods;
import com.meetSky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    public void clickOnTheSettingsMenu() {

        WebElement settingsMenu=Driver.getDriver().findElement(By.xpath("//div[@class='avatardiv avatardiv-shown']"));
        CommonMethods.click(settingsMenu);

    }

}
