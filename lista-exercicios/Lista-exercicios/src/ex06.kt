/**
 * 6 Faça um programa em Kotlin que leia um número inteiro e
 * mostre o seu antecessor
 *   e seu sucessor.
 * Ex:
 * Digite um número: 9
 * O antecessor de 9 é 8
 * O sucessor de 9 é 10
 *
 */


fun main(){
   println("Digite um numero: ")
    var numero = readLine()!!.toDouble()
    var antecessor = numero - 1
    var sucessor = numero + 1
    println("O antecessor de $numero é $antecessor")
    println("O sucessor de $numero é $sucessor")
}