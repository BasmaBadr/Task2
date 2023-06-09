package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Home_Page;
import pages.ValidatePackageForCountry_Page;


public class ValidatePackageForKuwaitStepDefinitions {


    Home_Page homePage =new Home_Page();
    ValidatePackageForCountry_Page validatePage=new ValidatePackageForCountry_Page();

    @Given("user open page and click on select country Kuwait")
    public void selectCountry(){
        homePage.navigateToSelectCountry();
        homePage.chooseKuwaitCountry();
    }

    @Then("Package Type and Price should be displayed for Kuwait")
    public void verifyTypeAndPriceForBahrain(){
        Assert.assertEquals(validatePage.validatePackage(),"12 - MOST POPULAR");
        Assert.assertEquals(validatePage.validatePackageType(),"CLASSIC");
        Assert.assertEquals(validatePage.validatePackagePrice(),"2.5 KWD/month");

    }
}
