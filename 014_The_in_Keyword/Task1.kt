//InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
  var s = ""
  for (c in 'a'..'z') {
    s += c
  }
  return s
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}
