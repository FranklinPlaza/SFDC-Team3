package Pages.Opportunities;

import Framework.BrowserManager;
import Framework.CommonActions;
import Pages.Base.HomeBase;
<<<<<<< HEAD
import Pages.Base.ViewFormBase;
=======
>>>>>>> refs/remotes/upstream/development
import Pages.Campaigns.CampaignProfile;
<<<<<<< HEAD
import Pages.Campaigns.NewCampaignForm;

=======
import org.openqa.selenium.By;
>>>>>>> refs/remotes/upstream/development
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.management.HotspotMemoryMBean;

/**
 * Created by ivan on 26-06-15.
 */
public class OpportunitiesHome extends HomeBase{
<<<<<<< HEAD
    
=======

    private WebDriver driver;
    private WebDriverWait wait;

>>>>>>> refs/remotes/upstream/development
    @FindBy(xpath = "//*[@name='new' and @type='button']")
    @CacheLookup
    WebElement NewButtton;
    private String accountName;

<<<<<<< HEAD
    public OpportunitiesHome() {
=======
    public OpportunitiesHome()
    {
>>>>>>> refs/remotes/upstream/development
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

<<<<<<< HEAD
    public NewOpportunityForm clickNewViewLnk() {
		CommonActions.click(createNewViewLnk);
		return new NewOpportunityForm();
	}
=======
    public OpportunityProfile clickOnAccount(String accountName)
    {
        driver.findElement(By.linkText(accountName)).click();
        return new OpportunityProfile();
    }

>>>>>>> refs/remotes/upstream/development

}
