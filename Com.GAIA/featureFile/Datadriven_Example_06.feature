
Feature: To try user two able to login now
Scenario Outline: Checking the user now two able to login with valid detail

 Given the user is landed to login page now
 When if2 user enters "<userName>" and "<password>" now
 Then now click the login button to move home page now
 
 Examples:
 |userName                 | password|
 |vasanthkumarda@gmail.com | Thalaa|
 
