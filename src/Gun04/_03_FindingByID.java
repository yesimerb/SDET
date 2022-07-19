package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByID {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");



        WebElement eleman=driver.findElement(By.id("label_"));
        System.out.println("eleman.getText() = " + eleman.getText());

        Thread.sleep(2000);
        driver.quit(); //açılmış bütün browserları, close() ise sadece aktif browserı kapatır
    }
}
