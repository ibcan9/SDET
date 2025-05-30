package Gun09;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _05_SelectClass extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://www.amazon.com.tr/");

        WebElement webElementSelect=driver.findElement(By.id("searchDropdownBox")); // html içindeki SELECT webelemment
        // webElementSelect.click();
        // optionı bulup ona tıklatıyordum

        Select ddMenu=new Select(webElementSelect); // Select html elementi SELECT sınıfından NESNEYE dönüşüyor
        ddMenu.selectByIndex(4);  // istersen index gibi option ı seçebilirsin
        //ddMenu.selectByValue(""); // istersen value siyle seçebilirsin
        //ddMenu.selectByVisibleText(""); // istersen görünen text ile de seçebilirsin

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());

        for (WebElement option: ddMenu.getOptions())
        {
            System.out.println("option.getText() = " + option.getText());
            System.out.println("option.getAttribute(value) = " + option.getAttribute("value"));
        }

        BekleKapat();
    }


}
