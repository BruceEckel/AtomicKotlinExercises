//Packages/Task3.kt
package pythagorean

import kotlin.math.sqrt

class EquilateralTriangle(val side: Double) {
  fun area() = sqrt(3.0) / 4 * side * side
}

//Packages/Main.kt
package packagesExercise3

import pythagorean.EquilateralTriangle

fun main() {
  val et = EquilateralTriangle(1.0)
  println(et.area()) // 0.4330127018922193
}
