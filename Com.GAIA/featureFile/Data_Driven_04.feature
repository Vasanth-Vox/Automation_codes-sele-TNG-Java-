Feature: To try user now able to login.
Scenario: Checking the user is now able to login with valid details

 Given testng before dummy run
 Given the user is landed to login page
 When if user enters username and password
 |vasanthkumarda@gmail.com | Thalaa|
 Then now click the login button to move home page
