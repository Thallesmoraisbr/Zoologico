import java.util.Scanner

class Animal(
    val reino: String,
    val filo: String,
    val classe: String,
    val ordem: String,
    val familia: String,
    val genero: String,
    val especie: String,
    val apelido: String,
    val origem: String,
    val dieta: String,
    val tipoGaiola: String,
    val localizacaoSela: String
) {
    fun exibirInformacoes() {
        println("Apelido: $apelido")
        println("Reino: $reino, Filo: $filo, Classe: $classe, Ordem: $ordem")
        println("Família: $familia, Gênero: $genero, Espécie: $especie")
        println("Origem: $origem")
        println("Dieta: $dieta")
        println("Tipo da Gaiola: $tipoGaiola")
        println("Localização da Sela: $localizacaoSela")
        println()
    }
}

class Zoologico {
    private val animais = mutableListOf<Animal>()

    fun cadastrarAnimal(animal: Animal) {
        animais.add(animal)
        println("Animal '${animal.apelido}' cadastrado com sucesso!")
    }

    fun listarAnimais() {
        if (animais.isEmpty()) {
            println("Não há animais cadastrados no zoológico.")
        } else {
            println("Lista de Animais no Zoológico:")
            animais.forEach { it.exibirInformacoes() }
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val zoologico = Zoologico()
    
    while (true) {
        println("Menu do Zoológico")
        println("1. Cadastrar novo animal")
        println("2. Listar animais cadastrados")
        println("3. Sair")
        print("Escolha uma opção: ")
        
        when (scanner.nextInt()) {
            1 -> {
                scanner.nextLine() 
                println("Cadastro de Novo Animal")
                print("Reino: ")
                val reino = scanner.nextLine()
                print("Filo: ")
                val filo = scanner.nextLine()
                print("Classe: ")
                val classe = scanner.nextLine()
                print("Ordem: ")
                val ordem = scanner.nextLine()
                print("Família: ")
                val familia = scanner.nextLine()
                print("Gênero: ")
                val genero = scanner.nextLine()
                print("Espécie: ")
                val especie = scanner.nextLine()
                print("Apelido: ")
                val apelido = scanner.nextLine()
                print("Origem: ")
                val origem = scanner.nextLine()
                print("Dieta: ")
                val dieta = scanner.nextLine()
                print("Tipo da Gaiola: ")
                val tipoGaiola = scanner.nextLine()
                print("Localização da Sela: ")
                val localizacaoSela = scanner.nextLine()

                val animal = Animal(
                    reino, filo, classe, ordem, familia, genero, especie, apelido,
                    origem, dieta, tipoGaiola, localizacaoSela
                )
                zoologico.cadastrarAnimal(animal)
            }
            2 -> {
                println("Lista de Animais")
                zoologico.listarAnimais()
            }
            3 -> {
                println("Encerrando o programa. Até mais!")
                break
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}
