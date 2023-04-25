package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseURL="https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseURL);
    }
    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    public void selectMenu(String menu){
       //This method should click on the menu whatever name is passed as parameter.
        if(menu.equalsIgnoreCase("Computers")){
             clickOnElement(By.linkText("Computers"));
        }else if(menu.equalsIgnoreCase("Electronics")){
            clickOnElement(By.linkText("Electronics"));
        }else if(menu.equalsIgnoreCase("Apparel")) {
            clickOnElement(By.linkText("Apparel"));
        }else if(menu.equalsIgnoreCase("Digital downloads")) {
            clickOnElement(By.linkText("Digital downloads"));
        }else if(menu.equalsIgnoreCase("Books")) {
            clickOnElement(By.linkText("Books"));
        }else if(menu.equalsIgnoreCase("Jewelry")) {
            clickOnElement(By.linkText("Jewelry"));
        }else if(menu.equalsIgnoreCase("Gift Cards")) {
            clickOnElement(By.linkText("Gift Cards"));
        }else{
            System.out.println("you have done wrong selection");
        }
    }
    /**
     * create the @Test method name verifyPageNavigation.use selectMenu method to
     * select the Menu and click on it and verify the page navigation.
     */
    @Test
    public void verifyPageNavigation(){
        selectMenu("Gift Cards");
        verifyThis("Gift Cards",By.linkText("Gift Cards"));
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
