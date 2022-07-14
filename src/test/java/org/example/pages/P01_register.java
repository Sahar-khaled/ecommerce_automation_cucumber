package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepDefs.Hooks.driver;

public class P01_register {

    public WebElement register_link() {
        return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
    }

    public WebElement enter_email(String email) {

        driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("test@n121.com");
        return null;
    }

    public WebElement enter_register() {
        return driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
    }

    public WebElement enter_valid_data() {
        driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
        driver.findElement(By.name("customer_firstname")).sendKeys("Sahar");
        driver.findElement(By.name("customer_lastname")).sendKeys("Khaled");
        driver.findElement(By.id("passwd")).sendKeys("12OMRAN");


        // Enter your address
        driver.findElement(By.id("company")).sendKeys("test");
        driver.findElement(By.id("address1")).sendKeys("Test 81/1,2nd cross");
        driver.findElement(By.id("city")).sendKeys("XYZ");

        // Select State
        WebElement stateDropdown = driver.findElement(By.name("id_state"));
        Select oSelect = new Select(stateDropdown);
        oSelect.selectByValue("4");

        driver.findElement(By.name("postcode")).sendKeys("15671");

        // Select Country
        WebElement countryDropDown = driver.findElement(By.name("id_country"));
        Select oSelectC = new Select(countryDropDown);
        oSelectC.selectByVisibleText("United States");

        //Enter Mobile Number"//input[@id='id_gender1']"
        driver.findElement(By.id("phone_mobile")).sendKeys("231414141");
        driver.findElement(By.xpath("//input[@name='alias']")).clear();
        driver.findElement(By.xpath("//input[@name='alias']")).sendKeys("home");
        return null;
    }

    public WebElement click_register() {
        driver.findElement(By.name("submitAccount")).click();
        return null;
    }

    public WebElement validate_that_user_is_created_successfully() {
        String userText = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();
        if (userText.contains("Sahar")) {
            System.out.println("User Verified,Test case Passed");
        } else {
            System.out.println("User Verification Failed,Test case Failed");
        }
        return null;
    }

}