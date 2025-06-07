public class Text {

    private int charCount = 0;  //För att spara antalet tecken
    private int wordCount = 0;  //För att spara antalet ord totalt.
    private String longestWord = "";  //Sparar längsta ordet som har hittats.
    private boolean stopEntered = false; //Om användaren har skrivit stop.
    private int lineCount = 0;  //För att spara antalet rader

    public boolean hasUserEnteredStop() {  //Returnerar true om användaren har skrivit ordet stop.
    return stopEntered;
} //om ordet stop skrevs
public void  addLine(String line) {    //Tar emot textrad från användaren
    if (line.equalsIgnoreCase("stop")) { //Slutar läsa om ordet är stop oavsett om det är med stor eller liten bokstav.
        stopEntered = true; // Om ordet "stop" skrevs
        return; // Avslutar metoden utan att räkna "stop" i antalet ord.
    }
    lineCount++;  //Ökar radräkningen med 1.
    charCount += line.replaceAll("\\s+", "").length(); //Räknar antal tecken utan mellanslag.

    String[] words = line.split("\\s+"); // Delar ord i rader.
    for (String word : words) {   //Loopar genom varje ord
        if (!word.isEmpty()) { //Hoppar över tomma strängar
            wordCount++; //Räknar ord
            if (word.length() > longestWord.length()) {  //Om ordet är längst hittills, spara det.
                longestWord = word;//Sparar nya ordet som den längsta.
            }
        }
    }
    }
    public int getLineCount() {   //Returnerar antal rader, tecken, ord och längsta ordet i main metoden.
        return lineCount;
    }

    public int getCharCount() {
        return charCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public String getLongestWord() {
        return longestWord;
    }
}
