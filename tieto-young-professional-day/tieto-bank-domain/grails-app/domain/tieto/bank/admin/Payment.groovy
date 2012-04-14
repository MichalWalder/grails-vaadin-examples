package tieto.bank.admin
//Payment maps payments between two accounts
class Payment {
	Date date;
	Integer amount
	Account from
	Account to

	static constraints = {
		//TODO: amount have to be higher than 0
		amount min:1
		from nullable:true
		to nullable:true
	}

	def beforeValidate()
	{
		date = new Date()
	}

}
