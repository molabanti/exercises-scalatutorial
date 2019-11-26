/*
 * scala-exercises - exercises-scalatutorial
 * Copyright (C) 2015-2016 47 Degrees, LLC. <http://www.47deg.com>
 */

package scalatutorial.utils

trait Animal {
  def fitness: Int
  def fitness1: Int
}

trait Reptile extends Animal

trait Mammal extends Animal

trait Zebra extends Mammal {
  def zebraCount: Int
}

trait Giraffe extends Mammal
