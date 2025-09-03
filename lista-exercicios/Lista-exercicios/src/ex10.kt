/**
 * 10	Faça um programa em kotlin que leia a largura e altura de
 *      uma parede,
 *      calcule e mostre a área a ser pintada e a quantidade
 *      de tinta necessária para o serviço,
 *      sabendo que cada litro de tinta pinta uma área de
 *      2 metros quadrados.
 */



fun main(){
   println("Qual a largura da parede: ")
    var largura = readLine()!!.toDouble()
    println("Qual a altura da parede: ")
    var altura = readLine()!!.toDouble()

    var area = altura*altura

    var litros = area / 2

    println("\nA parede tem dimensão de ${largura}m x ${altura}m e área de %.2f m²".format(area))
    println("Será necessário %.2f litros de tinta para pintá-la.".format(litros))




}