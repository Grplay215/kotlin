package Model

class Contabancaria (nomeTitular: String="não colocado") {

    private var saldo: Double = 200.0
    fun depositar(valor: Double ){

        saldo = saldo+valor

        if ( saldo <= 0.0 ){
            println("Não foi possível realizar o depósito, coloque um valor valido")
        }else if(saldo > 0.0){
            println("Depósito realizado")
            println("saldo: R$$saldo")
        }

    }

    fun sacar(dinheiro: Double){

        if (dinheiro<0){
            saldo = dinheiro * 2
        }else{
            saldo = dinheiro - saldo
        }

        println("Saldo realizado")
        println("Saldo: R$$saldo")
    }


}