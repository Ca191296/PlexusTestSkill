package com.example.demo1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.lang.Thread;

public class MainPageTest {
    public static WebDriver driver;
    public PlexusMainPage plexusMainPage;
    public PlexusAboutPage plexusAboutPage;
    public PlexusOurStoryPage plexusOurStoryPage;
    public String URL;


    @BeforeTest
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://plexusworldwide.com/");

        plexusMainPage = new PlexusMainPage(driver);
        plexusAboutPage = new PlexusAboutPage(driver);
        plexusOurStoryPage = new PlexusOurStoryPage(driver);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void GetSiteElement(){
        plexusAboutPage.BtnAcceptCookies.click();

        String ProdText = plexusMainPage.GetTxtProd();
        System.out.print("This is the Product of the Month Description: " + ProdText);

        plexusAboutPage.NavigateToPlexusAboutWebPage();

        plexusAboutPage.OpenPlexusStory();
        plexusOurStoryPage.ShopOurProdructs();

        URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://shop.plexusworldwide.com/products");

    }


}
