package happy1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	//initialization
		public LoginPage1(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		
		//declaration
		@FindBy(name= "user_name")
		private WebElement usernameEdt;
		
		@FindBy(name= "user_password")
		private WebElement passwordEdt;
		
		@FindBy(id= "submitButton")
		private WebElement submitBtn;
		
		//working
		
		//utilizaation     (create business libraries)
		public WebElement getusernameEdt()
		{
			return usernameEdt;
		}
		
		public WebElement getpasswordEdt()
		{
			return passwordEdt;
		}
		
		public WebElement getsubmitBtn()
		{
			return submitBtn;
		}
		
		
		public void  loginToApp(String username, String password)
		{
			usernameEdt.sendKeys(username);
			passwordEdt.sendKeys(password);
			submitBtn.click();
		}
		
		

}
