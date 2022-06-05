


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstTest {

    @Test
    public void checkMinPaymentSum () {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        driver.get("https://next.privat24.ua/money-transfer/card");

        driver.manage().window().maximize();

        By cardNumber = By.xpath("//input[@data-qa-node='numberdebitSource']");
        By expDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
        By cvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        By firstName = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        By lastName = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
        By cardNumberReceiver = By.xpath("//input[@data-qa-node='numberreceiver']");
        By firstNameReceiver = By.xpath("//input[@data-qa-node='firstNamereceiver']");
        By lastNameReceiver = By.xpath("//input[@data-qa-node='lastNamereceiver']");
        By amount = By.xpath("//input[@data-qa-node='amount']");
        By toggleComment = By.xpath("//span[@data-qa-node='toggle-comment']");
        By comment = By.xpath("//textarea[@data-qa-node='comment']");
        By submitBtn = By.xpath("//button[@type='submit']");


        driver.findElement(cardNumber).sendKeys("4006895689048337");
        driver.findElement(expDate).sendKeys("1128");
        driver.findElement(cvv).sendKeys("111");
        driver.findElement(firstName).sendKeys("Gloria");
        driver.findElement(lastName).sendKeys("Hayakawa");
        driver.findElement(cardNumberReceiver).sendKeys("4558032855841715");
        driver.findElement(firstNameReceiver).sendKeys("Federico");
        driver.findElement(lastNameReceiver).sendKeys("Stojan");
        driver.findElement(amount).sendKeys("400");
        driver.findElement(toggleComment).click();
        driver.findElement(comment).sendKeys("test test test");
        driver.findElement(submitBtn).submit();

        //System.out.println("Text:" + driver.findElement(By.xpath("//div[@data-qa-node='comment']")).getText());
        Assert.assertEquals("test test test", driver.findElement(By.xpath("//div[@data-qa-node='comment']")).getText());
        Assert.assertEquals("4006 8956 8904 8337", driver.findElement(By.xpath("//span[@data-qa-node='payer-card']")).getText());
        Assert.assertEquals("400 UAH", driver.findElement(By.xpath("//div[@data-qa-node='payer-amount']")).getText());
        Assert.assertEquals("104.41 UAH", driver.findElement(By.xpath("//div[@data-qa-node='payer-currency']")).getText());
        Assert.assertEquals("FEDERICO STOJAN", driver.findElement(By.xpath("//div[@data-qa-node='receiver-name']")).getText());
        Assert.assertEquals("4558 0328 5584 1715", driver.findElement(By.xpath("//span[@data-qa-node='receiver-card']")).getText());
        Assert.assertEquals("400 UAH", driver.findElement(By.xpath("//div[@data-qa-node='receiver-amount']")).getText());
        Assert.assertEquals("0 UAH", driver.findElement(By.xpath("//div[@data-qa-node='receiver-currency']")).getText());
        Assert.assertEquals("504.41 UAH", driver.findElement(By.xpath("//div[@class='sc-chPdSV iiqwfv']")).getText());


    }
}
