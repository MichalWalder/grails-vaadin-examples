<g:each var="payment" in="${payments}" >
   <li>  DATE : [${payment.date}] AMOUNT : [${payment.amount}] FROM : [${payment.from}] TO: [${payment.to}] <g:link action="remove" id="${payment.id}">REMOVE</g:link></li>

</g:each>