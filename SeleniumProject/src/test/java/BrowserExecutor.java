import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserExecutor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //Convenient
        driver.get("https://selenium.dev");

        //Longer way
        driver.navigate().to("https://selenium.dev");

        String url = driver.getCurrentUrl();
        System.out.println("URL: "+url);

        driver.navigate().back();
        driver.navigate().refresh();

        String title = driver.getTitle();
        System.out.println("Title: "+title);

        driver.close();
        driver.quit();






    }
}
