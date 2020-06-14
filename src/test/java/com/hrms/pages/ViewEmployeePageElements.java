package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class ViewEmployeePageElements extends CommonMethods {
	@FindBy(id="empsearch_employee_name_empName")
	public WebElement empName;

	@FindBy(id = "empsearch_id")
	public WebElement empID;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;

	@FindBy(xpath = "//table[@id='resultTable']/tbody/tr")
	public List<WebElement> employeeTableRow;

	@FindBy(xpath = "//table[@id='resultTable']/tbody/tr[1]/td[3]/a")
	public WebElement employeeIdValdiaiton;

	@FindBy(xpath = "//table[@id='resultTable']/tbody/tr/td[4]")
	public WebElement empLastNameValdiation;
	
	@FindBy( xpath="//ul[@id='sidenav']/li/a")
	public List<WebElement> employeeList;
	
	@FindBy(xpath="//div[@id='profile-pic']/h1")
	public WebElement nameDisplayed;

	public ViewEmployeePageElements() {
		PageFactory.initElements(driver, this);
	}

	public void chooseEmp(String expectedId) {

		boolean flag = false;
		while (!flag) {
			for (int i = 1; i < employeeTableRow.size(); i++) {
				String rowText = employeeTableRow.get(i - 1).getText();
				if (rowText.contains(expectedId)) {
					flag = true;
					driver.findElement(By.xpath("/table[@id='resultTable']/tbody/tr[" + i + "]/td[1]")).click();
					sleep(2);
					driver.findElement(By.cssSelector("input#btnDelete")).click();
					sleep(2);
					break;
				}

			}

		}
	}
	public void employeeList(String text) {
		for(WebElement lists: employeeList) {
			
			String actual= lists.getText();
			System.out.println(actual);
			if(actual.equals(text)) {
				jsClick(lists);
				break;
			}
		}
		
		
	}

}
