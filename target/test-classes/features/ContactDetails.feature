#Author: sarmedhalabi@synatx.com
Feature: ContactDetails
  
  Decriptions: As an admin I should be able to change employee contact details

  @UserStory1
  Scenario Outline: Admin is able to change employee contact details
    Given admin login successfully to Hrms Applicaiton
    And admin navigate to the PIM page and click on employee list
    When admin search employee by id "13389" and click search
    And admin click on employee name and the employee "Farid Aryob" is displayed successfully
    And admin click on Contact Details
    Then admin click on edit and enters "<AddressStreet1>","<City>","<State>","<Zipcode>","<Country>","<HomePhone>","<CellPhone>" and "<WorkEmail>"

    Examples: 
      | AddressStreet1   | City       | State   | Zipcode | Country       | HomePhone  | CellPhone | WorkEmail             |
      | 8112 Rockwood Dr | Alexandria | Virgina |   20151 | United States | 7034563434 | 571232323 | faridaryob@syntax.com |
