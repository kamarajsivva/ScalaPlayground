package com.scala.basics

object Functions {
  def main(args: Array[String]) {
    println("Maximum of 5 and 6 is " +max(5, 6))
    println("Minimum of 10 and 28 is "+ min(10,28))
    greetTheProgrammer()
    parameterLessFn
  }
  
  /*
   * Function to find the max of 2 numbers+
   */
  def max(x: Int, y: Int): Int = {
    if (x > y) {
      x
    } else {
      y
    }
  }
  
  def min(x:Int, y: Int): Int = {
    if(x < y) x else y
  }
  
  def greetTheProgrammer():Unit = {
    println("Hello Programmer!!")
  }
  
  def parameterLessFn = {
    println("I am parameterless!!")
  }
}