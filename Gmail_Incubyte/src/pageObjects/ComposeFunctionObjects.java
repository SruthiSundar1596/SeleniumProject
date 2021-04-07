package pageObjects;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.LaunchBrowser;
import utilities.PropertyRead;

public class ComposeFunctionObjects {

	WebDriverWait wait;
	WebDriver driver;
	Properties prop;

	@FindBy(xpath = "//input[@type='email']")
	public WebElement UserName;

	@FindBy(xpath = "//input[@type='password']")
	public WebElement Password;

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	public WebElement NextButton;

	@FindBy(xpath = "//div[contains(text(),'Compose')]")
	public WebElement ComposeButton;

	@FindBy(xpath = "//span[contains(text(),'New Message')]")
	public WebElement NewMessageWindow;

	@FindBy(xpath = "//textarea[@name='to']")
	public WebElement ToField;

	@FindBy(xpath = "//input[@name='subjectbox']")
	public WebElement SubjectField;

	@FindBy(xpath = "//div[@aria-label='Message Body']")
	public WebElement BodyField;

	@FindBy(xpath = "//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")
	public WebElement SendButton;
	
	@FindBy(xpath = "//*[contains(text(),'Message sent.')]")
	public WebElement MessageSentText;

	public ComposeFunctionObjects() {
		driver = LaunchBrowser.driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(LaunchBrowser.driver, 50);
		prop = PropertyRead.prop();
	}

	public void sendUserName() {
		UserName.sendKeys(prop.getProperty("UserName"));
		wait(NextButton);
		UserName.sendKeys(Keys.ENTER);
		wait(Password);
	}

	public void sendPassword() {
		Password.sendKeys(prop.getProperty("Password"));
	}

	public void clickLoginButton() {
		Password.sendKeys(Keys.ENTER);
	}

	public void ClickComposeButton() {
		ComposeButton.click();
	}

	public void EnterToField() {
		ToField.sendKeys(prop.getProperty("ToEmail"));
	}

	public void EnterSubjectField(String Subject) {
		SubjectField.sendKeys(Subject);
	}

	public void EnterBody(String Body) {
		BodyField.sendKeys(Body);
	}

	public void clickSendButton() {
		SendButton.click();

	}
	
	public void wait(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
