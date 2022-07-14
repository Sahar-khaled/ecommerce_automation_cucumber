package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepDefs.Hooks.driver;

public class P03_paymentProcess {
  Actions actions = new Actions(driver);
    public WebElement hover_womens_link(){
      WebElement womenTab = driver.findElement(By.linkText("WOMEN"));
      WebElement blouseTab = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a"));
      actions.moveToElement(womenTab).moveToElement(blouseTab).click().perform();
      return womenTab;
  }

  public WebElement product_name(){
    String ProductName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")).getText();
    System.out.println(ProductName);
    driver.findElement(By.id("search_query_top")).sendKeys(ProductName);
    driver.findElement(By.name("submit_search")).click();
    String SearchProductName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")).getText();
    if (ProductName.equalsIgnoreCase(SearchProductName)) {
      System.out.println(" Matched;Test Case Passed");
    } else {
      System.out.println(" NotMatched;Test Case Failed");
    }
    return null;
  }
  public WebElement click_more_btn() {
    WebElement SecondImg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
    WebElement MoreBtn = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]"));
    Actions action = new Actions(driver);
    actions.moveToElement(SecondImg).moveToElement(MoreBtn).click().perform();


    return null;
  }

  public WebElement changeQuantity() {
    driver.findElement(By.id("quantity_wanted")).clear();
    driver.findElement(By.id("quantity_wanted")).sendKeys("2");
    return null;
  }

  public WebElement changeSize() {
    WebElement selectSize = driver.findElement(By.xpath("//*[@id='group_1']"));
    Select oneOption = new Select(selectSize);
    oneOption.selectByVisibleText("M");
    return null;
  }

  public WebElement chooseColor() {
    driver.findElement(By.id("color_11")).click();
    return null;
  }

  public WebElement addToCart() {
    driver.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")).click();

    return null;
  }

  public WebElement checkOut() {
    // Click on proceed
    driver.findElement(By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")).click();
    //Checkout page Proceed
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();

    // Agree terms&Conditions
    driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")).click();
    return null;
  }
  public WebElement confirn_select_bank_wire(){
    // Click on by bank wire
    driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
    // Confirm the order
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();
    // Get Text
    return null;
  }
  public WebElement confirm_order(){
    String ConfirmationText = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong\n")).getText();
    if (ConfirmationText.contains("complete")) {
      System.out.println("Your order has been completed.: Test Case Passed");
    } else {
      System.out.println("Your order was not fulfilled.: Test Case Failed");
    }
    return null;
  }


    }
