package Gun04;

import Utility.Myfunc;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element= driver.findElement(By.className("form-sub-label"));
        System.out.println("Element.getText() = " + element.getText());
        // findelement: locator birden fazla elemanı işaret ediyor olsa bile ilkini bulur

        // Bütün elemanları almak için findElements kullanılır
        List<WebElement> etiketler = driver.findElements(By.className("form-sub-label"));
        System.out.println("Etiketlerin size'ını alır. " + etiketler.size());
        for (WebElement e : etiketler)
            System.out.println(e.getText());

        Myfunc.Bekle(3);
        driver.quit();


    }
}
