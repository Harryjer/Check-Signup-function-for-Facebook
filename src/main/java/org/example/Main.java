import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // Auto download correct version
        WebDriver driver = new ChromeDriver();

        driver.get("https://web.facebook.com/r.php?entry_point=login");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).sendKeys("Thisal");
        driver.findElement(By.name("lastname")).sendKeys("Kodithuwakku");

        WebElement days = driver.findElement(By.name("birthday_day"));
        Select daym1 = new Select(days);
        Thread.sleep(3000);
        daym1.selectByVisibleText("29");

        WebElement months = driver.findElement(By.name("birthday_month"));
        Select monthm1 = new Select(months);
        Thread.sleep(3000);
        monthm1.selectByVisibleText("Dec");

        WebElement year = driver.findElement(By.name("birthday_year"));
        Select yearm1 = new Select(year);
        yearm1.selectByVisibleText("1995");


        WebElement maleRadio = driver.findElement(By.xpath("//input[@type='radio' and @name='sex' and @value='2']"));
        maleRadio.click();

        driver.findElement(By.name("reg_email__")).sendKeys("Thisal");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Thisal");

        //add relavant test data to the email and password fields

        driver.wait(30000);


        driver.quit();
    }
}
