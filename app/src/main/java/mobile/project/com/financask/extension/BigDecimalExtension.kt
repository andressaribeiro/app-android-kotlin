package mobile.project.com.financask.extension

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.Locale

/**
 * Created by andressa on 15/11/17.
 */

fun BigDecimal.formataParaBrasileiro() : String {
    val format = DecimalFormat.getCurrencyInstance(Locale("pt", "br"))
    return format.format(this).replace("R$", "R$ ")
}
