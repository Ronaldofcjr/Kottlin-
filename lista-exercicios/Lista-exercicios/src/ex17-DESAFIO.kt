/**17  Escreva um programa em kotlin para calcular a redução do tempo de vida
de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos
ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.
 */



fun main(){
   println("Quantidade de cigarros fumados por dia: ")
    var cigarrosPorDia = readLine()!!.toInt()
    println("Quantos anos já fumou: ")
    var anosFumando = readLine()!!.toInt()

    var totalCigarros = cigarrosPorDia * 365 * anosFumando
    var minutosPerdidos = totalCigarros * 10
    var diasPerdidos = minutosPerdidos / (60 * 24)

   println("Perdeu aproximadamente $diasPerdidos dias de vida")





}