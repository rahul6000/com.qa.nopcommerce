package com.qa.auto.pages;

import com.qa.auto.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
















}
