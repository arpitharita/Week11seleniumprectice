import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Automation {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.way2automation.com/");
        String titlepages = driver.getTitle();
        System.out.println(titlepages);
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        //driver.quit();

        WebDriver driver1= new EdgeDriver();
        driver1.get("https://www.way2automation.com/");
        String titlepages1 = driver1.getTitle();
        System.out.println(titlepages1);
        driver1.manage().window();
        driver1.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        //driver1.quit();


        WebDriver driver2= new FirefoxDriver();
        driver2.get("https://www.way2automation.com/");
        String titlepages2 = driver2.getTitle();
        System.out.println(titlepages2);
        driver2.manage().window();
        driver2.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        //driver2.quit();

    }
}
