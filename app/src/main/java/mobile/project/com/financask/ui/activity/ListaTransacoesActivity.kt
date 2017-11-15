package mobile.project.com.financask.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import mobile.project.com.financask.R
import mobile.project.com.financask.model.Tipo
import mobile.project.com.financask.model.Transacao
import mobile.project.com.financask.ui.adapter.ListaTransacoesAdapter
import java.math.BigDecimal

/**
 * Created by andressa on 12/11/17.
 */

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = listOf(Transacao(valor = BigDecimal(20.5), tipo = Tipo.DESPESA),
                Transacao(valor = BigDecimal(100.0), tipo = Tipo.RECEITA))

        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }

}