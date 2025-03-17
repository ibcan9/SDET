package Gun05;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_GetCssValue {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
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


        MyFunc.Bekle(3);
        driver.quit();






    }
}
