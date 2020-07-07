package com.qa.auto.pages;

import com.qa.auto.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(id="small-searchterms")
    WebElement searchBar;

    @FindBy(className = "search-box-button")
    WebElement searchBtn;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[1]/a/img")
    WebElement logoImg;

    @FindBy(xpath="/html/body/div[6]/div[2]/ul[1]/li[1]/a")
    WebElement computerLabel;

    @FindBy(id="pollanswers-1")
    WebElement excellRadioBtn;




    public HomePage () {
        PageFactory.initElements(driver, this);
    }


    public void searchbar(String searchdata) {
        //searchBar.sendKeys(search);
        driver.navigate().refresh();
        searchBar.sendKeys(searchdata);
        searchBtn.click();

    }
    public void validateTitle(){
        driver.getTitle();
    }
    public void validateLogoImg() {
        logoImg.isDisplayed();
    }
    public void compLabel(){
        Actions action= new Actions (driver);
        action.moveToElement(computerLabel).build().perform();
    }
    public void radioBtn1(){
        //JavascriptExecutor js=(JavascriptExecutor)driver;
        //js.executeScript("arguments[0].click();",excellRadioBtn);

                excellRadioBtn.click();

    }


}
