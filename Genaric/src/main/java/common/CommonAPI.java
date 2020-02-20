package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonAPI {

        public static WebDriver driver=null;

        public WebDriver setBrowser(String OS,String Browser){
            if (OS.equalsIgnoreCase("windows")&& Browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","Generic/BrowserDriver/Windows/chromedriver.exe");
                driver=new ChromeDriver();
            }else if (OS.equalsIgnoreCase("mac")&& Browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","BrowserDriver/Windows/chromedriver.exe");
                driver=new ChromeDriver();
            }
            return driver;
        }

}
