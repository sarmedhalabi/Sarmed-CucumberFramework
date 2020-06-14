package com.hrms.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class EmergencyContactPage extends CommonMethods {
	@FindBy(css="input#btnAddContact")
	public WebElement btnAdd;
	
	@FindBy(id="emgcontacts_name")
	public WebElement contactName;
	
	@FindBy(id="emgcontacts_relationship")
	public WebElement relationship;
	
	@FindBy(id="emgcontacts_mobilePhone")
	public WebElement mobilePhone;
	
	@FindBy (id="emgcontacts_workPhone")
	public WebElement workPhone;
	
	@FindBy (id="btnSaveEContact")
	public WebElement btnSave;
	
	@FindBy(xpath="//table[@id=\"emgcontact_list\"]/tbody/tr[1]/td")
	public List<WebElement> emergencyTable;
	
	public EmergencyContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void namevalidation(String string) {
		for(WebElement  name: emergencyTable) {
			String actual= name.getText();
			if(actual.contains(string)) {
				Assert.assertEquals("name match", string, actual);
				break;
			}
			
		}
		
	}
	

}
