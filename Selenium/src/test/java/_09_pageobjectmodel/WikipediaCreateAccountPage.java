package _09_pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import static org.junit.Assert.*;

public class WikipediaCreateAccountPage extends LoadableComponent<WikipediaCreateAccountPage> {
	
	@FindBy(id = "wpName2")
	private WebElement usernameElement;

	@FindBy(id = "wpPassword2")
	private WebElement passElement;

	@FindBy(id = "wpRetype")
	private WebElement confirmPassElement;

	@FindBy(id = "wpName2")
	private WebElement emailElement;

	@FindBy(id = "mw-input-captchaWord")
	private WebElement captchaElement;
 	 
	@FindBy(id = "wpCreateaccount")
	private WebElement submitButton;
	
	private String url = "https://es.wikipedia.org/w/index.php?title=Especial:Crear_una_cuenta";
	private WebDriver driver;
	
	public WikipediaCreateAccountPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@Override
	protected void load() {
		this.driver.get(url);		
	}

	@Override
	protected void isLoaded() throws Error {
		assertEquals("Crear una cuenta - Wikipedia, la enciclopedia libre", driver.getTitle());
	}

	public void submitUser(String username, String password, String email, String captcha) {
		
		usernameElement.clear();
		usernameElement.sendKeys(username);
		
		passElement.clear();
		passElement.sendKeys(password);
		
		confirmPassElement.clear();
		confirmPassElement.sendKeys(password);
		
		captchaElement.clear();
		captchaElement.sendKeys(captcha);
		
		submitButton.click();
	}

}
