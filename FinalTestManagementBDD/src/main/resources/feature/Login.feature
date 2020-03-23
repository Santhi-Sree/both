Feature: Login 
	In order to login in Task management
     I want to get access to the portal
 
 
Background: 
	Given I have browser 'ch' with Task management page 
	
Scenario Outline: ValidCredential 

	When I click on Administration Icon and I enter username as 'admin' and  I enter password as 'admin' 
	Then I should access to the portal and check the presence of AddTask and TaskList 
	Examples: 
		|username|password|
		|admin|admin|
		
Scenario Outline: InvalidCredential 

	When I click on Administration Icon and I enter invalid username as 'abc' and I enter valid password as 'admin' 
	Then It should display an error message1 as 'Login or Password is incorrect.' 
	Examples: 
		|username|password|
		|abc|admin|
		
Scenario Outline: InvalidCredential 

	When I click on Administration Icon and I enter valid username as 'admin' and I enter invalid password as 'abcxyz' 
	Then It should display an error message2 as 'Login or Password is incorrect.' 
	Examples: 
		|username|password|
		|admin|abcxyz|
		
Scenario Outline: InvalidCredential 

	When I click on Administration Icon and I enter invalid username as 'abc' and I enter invalid password as 'xyz' 
	Then It should display an error message3 as 'Login or Password is incorrect.' 
	Examples: 
		|username|password|
		|abc|xyz|
		
Scenario Outline: To check whether the logOut is working 

	When I click on the Administration Icon and I enter valid username as 'admin' and I enter valid password as 'admin' 
	Then I should display the page and click on LogOut 
	Examples: 
		|username|password|
		|admin|admin| 
 
