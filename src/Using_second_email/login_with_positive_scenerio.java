package Using_second_email;
import java.time.Duration;
	

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_with_positive_scenerio {


	public static void main(String[] args) {
		//Launch the browser and open the websites, then maximize the window and then write the implicit wait for 20 seconds.
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://gongchadev.s3-website.us-east-2.amazonaws.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Enter the valid username and password
		WebElement emailtextfield = driver.findElement(By.xpath("//input[@name='email']"));
		emailtextfield.sendKeys("mathurtest2@yopmail.com");
		WebElement passtextfield = driver.findElement(By.xpath("//input[@name='password']"));
		passtextfield.sendKeys("12345678");
		
		//click on remember me check box
		WebElement rememberme_cb = driver.findElement(By.xpath("//input[@type='checkbox']"));
		 rememberme_cb.click();
		
		//click on submit button
		WebElement submitbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		submitbtn.click();
			
		
		//It will compare with the "welcome back" text  which is wriiten in welcome back page. And welcome back page
		// will come after login with valid or correct details.
		
			WebElement actual_text = driver.findElement(By.xpath("//h5[text()=', Welcome back!']"));
			
			if(actual_text != null)
			{
				System.out.println("PASS: We are successfully login");
			}
			else
			{
				System.out.println("FAIL: We are not successfully login");
			}
		
		
	}

}
