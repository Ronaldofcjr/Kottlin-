/**15 A locadora de carros precisa da sua ajuda para
 * cobrar seus serviços. Escreva um
programa em kotlin que pergunte a quantidade de Km percorridos por um carro alugado
e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$ 90,00 por dia e R$ 0,20 por Km rodado.
 */



fun main(){
   println("Quantidade de km percorridos: ")
    var km_percorridos = readLine()!!.toDouble()

    println("Quantidade de dias alugado: ")
    var dias = readLine()!!.toInt()

    var dias_valor = 90

    var km_valor = 0.20

    var total_pagar = (dias * dias_valor) + (km_percorridos * km_valor)

    println("O Total a pagar é de $total_pagar")



}