package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testhomepage.TestHomePage;

public class HomePageStepDefination extends TestHomePage {

    @Given("I click on practice button")
    public void i_click_on_practice_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testPracticeButton();
    }
    @Given("I click on radio button")
    public void i_click_on_radio_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testRadioButton();
    }
    @Given("I Select honda in the dropdown button")
    public void i_Select_honda_in_the_dropdown_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testDropDownSelectBar();
    }

    @Given("I Select BMW in the dropdown button")
    public void i_Select_BMW_in_the_dropdown_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testSelectDropDownSelectBar();
    }
    //11
    @Given("Select all the mutiSelect element")
    public void select_all_the_mutiSelect_element() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testMultiSelectBox();
    }
@Then("I Select all the mutiSelect element")
public void i_Select_all_the_mutiSelect_element() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   testMultiSelectBox();
}
    @Given("I click the checkbox")
    public void i_click_the_checkbox() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testCheckBoxSelect();
    }
    @Given("I click the switch window button")
    public void i_click_the_switch_window_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testPracticeButton();
        clickSwitcNewhWindow();
        sleepFor(4);
        handleNewWindow(driver);
        sleepFor(3);
    }
    @Given("i cick the new tab button")
    public void i_cick_the_new_tab_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testPracticeButton();
        clickSwitchNewTab();
        sleepFor(3);
        handleNewTab(driver);
        sleepFor(3);
    }
    @Given("I Click on alert handel")
    public void i_Click_on_alert_handel() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testAlertHandlingPositive();
    }
    @Given("I click in confirm button")
    public void i_click_in_confirm_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
       testAlertHandlingNegative();
    }
    @Given("I click hide button")
    public void i_click_hide_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testHide();
    }

    @Given("I check the total webElement")
    public void i_check_the_total_webElement() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testWebElementBox();
    }
    @Given("I check the mouse Hover")
    public void i_check_the_mouse_Hover() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testMouseHover();
    }
    @Given("I click the sign up button")
    public void i_click_the_sign_up_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testSignUpAndScreenShot();
    }
    @Given("I put the user valu in in user id field")
    public void i_put_the_user_valu_in_in_user_id_field() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getInItElements();
        sleepFor(2);
        clickSignUp();
        sleepFor(3);
        sendUserName();
        sleepFor(4);
        cleanField(userNameXp);
        sleepFor(3);
    }

    @Given("I validate the actual value to expected value")
    public void i_validate_the_actual_value_to_expected_value() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
      testPracticePage();
    }

    @Given("I send the value")
    public void i_send_the_value() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testHideAndShowFieldInput();
    }
    @Given("Send value in iframe")
    public void send_value_in_iframe() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
      testiframe();
    }
    @Given("I click on Show button")
    public void i_click_on_Show_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testShow();
    }














}
