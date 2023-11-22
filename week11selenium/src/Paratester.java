import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Paratester {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://para.testar.org/");
        String titlepage = driver.getTitle();
        System.out.println(titlepage);
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        // driver.quit();

        WebDriver driver1 =new EdgeDriver();
        driver1.get("https://para.testar.org/");
        String titlepage1 = driver1.getTitle();
        System.out.println(titlepage1);
        driver1.manage().window();
        driver1.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        // driver1.quit();

        WebDriver driver2 =new FirefoxDriver();
        driver2.get("https://para.testar.org/");
        String titlepage2 = driver2.getTitle();
        System.out.println(titlepage2);
        driver2.manage().window();
        driver2.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        // driver2.quit();
    }
}
