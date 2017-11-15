package mobile.project.com.financask.model

import java.math.BigDecimal
import java.util.Calendar

/**
 * Created by andressa on 14/11/17.
 */
class Transacao(val valor: BigDecimal,
                val tipo: Tipo,
                val categoria: String = "Indefinida",
                val data: Calendar = Calendar.getInstance())