package Pages.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Framework.BrowserManager;
import Framework.CommonActions;
import Pages.Accounts.NewAccountPage;

public abstract class HomeBase {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	@FindBy(linkText = "Create New View")
    @CacheLookup
    protected WebElement createNewViewLnk;
    
	
	@FindBy(name = "new")
	@CacheLookup
	protected WebElement newElementBtn;
	
	@FindBy(xpath = "//*[@name='new' and @type='button']")
    @CacheLookup
    WebElement NewButtton;
	
	public HomeBase() {
		driver = BrowserManager.getInstance().getDriver();
		wait = BrowserManager.getInstance().getWait();
		PageFactory.initElements(driver, this);
	}
	
	public abstract ViewFormBase clickNewViewLnk ();
	
	public abstract FormBase clickNewViewLnk ();
	
	


}
