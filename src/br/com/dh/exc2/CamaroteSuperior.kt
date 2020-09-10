package br.com.dh.exc2

class CamaroteSuperior(valor: Double, valorAdicional: Double) : VIP(valor, valorAdicional) {
    override fun imprimeTipoIngresso() {
        super.imprimeTipoIngresso()
        println("Camarote superior!")
    }
}