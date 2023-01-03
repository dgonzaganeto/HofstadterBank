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
    contaDionizio.setSaldo(100.00)

    val contaJessica = Conta()
    contaJessica.titular = "Jessica"
    contaJessica.numero = 2
    contaJessica.setSaldo(100.00)

    println(contaDionizio.titular)
    println(contaDionizio.numero)
    println(contaDionizio.getSaldo())

    println()

    println(contaJessica.titular)
    println(contaJessica.numero)
    println(contaJessica.getSaldo())

    println()

    println(contaDionizio.getSaldo())
    println("Depositando na conta Dionizio")
    contaDionizio.deposita(valor = 50.0)
    println(contaDionizio.getSaldo())

    println()

    println("Saldo anteior conta de Jessica: ${contaJessica.getSaldo()}")
    println("Depositando na conta de Jessica")
    contaJessica.deposita(valor = 100.0)
    println("Saldo atual na conta de Jessica: ${contaJessica.getSaldo()}")

    println("sacando na conta de Dionizio")
    contaDionizio.saca(valor = 10.0)
    println(contaDionizio.getSaldo())

    println()

    println("Sacando na conta da Jessica")
    contaJessica.saca(valor = 15.00)
    println(contaJessica.getSaldo())

    println()
    println("Transferência da conta de Jessica para Dionizio")

    if (contaJessica.transfere(valor = 1.75, contaDionizio)){
        println("Sucesso na transferência")
    }else {
        println("Falha na transferência")
    }

    println()
    println(contaJessica.getSaldo())

    println()
    println("Saldo conta Dionizio, ${contaDionizio.getSaldo()}")

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
        private var saldo = 0.0

        fun deposita(valor: Double){
            this.saldo += valor
        }

        fun saca(valor: Double){
            if(saldo >= valor){
                saldo -= valor
            }
        }

        fun transfere(valor: Double, destino: Conta): Boolean{
            if(saldo >= valor){
                saldo -= valor
                destino.deposita(valor)
                return true
            }
                return false
        }

        fun getSaldo(): Double{
            return saldo
        }

        fun setSaldo(valor: Double){
            saldo = valor
        }

    }