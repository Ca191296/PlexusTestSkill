package com.example.demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlexusAboutPage {
    public WebDriver driver;
    public PlexusAboutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    // Button for Our Story
    @FindBy(xpath = "//*[@id=\"section-group-2\"]/div/div/span/div[2]/div/div[2]/div/div/a")
    public WebElement BtnOurStory;

    // Button to Accept Cookies on the WebPage
    @FindBy(id = "truste-consent-button")
    public WebElement BtnAcceptCookies;

    // Method to click on Our Story Button
    public void OpenPlexusStory(){
        BtnOurStory.click();

    }
}