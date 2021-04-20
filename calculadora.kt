import java.util.Scanner
import java.lang.Math

fun soma(scan:Scanner):Int{
    print("Digite o primeiro valor: ")
    val valor1:Int = scan.nextLine().trim().toInt()
    print("Digite o segundo valor: ")
    val valor2:Int = scan.nextLine().trim().toInt()
    val soma:Int = valor1 + valor2
    return soma
}

fun subtracao(scan:Scanner):Int{
    print("Digite o primeiro valor: ")
    val valor1:Int = scan.nextLine().trim().toInt()
    print("Digite o segundo valor: ")
    val valor2:Int = scan.nextLine().trim().toInt()
    val subtracao:Int = valor1 - valor2
    return subtracao
}

fun multiplicacao(scan:Scanner):Int{
    print("Digite o primeiro valor: ")
    val valor1:Int = scan.nextLine().trim().toInt()
    print("Digite o segundo valor: ")
    val valor2:Int = scan.nextLine().trim().toInt()
    val multiplicacao:Int = valor1 * valor2
    return multiplicacao
}

fun divisao(scan:Scanner):Int{
    print("Digite o dividendo: ")
    val valor1:Int = scan.nextLine().trim().toInt()
    print("Digite o divisor: ")
    val valor2:Int = scan.nextLine().trim().toInt()
    val divisao:Int = valor1 / valor2
    return divisao
}

fun resto(scan:Scanner):Int{
    print("Digite o dividendo: ")
    val valor1:Int = scan.nextLine().trim().toInt()
    print("Digite o divisor")
    val valor2:Int = scan.nextLine().trim().toInt()
    val resto:Int = valor1 % valor2
    return resto
}

fun potenciacao(scan:Scanner):Double{
    print("Digite a base: ")
    val valor1:Double = scan.nextLine().trim().toDouble()
    print("Digite o expoente: ")
    val valor2:Double = scan.nextLine().trim().toDouble()
    val potenciacao:Double = Math.pow(valor1, valor2)
    return potenciacao
}

fun raiz(scan:Scanner):Double{
    print("Digite o radicando: ")
    val valor1:Double = scan.nextLine().trim().toDouble()
    val raiz:Double = Math.sqrt(valor1)
    return raiz
}

fun main(){

    val scan = Scanner(System.`in`)

    println("########## CALCULADORA ##########")
    println("######## MENU OPERAÇÕES #########")
    println("OPÇÃO | OPERAÇÃO")
    println("1     | SOMA")
    println("2     | SUBTRAÇÃO")
    println("3     | MULTIPLICAÇÃO")
    println("4     | DIVISÃO")
    println("5     | RESTO DA DIVISÃO")
    println("6     | POTENCIAÇÃO")
    println("7     | RAIZ QUADRADA")
    println("#################################")

    var opcao:Int = -1

    while(opcao != 0){
        print("QUAL OPÇÃO VOCÊ ESCOLHE ? ")
        opcao = scan.nextLine().trim().toInt()
        when(opcao){
            0 -> println("TCHAU TCHAU, ATÉ MAIS!!! (:)")
            1 -> println("SOMA = ${soma(scan)}")
            2 -> println("SUBTRAÇÃO = ${subtracao(scan)}")
            3 -> println("MULTIPLICAÇÃO = ${multiplicacao(scan)}")
            4 -> println("DIVISÃO = ${divisao(scan)}")
            5 -> println("RESTO = ${resto(scan)}")
            6 -> println("POTENCIAÇÃO = ${potenciacao(scan)}")
            7 -> println("RAIZ QUADRADA = ${raiz(scan)}")
            else -> println("Digite uma opção válida.")
        }
    }
}
