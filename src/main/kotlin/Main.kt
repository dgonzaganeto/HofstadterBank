fun main(args: Array<String>) {
    println("Bem Vindo ao Hofstadter Bank")

    val titular = "Dionzio"
    val numeroConta = 1234
    var saldo = 100.00

    println("Titular: $titular")
    println("Número da Conta: $numeroConta")
    println("Saldo em conta: $saldo")

    if(saldo > 0.0){
        println("conta é positiva")
    }else if (saldo == 0.0) {
        println("conta é neutra")
    }else{
        println("conta é negativa")
    }
}