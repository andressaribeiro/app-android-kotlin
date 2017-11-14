package mobile.project.com.financask.model

import java.math.BigDecimal
import java.util.Calendar

/**
 * Created by andressa on 14/11/17.
 */
class Transacao(valor: BigDecimal,
                categoria: String,
                data: Calendar) {

    private val valor = valor
    private val categoria = categoria
    private val data = data


    fun getValor(): BigDecimal {
        return valor
    }

    fun getCategoria(): String {
        return categoria
    }

    fun getCalendar(): Calendar {
        return data
    }

}