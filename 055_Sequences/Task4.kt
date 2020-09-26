//Sequences/Task4.kt
package sequencesExercise4

fun School.favouriteInstructor(student: Student): Instructor? =
  lessons
    .filter { student in it.students }
    .groupBy { it.instructor }
    .maxBy { (_, lessons) -> lessons.size }
    ?.key

//Sequences/School.kt
package sequencesExercise4

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
