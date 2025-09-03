/**16 Crie um programa kotlin que leia o número de dias trabalhados em
 * um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por
hora trabalhada.
 */



fun main(){
   println("Dias trabalhados em 1 mês: ")
    var quantidade = readLine()!!.toInt()
   var valor_hora = 25
   var trabalho_hora_dia = 8
    var salario = (quantidade * trabalho_hora_dia * valor_hora)

    println("O salario é de $salario")


}