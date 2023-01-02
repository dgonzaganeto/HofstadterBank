fun main(args: Array<String>) {
    println("Bem Vindo ao Hofstadter Bank")
    println(clienteCorrentista())
//    println(nomeTitular())

//    println(qualidadeConta())
}

//println("Titular: $titular")
//println("Número da Conta: $numeroConta")
//println("Saldo em conta: $saldo")

//fun qualidadeConta(){
//    when{saldo > 0.0 -> println("conta é positiva")
//    saldo == 0.0 -> println("conta é neutra")
//    else -> println("conta é negativa")
//}

fun clienteCorrentista() {
    val contaDionizio = Conta()
    contaDionizio.titular = "Dionizio"
    contaDionizio.numero = 1
    contaDionizio.saldo = 1.00

    val contaJessica = Conta()
    contaJessica.titular = "Jessica"
    contaJessica.numero = 2
    contaJessica.saldo = 10.00

    println(contaDionizio.titular)
    println(contaDionizio.numero)
    println(contaDionizio.saldo)

    println()

    println(contaJessica.titular)
    println(contaJessica.numero)
    println(contaJessica.saldo)

    println()

    println(contaDionizio.saldo)
    println("Depositando na conta Dionizio")
    deposita(contaDionizio, valor = 50.0)
    println(contaDionizio.saldo)

    println()

    println("Saldo anteior conta de Jessica: ${contaJessica.saldo}")
    println("Depositando na conta de Jessica")
    deposita(contaJessica, valor = 100.0)
    println("Saldo atual na conta de Jessica: ${contaJessica.saldo}")


}

fun deposita(conta: Conta, valor: Double){
    conta.saldo += valor
}
fun nomeTitular(){
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