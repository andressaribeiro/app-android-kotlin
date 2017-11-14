package mobile.project.com.financask.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import mobile.project.com.financask.R
import mobile.project.com.financask.model.Transacao
import java.math.BigDecimal
import java.util.*

/**
 * Created by andressa on 12/11/17.
 */

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = listOf(Transacao(BigDecimal(20.5), "Comida", Calendar.getInstance()),
                Transacao(BigDecimal(100.0), "Economia", Calendar.getInstance()))

        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }

}