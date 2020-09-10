package br.com.dh.exc2

abstract class Ingresso(var valor: Double) {
    open fun imprimeValor() {
        println("Valor do ingresso: R$ ${this.valor}")
    }

    abstract fun imprimeTipoIngresso()
}