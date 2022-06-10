Feature: US1016 Exercises 2

  @exercise2
  Scenario: TC23 Login User with correct email and password

    Given kullanici "automationExerciseUrl" anasayfasinda
    Then Verify that home page is visible successfully
    And kullanici 1 sn bekler
    And Click on Signup and Login button
    And kullanici 1 sn bekler
    And Verify Login to your account is visible
    And Enter correct email address and password
    And kullanici 1 sn bekler
    Then Click login button
    And Verify that Logged in as username is visible
    And kullanici 1 sn bekler
    And Click Delete Account button
    And kullanici 1 sn bekler
    Then Verify that DELETE ACCOUNT is visible
    Then kullanici 1 sn bekler
    And sayfayi kapatir