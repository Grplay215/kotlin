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

//    print("A habilidade $habilidade do usuário $nome, casou ${dano*7}")



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


val verdadeiro = texto.contains("human")
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



 var frutas = listOf("Banana", "Maçã", "Abacate")
 println(frutas[0])
 println(frutas.size)
 println(frutas.first())
 println(frutas.last())
 println(frutas.contains("Maçã"))













 //main
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

n sei o q é bluthof
n sei o q é internet
pra co*er mu**er nunca precisei disso

[...]
*/

