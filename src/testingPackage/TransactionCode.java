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

//import cucumberUtilities.Xls_Reader_Fillo;

public class TransactionCode {

	public static void main(String[] args) throws InterruptedException, FilloException {
		// TODO Auto-generated method stub
      String  path = "C:\\Users\\mohit-gupta\\Documents\\Eclipse_projects\\BA2_Cucumber_Automation_2_Test\\Fixture\\TestData.xlsx";
		//Xls_Reader_Fillo filloReader = new Xls_Reader_Fillo(System.getProperty("user.dir") + "\\TestData\\emp.csv");
		
		Fillo fillo = new Fillo();
		String claimant_name;
		String AccRej;
		Connection conn = fillo.getConnection(path);
		Recordset recordset = conn.executeQuery("Select * from Claims");
		//List<String> claims = new ArrayList<>();
       // HashMap<String, String> hm = new HashMap<String, String>();
       
				
		
		
		System.setProperty("webdriver.chrome.driver",
	               "C:\\Users\\mohit-gupta\\Documents\\Eclipse_projects\\BA2_Demo_Testing\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://uatap.benefitsasia.com/ba2web_wip/dsosgautomation/BA2Login/tabid/23993/Default.aspx");
		
		

		  WebElement username=driver.findElement(By.id("dnn_ctr17772_LoginDefault_NewLoginDefault1_SignIn_v2_txtUsername"));
		  username.clear();
		  username.sendKeys("BA2_DSO_050_20");
		  WebElement password=driver.findElement(By.id("dnn_ctr17772_LoginDefault_NewLoginDefault1_SignIn_v2_txtPassword"));
		  
		  password.clear();
		  password.sendKeys("Password123$");
		  WebElement login=driver.findElement(By.id("dnn_ctr17772_LoginDefault_NewLoginDefault1_SignIn_v2_cmdLogin")); 
		 
		  login.click(); 
		
		  WebElement Employee=driver.findElement(By.id("dnn_ctr17772_LoginDefault_NewLoginDefault1_SignIn_v2_ctlEmployeeOrAdmin_btnEmployee"));
		  Employee.click();
		//a[(@id="dnn_ctr17755_BA2DashBoard_SEARCHCLAIM")]
		  
		  
		  WebElement createClaim = driver.findElement(By.linkText("Create New Claim"));
		  createClaim.click();
		  Select claimant  = new Select(driver.findElement(By.xpath("//select[contains(@id,'_ClaimsSubmit_ClaimSubmitControlV2_lstClaimantName')]")));
		  claimant.selectByIndex(2);
		  Select claim_type = new Select(driver.findElement(By.xpath("//select[contains(@id,'_ClaimsSubmit_ClaimSubmitControlV2_lstClaimItemName')]")));
		 // claim_type.selectByIndex(3);
		  claim_type.selectByVisibleText("   Childcare services including infant care services (licensed centres only)");
		  
		//  WebElement clinicProviderName = driver.findElement(By.xpath("//input[contains(@id, '_ClaimsSubmit_ClaimSubmitControlV2_txtProviderName')]"));
		//  clinicProviderName.sendKeys("Clinic 1");
		  
		  WebElement receiptDate = driver.findElement(By.xpath("//input[contains(@id, '_ClaimsSubmit_ClaimSubmitControlV2_txtReceiptDate')]"));
		  receiptDate.sendKeys("26/06/2020");
		  
		  WebElement receiptNo = driver.findElement(By.xpath("//input[contains(@id, '_ClaimsSubmit_ClaimSubmitControlV2_txtReceiptNo')]"));
		  receiptNo.sendKeys("11");
		  
		  WebElement receiptAmount = driver.findElement(By.xpath("//input[contains(@id, '_ClaimsSubmit_ClaimSubmitControlV2_txtReceiptAmount')]"));
		  receiptAmount.sendKeys("2");
		  
		  
		 /* //int i=0;
		  //while (recordset.next()) {
			 // Select claimant  = new Select(driver.findElement(By.id("dnn_ctr2064_ClaimsSubmit_ClaimSubmitControlV2_lstClaimantName")));
			 // Select claim_type = new Select(driver.findElement(By.id("dnn_ctr2064_ClaimsSubmit_ClaimSubmitControlV2_lstClaimItemName")));
			  
	        	//claimant_name =recordset.getField("claimant_name");
	        	//AccRej = recordset.getField("Accept/Reject");
	        	//claimant.selectByIndex(i);
	        	//claim_type.selectByIndex(4);
	        	
	        	Thread.sleep(10000);
	        	driver.findElement(By.id("dnn_ctr2064_ClaimsSubmit_ClaimSubmitControlV2_txtProviderName")).sendKeys(recordset.getField("clinic_provider_name"));
	            driver.findElement(By.id("dnn_ctr2064_ClaimsSubmit_ClaimSubmitControlV2_txtReceiptDate")).sendKeys(recordset.getField("receipt_date"));
	            driver.findElement(By.id("dnn_ctr2064_ClaimsSubmit_ClaimSubmitControlV2_txtReceiptNo")).sendKeys(recordset.getField("receipt_no"));
	            driver.findElement(By.id("dnn_ctr2064_ClaimsSubmit_ClaimSubmitControlV2_txtReceiptAmount")).sendKeys(recordset.getField("receipt_amount"));
	            driver.findElement(By.id("dnn_ctr2064_ClaimsSubmit_ClaimSubmitControlV2_txtEmployeeRemarks")).sendKeys(recordset.getField("remark"));
	            
	            //enter code to upload JPEG file
	            
	            
				driver.findElement(By.id("dnn_ctr2064_ClaimsSubmit_ClaimSubmitControlV2_ready")).click();
				Thread.sleep(10000);
				
	            //System.out.println(recordset.getField("claimant_name"));
				//System.out.println("Column data is :" + recordset.getField(columnName));
				//System.out.println(recordset.getField("Accept/Reject"));
				//hm.put(claimant_name, AccRej);
				//i++;
*/	        }
		  
		//  driver.findElement(By.linkText("Home")).click();
		 
	
		  /*WebElement searchClaim=driver.findElement(By.xpath("//a[(@id=\"dnn_ctr17755_BA2DashBoard_SEARCHCLAIM\")]")); 
			 
		searchClaim.click();
		
		driver.findElement(By.id("dnn_ctr17770_ClaimsSearch_btnSearchNew")).click();
		Thread.sleep(6000);
		System.out.println("this is test");
		
		
		List<WebElement> row = driver.findElements(By.xpath("//table[contains(@id,'_ClaimsSearch_gvResultNew')]/tbody/tr"));
		System.out.println(row.size());
		
		//driver.findElement(By.linkText("My Details")).click();
		Thread.sleep(6000);
		String[] transactCode = new String[row.size()-2];
		
		for(int i1=3,j=0;i1<=row.size();i++,j++)
		{
			
			
			WebElement table = driver.findElement(By.xpath("//table[contains(@id,'dnn_ctr17770_ClaimsSearch_gvResultNew')]/tbody/tr["+i+"]/td[2]"));
			transactCode[j]= table.getText();
			System.out.println(table.getText());
		}
		*/
		
		
		
		
		
		
		//driver.close();
	
		


	
	
	
	
	
	
	
	
	
	
	
	}
	
	


