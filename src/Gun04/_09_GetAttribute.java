package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _09_GetAttribute {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://hepsiburada.com/");


        Gun04.WebElement siparislerimlinki=driver.findElement(By.linkText("Siparişlerim"));
        System.out.println(siparislerimlinki.getText());

        
    }
}
