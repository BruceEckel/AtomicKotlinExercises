//SecondaryConstructors/Task1.kt
package secondaryConstructorsExercise1

import atomictest.eq

data class Flower1(val type: String) {
    constructor(): this("Daisy")
}

data class Flower2(val type: String = "Daisy")

fun main() {
    Flower1().type eq "Daisy"
    Flower2().type eq "Daisy"
}
