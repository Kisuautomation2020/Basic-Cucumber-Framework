Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given user is already on Login Page 
When title of Login page is Free CRM
Then user enters username and password
	| username | password|
 	| shwetap | shweta@123 |
Then user clicks on Login button
Then user is on home page
Then user moves to new deal page 
Then user enters deal details
		|title       | amount | probability | commission |
		| test deal1 | 1000 | 50 | 10 |
		| test deal2 | 2000 | 60 | 20 |
		| test deal3 | 3000 | 70 | 30 |
		| test deal | 1000 | 50 | 10 |
Then close the browser
