package mobile.project.com.financask.extension

fun String.limitaEmAte(caracteres: Int) : String {
    if (this.length > caracteres) {
        return "${this.subSequence(0, caracteres)}..."
    }
    return this
}