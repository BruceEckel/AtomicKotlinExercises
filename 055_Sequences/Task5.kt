//Sequences/Task5.kt
package sequencesExercise5

fun School.findInstructorsWithLargestClass(): Set<Instructor> {
  val maxClassSize = lessons
    .map { it.students.size }
    .max()

  return lessons.filter { it.students.size == maxClassSize }
    .groupBy { it.instructor }
    .keys
}

//Sequences/School.kt
package sequencesExercise5

data class Instructor(val name: String)

data class Student(val name: String)

data class Lesson(
  val instructor: Instructor,
  val students: Set<Student>,
  val rating: Map<Student, Int>
)

data class School(
  val instructors: Set<Instructor>,
  val students: Set<Student>,
  val lessons: Sequence<Lesson>
)
