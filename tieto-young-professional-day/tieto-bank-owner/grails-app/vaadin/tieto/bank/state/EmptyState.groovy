package tieto.bank.state

import tieto.bank.*

class EmptyState extends AbstractState {

	@Override
	public void initTxtAccBalance(AccountDetailForm form) {
		// TODO Auto-generated method stub
		super.initTxtAccBalance(form);
		form.txtAccBalance.setValue(0)
	}
}
