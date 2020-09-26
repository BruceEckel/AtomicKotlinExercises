//Sequences/Task3.kt
package sequencesExercise3

fun School.getAverageRatingForInstructor(instructor: Instructor): Double =
  lessons
    .filter { it.instructor == instructor }
    .flatMap { it.rating.values.asSequence() }
    .average()

//Sequences/School.kt
package sequencesExercise3

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
