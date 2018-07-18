package test1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class Testlog {
	private static Logger logger=Logger.getLogger("LoggingExample");
	
	 public static void main(String [] args) throws InterruptedException, IOException {
			/*
			 *First web page test 1 
			 *
			 * System.setProperty("webdriver.chrome.driver","C://Users//training_d5.01.02//Downloads//Selenium//chromedriver_win32//chromedriver.exe" );
			 
			WebDriver driver=new ChromeDriver();
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");
			Thread.sleep(1000);
			//WebElement createaccbtn=driver.findElement(By.xpath("html/body/nav/div/a[3]"));
			//createaccbtn.click();
			driver.manage().window().maximize();
			WebElement Fname=driver.findElement(By.xpath(".//*[@id='firstName']"));
			Fname.sendKeys("Rahul");
			WebElement Lname=driver.findElement(By.xpath(".//*[@id='lastName']"));
			Lname.sendKeys("Gautam");
			*/
		 System.out.println("abc");
			BasicConfigurator.configure();
			try
		{FileInputStream fstream =new FileInputStream("C:\\Users\\training_d5.01.02\\Downloads\\WriteInExcel.txt");
		DataInputStream in =new DataInputStream(fstream);
		BufferedReader br =new BufferedReader(new InputStreamReader(in)); 
		String strLine;
		while ((strLine = br.readLine()) != null)
		{System.out.println (strLine);

		}
		in.close();
		}catch (FileNotFoundException fe)
		{logger.error("File Not Found",fe);
		logger.warn("This is a warning message");
		logger.trace("This message will not be logged since log level is set as DEBUG");
		}
			catch (IOException e)
		{logger.error("IOEXception occured:", e);
		}
	 }
}
