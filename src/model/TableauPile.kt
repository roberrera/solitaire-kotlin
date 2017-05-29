package model

/**
 * Created by Rob on 5/29/17.
 */
class TableauPile(var cards: MutableList<Card>) {
    init {
        cards.last().faceUp = true
    }

    fun addCards(newCards: MutableList<Card>): Boolean {
        if (cards.size > 0) {
            if (newCards.first().value == cards.last().value - 1 &&
                    suitCheck(newCards.first(), cards.last())) {
                cards.addAll(newCards)
                return true
            }
        } else if (newCards.first().value == 12) { // value of a king
            cards.addAll(newCards)
            return true
        }
        return false
    }

    private fun suitCheck(c1: Card, c2: Card): Boolean {
        if ((redSuits.contains(c1.suit) && blackSuits.contains(c2.suit)) ||
                (blackSuits.contains(c1.suit) && redSuits.contains(c2.suit))) {
            return true
        }
        return false
    }
}