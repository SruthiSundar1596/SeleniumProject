package stepDefinitions;

import java.io.IOException;

import baseClass.LaunchBrowser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ComposeFunction;

public class StepDefinitions {
	ComposeFunction compose;
	
	@Given("I launched the chrome browser and navigated to Gmail URL")
	public void i_launched_the_chrome_browser() throws IOException {
		LaunchBrowser.browserLaunch();
	}

	@When("I enter Username")
	public void i_enter_username() {
		compose=new ComposeFunction();
		compose.sendUserName();
	}

	@When("I enter Password")
	public void i_enter_password() {
		compose.sendPassword();
	}

	@When("click on Login button")
	public void click_on_login_button() {
		compose.clickLoginButton();
	}

	@Then("I verify if i navigated to Inbox Emails screen")
	public void i_verify_if_i_navigated_to_inbox_emails_screen() {
		compose.waitUntilUserNavigatedToInboxScreen();
	}

	@When("I Click on Compose button")
	public void i_click_on_compose_button() {
		compose.ClickComposeButton();
	}

	@Then("I should be displayed with Compose pop-up")
	public void i_should_be_displayed_with_compose_pop_up() {
		compose.waitUntilNewMessageWindowDisplayed();
	}

	@When("I enter To Email Address")
	public void i_enter_to_email_address() {
		compose.EnterToField();
	}

	@When("I enter Subject as {string}")
	public void i_enter_subject_as(String subject) {
		compose.EnterSubjectField(subject);
	}

	@When("I enter Body as {string}")
	public void i_enter_body_as(String Body) {
		compose.EnterBodyField(Body);
	}

	@When("I click on Send button")
	public void i_click_on_send_button() {
		compose.ClickSendButton();
	}

	@Then("I verify if mail is sent")
	public void i_verify_if_mail_is_sent() {
		compose.VerifyIfMessageSent();
	}

}
