//Sets/Task1.kt
package setsExercise1

import atomictest.eq

fun hasUniqueCharacters(s: String): Boolean {
  return s.toSet().size == s.length
}

fun main() {
  hasUniqueCharacters("abcd") eq true
  hasUniqueCharacters("abcb") eq false
}
