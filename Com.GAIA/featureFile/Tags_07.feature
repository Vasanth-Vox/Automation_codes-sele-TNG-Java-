@login01 @login02
Feature: To try user two able to login now

@login01
Scenario Outline: Checking the user now two able to login with valid detail
 Given the user is landed to login page now
 When if2 user enters "<userName>" and "<password>" now
 Then now click the login button to move home page now
 
 Examples:
 |userName                 | password|
 |vasanthkumarda@gmail.com | Thalaa|
 
@login02
Scenario: To validate user able to access any term in search
	Given User login to cts site
	When when user enter any terms and type "services"
	And user action press enter
	Then User able to achieve it