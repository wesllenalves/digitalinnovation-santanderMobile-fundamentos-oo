package one.digitalinnovation.digonebank

class Pessoa {
    var nome: String = "Wesllen"
    var cpf: String = "03230944143"
    private set

}

fun main() {
    val Clinte  = Pessoa ()
    println(Clinte.nome)
    println(Clinte.cpf)

}