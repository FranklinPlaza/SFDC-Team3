package Pages.Leads;

import Framework.CommonActions;
import Pages.Base.ElementFormBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Pablo Zubieta on 27/08/2015.
 * This class holds leads home page elements and inherits from FormBase the basic button "new"
 */

public class LeadHomePage extends ElementFormBase {

	
	@FindBy(linkText = "Create New View")
    @CacheLookup
    protected WebElement createNewViewLnk;
	
    public LeadHomePage() {
        super();
    }

    @Override
    public NewLeadPage clickNewBtn() {
        //wait.until(ExpectedConditions.visibilityOf(newElementBtn));
        newElementBtn.click();
        return new NewLeadPage();
    }
    
    public NewLeadForm clickNewViewLnk() {
    	CommonActions.click(createNewViewLnk);
    	return new NewLeadForm();
    } 
    
    
}