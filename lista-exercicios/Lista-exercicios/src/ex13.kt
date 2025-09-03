/**14 Faça um programa em kotlin que
 *  leia o salário de um funcionário,
 *  calcule e mostre o
seu novo salário, com 15% de aumento.
 */



fun main(){
   println("Salario do Funcionario: ")
    var salario = readLine()!!.toDouble()

    var aumento = salario * 0.15
    var novo_salario = salario + aumento

    print("O salario do funcionario é $salario e o salario com aumento é $novo_salario")




}