package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactDetails extends CommonMethods {
	@Given("admin login successfully to Hrms Applicaiton")
	public void admin_login_successfully_to_Hrms_Applicaiton() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		sleep(3);

	}

	@Given("admin navigate to the PIM page and click on employee list")
	public void admin_navigate_to_the_PIM_page_and_click_on_employee_list() {
		click(dashboard.PIM);
		jsClick(dashboard.empListPage);
		sleep(3);
	}

	@Given("admin search employee by id {string} and click search")
	public void admin_search_employee_by_id_and_click_search(String id) {
		sendText(viewEmp.empID, id);
		jsClick(viewEmp.searchBtn);
		sleep(5);
	}

	@When("admin click on employee name and the employee {string} is displayed successfully")
	public void admin_click_on_employee_name_and_the_employee_is_displayed_successfully(String string) {
		click(viewEmp.employeeIdValdiaiton);
//		Actions action =new Actions(driver);
//		action.doubleClick(viewEmp.employeeIdValdiaiton).perform();
		sleep(2);
		 String expected = string;
		 String actual = viewEmp.nameDisplayed.getText();
		Assert.assertEquals("Names do not match", expected, actual);

	}

	@Given("admin click on Contact Details")
	public void admin_click_on_Contact_Details() {
		viewEmp.employeeList("Contact Details");
		sleep(2);
	}

	@Then("admin click on edit and enters {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void admin_click_on_edit_and_enters_and(String street, String city, String state, String zipcode,
			String country, String homephone, String cellphone, String workemail) {

		click(contactDetails.btnSave);
		sendText(contactDetails.ContactStreet, street);
		sendText(contactDetails.City, city);
		sendText(contactDetails.Province, state);
		sendText(contactDetails.Zip, zipcode);
		selectValue(contactDetails.Country, country);
		sleep(2);
		sendText(contactDetails.Homephone, homephone);
		sendText(contactDetails.CellPhone, cellphone);
		sendText(contactDetails.WorkEmail, workemail);
		sleep(2);
		jsClick(contactDetails.btnSave);

	}

}
