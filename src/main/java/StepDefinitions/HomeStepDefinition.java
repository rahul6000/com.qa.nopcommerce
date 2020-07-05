package StepDefinitions;

import com.qa.auto.base.TestBase;
import com.qa.auto.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class HomeStepDefinition extends TestBase{

    HomePage homepage;
    public HomeStepDefinition(){
        super();
    }
    @BeforeMethod
    public void setup() {

    homepage=new HomePage();
    }


    @Given("^user is on home page$")
    public void userIsOnHomePage() {

    }

    //@When("^title home page is My Store$")
    //public void titleHomePageIsMyStore() {
        
    //}

    @When("^logo image is displayed$")
    public void logoImageIsDisplayed() {
        homepage.validateLogoImg();
    }

    @Then("^user inputs in search bar and user enters \"([^\"]*)\" and click$")
    public void userInputsInSearchBarAndUserEntersAndClick(String search) {
        homepage.searchbar(search);
    }

    @Then("^user hoover on computer label$")
    public void userHooverOnComputerLabel() {
      homepage.compLabel();
    }

    @Then("^user clicks on excellent radio button$")
    public void userClicksOnExcellentRadioButton() {
        homepage.radioBtn1();
    }

    @Then("^exit the browser$")
    public void exitTheBrowser() {
        driver.quit();
    }
}
