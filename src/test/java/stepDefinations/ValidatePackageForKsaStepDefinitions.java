package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Home_Page;
import pages.ValidatePackageForCountry_Page;


public class ValidatePackageForKsaStepDefinitions {


    Home_Page homePage =new Home_Page();
    ValidatePackageForCountry_Page validatePage=new ValidatePackageForCountry_Page();

    @Given("user open page and click on select country Ksa")
    public void selectCountry(){
        homePage.navigateToSelectCountry();
        homePage.chooseKsaCountry();
    }

    @Then("Package Type and Price should be displayed for Ksa")
    public void verifyTypeAndPriceForBahrain(){
        Assert.assertTrue(validatePage.isDisplayKsaPackage());
        Assert.assertEquals(validatePage.validatePackageType(),"CLASSIC");
        Assert.assertEquals(validatePage.validatePackagePrice(),"25 SAR/month");
    }
}
