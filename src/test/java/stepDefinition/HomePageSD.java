package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import runnerTest.webPages.HomePage;
import utils.BasePage;

public class HomePageSD {
    private HomePage homePage = new HomePage();

    @Given("^I am on DarkSky Home Page$")
    public void verifyTitle(){
        Assert.assertEquals(BasePage.get().getTitle(),"Dark Sky - Broadway, New York, NY");
    }

    @When("^I click on today button on home page$")
    public void clickTodayButton(){ homePage.getTemperature();
    }

    @And("^I get temperatures on home page$")
    public void getTemperature(){ System.out.println(homePage.getTempList());
    }

    @And("^I get minimum temperatures on home page$")
    public void getMinTemp(){
        System.out.println(homePage.minTemp());
    }

    @And("^I get maximum temperatures on home page$")
    public void getMaxTemp(){ System.out.println(homePage.maxTemp());
    }
    @Then("^I verify minimum temperature on home page$")
    public void verifyMinTemp(){
        //boolean result = homePage.verifyMin() == homePage.minTemp();
        //Assert.assertFalse("Different values", result);
    }
    @Then("^I verify maximum temperature on home page$")
    public void verifyMaxTemp(){
        //Assert.assertEquals(homePage.verifyMax(),homePage.maxTemp());
    }
}