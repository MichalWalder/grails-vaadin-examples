package tieto.bank

import com.vaadin.data.Property
import com.vaadin.data.Property.*
import tieto.bank.admin.Account
import com.vaadin.data.Property
import com.vaadin.data.Property.ValueChangeEvent
import com.vaadin.data.Property.ValueChangeListener
import tieto.bank.*

class ShowAccountDetailListener implements ValueChangeListener{
	OwnerApp app
	@Override
	public void valueChange(ValueChangeEvent event) {
		Property p= event.getProperty()
		Account account=p.getValue()
		if(p){
			app.form.setVisible(true)
			app.form.setAccount(account)
		}
	}
}
