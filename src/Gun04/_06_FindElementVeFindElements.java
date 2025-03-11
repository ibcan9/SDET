package Gun04;

import Utility.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _06_FindElementVeFindElements {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");



        List<WebElement> elementler = driver.findElements(By.id("hatalilocator"));
        System.out.println(elementler.size());


        Myfunc.Bekle(3);
        driver.quit();





    }
}
