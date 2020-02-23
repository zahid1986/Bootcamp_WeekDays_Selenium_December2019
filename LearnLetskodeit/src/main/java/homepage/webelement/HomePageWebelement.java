package homepage.webelement;

import common.WebAPI;

public class HomePageWebelement extends WebAPI {
    // 1. click on practice button
    public static final String practiceXp = "//a[@class='fedora-navbar-link navbar-link']";
    // 2. check the radio button
    public static final String radioButtonXp = "//input[@id='bmwradio']";
    // 3. Select drop down class bar
    public static final String selectDropDownClassBarXp = "//select[@id='carselect']";
    // 4. multi select box
    public static final String multiSelectBoxXp = "//select[@id='multiple-select-example']";
    // 5. Check box select
    public static final String CheckBoxSelectXp = "//input[@id='hondacheck']";
    // 6. Switch New Window
    public static final String switcNewhWindowXp = "//button[@id='openwindow']";
    // 7. Switch new Tab
    public static final String switchNewTabXp = "//a[@id='opentab']";
    // 8. Positive Alert handling
    public static final String alertxP = "//input[@id='alertbtn']";
    // 9. Negative Alert handling
    public static final String confirmXp = "//input[@id='confirmbtn']";
    // 10. Element displayed example hide & Show Button
    public static final String hideXp = "//input[@id='hide-textbox']";
    // 11. web table Example, get the text in the console **
    public static final String webElementBoxXp = "//table[@id='product']";
    // 12. mouse Hover
    public static final String mouseHoverXp = "//button[@id='mousehover']";
    // 13. Sign up button and SEREEN SHORT
    public static final String signUpXp = "//a[@id='header-sign-up-btn']";
    // 14. Send text on user name
    public static final String userNameXp = "//input[@id='user_name']";
    // text Validation Actual and expected
    public static final String practicePageXp = "//h1[contains(text(),'Practice Page')]";
    // check hide and show field input
    public static final String hideAndShowFieldXp = "//input[@id='displayed-text']";
    // 1. iframe handiling
    public static final String iframeXp = "//iframe[@id='courses-iframe']";
    public static final String iframeName = "iframe-name";

    // 2. iFrame handiling
    public static final String iframeSearchBarXp = "//input[@id='search-courses']";
    //
    public static final String showXp = "//input[@id='show-textbox']";







}
