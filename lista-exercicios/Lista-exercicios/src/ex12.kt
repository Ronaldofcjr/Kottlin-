/**13 Crie um programa em Kotlin que
 * leia o preço de um produto, calcule e mostre o
seu PREÇO PROMOCIONAL, com 5% de desconto.
 */



fun main(){
   println("Valor do produto: ")
    var produto = readLine()!!.toDouble()
    var promocional = produto * 0.05
    var promocional_valor = produto - promocional

    println("O preco original é $produto")
    println("O valor com desconto é $promocional_valor")


}