package br.com.dh.exc2

class CamaroteInferior(valor: Double, valorAdicional: Double, var localizacao: String) : VIP(valor, valorAdicional) {
    fun imprimireLocalizacao() {
        println("Localização: ${this.localizacao}")
    }

    override fun imprimeTipoIngresso() {
        super.imprimeTipoIngresso()
        println("Camarote inferior!")
    }
}