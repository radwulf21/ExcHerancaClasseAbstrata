package br.com.dh.exc1

fun main() {
    val cliente1 = Cliente(1, "Raul", "Andrade", "5.456.888", "789.415.687-22")
    val contaP = ContaPoupanca(1000.0, cliente1)

    contaP.sacarDinheiro(200.0)
    contaP.depositarDinheiro(400.0)
    println("Recolhendo juros de R$ ${contaP.recolherJuros()}")
    println("Saldo da conta do ${contaP.cliente.nome}: R$ ${contaP.consultarSaldo()}")

    println("-----------------------------------------")

    val cliente2 = Cliente(2, "Yan", "Almeida", "8.854.899", "741.321.569.99")
    val contaC = ContaCorrente(1000.0, cliente2, 2000.0)
    val cheque1 = Cheque(500.0, "Santander", "10/09/2020")
    val cheque2 = Cheque(200.0, "Santander", "10/09/2020")

    contaC.sacarDinheiro(500.0)
    contaC.depositarDinheiro(300.0)
    println("Saldo da conta do ${contaC.cliente.nome}: R$ ${contaC.consultarSaldo()}")

    contaC.depositarCheques(cheque1)
    contaC.depositarCheques(cheque2)
}