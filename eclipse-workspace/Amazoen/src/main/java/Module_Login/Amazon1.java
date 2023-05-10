package Module_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon1 
{

	@FindBy(xpath="//span[text()='Account & Lists']") private WebElement Acount;
	@FindBy(xpath="(//span[@class='nav-action-inner'])[1]") private WebElement SingUp;
	@FindBy(xpath="//a[@id='createAccountSubmit']") private WebElement CreateNeWAccount;
	
	@FindBy(xpath="//input[@id='ap_customer_name']") private WebElement UserName;
	@FindBy(xpath="//input[@id='ap_email']") private WebElement Email;
	@FindBy(xpath="//input[@id='ap_password']") private WebElement Password;
	@FindBy(xpath="//input[@id='ap_password_check']") private WebElement RePassword;
	@FindBy(xpath="//input[@id='continue']") private WebElement ContinuedBtn;
	@FindBy(xpath="//h4[text()='Email address already in use']") private WebElement VerifyMSG;
	
	public Amazon1 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void AcountClick(WebDriver driver)
	{
		Actions act=new Actions(driver);
		
		        act.moveToElement(Acount).perform();	        
	}
	
	public void ClickSignUpBTN()
	{
		SingUp.click();
	}
	public void CreateAccount()
	{
		CreateNeWAccount.click();
	}
	
	public void UserName(String User)
	{
		UserName.sendKeys(User);
	}
	public void Email(String mail)
	{
		Email.sendKeys(mail);
	}
	public void Password(String pass)
	{
		Password.sendKeys(pass);
	}
	public void RePassword(String repass)
	{
		RePassword.sendKeys(repass);
	}
	public void ContinuedBtn()
	{
		ContinuedBtn.click();
	}
	public String VerifyMassage()
	{
	   String 	Actual=VerifyMSG.getText();
	      return Actual;
	}
}
