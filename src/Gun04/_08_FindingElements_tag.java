package Gun04;

import Utility.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _08_FindingElements_tag {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hepsiburada.com/");


        List< WebElement> linkler = driver.findElements(By.tagName("a"));
        for (WebElement link : linkler)
            if (!link.getText().equals(""))
            System.out.println(link.getSize());

        Myfunc.Bekle(2);
        driver.quit();



    }
}
