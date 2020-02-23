package homepage.pageobject;

//import com.sun.org.apache.bcel.internal.generic.PUSH;
import homepage.webelement.HomePageWebelement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends HomePageWebelement {
    /* 1. click on practice button */
    @FindBy(how = How.XPATH, using = practiceXp)
    public static WebElement practice;
    public static WebElement getPractice(){return practice;}
    public static void clickPractice(){getPractice().click();}
    /* 2. check the radio button */
    @FindBy(how = How.XPATH, using = radioButtonXp)
    public static WebElement radioButton;
    public static WebElement getRadioButton(){return radioButton;}
    public static void clickRadioButtn(){getRadioButton().click();}
    /* 3 & 4. Select drop down class bar */
    @FindBy(how = How.XPATH,using = selectDropDownClassBarXp)
    public static WebElement selectDropDownClassBar;
    public static WebElement getSelectDropDownClassBar(){return selectDropDownClassBar; }
    public static void clickselectDropDownClassBar(){getSelectDropDownClassBar().click();}
    /* 5. Select some elements from multiselect box */
    @FindBy(how = How.XPATH, using = multiSelectBoxXp)
    public static WebElement multiSelectBox;
    public static WebElement getMultiSelectBox(){return multiSelectBox;}
    public static void clickMultiSelectBox(){getMultiSelectBox().click();}
    /* 6. CheckBOx select */
    @FindBy(how = How.XPATH, using = CheckBoxSelectXp)
    public static WebElement CheckBoxSelect;
    public static WebElement getCheckBoxSelect(){return CheckBoxSelect;}
    public static void selectCheckBox(){getCheckBoxSelect().click();}
    /* 7. switch new window */
    @FindBy(how = How.XPATH, using = switcNewhWindowXp)
    public static WebElement switcNewhWindow;
    public static WebElement getSwitcNewhWindow(){return switcNewhWindow;}
    public static void clickSwitcNewhWindow(){getSwitcNewhWindow().click();}
    /* 8. switch new tab */
    @FindBy(how = How.XPATH, using = switchNewTabXp)
    public static WebElement switchNewTab;
    public static WebElement getSwitchNewTab(){return switchNewTab;}
    public static void clickSwitchNewTab(){getSwitchNewTab().click();}
    /* 9. positive Alert Handling */
    @FindBy(how = How.XPATH, using = alertxP)
    public static WebElement alart;
    public static WebElement getAlart(){return alart;}
    public static void clickAlert(){getAlart().click();}
    /* 10. Negative Alert Handling */
    @FindBy(how = How.XPATH, using = confirmXp)
    public static WebElement confirm;
    public static WebElement getConfirm(){return confirm;}
    public static void clickConform(){getConfirm().click();}
    /* 11. Hide and show button check */
    @FindBy(how = How.XPATH, using = hideXp)
    public static WebElement hide;
    public static WebElement getHide(){return hide;}
    public static void clickHide(){getHide().click();}
    /* 12. Get the text in the console */
    @FindBy(how = How.XPATH, using = webElementBoxXp)
    public static WebElement webElementBox;
    public static WebElement getWebElementBox(){return webElementBox; }
    public static void clickwebElementBox(){getWebElementBox().isSelected();}
    /* 13. Mouse Hover */
    @FindBy(how = How.XPATH, using = mouseHoverXp)
    public static WebElement mouseHover;
    public static WebElement getMouseHover(){return mouseHover;}
    public static void setMouseHover(){getMouseHover().isSelected();}
    /* sign up and screen shot */
    @FindBy(how = How.XPATH, using = signUpXp)
    public static WebElement signUP;
    public static WebElement getSignUP(){return signUP;}
    public static void clickSignUp (){getSignUP().click();}
    /* send keys and clean the value */
    @FindBy(how = How.XPATH, using = userNameXp)
    public static WebElement userName;
    public static WebElement getUserName(){return userName;}
    public static void sendUserName (){getUserName().sendKeys("ZAHID HASAN");}
    /* text Validation Actual and expected */
    @FindBy(how = How.XPATH, using = practicePageXp)
    public static WebElement practicePage;
    public static WebElement getPracticePage(){return practicePage;}
    /* check hide and show field input */
    @FindBy(how = How.XPATH, using = hideAndShowFieldXp)
    public static WebElement hideAndShowField;
    public static WebElement getHideAndShowField(){return hideAndShowField;}
    /* 1. first take the total iframe xpath to get in the iframe */
    @FindBy(how = How.XPATH, using = iframeXp)
    public static WebElement iframe;
    public static WebElement getIframe(){return iframe;}
    /* 2. then i can work in iframe, without get in the iframe i can not work in the i frame  */
    @FindBy(how = How.XPATH, using = iframeSearchBarXp)
    public static WebElement iframeSearchBar;
    public static WebElement getIframeSearchBar(){return iframeSearchBar;}
    public static void useIframSearchBar(){getIframeSearchBar().sendKeys("info", Keys.ENTER);}
    /* show button check */
    @FindBy(how = How.XPATH, using = showXp)
    public static WebElement show;
    public static WebElement getShow(){return show;}
    public static void clickShow(){getShow().click();}




}
