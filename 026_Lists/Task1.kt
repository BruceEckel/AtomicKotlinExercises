//Lists/Task1.kt
package listsExercise1

import atomictest.eq

fun findMax(list: IntList): Int {
  var max = 0
  for (e in list) {
    if (max <= e) {
      max = e
    }
  }
  return max
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  findMax(list) eq 3
}

//Lists/IntList.kt
package listsExercise1

class IntList(private val list: List<Int>) : Iterable<Int> {

  override fun iterator(): Iterator<Int> = list.iterator()

  operator fun get(index: Int): Int = list[index]

  override fun toString() = list.toString()

  fun size() = list.size
}
