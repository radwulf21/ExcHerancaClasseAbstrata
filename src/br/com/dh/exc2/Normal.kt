package br.com.dh.exc2

class Normal(valor: Double) : Ingresso(valor) {
    override fun imprimeTipoIngresso() {
        println("Ingresso normal!")
    }
}