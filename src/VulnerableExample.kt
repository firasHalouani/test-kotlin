import java.io.File
import java.lang.Runtime

class VulnerableExample {

    // ❌ NullPointerException possible
    fun printUserName(user: Map<String, String>) {
        val name = user["name"]!!  // panic si clé manquante
        println("User: $name")
    }

    // ❌ Command Injection
    fun runCommand(cmd: String) {
        Runtime.getRuntime().exec(cmd) // input utilisateur non validé
    }

    // ❌ Secret codé en dur
    fun getApiKey(): String {
        return "SECRET_API_KEY_123"
    }

    // ❌ Mauvaise gestion des exceptions
    fun readFile(path: String): String {
        return File(path).readText() // exception possible non gérée
    }

    // ❌ Code dupliqué / mauvaise pratique
    fun calculate(a: Int, b: Int): Int {
        if (a > b) {
            return a + b
        } else {
            return a + b
        }
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
}
