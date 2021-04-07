package pages;

import pageObjects.ComposeFunctionObjects;

public class ComposeFunction {
	ComposeFunctionObjects compose=new ComposeFunctionObjects();
	public void sendUserName()
	{
		compose.sendUserName();
	}
	
	public void sendPassword()
	{
		compose.sendPassword();
	}
	
	public void clickLoginButton()
	{
		compose.clickLoginButton();
	}
	
	public void waitUntilUserNavigatedToInboxScreen()
	{
		compose.wait(compose.ComposeButton);
	}
	
	public void ClickComposeButton()
	{
		compose.ClickComposeButton();
	}
	
	public void waitUntilNewMessageWindowDisplayed()
	{
		compose.wait(compose.NewMessageWindow);
	}
	
	public void EnterToField()
	{
		compose.EnterToField();
	}
	
	public void EnterSubjectField(String Subject)
	{
		compose.EnterSubjectField(Subject);
	}
	
	public void EnterBodyField(String Body)
	{
		compose.EnterBody(Body);
	}
	
	public void ClickSendButton()
	{
		compose.clickSendButton();
	}
	
	public void VerifyIfMessageSent()
	{
		compose.wait(compose.MessageSentText);
	}
}
