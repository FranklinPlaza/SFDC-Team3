package Pages.Contacts;


import Framework.CommonActions;
import Pages.Base.HomeBase;
<<<<<<< HEAD

=======
>>>>>>> refs/remotes/upstream/development
import Pages.Contacts.NewContactForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Gisela on 6/28/2015.
 */
<<<<<<< HEAD
public class ContactsHome extends HomeBase{
   
=======
public class ContactsHome extends HomeBase {



>>>>>>> refs/remotes/upstream/development
    //region Locators

    @FindBy(xpath = "//input[@name='new']")
    @CacheLookup
    WebElement newButton;
    //endregion

    public ContactsHome()
    {
<<<<<<< HEAD
    	super();
=======
        super();
>>>>>>> refs/remotes/upstream/development
    }


    public NewContactForm clickPostLnk() {
        CommonActions.click(newButton);
        return new NewContactForm();
    }

<<<<<<< HEAD
    public NewContactForm clickNewViewLnk() {
		CommonActions.click(createNewViewLnk);
		return new NewContactForm();
	}

    
=======


>>>>>>> refs/remotes/upstream/development
}
