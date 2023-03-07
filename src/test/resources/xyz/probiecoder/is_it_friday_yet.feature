# language zh_CN
@order
Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: 账户余额
    Given 账户余额 49 元
    When 向账户转入 51 元
    Then 账户余额应该为 100 元
    And 账户余额大于 0

