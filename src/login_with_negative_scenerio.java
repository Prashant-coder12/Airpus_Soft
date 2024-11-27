import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_with_negative_scenerio {

	public static void main(String[] args) {
		
		//Launch the browser and open the websites, then maximize the window and then write the implicit wait for 20 seconds.
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://gongchadev.s3-website.us-east-2.amazonaws.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Locte and Leave the username and password textfield
		
		driver.findElement(By.xpath("//input[@name='email']"));
		driver.findElement(By.xpath("//input[@name='password']"));
		
		//click on remember me check box
		WebElement rememberme_cb = driver.findElement(By.xpath("//input[@type='checkbox']"));
		 rememberme_cb.click();
		
		//click on submit button
		WebElement submitbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		submitbtn.click();
			
		
	//If we have leave the username textfield and password textfield then it show an message "Please fill all the fields"
	//on the screen.
		
		
		WebElement actual_text = driver.findElement(By.xpath("//div[text()='Please fill all the fields']"));
			
		if(actual_text != null)
			{
				System.out.println("PASS: We are not enter any username and password");
			}
		else
			{
				System.out.println("FAIL: We are enter the username and password");
			}
	}

}
