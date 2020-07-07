package StepDefinitions;

import com.qa.auto.base.TestBase;
import com.qa.auto.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeStepDefinition extends TestBase{

    HomePage homepage;
    //Home homepage;
    public HomeStepDefinition(){
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        homepage=new HomePage();
    }


    @Test
    @Given("^user is on home page$")
    public void userIsOnHomePage() {
        TestBase.initialization();
        homepage= new HomePage();
    }
    @Test
    @When("^title home page is My Store$")
    public void titleHomePageIsMyStore() {
        homepage.validateTitle();
    }
    @Test
    @When("^logo image is displayed$")
    public void logoImageIsDisplayed() {
       homepage.validateLogoImg();
    }
    @Test
    @Then("^user inputs in search bar and click$")
    public void userInputsInSearchBarAndClick() {
        homepage.searchbar(prop.getProperty("search"));
        driver.navigate().back();

    }
    @Test
    @Then("^user hoover on computer label$")
    public void userHooverOnComputerLabel() {
      homepage.compLabel();
    }
    @Test
    @Then("^user clicks on excellent radio button$")
    public void userClicksOnExcellentRadioButton() {
        homepage.radioBtn1();
    }
    @AfterMethod
    @Then("^exit the browser$")
    public void exitTheBrowser() {
        driver.quit();
    }

}

