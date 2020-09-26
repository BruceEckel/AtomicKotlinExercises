//Sequences/Task2.kt
package sequencesExercise2

fun School.studentInstructors(
  student: Student
): Set<Instructor> {
  return lessons.filter {
    student in it.students
  }.mapTo(mutableSetOf()) { it.instructor }
}

fun School.studentsOf(
  instructor: Instructor
): Set<Student> {
  return lessons.filter {
    instructor == it.instructor
  }.flatMapTo(mutableSetOf()) { it.students.asSequence() }
}

//Sequences/School.kt
package sequencesExercise2

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
