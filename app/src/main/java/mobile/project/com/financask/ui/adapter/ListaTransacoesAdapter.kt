package mobile.project.com.financask.ui.adapter

import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.transacao_item.view.*
import mobile.project.com.financask.R
import mobile.project.com.financask.extension.formataParaBrasileiro
import mobile.project.com.financask.extension.limitaEmAte
import mobile.project.com.financask.model.Tipo
import mobile.project.com.financask.model.Transacao

/**
 * Created by andressa on 14/11/17.
 */
class ListaTransacoesAdapter(private val transacoes: List<Transacao>,
                             private val context: Context) : BaseAdapter() {

    private val limiteDaCategoria = 14

    override fun getView(posicao: Int, view: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.transacao_item, parent, false)
        val transacao = transacoes[posicao]

        adicionaIcone(transacao, view)
        adicionaValor(view, transacao)
        adicionaCategoria(view, transacao)
        adicionaData(view, transacao)

        return view
    }

    private fun adicionaIcone(transacao: Transacao, view: View) {
        view.transacao_icone.setBackgroundResource(iconePor(transacao.tipo))
    }

    private fun iconePor(tipo: Tipo): Int {
        if (tipo == Tipo.RECEITA) {
            return R.drawable.icone_transacao_item_receita
        }
        return R.drawable.icone_transacao_item_despesa
    }

    private fun adicionaValor(view: View, transacao: Transacao) {
        view.transacao_valor.setTextColor(corPor(transacao.tipo))
        view.transacao_valor.text = transacao.valor.formataParaBrasileiro()
    }

    private fun corPor(tipo: Tipo): Int {
        return if (tipo == Tipo.RECEITA) {
            ContextCompat.getColor(context, R.color.receita)
        } else {
            ContextCompat.getColor(context, R.color.despesa)
        }
    }

    private fun adicionaCategoria(view: View, transacao: Transacao) {
        view.transacao_categoria.text = transacao.categoria.limitaEmAte(limiteDaCategoria)
    }

    private fun adicionaData(view: View, transacao: Transacao) {
        view.transacao_data.text = transacao.data.formataParaBrasileiro()
    }

    override fun getItem(posicao: Int): Transacao {
        return transacoes[posicao]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return transacoes.size
    }

}