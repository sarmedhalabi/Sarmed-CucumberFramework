package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmergencyContact extends CommonMethods {
	@When("admin click on Emergency Contacts")
	public void admin_click_on_Emergency_Contacts() {
	   viewEmp.employeeList("Emergency Contacts");
	   sleep(2);
	}

	@Then("admin click on add")
	public void admin_click_on_add() {
	    click(emergencycontact.btnAdd);
	}

	@Then("admin enters {string}, {string},{string} ,{string} and click save sucessfully")
	public void admin_enters_and_click_save_sucessfully(String name, String relationship, String mobile, String work) {
	    sendText(emergencycontact.contactName, name);
	    sendText(emergencycontact.relationship, relationship);
	    sleep(2);
	    sendText(emergencycontact.mobilePhone, mobile);
	    sendText(emergencycontact.workPhone, work);
	    sleep(2);
	    click(emergencycontact.btnSave);
	    
	    emergencycontact.namevalidation("Sarmed Halabi");
	    sleep(2);
	    




}}
