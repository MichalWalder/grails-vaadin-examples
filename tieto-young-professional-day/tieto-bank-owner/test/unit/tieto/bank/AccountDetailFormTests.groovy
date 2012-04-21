package tieto.bank

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*

import tieto.bank.admin.*;


@TestMixin(GrailsUnitTestMixin)
class AccountDetailFormTests {
	AccountDetailForm form
	void setUp() {
		form=new AccountDetailForm();
		Account account = new Account();
		account.balance=1000;
		account.type=AccountType.Private
		form.setAccount(account);
	}

	void tearDown() {
		// Tear down logic here
	}

	void test_empty_state() {
		boolean enabled=form.txtAccBalance.isEnabled()
		assertEquals(true,enabled)
	}

	void test_empty_value() {
		Object value=form.txtAccBalance.getValue()
		assertEquals(1000,value)
	}
}
