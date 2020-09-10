package br.com.dh.exc2

abstract class VIP(valor: Double, var valorAdicional: Double) : Ingresso(valor) {
    override fun imprimeValor() {
        println("Valor do ingresso: R$ ${this.valor + this.valorAdicional}")
    }

    override fun imprimeTipoIngresso() {
        println("Ingresso VIP!")
    }
}