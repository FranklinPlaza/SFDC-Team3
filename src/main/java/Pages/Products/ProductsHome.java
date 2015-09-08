package Pages.Products;
import Framework.CommonActions;
import Pages.Base.HomeBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


/**
 * Created by ivan on 26-06-15.
 */

public class ProductsHome extends HomeBase {


 

    @FindBy(xpath = "//*[@name='new' and @type='button']")
    @CacheLookup
    WebElement NewButtton;


    public ProductsHome()
    {

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
