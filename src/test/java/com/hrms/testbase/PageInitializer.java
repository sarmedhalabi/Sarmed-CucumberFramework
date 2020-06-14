package com.hrms.testbase;

import com.hrms.pages.AddEmployee;
import com.hrms.pages.ContactDetailsPage;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.EmergencyContactPage;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.ViewEmployeePageElements;




public class PageInitializer extends BaseClass {
	
	public static ContactDetailsPage contactDetails;
		public static LoginPageElements login;
		public static AddEmployee addEmp;
		public static DashboardPageElements dashboard;
		public static PersonalDetailsPageElements pdetails;
		public static AddEmployee addemployee;
		public static ViewEmployeePageElements viewEmp;
		public static EmergencyContactPage emergencycontact;
	
		
		public static void initialize() {
			
			login=new LoginPageElements();
			dashboard=new DashboardPageElements();
			addEmp=new AddEmployee();
			pdetails=new PersonalDetailsPageElements();
			addemployee=new AddEmployee();
			viewEmp= new ViewEmployeePageElements();
			contactDetails=new ContactDetailsPage();
			emergencycontact=new EmergencyContactPage();
			
		}

}
