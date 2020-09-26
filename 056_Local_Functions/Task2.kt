//LocalFunctions/Task2.kt
package localFunctionsExercise2

import atomictest.eq

fun createCounter(): Pair<() -> Unit, () -> Int> {
  var counter = 0

  fun inc() {
    counter++
  }

  fun value(): Int {
    return counter
  }

  return Pair(::inc, ::value)
}

fun main() {
  val (inc, value) = createCounter()
  repeat(10) {
    inc()
  }
  value() eq 10
}
