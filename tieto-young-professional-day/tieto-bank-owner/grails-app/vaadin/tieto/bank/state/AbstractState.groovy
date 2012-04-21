package tieto.bank.state

import tieto.bank.*;

abstract class AbstractState implements State {

	@Override
	public void initTxtAccBalance(AccountDetailForm form) {
		form.txtAccBalance.setEnabled(false)
	}
	@Override
	public void initBtnRemove(AccountDetailForm form) {
		form.btnRemove.setEnabled(false)
	}

	@Override
	public void initBtnSave(AccountDetailForm form) {
		form.btnSave.setEnabled(false)
	}
}