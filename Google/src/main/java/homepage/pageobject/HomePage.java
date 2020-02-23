package homepage.pageobject;

import homepage.webelement.HomePageWebelement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePage extends HomePageWebelement {
    public static void setBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Quazi\\IdeaProjects\\Shuvro\\BootCampSelenium\\Generic\\BrowserDriver\\Windows\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
    }
    @FindBy(how = How.XPATH, using = gamailLinkXp)
    public static WebElement gamilLink;
    public static WebElement getGamilLink(){return gamilLink;}
    public static void setGamilLink(){getGamilLink().getAttribute("href");}
}
