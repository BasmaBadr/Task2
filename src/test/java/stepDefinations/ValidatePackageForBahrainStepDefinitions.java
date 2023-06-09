package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Home_Page;
import pages.ValidatePackageForCountry_Page;



public class ValidatePackageForBahrainStepDefinitions {


    Home_Page homePage =new Home_Page();
    ValidatePackageForCountry_Page validatePage=new ValidatePackageForCountry_Page();

    @Given("user open page and click on select country Bahrain")
    public void selectCountry(){
        homePage.navigateToSelectCountry();
        homePage.chooseBahrainCountry();
    }

    @Then("Package Type and Price should be displayed for Bahrain")
    public void verifyTypeAndPriceForBahrain(){
        Assert.assertEquals(validatePage.validatePackage(),"12 - MOST POPULAR");
        Assert.assertEquals(validatePage.validatePackageType(),"CLASSIC");
        Assert.assertEquals(validatePage.validatePackagePrice(),"3 BHD/month");

    }
}
