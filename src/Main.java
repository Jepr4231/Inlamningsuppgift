import java.util.Scanner;  //För att läsa text från användaren.

public class Main {    //Huvudklassen

    public static void main(String[] args) {     //Startar main metoden.
            Scanner scanner = new Scanner(System.in); //Läser in text.
            Text text= new Text();  //Skapar nytt object av klassen text som håller koll på rader och tecken.

            System.out.println("Write your text or stop:");  //Skriver ut instruktioner

            while(!text.hasUserEnteredStop()){   //Startar en loop som avslutas med break.
            String Text= scanner.nextLine(); //Läser en rad från användaren och sparar den i variabeln Text.
                text.addLine(Text);//Skickar till logikklassen

            }

            System.out.println("Line amount: " + text.getLineCount()); //Skriver ut hur många rader.
            System.out.println("Char amount: " + text.getCharCount()); //Skriver ut hur många tecken.
            System.out.println("Word amount: " + text.getWordCount()); //Antalet ord.
            System.out.println("Longest word: " + text.getLongestWord()); //Det lägsta ordet.

    }
}