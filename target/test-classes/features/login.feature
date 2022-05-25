Feature: Login

In order to login successfully into application
As a user
I want to enter correct username and password

Scenario: To verify login into application
				Given user navigates to application
				When User validates the home page title
				Then user entered the username
				And user entered the password
				Then user should be successfully loggedin 

				