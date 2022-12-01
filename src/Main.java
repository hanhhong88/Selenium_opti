import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException{
//        lay duong dan thu muc goc
        String projectPath = System.getProperty("user.dir");
//        tro duong dan toi chrome/firefox/edge driver
        System.setProperty("webdriver.opera.driver", projectPath + "/web_driver/operadriver.exe");
//        khoi tao 1 doi tuong chrome/firefox/edge driver
        WebDriver driver = new OperaDriver();
//        dieu huong toi trang google.com
        driver.get("https://google.com");
//        open full size
        driver.manage().window().maximize();
//        dung luong chay 5000ms
        Thread.sleep(5000);
//        dong cua so trinh duyet
        driver.quit();
    }
}