package Pages.Opportunities;

import Framework.CommonActions;
import Pages.Base.HomeBase;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


/**
 * Created by ivan on 26-06-15.
 */
public class OpportunitiesHome extends HomeBase{


    


    @FindBy(xpath = "//*[@name='new' and @type='button']")
    @CacheLookup
    WebElement NewButtton;
    private String accountName;


    public OpportunitiesHome()
    {
        super();
    }

    public NewOpportunityForm clickNewButton() {
        CommonActions.click(NewButtton);

        return new NewOpportunityForm();
    }

    public OpportunityProfile goOpportunityProfile(String url) {
        driver.navigate().to(url);

        return new OpportunityProfile();
    }


    public NewOpportunityForm clickNewViewLnk() {
		CommonActions.click(createNewViewLnk);
		return new NewOpportunityForm();
	}

    public OpportunityProfile clickOnAccount(String accountName)
    {
        driver.findElement(By.linkText(accountName)).click();
        return new OpportunityProfile();
    }



}
