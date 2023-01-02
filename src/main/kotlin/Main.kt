fun main(args: Array<String>) {
    println("Bem Vindo ao Hofstadter Bank")

    val contaDionizio = Conta()
    contaDionizio.titular = "Dionizio"
    contaDionizio.numero = 1
    contaDionizio.saldo = 100000.0

    val contaJessica = Conta()
    contaJessica.titular = "Jessica"
    contaJessica.numero = 2
    contaJessica.saldo = 100000.12

    println(contaDionizio.titular)
    println(contaDionizio.numero)
    println(contaDionizio.saldo)

    println()

    println(contaJessica.titular)
    println(contaJessica.numero)
    println(contaJessica.saldo)

    val contaDidio = Conta()
    contaDidio.titular = "Dionizio"

    var contaJess = Conta()
    contaJess.titular = "Jessica"

    println("Titular conta Didio: ${contaDidio.titular}")
    println("Titular conta Jess: ${contaJess.titular}")
}


class Conta{
    var titular = ""
    var numero = 0
    var saldo = 0.0
}


//for(i in 1..10 step 2) {
//    val titular = "Dionzio $i"
//    val numeroConta = 1234 +i
//    val saldo = 100.00
//
//    println("Titular: $titular")
//    println("Número da Conta: $numeroConta")
//    println("Saldo em conta: $saldo")
//    when {
//        saldo > 0.0 -> println("conta é positiva")
//        saldo == 0.0 -> println("conta é neutra")
//        else -> println("conta é negativa")
//    }
//    println()
//}