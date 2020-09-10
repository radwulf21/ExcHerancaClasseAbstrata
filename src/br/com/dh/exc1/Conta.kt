package br.com.dh.exc1

abstract class Conta(var saldo: Double, var cliente: Cliente) {
    fun consultarSaldo(): Double {
        return this.saldo
    }

    open fun sacarDinheiro(quantia: Double) {
        if (quantia <= this.saldo) {
            this.saldo -= quantia
            println("Sacando R$ $quantia")
        } else {
            println("Saldo insuficiente!")
        }
    }

    fun depositarDinheiro(quantia: Double) {
        this.saldo += quantia
        println("Depositando R$ $quantia")
    }
}