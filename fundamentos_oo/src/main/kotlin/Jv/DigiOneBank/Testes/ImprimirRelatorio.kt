package Jv.DigiOneBank.Testes

import Jv.DigiOneBank.Funcionario

class ImprimirRelatorio {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(funcionario.toString())
            println("------------------------------")
        }
    }
}