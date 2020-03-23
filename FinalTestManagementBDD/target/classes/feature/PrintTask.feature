Feature: Print Task List 
	In order to print task lists in  the website
	As a task manager
	I want to print the tasks list
		
Background: 
	Given I have the browser 'ch' with Task Management 
	When I click on Admin button, i enter username as 'admin', password as 'admin' 
	
Scenario: Printing TaskList 

	Then I should get the details of the tasks as i click on the Task List Icon 
	
Scenario: Logging the application with valid credentials 

	Then I should navigate to page with 'Administration' page 
	
Scenario: printing Employees List 

	And  I click on Employees 
	Then I should get the details of the all the Employees 
	
Scenario: printing Priorities List 

	And  I click on Priorities 
	Then I should get the details of the all the Priorities 
	
Scenario: printing Projects List 

	And  I click on Projects 
	Then I should get the details of the all the  Projects 
	
Scenario: printing Statuses List 

	And  I click on Statuses 
	Then I should get the details of the all the Statuses 
	
Scenario: printing Types List 

	And  I click on Types 
	Then I should get the details of the all the Types