package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.stepDefs.Hooks.driver;

public class P02_login {
    public WebElement enter_your_mail(String mail) {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@F.com");
        return null;
    }

    public WebElement enter_your_pass(String pass) {
        driver.findElement(By.id("passwd")).sendKeys("12OMRAN");
        return null;
    }

    public WebElement click_signIn() {
        driver.findElement(By.name("SubmitLogin")).click();
        return null;
    }

    public boolean validate_login() {
        boolean result = false;
        if (driver.getCurrentUrl().equalsIgnoreCase("http://automationpractice.com/index.php?controller=my-account")) {
            result = true;
        }
        return result;
    }
}
