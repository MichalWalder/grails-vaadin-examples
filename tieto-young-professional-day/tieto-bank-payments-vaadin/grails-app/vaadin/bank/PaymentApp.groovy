package bank

import com.vaadin.*
import com.vaadin.ui.*

import tieto.bank.admin.*

class PaymentApp extends Application {

	void init() {
		Window w = new Window("Payment app")
		Label Lbt = new Label("Payment history:")
		w.addComponent(Lbt)
		Table table = new Table()
		table.addContainerProperty("Id", Long.class, null)
		table.addContainerProperty("Payment", Date.class, null)
		table.addContainerProperty("Transfered Amount", Integer.class, null)
		table.addContainerProperty("From", Account.class, null)
		table.addContainerProperty("To", Account.class, null)
		List payments =Payment.list()
		for(Payment p:payments){
			Object [] values =new Object[5]
			values[0]=p.id
			values[1]=p.date
			values[2]=p.amount
			values[3]=p.from.owner.name
			values[4]=p.to.owner.name
			table.addItem(values,p)
		}
		w.addComponent(table)
		setMainWindow(w)
	}
}
