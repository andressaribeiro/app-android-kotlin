package mobile.project.com.financask.ui.activity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.transacao_item.view.*
import mobile.project.com.financask.R
import mobile.project.com.financask.model.Transacao
import java.text.SimpleDateFormat

/**
 * Created by andressa on 14/11/17.
 */
class ListaTransacoesAdapter(transacoes: List<Transacao>,
                             context: Context) : BaseAdapter() {

    private val transacoes = transacoes
    private val context = context

    override fun getView(posicao: Int, view: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.transacao_item, parent, false)
        val transacao = transacoes[posicao]
        view.transacao_valor.text = transacao.valor.toString()
        view.transacao_categoria.text = transacao.categoria
        view.transacao_data.text = SimpleDateFormat("dd/MM/yyyy").format(transacao.data.time)
        return view
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