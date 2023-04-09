Feature: Login negatif

  Background:
    Given Navigate to ParaBank

  Scenario Outline: Negatif Login Functionality

    When Enter username as "<username>" password as "<password>" and click login button
    Then The username and password could not be verified message is displayed

    Examples:
      | username | password |
      | esra     | 548772   |
      | ayse     | 4545     |
      | melek    | h2424    |