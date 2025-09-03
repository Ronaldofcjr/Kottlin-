/**
 * 4 - Desenvolva um programa em Kotlin que leia dois números inteiros e mostre o somatório entre eles.
 * Ex:
 * Digite um valor: 8
 * Digite outro valor: 5
 * A soma entre 8 e 5 é igual a 13.
 *
 */


fun main(){
    println("Digite um valor: ")
    var valor = readLine()!!.toInt()
    println("Digite um valor: ")
    var valor2 = readLine()!!.toInt()
    var soma = valor + valor2
    println("A soma entre $valor e $valor2 é igual a $soma")

}