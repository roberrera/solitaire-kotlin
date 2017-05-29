package model

import java.util.*

/**
 * Created by Rob on 5/29/17.
 */
class Deck {

    val cards = Array(52, { Card(it % 13, getSuit(it)) })
    var cardsInDeck: MutableList<Card> = cards.toMutableList()

    fun drawCard(): Card = cardsInDeck.removeAt(0)

    fun reset() {
        cardsInDeck = cards.toMutableList()
        Collections.shuffle(cardsInDeck) // Randomize deck
    }

    private fun getSuit(i: Int) = when(i / 13) {
            0 -> clubs
            1 -> diamonds
            2 -> hearts
            else -> spades
    }
}