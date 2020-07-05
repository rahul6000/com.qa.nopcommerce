package com.qa.auto.pages;

import com.qa.auto.base.TestBase;
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

    @FindBy(linkText = "Excellent")
    WebElement excellRadioBtn;



    public HomePage () {
        PageFactory.initElements(driver, this);
    }


    public void searchbar(String search) {
        //searchBar.sendKeys(search);
        searchBar.sendKeys(prop.getProperty(search));
        searchBtn.click();
    }
    public boolean validateLogoImg() {
        return logoImg.isDisplayed();
    }
    public void compLabel(){
        Actions action= new Actions (driver);
        action.moveToElement(computerLabel).build().perform();
    }
    public void radioBtn1(){

        excellRadioBtn.click();

    }


}
