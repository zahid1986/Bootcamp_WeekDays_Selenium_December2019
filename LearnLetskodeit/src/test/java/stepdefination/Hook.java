package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;
import testhomepage.TestHomePage;

public class Hook extends TestHomePage {
    @Given("I am in learnletskodeeit home Page")
    public void I_am_in_learnletskodeeit_home_Page() {
        // Write code here that turns the phrase above into concrete actions
        // getLocalDriver("mac","chrome");
        System.setProperty("webdriver.chrome.driver", "/Users/zahidhasan/IdeaProjects/Bootcamp_WeekDays_Selenium_December2019/Genaric/BrowserDriver/Mac/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://learn.letskodeit.com/");
    }

    @Then("Close the browser")
    public void close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }

}


