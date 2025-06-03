
import org.junit.jupiter.api.Test;  //Markerar att en metod är ett test.
import static org.junit.jupiter.api.Assertions.*; //Importerar assertions för att kontrollera att resultatet är korrekt.

public class TextTest {   //Startar testklassen
    @Test
    public void testCountsWithOneLine() { //Ett testfall som kollar att en enda rad ger rätt antal rader och tecken.
        Text text = new Text(); //Skapar ett nytt text object som testas.
        text.addLine("Hello World");
        assertEquals(1, text.getLineCount()); //Kontrollerar att antal rader är 1.
        assertEquals(10, text.getCharCount()); //Kontrollerar att antal tecken är 10.
        assertEquals("Hello world".replaceAll("\\s+", "").length(), text.getCharCount());//Kontrollerar att antal tecken är 10 utan mellanslag.
    }
    @Test
    public void testLongestWord() {
        Text text = new Text();
        text.addLine("I am programming every day");//Skickar en rad med text till logikklassen
        assertEquals("programming", text.getLongestWord());
    }
    @Test
    public void testStopDetection() {   //Test om "stop" fungerar korrekt.
        Text text = new Text(); //Skapar nytt object och lagrar alla värden av klassen text.
        text.addLine("Första raden"); //Skickar en vanlig rad till logikklassen
        text.addLine("stop"); //Stop signal för programmet
        assertTrue(text.hasUserEnteredStop());//Testar att Text-klassen upptäckte "stop" och flaggade stopEntered=true
        assertEquals(1, text.getLineCount()); // "Stop" ska inte räknas som rad
    }
    @Test
    public void testMultipleLines() {
        Text text = new Text();
        text.addLine("First line");//
        text.addLine("Second line");//Skapar två rader med text
        int expected = ("First line" + "Second line").replaceAll("\\s+", "").length();
        assertEquals(expected, text.getCharCount());

    }
    @Test
    public void testEmptyLines() {
        Text text = new Text();
        text.addLine("");//
        text.addLine(""); //Lägger till två tomma rader
        assertEquals(2, text.getLineCount());//Två tomma rader läggs till
        assertEquals(0, text.getCharCount());// Inga tecken.
    }
}
