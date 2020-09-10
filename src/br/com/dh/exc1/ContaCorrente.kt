package br.com.dh.exc1

class ContaCorrente(saldo: Double, cliente: Cliente, var limiteEspecial: Double) : Conta(saldo, cliente) {
    var cheques = arrayListOf<Cheque>()

    fun depositarCheques(cheque: Cheque) {
        this.cheques.add(cheque)
    }

    override fun sacarDinheiro(quantia: Double) {
        if (quantia > this.saldo) {
            this.limiteEspecial -= quantia
            println("Você não tem saldo, estamos retirando R$ $quantia do seu cheque especial...")
        } else {
            this.saldo -= quantia
            println("Sacando R$ $quantia")
        }
    }
}