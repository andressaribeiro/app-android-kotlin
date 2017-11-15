package mobile.project.com.financask.extension

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by andressa on 15/11/17.
 */

fun Calendar.formataParaBrasileiro(): String {
    return SimpleDateFormat("dd/MM/yyyy").format(this.time)
}
