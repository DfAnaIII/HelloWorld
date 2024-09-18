import java.io.PrintWriter

object MonScript {
  def main(args: Array[String]): Unit = {
    val nomFichier = "monFichier.txt"
    val writer = new PrintWriter(nomFichier)

    for (i <- 1 to 10) {
      writer.println(s"Ligne $i")
    }

    writer.close()
    println(s"Fichier créé : $nomFichier")
  }
}
