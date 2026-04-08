import java.io.File
import java.lang.Runtime

class VulnerableExample {

    // ❌ Null unsafe
    fun printUserName(user: Map<String, String>) {
        val name = user["name"]!!  // panic si clé manquante
        println("User: $name")
    }

    // ❌ Variable inutilisée
    fun unusedVar() {
        val x = 42
    }

    // ❌ Magic number
    fun checkAge(age: Int) {
        if (age > 18) {
            println("Adult")
        }
    }

    // ❌ Code dupliqué
    fun addNumbers(a: Int, b: Int): Int {
        if (a > b) {
            return a + b
        } else {
            return a + b
        }
    }
}

fun main() {
    val example = VulnerableExample()

    // Null unsafe
    example.printUserName(mapOf())

    // Magic number / code dupliqué
    example.checkAge(20)
    println(example.addNumbers(5, 10))

    // Variable inutilisée
    example.unusedVar()
}
