package com.example.demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlexusOurStoryPage {

    public PlexusOurStoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Button for Our Shop Our Products
    @FindBy(xpath = "/html/body/app-root/main/ecom-our-story/main/pwwgen-component[2]/span/section[2]/div/div/div[2]/a")
    public WebElement BtnShopOurProducts;

    //This method click the Shop Our Products Button on Plexus Our Story WebPage
    public void ShopOurProdructs(){
        BtnShopOurProducts.click();
    }
}
