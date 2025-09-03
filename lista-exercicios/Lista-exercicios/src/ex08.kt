/**
 * 8   Desenvolva um programa em Kotlin que leia uma distância em metros e mostre os
 *     valores relativos em outras medidas.
 *     Ex:
 *     Digite uma distância em metros: 100
 *     Distância de 10000 Cm
 *
 *     Ajustar para outras medidas
 *
 */


fun main(){
   println("Digite uma Distancia em metros: ")
    var metros = readLine()!!.toDouble()
    val km = metros / 1000
    val hm = metros / 100
    val dam = metros / 10
    val dm = metros * 10
    val cm = metros * 100
    val mm = metros * 1000

    println("A distância de $metros m corresponde a:")
    println("$km km")
    println("$hm hm")
    println("$dam dam")
    println("$dm dm")
    println("$cm cm")
    println("$mm mm")



}