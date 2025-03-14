Feature: Create Account
	
	Scenario: Create Account with valid credentials
		Given Valid page
		When Enter the username
		And Enter Account Details
		And Enter Personal Details
		And Enter Address
		And Click Checkboxs
		And Cick on Register button
		Then Next Page Appears
		
		