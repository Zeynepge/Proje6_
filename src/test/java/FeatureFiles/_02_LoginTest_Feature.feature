Feature: Login

  Background:
    Given Navigate to ParaBank

  Scenario Outline: Login Functionality 1

    When Enter username as "<username>" password as "<password>" and click login button
    Then Success message as "<firstName>"  should be displayed
    And Enter LogOut

    Examples:
      | username | password | firstName |
      | akaraman | 123456   | ayse      |
      | zehra    | 123456   | zehra     |
      | zeynep   | zeynep11 | zeynep    |