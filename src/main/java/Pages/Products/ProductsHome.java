package Pages.Products;

import Framework.BrowserManager;
import Framework.CommonActions;
import Pages.Base.HomeBase;
<<<<<<< HEAD
import Pages.Base.ViewFormBase;
import Pages.Opportunities.NewOpportunityForm;

=======
>>>>>>> refs/remotes/upstream/development
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by ivan on 26-06-15.
 */
<<<<<<< HEAD
public class ProductsHome extends HomeBase{
=======
public class ProductsHome extends HomeBase {


    private WebDriver       driver;
    private WebDriverWait   wait;
>>>>>>> refs/remotes/upstream/development

    @FindBy(xpath = "//*[@name='new' and @type='button']")
    @CacheLookup
    WebElement NewButtton;

<<<<<<< HEAD
    public ProductsHome(WebDriver driver) {
=======
    public ProductsHome()
    {
>>>>>>> refs/remotes/upstream/development
        super();
    }

    public NewProductForm clickNewButton() {
        CommonActions.click(NewButtton);
        return new NewProductForm();
    }
	
	public NewProductForm clickNewViewLnk() {
		CommonActions.click(createNewViewLnk);
		return new NewProductForm();
	}


}
