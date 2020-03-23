Feature: Add Task in Task Management website 
	In order to login to website
	As a Task Manager
	I want to get access to the portal
	
Background: 
	Given I have browser 'ch' with Task Management website 
	
Scenario Outline: Search Task 

	When I enter data 'Alexander Atkinson' 'CodeCharge' 'Highest' 'Open' 'Task' 
	And Click on search button i shoud get the results 
	Then I should access the portal with title as 'Task Manager' 
	Examples: 
		|Assigned To|Project|Priority|Status|Type|
		|Alexander Atkinson|CodeCharge|Highest|Open|Task|
Scenario: Access Task 

	When I click on task and enter username as 'admin' and password as 'admin' 
	Then I should get the text in Task field as 'Bored with your programming job? Get CodeCharge. Have Fun.' 
	
Scenario Outline: Add Task with Valid Credentials 

	When I click on Add Task Icon and i enter username as 'admin' and password as 'admin' 
	And I enter data 'Testing' 'I need to test the task' 'CodeCharge' 'High' 'In progress' 'Task' 'Stan Simon' '03/14/20' '03/18/20' 
	Then  I should return to 'Task Manager' page by clicking on add button 
	Examples: 
		|Task|Description|Project|Priority|Status|Type|Assigned To|Start Date|Finish Date|
		|Testing|I need to test the task|CodeCharge|High|In progress|Task|Stan Simon|03/14/20|03/18/20|
		
Scenario Outline: Add Task with Invalid Credentials 

	When I click on Add Task Icon and i enter username as 'admin' and password as 'admin' 
	And I enter data 'I need to test the task' 'CodeCharge' 'High' 'In progress' 'Task' 'Stan Simon' '03/14/20' '03/18/20' and click on add button 
	Then  I should get error message as 'The value in field Task is required.' 
	Examples: 
		|Description|Project|Priority|Status|Type|Assigned To|Start Date|Finish Date|
		|I need to test the task|CodeCharge|High|In progress|Task|Stan Simon|03/14/20|03/18/20|
Scenario: Edit Task 

	When  I click on existing task and i enter username as 'admin' and password as 'admin' 
	And   click on task and enter data 'Enter code' 
	Then  I should redirect to 'Task Manager' page when i  click on submit button 
	
	
	