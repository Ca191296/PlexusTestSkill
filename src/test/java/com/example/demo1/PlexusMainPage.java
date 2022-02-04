package com.example.demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PlexusMainPage {

    public PlexusMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Element to verify the description for Product of The Month
    @FindBy(xpath = "//*[@id=\"section-group-1\"]/div/div/span/div/div/div[1]/div/a/div/div[2]/p")
    public WebElement TxtProdOfMonth;

    // Return the description for Product of The Month
    public String GetTxtProd(){
        return TxtProdOfMonth.getText();
    }


}
