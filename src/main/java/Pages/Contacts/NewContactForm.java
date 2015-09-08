package Pages.Contacts;

import Framework.BrowserManager;
import Framework.CommonActions;
import Pages.Base.ViewBase;
import Pages.Base.ViewFormBase;
import Pages.Campaigns.CampaignView;
import Pages.Contacts.ContactsProfile;
import Pages.LookUp.LookUpWindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Gisela on 6/28/2015.
 */
public class NewContactForm extends ViewFormBase{


    @FindBy(id = "name_salutationcon2")
    @CacheLookup
    WebElement firstNameCategoryField;
   
    @FindBy(id = "name_firstcon2")
    @CacheLookup
    WebElement firstNameField;
  
    @FindBy(id = "name_lastcon2")
    @CacheLookup
    WebElement lastNameField;
   
    @FindBy(id = "con4")
    @CacheLookup
    WebElement accountNameField;
   
    @FindBy(id = "con5")
    @CacheLookup
    WebElement titleField;
    
    @FindBy(id = "con6")
    @CacheLookup
    WebElement departmentField;
   
    @FindBy(id = "con7")
    @CacheLookup
    WebElement birthDateField;

    @FindBy(id = "con8")
    @CacheLookup
    WebElement reportToField;

    @FindBy(id = "con9")
    @CacheLookup
    WebElement leadSourceField;

    @FindBy(id = "con10")
    @CacheLookup
    WebElement phoneField;



    @FindBy(xpath = "//input[@tabindex='32']")
    @CacheLookup
    WebElement saveNewBtn;

    @FindBy(xpath = "//input[@tabindex='33']")
    @CacheLookup
    WebElement cancelBtn;


    public NewContactForm()
    {

        super();

    }
    
    public NewContactForm selectFirstNameCategory(String item) {
        CommonActions.selectItem(firstNameCategoryField, item);
        return this;
    }

    public NewContactForm setContactNameField(String text) {
        CommonActions.setValue(firstNameField, text);
        return this;
    }

    public NewContactForm setLastName(String text) {
        CommonActions.setValue(lastNameField, text);
        return this;
    }

    public NewContactForm setAccountName(String text) {
        CommonActions.setValue(accountNameField, text);
        return this;
    }

    public NewContactForm setTitle(String text) {
        CommonActions.setValue(titleField, text);
        return this;
    }

    public NewContactForm setDepartment(String text) {
        CommonActions.setValue(departmentField, text);
        return this;
    }

    public NewContactForm setBirthDate(String date) {
        CommonActions.setValue(birthDateField, date);
        return this;
    }


    public NewContactForm selectLeadSource(String item) {
        CommonActions.selectItem(leadSourceField, item);
        return this;
    }

    public ContactsProfile clickSaveButton() {
        CommonActions.click(saveBtn);
        return new ContactsProfile();

    }
    
    public ContactView clickSaveBtn() {
    	ContactView contactView = (ContactView) new ContactView().setViewName(this.viewNameTxt).setViewUniqueName(this.viewUniqueNameTxt);
    	CommonActions.click(saveBtn);
    	return contactView;

    }


}
