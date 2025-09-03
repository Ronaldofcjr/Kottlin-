/**12 Desenvolva uma programa em kotlin que leia os valores
 * de A, B e C de uma
equação do segundo grau e mostre o valor de Delta.
(formula Δ = b2 – 4ac)
 */



fun main(){
   println("Valor de A: ")
    var A  = readLine()!!.toInt()
    println("Valor de B: ")
    var B  = readLine()!!.toInt()
    println("Valor de C: ")
    var C  = readLine()!!.toInt()

    var delta = (B * B) - (4 * A * C)

    println("\nA equação é: (${A})x² + (${B})x + (${C})")
    println("O valor de Δ (delta) é: $delta")




}