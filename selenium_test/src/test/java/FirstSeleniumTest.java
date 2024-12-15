import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    @Test
    public void firstTest() {
        // Cho hệ thống biết đường dẫn để tìm chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        // Tạo webdriver mới cho ChromeDriver
        WebDriver driver = new ChromeDriver();
        //Bật trình duyệt
        driver.navigate().to("http://www.google.com/");
        // Click vào khung search và điền giá trị
        driver.findElement(By.name("q")).sendKeys("pho ga");
        // Click vào nút search
        driver.findElement(By.name("btnK")).click();
        // Tắt trình duyệt
        driver.quit();
    }
}
