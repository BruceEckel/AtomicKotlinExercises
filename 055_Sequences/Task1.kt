//Sequences/Task1.kt
package sequencesExercise1

fun School.commonLessons(
  instructor: Instructor,
  student: Student
): Sequence<Lesson> {
  return lessons.filter {
    instructor == it.instructor && student in it.students
  }
}

//Sequences/School.kt
package sequencesExercise1

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
