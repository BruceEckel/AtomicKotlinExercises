//InKeyword/Task3.kt
package theInKeywordExercise3

fun isLowerCase(ch: Char): Boolean = ch in 'a'..'z'

fun main() {
  println(isLowerCase('A'))  // false
  println(isLowerCase('b'))  // true
}
