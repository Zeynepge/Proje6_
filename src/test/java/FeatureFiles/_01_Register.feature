Feature:Register

  Scenario: Register Functionality

    Given Navigate to ParaBank
    When Click register
    Then Create account
    And Success message should be displayed