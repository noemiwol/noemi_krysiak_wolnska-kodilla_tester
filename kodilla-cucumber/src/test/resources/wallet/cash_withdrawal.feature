Feature: Cash Withdrawal

  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $<amount>
    Then $<amount> should be dispensed
    And the balance of my wallet should be $170
    Examples:
      | amount |
      |   30   |
      |   200  |

  Scenario Outline: Unsuccessful withdrawal from a wallet
    Given I have deposited $<cashInTotal> in my wallet
    When I request $<amount>
    Then The requested <amount> should be dispensed
    Examples:
      | cashInTotal |     amount    |
      |    200      |      201      |
      |    200      |        0      |
      |      0      |      200      |