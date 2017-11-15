package mobile.project.com.financask.extension

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.formataParaBrasileiro(): String {
    return SimpleDateFormat("dd/MM/yyyy").format(this.time)
}
