Feature: Free CRM Login Feature

# short cut key for comment this feature file code : ' Ctrl + Shif + C' --> press it again to uncomment after select the content

# Without Examples Keywords
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page   
#When title of Login page is Free CRM
#Then user enters "shwetap" and "shweta@123"   
#Then user clicks on Login button
#Then user is on home page
#Then close the browser

#------ Interview Que: Diff bw Scenario and Scenario Outline ---------

# With Examples Keywords
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page   
When title of Login page is Free CRM
Then user enters "<username>" and "<password>"   
Then user clicks on Login button
Then user is on home page
Then close the browser

Examples:
	|  username  |  password  |
	|  shwetap   |  shweta@123  |
	|  dhruvp     |  dhurv456   |
	| 	tom      |  test456     |
