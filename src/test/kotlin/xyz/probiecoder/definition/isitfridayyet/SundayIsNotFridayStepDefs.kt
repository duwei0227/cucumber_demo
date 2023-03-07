package xyz.probiecoder.definition.isitfridayyet

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import junit.framework.TestCase.assertEquals
import kotlin.test.assertTrue

class SundayIsNotFridayStepDefs {
    private var balance: Int = 0

    @Given("账户余额 {int} 元")
    fun initAccountBalance(initAccount: Int) {
        balance = initAccount
    }

    @When("向账户转入 {int} 元")
    fun transfer_100(transferMoney: Int) {
        balance += transferMoney
    }

    @Then("账户余额应该为 {int} 元")
    fun i_should_be_told(expectAccount: Int) {
        assertEquals(expectAccount, balance)
    }

    @Then("账户余额大于 0")
    fun account_balance_should_not_0() {
        assertTrue(balance > 0)
    }
}