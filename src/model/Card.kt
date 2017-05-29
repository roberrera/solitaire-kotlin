package model

/**
 * Created by Rob on 5/29/17.
 */

val clubs = "Clubs"
val diamonds = "Diamonds"
val hearts = "Hearts"
val spades = "Spades"
val redSuits = arrayOf(diamonds, hearts)
val blackSuits = arrayOf(clubs, spades)

// Data classes provide a toString() method, and the = symbol is based on its constructor args
// If the cards have the same properties, they will be considered equal (even if they are different objects).
data class Card(val value: Int, val suit: String, var faceUp: Boolean = false)