#Author: SarmedHalabi@syntax.com
Feature: EmergencyContact
  
  Decription: As an admin I should be able to add employee Emergency Contacts by specifying
  
@UserStory2
  Scenario Outline: Add employee emergency contact
    Given admin login successfully to Hrms Applicaiton
    And admin navigate to the PIM page and click on employee list
    When admin search employee by id "13389" and click search
    And admin click on employee name and the employee "Farid Aryob" is displayed successfully
    When admin click on Emergency Contacts
    Then admin click on add
    And admin enters "<Name>", "<Relationship>","<MobilePhone>" ,"<WorkPhone>" and click save sucessfully

    Examples: 
      | Name          | Relationship | MobilePhone | WorkPhone  |
      | Sarmed Halabi | Friend       |  7031112220 | 5713332221 |
