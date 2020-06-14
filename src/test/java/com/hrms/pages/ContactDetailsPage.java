package com.hrms.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class ContactDetailsPage extends CommonMethods {
	@FindBy(css = "input#contact_street1")
	public WebElement ContactStreet;

	@FindBy(id = "contact_city")
	public WebElement City;

	@FindBy(id = "contact_province")
	public WebElement Province;

	@FindBy(id = "contact_emp_zipcode")
	public WebElement Zip;

	@FindBy(xpath = "//select[@id='contact_country']")
	public WebElement Country;

	@FindBy(id = "contact_emp_hm_telephone")
	public WebElement Homephone;

	@FindBy(id = "contact_emp_mobile")
	public WebElement CellPhone;

	@FindBy(id = "contact_emp_work_email")
	public WebElement WorkEmail;

	@FindBy(id = "btnSave")
	public WebElement btnSave;

	public ContactDetailsPage() {

		PageFactory.initElements(driver, this);

	}
}
