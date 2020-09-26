//Lists/Task2.kt
package listsExercise2

fun countOccurrences(list: IntList, number: Int): Int {
  var occurrences = 0
  for (e in list) {
    if (number == e) {
      occurrences++
    }
  }
  return occurrences
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  println(countOccurrences(list, 2))  // 2
}

//Lists/IntList.kt
package listsExercise2

class IntList(private val list: List<Int>) : Iterable<Int> {

  override fun iterator(): Iterator<Int> = list.iterator()

  operator fun get(index: Int): Int = list[index]

  override fun toString() = list.toString()

  fun size() = list.size
}
