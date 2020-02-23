package testhomepage;

import homepage.pageobject.HomePage;
import homepage.webelement.HomePageWebelement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestHomePage extends HomePage {
   // static HomePage homeP;

    public static void getInItElements(){
        PageFactory.initElements(driver, HomePage.class);
    }
    // click on practice button
    @Test(priority = 1)
    public static void testPracticeButton() throws InterruptedException {
        getInItElements();
        sleepFor(2);
        clickPractice();
        sleepFor(2);
    }
    //check the radio button
    @Test(priority = 2)
    public static void testRadioButton() throws InterruptedException {
        getInItElements();
        sleepFor(2);
        clickPractice();
        clickRadioButtn();
        sleepFor(2);
    }
    // i call Priority no 1 to get the practice page call the selectFromDrop method from Web API.
    @Test(priority = 3)
    public static void testDropDownSelectBar() throws InterruptedException {
        testPracticeButton();
       // clickselectDropDownClassBar();
        selectFromDrop(selectDropDownClassBarXp, "honda");
        sleepFor(4);
    }
    //I call priority no. 3 to check the random select from from drop down manu "honda" and Bmw respectively
     @Test(priority = 4)
     public static void  testSelectDropDownSelectBar () throws InterruptedException {
        testDropDownSelectBar();
        selectFromDrop(selectDropDownClassBarXp, "bmw");
    }
    // i call prioroty no 1 to go to the practice page. then i check the click on multipall box and then select all the element at the same
    // time by calling selectFromMultipleDrop method from Web API.
    @Test(priority = 5)
    public static void testMultiSelectBox () throws InterruptedException {
        testPracticeButton();
        clickMultiSelectBox();
        sleepFor(4);
        selectFromMultipleDrop(multiSelectBoxXp, "orange", "peach", "apple");
    }
    // call the testPracticeButton method from priority no 1 to get the next page
    @Test(priority = 6)
    public static void testCheckBoxSelect() throws InterruptedException {
        testPracticeButton();
        selectCheckBox();
        sleepFor(3);
    }
    /* call the testPracticeButton method from priority no 1 to get the next page and call the
    handleNewWindow from web API to close new window. */
    @Test(priority = 7)
    public static void testSwitcNewhWindow() throws InterruptedException {
        testPracticeButton();
        clickSwitcNewhWindow();
        sleepFor(4);
        handleNewWindow(driver).close();
        sleepFor(3);
    }
    @Test(priority = 8)
    /* call the testPracticeButton method from priority no 1 to get the next page and call the
    handleNewTab from web API to close new tab. */
    public static void testSwitchNewTab() throws InterruptedException {
        testPracticeButton();
        clickSwitchNewTab();
        sleepFor(3);
        handleNewTab(driver).close();
        sleepFor(3);
    }
    /*call the testPracticeButton method from priority no 1 to get the next page and call the
    okalert from Web API to handle the alert  */
    @Test(priority = 9)
    public static void testAlertHandlingPositive() throws InterruptedException {
        testPracticeButton();
        clickAlert();
        sleepFor(3);
        okAlert();
        sleepFor(3);
    }
    /*call the testPracticeButton method from priority no 1 to get the next page and call the cancelAlert
   from Web API to handle the alert  */
    @Test(priority = 10)
    public static void testAlertHandlingNegative() throws InterruptedException {
        testPracticeButton();
        clickConform();
        sleepFor(2);
        cancelAlert();
        sleepFor(3);
    }
    /*call the testPracticeButton method from priority no 1 to get the next page and then i scroll
    down for to see the exactly location to see the hide button is working or not */
    @Test(priority = 11)
    public static void testHide() throws InterruptedException {
        testPracticeButton();
        scrollUpDown(600);
        sleepFor(3);
        clickHide();
        sleepFor(3);
    }
    //get the text from web element in the console
    @Test(priority = 12)
    public static void testWebElementBox() throws InterruptedException {
        testPracticeButton();
        scrollUpDown(600);
        sleepFor(2);
        System.out.println(getWebElementBox().getText());
    }
    // test Mouse Hover
    @Test(priority = 13)
    public static void testMouseHover() throws InterruptedException {
        testPracticeButton();
        scrollUpDown(700);
       mouseHoverByXpath(mouseHoverXp);
    }
    // Screen shot
    @Test(priority = 14)
    public static void testSignUpAndScreenShot() throws InterruptedException {
        getInItElements();
        testPracticeButton();
        clickSignUp();
        sleepFor(3);
        captureScreenshot(driver, signUpXp);
        sleepFor(5);
    }
    // send keys on user id field and clean the text
    @Test(priority = 15)
    public static void testSendUserName () throws InterruptedException {
        getInItElements();
        sleepFor(2);
        clickSignUp();
        sleepFor(3);
        sendUserName();
        sleepFor(4);
        cleanField(userNameXp);
        sleepFor(3);
    }
    // text Validation Actual and expected
    @Test(priority = 16)
    public static void testPracticePage() throws InterruptedException {
        testPracticeButton();
        System.out.println(getPracticePage().getText());
        String expected = "Practice Page";
        String actual = getPracticePage().getText();
        assertValidate(actual,expected);
    }
    // check hide and show field input
    @Test(priority = 17)
    public static void testHideAndShowFieldInput() throws InterruptedException {
        testPracticeButton();
        typeByXpath(hideAndShowFieldXp, "Hello world");
    }
    // Iframe handele
    @Test(priority = 18)
    public static void testiframe() throws InterruptedException {
        testPracticeButton();
        scrollUpDown(1400);
        iframeHandle(iframe); //WEB element value
       // sleepFor(5);
        useIframSearchBar();
        //sleepFor(5);
        goBackToHomeWindow();
        sleepFor(5);
    }
    // check show
    @Test(priority = 19)
    public static void testShow() throws InterruptedException {
        testPracticeButton();
        scrollUpDown(600);
        clickShow();

    }










}
