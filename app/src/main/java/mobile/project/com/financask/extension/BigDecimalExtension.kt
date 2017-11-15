package mobile.project.com.financask.extension

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.Locale

fun BigDecimal.formataParaBrasileiro() : String {
    val formatador = DecimalFormat.getCurrencyInstance(Locale("pt", "br"))
    return formatador.format(this).replace("R$", "R$ ")
}
