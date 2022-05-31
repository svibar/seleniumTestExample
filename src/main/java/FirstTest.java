import org.junit.jupiter.api.Test;
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
    }
}
