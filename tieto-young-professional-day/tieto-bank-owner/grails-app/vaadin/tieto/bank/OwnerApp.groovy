package tieto.bank

import tieto.bank.admin.Account
import tieto.bank.admin.User
import com.vaadin.Application
import com.vaadin.ui.HorizontalLayout
import com.vaadin.ui.Label
import com.vaadin.ui.Table
import com.vaadin.ui.Window
import com.vaadin.ui.themes.Runo

class OwnerApp extends Application {

	Label lblUserBalance = new Label()
	Table accountTable=new Table()
	AccountDetailForm form = new AccountDetailForm()

	@Override
	public void init() {
		setTheme(Runo.themeName())
		Window w = new Window()
		w.setContent(new HorizontalLayout())
		Integer bankBalance = Account.list().balance.sum()
		Label lblBankBalance = new Label("Bank balance: " + bankBalance)
		lblBankBalance.setStyleName(Runo.LABEL_H1)
		w.addComponent(lblBankBalance)
		w.addComponent(lblUserBalance)

		Table table = new Table()
		table.setWidth("80%")
		table.setSelectable(true)
		table.setImmediate(true)
		table.addContainerProperty("Id", Long.class, null)
		table.addContainerProperty("Name", String.class, null)

		List users = User.list()
		for(User u : users) {
			Object [] cells = new Object[2]
			cells[0] = u.id
			cells[1] = u.getName()
			table.addItem(cells, u)
		}

		accountTable.setSelectable(true)
		accountTable.setImmediate(true)
		accountTable.addListener(new ShowAccountDetailListener(app:this))
		table.addListener(new ShowBalanceListener(app:this))
		w.addComponent(table)
		w.addComponent(accountTable)

		w.addComponent(form)
		setMainWindow(w)
	}
}
