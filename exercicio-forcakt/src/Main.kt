// 1  Passo - Criação da função formula
// 2  Passo - Criação das variaveis dentro do parametro da formula m int a int
// 3  Passo - Criação da variavel f  que realiza o calculo da formula f = m * a
// 4  Passo - faço o return para retornar o valor da variavel f na chamada da função
// 5  Passo - na função principal Main crio a variavel resultado que recebe a função
// 6 Passo - declaro os argumentos da função formula na variavel resultado
// 7 Passo - Chamo a função Println que me traz o Resultado do Calculo da Formula


fun main(){
    val resultado = formula(10, 5) //5 //6
    println("Resultado:  $resultado") // 6

}

fun formula(m: Int, a: Int): Int{    //1  //2
    val f = m * a // 3
    return f // 4
}