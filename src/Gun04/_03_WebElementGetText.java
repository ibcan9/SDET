package Gun04;

import Utility.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_WebElementGetText {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement labelFirstName= driver.findElement(By.id("sublabel_8_first"));
        String elementinGorunenYazisi=labelFirstName.getText();

        System.out.println("elementinGorunenYazisi = " + elementinGorunenYazisi);

        WebElement labelSurName= driver.findElement(By.id("sublabel_8_last"));
        String elementinGorunenYazisi2=labelSurName.getText();

        System.out.println("elementinGorunenYazisi2 = " + elementinGorunenYazisi2);

        Myfunc.Bekle(3);
        driver.quit();
    }
}
