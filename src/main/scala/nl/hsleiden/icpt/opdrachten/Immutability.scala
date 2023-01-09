package nl.hsleiden.icpt.opdrachten

import scala.annotation.tailrec

object Immutability {

  /**
   * Programmeer de faculteit.
   * Dit is door de reeks optellend met elkaar te vermenigvuldigen tot 2.
   * Bijvoorbeeld n = 5
   * Bonuspunten als je tailrecursie gebruikt
   * 5 * 4 * 3 * 2 => Antwoord  120
   * @param n
   * @return
   */
    @tailrec def faculty(n: Int, res: Int = 1): Int = {
    if (n == 1) {
      res
    } else {
      faculty(n - 1, res * n)
    }
  }

  /**
   * Met deze functie maken we onze eigen machten verheffen. Java (Math.pow)
   * Doe dit recursief.
   * * Bonuspunten. Zorg dat deze functie geannoteerd kan worden met @tailrec
   * @param n
   * @return
   */
  def pow(lh: Int, rh: Int): Double = {
    if (rh == 0) 1 else lh * pow(lh, rh - 1)
  }

}
