package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import seleniumPages.Page_GoogleHomepage;

@RunWith(Cucumber.class)
public class CucumberStepDefinition 
{

	Page_GoogleHomepage ghp = new Page_GoogleHomepage();
	
    @Given("^Chrome Browser is launched$")
    public void chrome_browser_is_launched() throws Throwable 
    {
    	System.out.println("Inside chromer browser method");
    	ghp.launchBrowser();
        
    }

    @When("^Google url is clicked$")
    public void google_url_is_clicked() throws Throwable 
    {
    	System.out.println("Inside google url method");
    	ghp.openGoogleURL();
        
    }

    @Then("^Google HomePage should be displayed$")
    public void google_homepage_should_be_displayed() throws Throwable 
    {
    	System.out.println("Inside google home page displayed");
    	ghp.checkGoogleSearchButtonIsDisplayed();
    	ghp.checkImFeelingLuckyButtonIsDisplayed();
    	ghp.checkSearchBoxIsDisplayed();
    	ghp.shutdown();
    }

}