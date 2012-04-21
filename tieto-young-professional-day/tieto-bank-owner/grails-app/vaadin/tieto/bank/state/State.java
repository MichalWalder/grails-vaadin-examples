package tieto.bank.state;

import tieto.bank.*;

public interface State {

	void initTxtAccBalance(AccountDetailForm form);

	void initBtnRemove(AccountDetailForm form);

	void initBtnSave(AccountDetailForm form);
}
