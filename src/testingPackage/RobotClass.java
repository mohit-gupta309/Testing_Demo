package testingPackage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.HashMap;
//import cucumberUtilities.*;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class RobotClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		public class UploadFileRobot {

			String URL = "application URL";
			
		system.out.println("Robot");
		
			public void testUpload() throws InterruptedException
			{
				WebDriver  driver = new FirefoxDriver();
				driver.get(URL);
				WebElement element = driver.findElement(By.name("uploadfile"));
				element.click();
				uploadFile("path to the file");
				Thread.sleep(2000);
			}
			
			/**
		     * This method will set any parameter string to the system's clipboard.
		     */
			public  void setClipboardData(String string) {
				//StringSelection is a class that can be used for copy and paste operations.
				   StringSelection stringSelection = new StringSelection(string);
				   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
				}
			
			public void uploadFile(String fileLocation) {
		        try {
		        	//Setting clipboard with file location
		            setClipboardData(fileLocation);
		            //native key strokes for CTRL, V and ENTER keys
		            Robot robot = new Robot();
			
		            robot.keyPress(KeyEvent.VK_CONTROL);
		            robot.keyPress(KeyEvent.VK_V);
		            robot.keyRelease(KeyEvent.VK_V);
		            robot.keyRelease(KeyEvent.VK_CONTROL);
		            robot.keyPress(KeyEvent.VK_ENTER);
		            robot.keyRelease(KeyEvent.VK_ENTER);
		        } catch (Exception exp) {
		        	exp.printStackTrace();
		        }
		    }
		}
		
	}

}
