//Packages/task.kt
package ccc

import bbb.*

fun main() {
  println(g(1))
}

//Packages/aaa.kt
package aaa

val x = 10

fun fa(i: Int) = i * x

class K {
  override fun toString() = "K"
}

//Packages/bbb.kt
package bbb

import aaa.*

fun g(i: Int): String = "${K()} ${fa(i)}"
