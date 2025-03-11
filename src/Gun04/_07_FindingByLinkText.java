package Gun04;

import Utility.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07_FindingByLinkText {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.get("https://hepsiburada.com/");


        WebElement siparislerimlinki=driver.findElement(By.linkText("Siparişlerim"));
        System.out.println(siparislerimlinki.getText());

        WebElement link2=driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println(link2.getText());
//        siparislerimlinki.click();


        Myfunc.Bekle(2);
        driver.quit();














    }
}
