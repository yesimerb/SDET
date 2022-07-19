package Gun04;

import Utils.BaseStaticDriver;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_SentText extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement element=driver.findElement(By.partialLinkText("thanks!"));
        element.click();

        WebElement txtbox= element.findElement(By.id("user-message"));
        txtbox.sendKeys("Merhaba Selenium");

        WebElement btn=driver.findElement(By.className("btn-default"));
        btn.click();

        WebElement msg=driver.findElement(By.id("display"));
        if(msg.getText().contains("Merhaba Selenium"))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        Bekle(1);
        BekleKapat();

    }
}
