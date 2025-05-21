Feature: To try user now two able to login.
Scenario: Checking the user is now two able to login with valid details

 Given the user is landed to login page2
 When if2 user enters username and password
 |userName                 | password|
 |vasanthkumarda@gmail.com | Thalaa|
 Then now click the login button to move home page2
