@Opengoogle
Feature: To login to google site
Scenario: To validate user able to access any term in search
	Given User login to cts site
	When when user enter any terms and type "services"
	And user action press enter
	Then User able to achieve it
	