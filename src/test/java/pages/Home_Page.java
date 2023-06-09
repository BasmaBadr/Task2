package pages;

 import org.openqa.selenium.By;
 import stepDefinations.Hooks;


public class Home_Page {


    By Bn_SelectCountry= By.xpath("//span[@id='arrow']//img");
    By Btn_BahrainCountry= By.cssSelector("#bh-contry-lable");
    By Btn_KsaCountry= By.cssSelector("#sa-contry-lable");
    By Btn_KuwaitCountry= By.cssSelector("#kw-contry-lable");


    public void navigateToSelectCountry() {
        clickButton(Bn_SelectCountry);
  }
    public void chooseBahrainCountry(){
        clickButton(Btn_BahrainCountry);
    }
    public void chooseKsaCountry(){
        clickButton(Btn_KsaCountry);
    }
    public void chooseKuwaitCountry(){
        clickButton(Btn_KuwaitCountry);
    }

    public void clickButton(By element){

        Hooks.driver.findElement(element).click();
    }

}
