package tieto.bank.state

import tieto.bank.*
class LoadedState extends AbstractState{

	@Override
	public void initTxtAccBalance(AccountDetailForm form) {
		form.txtAccBalance.setValue(form.account.getBalance())
		form.txtAccBalance.setEnabled(true)
	}
}
