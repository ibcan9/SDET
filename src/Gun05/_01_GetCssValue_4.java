package Gun05;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_GetCssValue_4 extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://snapdeal.com/");
        WebElement aramaKutusu=driver.findElement(By.id("inputValEnter"));

        // Şekil özellikleri -- Yani rengi , fontu , backgroundu
        System.out.println("aramaKutusu.getCssValue(color) = " + aramaKutusu.getCssValue("color"));
        System.out.println("aramaKutusu.getCssValue(background) = " + aramaKutusu.getCssValue("background"));
        System.out.println("aramaKutusu.getCssValue(font-size) = " + aramaKutusu.getCssValue("font-size"));
        System.out.println("aramaKutusu.getCssValue(height) = " + aramaKutusu.getCssValue("height"));
        System.out.println("aramaKutusu.getCssValue(font-family) = " + aramaKutusu.getCssValue("font-family"));

        BekleKapat();
    }
}