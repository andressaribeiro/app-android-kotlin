package mobile.project.com.financask.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import mobile.project.com.financask.R
import mobile.project.com.financask.model.Tipo
import mobile.project.com.financask.model.Transacao
import mobile.project.com.financask.ui.adapter.ListaTransacoesAdapter
import java.math.BigDecimal

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)
        val transacoes: List<Transacao> = transacoesDeExemplo()
        configuraLista(transacoes)
    }

    private fun configuraLista(transacoes: List<Transacao>) {
        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }

    private fun transacoesDeExemplo() = listOf(Transacao(valor = BigDecimal(20.5), tipo = Tipo.DESPESA),
            Transacao(valor = BigDecimal(100.0), tipo = Tipo.RECEITA, categoria = "Almoço do final de semana"))

}