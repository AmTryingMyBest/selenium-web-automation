import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMakeTime {
    public static void main (String[]args){
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://pro.xometry.com");

        WebElement element = driver.findElement(By.name("user_email"));
        element.sendKeys("email will go here");

        WebElement pass_field = driver.findElement(By.name("password"));
        pass_field.sendKeys("password will go here");

        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/form/fieldset/div[3]/div/label/span[1]"));
        checkbox.click();

        WebElement signin_btn = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/form/fieldset/button"));
        signin_btn.click();
    }
}
