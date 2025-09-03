/**
 * 2	Faça um programa que leia o nome de uma pessoa e
 * mostre uma mensagem de boas-vindas para ela:
 * Ex:
 * Qual é o seu nome? Johann Gabriell
 * Olá Johann Gabriel, é um prazer conhecer-te!
 *
 */

fun main(){
    println("Digite o seu nome: ")
    var nome = readLine()!!
    println("Olá $nome, É um prazer conhecer você!")
}