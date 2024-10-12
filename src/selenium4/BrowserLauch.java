package selenium4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserLauch {
	
    public static void main(String[] args) {
    	System.out.println("New");
    WebDriver driver = new ChromeDriver(); 
    driver.get("https://www.primevideo.com");
    driver.findElement(By.xpath("//span[text()='Sign in to join Prime']")).click();
    WebElement UserName =  driver.findElement(By.xpath("//input[@id='ap_email']"));
    UserName.click();
    UserName.sendKeys("Harshapradyumn");
    UserName.clear();
    driver.close();
    }
}
