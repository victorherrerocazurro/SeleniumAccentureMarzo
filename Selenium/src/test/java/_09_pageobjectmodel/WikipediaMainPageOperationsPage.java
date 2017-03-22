package _09_pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaMainPageOperationsPage {
	
	private WebDriver driver;

	@FindBy(id = "searchInput")
	private WebElement searchBox;
	
	@FindBy(id = "searchButton")
	private WebElement searchButton;
	
	@FindBy(id = "pt-anoncontribs")
	private WebElement contributionsLink;
	
	@FindBy(id = "pt-createaccount")
	private WebElement createAccountLink;
	
	private String url = "https://es.wikipedia.org/wiki/Wikipedia:Portada";
	
	public WikipediaMainPageOperationsPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void load() {		
		this.driver.get(url);
	}
	
	public void close() {
		this.driver.close();
	}
	
	public void makeSearch(String text) {
		
		this.setSearchText(text);
		this.search();
	}

	public void setSearchText(String text) {
		this.searchBox.clear();
		this.searchBox.sendKeys(text);
	}
	
	public void search() {
		this.searchButton.click();
	}
	
	public void contributors() {
		this.contributionsLink.click();
	}
	
	public void createAccount() {
		this.createAccountLink.click();
	}
	
	public String getPlaceholder() {
		return searchBox.getAttribute("placeholder");
	}
}
