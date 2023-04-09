Feature: BillPay Sites

  Background:
    Given Navigate to ParaBank
    When Enter username as "ZGedik" password as "123456" and click login button
    Then User should login successfully

  Scenario Outline: Bill pay Functionality

    When Click Bill Pay
    Then Enter payeeName as "<payeeName>" Adress as "<Adress>" City as "<City>"
    And  Enter state as "<State>" Zipcode as "<Zipcode>" phone as "<phone>"
    And  Enter account as "<account>" v_account as "<v_account>" amount as "<amount>"
    And  Click Send payment
    Then  Completed message as "<amount>" should be displayed

    Examples:
      | payeeName | Adress  | City     | State      | Zipcode | phone     | account | v_account | amount |
      | Elektrik  | kethuda | istanbul | Diyarbakir | 2314    | 65422232  | 32      | 32        | 85     |
      | Su        | nilufer | erzurum  | igdur      | 2534    | 65433332  | 99      | 99        | 45     |
      | Dogalgaz  | kethuda | istanbul | Bolu       | 2384    | 654323762 | 88      | 88        | 120    |






