/**
 * 7 Crie um programa em Kotlin que leia um número real e mostre na tela o seu dobro
 *   e a sua terça parte.
 *   Ex: Digite um número: 3.5
 *       O dobro de 3.5 é 7.0
 *       A terça parte de 3.5 é 1.16666
 */

fun main(){
   println("Digite um numero: ")
    var numero = readLine()!!.toDouble()
    var dobro = numero * 2
    var terca = numero / 3
    println("O dobro de $numero é $dobro")
    println("A terça parte de $numero é $terca")

}