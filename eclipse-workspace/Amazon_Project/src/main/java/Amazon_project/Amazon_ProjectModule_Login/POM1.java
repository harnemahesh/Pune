package Amazon_project.Amazon_ProjectModule_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 
{
 
	@FindBy(id="nav-link-accountList-nav-line-1") private WebElement Accountlink;
	@FindBy(xpath="(//span[text()='Sign in'])[1]") private WebElement SignIn;
	@FindBy(id="ap_email") private WebElement username;
	@FindBy(id="continue") private WebElement ContinuedBtn;
	@FindBy(id="ap_password") private WebElement Password;
	@FindBy(id="signInSubmit") private WebElement Sign;
	@FindBy(xpath="//h4[text()='There was a problem']") private WebElement Error;

	public POM1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
	public void move_to_accountlink(WebDriver driver)
	{
	  	WebElement link=Accountlink;
	   Actions act=new Actions(driver);
	   act.moveToElement(link).perform();
	}
	public void clickOnsingin()
	{
		SignIn.click();
	}
	public void EnterUserName(String user)
	{
		username.sendKeys(user);
	}
	public void ClickContinuedbtn()
	{
		ContinuedBtn.click();
	}
	public void EnterPassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void Clicksingin()
	{
		Sign.click();
	}
	public String showErrormsg()
	{
		String err=Error.getText();
		return err;
	}
	
	
}