package nl.hsleiden.icpt.opdrachten

import scala.annotation.tailrec

sealed trait Dier

// Sum type en product type.
case class Kat(naam: String, leeftijd: Int) extends Dier
case class Hond(naam: String, ras: String, leeftijd: Int) extends Dier

/**
 * Gebruik voor de gehele klasse pattern matching en recursie
 * Bonus punten als je tail recursie kan toevoegen
 */
object DataTypes {

  /**
   * Bereken hoeveel honden in een gegeven sequentie zitten.
   * Gebruik hiervoor pattern matching en recursie
   *
   * @param dieren => De lijst met dieren
   * @return Hoeveelheid honden die hierin zitten
   */
  def hoeveelheidHonden(dieren: Seq[Dier]): Int = dieren match
    case Hond::tail => 1 + hoeveelheidHonden(tail)
    case _::tail => hoeveelheidHonden(tail)
  /**
   * Tel hoeveel honden er in het lijstje zitten die 1 zijn.
   *
   * @param dier
   * @return
   */
  def hoeveelHeidHondenZijnEen(dier: Seq[Dier]) : Int = dieren match
    case Hond(_,_,1)::tail => + hoeveelHeidHondenZijnEen(tail)
    case _::tail => hoeveelHeidHondenZijnEen(tail)
  /**
   * Tel de totale leeftijd van alle honden op.
   * @param dier
   * @return
   */
  def totaleLeeftijdHonden(dier:Seq[Dier], Int: int): Int = dieren match
    case Hond::tail => int + totaleLeeftijdHonden()

  /**
   * Reken de leeftijd van alle labradors bij elkaar!
   *
   * @param dier
   * @param resultaat
   * @return
   */
  def totaleLeeftijdLabradors(dier: Seq[Dier]): Int = ???
}


