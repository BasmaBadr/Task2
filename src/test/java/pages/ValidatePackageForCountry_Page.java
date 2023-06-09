package pages;

import org.openqa.selenium.By;
import stepDefinations.Hooks;

public class ValidatePackageForCountry_Page {

    By txt_PackageType = By.cssSelector("#name-classic");
    By txt_Package = By.xpath("//div[text()='12 - Most Popular']");
    By txt_PackagePrice = By.cssSelector("#currency-classic");
    By txt_KsaPackage = By.xpath("//div[@class='info-flag']");


    public String validatePackageType(){

        return getText(txt_PackageType);
    }
    public String validatePackagePrice(){

        return getText(txt_PackagePrice);
    }
    public String validatePackage(){

        return getText(txt_Package);
    }
    public Boolean isDisplayKsaPackage(){

        return isDisplay(txt_KsaPackage);
    }




    public String getText(By element) {

        return Hooks.driver.findElement(element).getText();
    }

    public boolean isDisplay(By element){

        return Hooks.driver.findElement(element).isDisplayed() ;
    }

}
