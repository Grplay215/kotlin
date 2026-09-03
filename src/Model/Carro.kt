package Model

import com.sun.jdi.Field

open class Carro {
    var modelo: String = ""
        get(){
            return field.uppercase()
        }

    var ano: Int = 0
        set(value) {
            field = if (value >= 0) value else 0
        }




    private var kilometragem: Double = 0.0
    fun rodar(km: Double){
        kilometragem+= km
    }

    fun consultarkm(): Double{
        return kilometragem
    }

    open fun acelerar(){
        println("Vrum-Vrum")
    }
//    init {
//        println("Carro do modelo $modelo com $portas portas foi criado no ano de $ano")
//    }

}