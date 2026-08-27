


fun main() {
   var idade: Int = 2

    var altura = 1.80
    altura = 1.76


    val texto = "--soldier boy é muito bolado na série e buxa nos quadrinhos--"

    /*
    println(texto)

    println(texto.length)
    println(texto.uppercase())
    println(texto.contains("human"))

     */



    val habilidade = "corte dimensional"
    val renge = 20
    val nome: String = "yami"

    var dano = renge + (10-4)

    print("A habilidade $habilidade do usuário $nome, casou ${dano*7}")







/*
    val texto = """
        texto escreito
        em varias linhas
        para vermos q 
        o anirap é um tamanduá (aniduá)
    """.trimIndent()
    print(texto)

 */


    val character = 's'

    val blood: Boolean = false




    val number = 7_000_000_000_000_000_000L
    val peso = 75.1234F


    val x: Int = 10
    val y: Double = x.toDouble() * 12
    var calculo = y + peso / dano * idade
    val z = calculo


 val a = 10
 val b =3


 var u = 10

 u += 5

 u -= 5

 u *= 5

 u /= 5

 u %= 5


 // println(a % b)



val result = somas(10, 3)

// mensagem( "matheus" , 2 )

 //println(result)

 val somass: (Int, Int) -> Int = {a, b -> a + b}
 val resa = somass(10, 3)
 //println( resa)


val verdadeiro = texto.contains("boy")
 val verdade: Boolean = verdadeiro

 if (verdade == true){
  println("a habilidade $habilidade está carregada e pronta para ser usada")
 }else {
  println("o seu $habilidade deu $dano no adversário (falta 5 minutos para usar novamente)")
 }



// val status = if(idade >= 18){
//  "Maior de idade"
// } else {
//  "menor de idade"
//  println("teste 2")
//  println("teste 3")
//  return
// }
 //println(status)



 val dia = 4

 when (dia){
  1 -> println("Domingo")
  2 -> println("Segunda")
  3 -> println("Terça")
  4 -> println("Quarta")
  5 -> println("Quinta")
  6 -> println("Sexta")
  7 -> println("Sábado")
  else -> println("Vtmnc, isso nem existe")
 }

 val nomeDia = when (dia){
  1 -> "Domingo"
  2 -> "Segunda"
  3 -> "Terça"
  else -> "outro dia"
 }




 val nota = 10
 when (nota){
  9,10 -> println("EXCELENTE")
  7,8 -> println("BOM")
  6 -> println("OK")
  else -> println("vc é um merda")
 }

 when{
  nota >= 9 -> println("Exelente")
  nota >= 6 -> println("Regular")
  else -> println("MUITO BURRO Kkkkkkkkkkkkkk")
 }




 var neme: String? = "Joao"
 neme = null
 if (neme != null){
  println(neme.length)
 }
 var nomes: String? = null
 println(nomes?.length)



 var numeross = arrayOf(1, 2,2)
 println(numeross[0])

 numeross[1] = 50
 println(numeross[1])


//lista imutável, n tem como mudar
 var frutas = listOf("Banana", "Maçã", "Abacate")
 println(frutas[0])
 println(frutas.size)
 println(frutas.first())
 println(frutas.last())
 println(frutas.contains("Maçã"))


 //lista Mutável,  tem como mudar a vontade(adicionar)
 var carros = mutableListOf("Lamborguine", "Up Tsi")
 println(carros.size)
 println(carros.last())
 println(carros.add("Mustang"))
 println(carros.last())
 println(carros.size)
 println(carros.remove("Up Tsi"))
 println(carros.size)


 //é imutável e n da para colocar coisas repetidas
 val cores = setOf("azul", "Verde", "Verde")
 println(cores)
 println(cores.size)

 //mutável
 var cor = mutableSetOf("Azul", "Verde", "Verde")

 cor.add("Amarelo")
 cor.add("Verde")
 cor.remove("Verde")
 println(cor)




 //mapa imutavel
 val poder = mapOf(
  "byakugan" to 25,
  "six eyes" to 26
 )
 println(poder["byakugan"])
 println(poder["six eyes"])
 println(poder["biyakugou"])


 //mapa mutavel
 val poderes = mutableMapOf(
  "expansão de dominio" to "Sukuna",
  "Mahoraga" to "Megumi"
 )

 println(poderes["expansão de dominio"])
 poderes["Itadori"] = "Black Flash"
 poderes.remove("Mahoraga")
 println(poderes)


 for (i in 1..10){
  println(i)
 }



 for (i in carros){
  println(i)
 }


 for (i in carros.indices){
  println(i)
 }
// var i = 0
// while (1<10){
//  println(i)
//  i++
// }

 1..5
 1 until 5
 5 downTo 1
 1..10 step 2


 for ((indice, carro) in carros.withIndex()){
  println("O $carro é $indice")
 }



 val anos = 200

 when(anos){
  in 0..12 -> println("Criança")
  in 13..17 -> println("Adolescente")
  in 18..40 -> println("adulto")
  in 41..99 -> println("idoso")
  else -> println("Tutancâmon")
 }


 println("=============================================================================")
 println("=============================================================================")
 println("=============================================================================")


 //1
 var impar = 10
 impar %= 2

 val status = if(impar == 1){
  "Ímpar"
 } else {
  "Par"
 }
 println(status)



 //2
 var numero = 4
 var resultado = if (numero >= 1){
  "Positivo"
 } else if (numero == 0) {
  "Zero"
 } else {
  "Negativo"
 }
println(resultado)



//3
 val idades = 200

 when(idades){
  in 0..12 -> println("Criança")
  in 13..17 -> println("Adolescente")
  in 18..59 -> println("Adulto")
  in 59..112 -> println("Idoso")
  else -> println("morto")
 }


 //4
//copiado
/*
 var numeroEscolhido = 7
 for ( i in 1 .. 10){
  println("$numeroEscolhido X $i = $numeroEscolhido")
 }
 */



 //5
var nume = arrayOf(0, 0, 0, 0)
 nume[0] = 1
 nume[1] = 2
 nume[2] = 3
 nume[3] = 4
 var contas = nume[0] + nume[1] + nume[2] + nume[3]
 println(contas)



 //6
//copiado

/*
 val listveja = arrayOf(1, 2, 30, 5, 100)

 var valormaior = listveja[0]
 for (i in listveja)
  if (valormaior < i){
   valormaior = i
  }

 println(valormaior)
 */





 //7
 var i = 30
for (dece in i downTo  0){
 println(dece)
}






 //8
 //copiado
 /*
 val reis = arrayOf(1, 2, 3, 4, 5, 6)
 var pares = 0
 for (numerous in reis){
  if (numerous % 2 == 0){
   pares += numerous
  }
  println(pares)
 }
  */





 //9
 var resul = calcular(2)
 println(resul)


//10
 var notas = media(10.0, 7.0, 3.0)
 var format = String.format("%.2f", notas)
println(format)


 //11
var temp = graus(21.7)
 var formato = String.format("%.2f", temp)
 println("$formato °F")




 println("=============================================================================")
 println("=============================================================================")
 println("=============================================================================")



 val numerosss = (1..10).toList()
 val impares = numerosss.filter { it % 2 == 1 }
 println(impares)



 val nummer = (1..5).toList()
 val dobros = nummer.map{
  nummer -> nummer * 2
 }
 println(dobros)


 val soma = nummer.reduce { acumulador, numerosss -> acumulador / numerosss }
 println(soma)














 //main
}
//11
fun graus (celcios: Double) :Double = (celcios*1.8)+32

//10
fun media (nota1: Double, nota2: Double, nota3: Double): Double{
 var final = nota1 + nota2 + nota3
 return final / 3
}

//9
fun calcular(numero: Int): Int {
 return numero * 2
}

fun mandaSalve(nome: String= "mano"){
 println("Salve $nome!")
}

fun mensagem(nome: String, idade: Int){
 println("parabens $nome pelos $idade anos de acasalamento!")
}

fun soma (a: Int, b: Int): Int {
   return a + b
}
//ou
fun somas(a:Int, b: Int) = a + b
//ou




//k2 é uma merda

/*
soldier boy - anirap

[...]
pqp olha pros homens de hj em dia
só b@iola afeminado
no meu tempo 6 m@rri4n,

n sei o q é bluetooth
n sei o q é internet
pra co*er mu**er nunca precisei disso

[...]
*/

