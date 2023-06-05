package nl.hsleiden.icpt.opdrachten

import nl.hsleiden.icpt.opdrachten.ExceptionHandling.{appendHi, division, maakNegatief}

object Functors {


  /**
   * Doe hier een dubbele divisie.
   * Eerst lh / rh (resultaat)
   * lh / resultaat
   * Gebruik hier flatmap voor
   *
   * @param lh
   * @param rh
   * @return
   */
  def DoubleDivision(lh: Int, rh: Int): Either[String, Int] = {
    division(lh, rh).flatMap(division(lh, _))
  }


  /**
   * Voer de bovenstaande divisie methode uit.
   * Incrementeer dit resultaat  met 1
   *
   * @param lh
   * @param rh
   * @return
   */
  def divisionAddOne(lh: Int, rh: Int): Either[String, Int] = {
    // Gebruik hier de map functor. https://www.geeksforgeeks.org/scala-map-method/
    division(lh, rh).map(_ + 1)
  }

  /**
   * Voer de appendHi dubbel uit.
   * Gebruik hier de flatmap functie voor.
   *
   * @param name
   * @return
   */
  def doubleAppendHi(name: String): Either[String, String] = {
    appendHi(name).flatMap(appendHi)
  }

  def maakNegatiefAppend1(n: Int): Option[Int] = {
    maakNegatief(n).map(_ + 1)
  }

  /**
   * Doe de appendHi en doe dan daarna gelijk toUpperCase.
   * Gebruik hier de map functor voor.
   *
   * @param name
   * @return
   */
  def doeAppendHiMetToUpper(name: String): Either[String, String] = {
    // Hier heb je de functor map voor nodig
    appendHi(name).map(_.toUpperCase)
  }

}
