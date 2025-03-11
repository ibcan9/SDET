package Gun03;
import Utility.Myfunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();

            driver.get("https://google.com.tr/");

            Myfunc.Bekle(3);

            driver.quit();


    }

}
