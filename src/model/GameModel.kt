package model

/**
 * Created by Rob on 5/29/17.
 */
class GameModel {
    val deck = Deck()
    val wastePile: MutableList<Card> = mutableListOf()
    val foundationPiles = arrayOf(FoundationPile(clubs)
            , FoundationPile(diamonds), FoundationPile(hearts)
            , FoundationPile(spades))
    val tableauPiles = Array(7, { TableauPile() })
}