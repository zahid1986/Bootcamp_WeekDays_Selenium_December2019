package testhomepage;

import databases.ConnectToSqlDB;
import homepage.pageobject.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;
import java.util.List;

public class TestHomePage extends HomePage {
    public static void getInItElements(){
        PageFactory.initElements(driver, HomePage.class);
    }

    @Test (priority = 1)
    public static void searchFromDatabase() throws Exception {
        setBrowser();
        //System.out.println(ConnectToSqlDB.readDataBase("shuvro","search").get(0));
        for (int i = 0; i< ConnectToSqlDB.readDataBase("quazi","search").size(); i++) {
            driver.findElement(By.xpath(searchBox)).sendKeys(ConnectToSqlDB.readDataBase("quazi","search").get(i), Keys.ENTER);
            sleepFor(2);
            navigateBack();
            sleepFor(2);
        }
    }

    @Test(priority = 2)
    public static void searchFromTable() throws IOException, InterruptedException {
//public static void main(String[] args) throws IOException {


        setBrowser();
        //System.out.println(ConnectToSqlDB.readDataBase("shuvro","search").get(0));
        String[][] file = DataReader.fileReader1("/Users/zahidhasan/IdeaProjects/Bootcamp_WeekDays_Selenium_December2019/Genaric/src/main/java/filereader/FileReader.xls", 0);
        for (int i = 0; i < file.length; i++) {
            System.out.println(file[i][0] + " ");
            driver.findElement(By.xpath(searchBox)).sendKeys(file[i][0], Keys.ENTER);
            sleepFor(2);
            navigateBack();
            sleepFor(2);
        }
    }
        @Test(priority = 2)
        public static void testGmailLink(){
        getSingleLink("Gmail");
    }


}

