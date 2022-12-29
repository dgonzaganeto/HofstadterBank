fun main(args: Array<String>) {
    println("Bem Vindo ao Hofstadter Bank")

    for(i in 1..10 step 2) {
        val titular = "Dionzio $i"
        val numeroConta = 1234 +i
        val saldo = 100.00

        println("Titular: $titular")
        println("Número da Conta: $numeroConta")
        println("Saldo em conta: $saldo")
        when {
            saldo > 0.0 -> println("conta é positiva")
            saldo == 0.0 -> println("conta é neutra")
            else -> println("conta é negativa")
        }
        println()
    }
}