//OperationsOnCollections/Task2.kt
package operationsOnCollectionsExercise2

import atomictest.eq

val operation = { x: Int ->
  x in setOf(1, 5, 32)
  // other options:
  // x % 5 == 0
  // x.toString().contains('5')
}

fun main() {
  val first = listOf(1, 5, 32, 45, 70, 511)
  first.any(operation) eq true
  first.all(operation) eq false
  first.none(operation) eq false
  first.count(operation) eq 3
}
