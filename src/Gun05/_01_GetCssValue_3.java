package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_GetCssValue_3 extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://snapdeal.com/");

        WebElement aramaKutusu = driver.findElement(By.id("inputValEnter"));

        // GetAttribute parametreleri ve değerleri
        System.out.println("aramaKutusu.getAttribute(autocomplete) = " + aramaKutusu.getAttribute("autocomplete"));
        System.out.println("aramaKutusu.getAttribute(name) = " + aramaKutusu.getAttribute("name"));
        System.out.println("aramaKutusu.getAttribute(type) = " + aramaKutusu.getAttribute("type"));
        System.out.println("aramaKutusu.getAttribute(class) = " + aramaKutusu.getAttribute("class"));
        System.out.println("aramaKutusu.getAttribute(id) = " + aramaKutusu.getAttribute("id"));
        System.out.println("aramaKutusu.getAttribute(onkeypress) = " + aramaKutusu.getAttribute("onkeypress"));
        System.out.println("aramaKutusu.getAttribute(placeholder) = " + aramaKutusu.getAttribute("placeholder"));


        // Şekil özellikleri -- Yani rengi , fontu , backgroundu
        System.out.println("aramaKutusu.getCssValue() = " + aramaKutusu.getCssValue("color"));
        System.out.println("aramaKutusu.getCssValue() = " + aramaKutusu.getCssValue("background"));
        System.out.println("aramaKutusu.getCssValue() = " + aramaKutusu.getCssValue("font-size"));
        System.out.println("aramaKutusu.getCssValue() = " + aramaKutusu.getCssValue("height"));
        System.out.println("aramaKutusu.getCssValue() = " + aramaKutusu.getCssValue("border-radius"));
        System.out.println("aramaKutusu.getCssValue() = " + aramaKutusu.getCssValue("font-family"));


        BekleKapat();

    }
}