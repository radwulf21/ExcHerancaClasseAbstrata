package br.com.dh.exc1

class ContaPoupanca(saldo: Double, cliente: Cliente) : Conta(saldo, cliente) {
    var taxaJuros: Double = 0.1

    fun recolherJuros(): Double {
        this.saldo += this.saldo * taxaJuros
        return this.saldo * taxaJuros
    }
}