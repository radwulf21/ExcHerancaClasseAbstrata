package br.com.dh.exc2

import java.util.Scanner

fun main() {
    println("-------- Menu --------")
    println("1 - Ingresso Normal")
    println("2 - Ingresso VIP")
    print("Escolha: ")

    val reader = Scanner(System.`in`)

    when (reader.nextInt()) {
        1 -> {
            val ingresso = Normal(100.0)
            ingresso.imprimeTipoIngresso()
            ingresso.imprimeValor()
        }
        2 -> {
            println("-------- Menu --------")
            println("1 - Camarote Inferior")
            println("2 - Camarote Superior")
            print("Escolha: ")
            when (reader.nextInt()) {
                1 -> {
                    val ingresso = CamaroteInferior(100.0, 100.0, "Área espelhada")
                    ingresso.imprimeTipoIngresso()
                    ingresso.imprimeValor()
                    ingresso.imprimireLocalizacao()
                }
                2 -> {
                    val ingresso = CamaroteSuperior(100.0, 150.0)
                    ingresso.imprimeTipoIngresso()
                    ingresso.imprimeValor()
                }
                else -> {
                    println("Opção Inválida!")
                }
            }
        }
        else -> {
            println("Opção Inválida!")
        }
    }
}