Feature: US1015 Exercise 1

  @exercise
  Scenario: TC22 Register User

    Given kullanici "automationExerciseUrl" anasayfasinda
    Then Verify that home page is visible successfully
    And kullanici 1 sn bekler
    And Click on Signup and Login button
    And Verify New User Signup is visible
    And kullanici 1 sn bekler
    Then Enter name and email address
    And kullanici 1 sn bekler
    And Click Signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible
    And kullanici 2 sn bekler
    Then Fill details: Title, Name, Email, Password, Date of birth
    And kullanici 1 sn bekler
    And Select checkbox Sign up for our newsletter
    And kullanici 1 sn bekler
    Then Select checkbox Receive special offers from our partners
    And kullanici 1 sn bekler
    And  Fill details: First name, Last name, Company, Address, Address, Country, State, City, Zipcode, Mobile Number
    And kullanici 1 sn bekler
    Then  Click Create Account button
    And kullanici 1 sn bekler
    And Verify that ACCOUNT CREATED is visible
    And kullanici 1 sn bekler
    Then Click Continue button
    And kullanici 1 sn bekler
    And Verify that Logged in as username is visible
    And kullanici 1 sn bekler
    Then Click Logout button
    Then sayfayi kapatir


