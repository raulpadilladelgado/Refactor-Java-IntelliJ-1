package untestableLegacy;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterServiceShould {

    @Test
    public void printWords() {
        PrinterServiceForTests printerService = new PrinterServiceForTests();
        printerService.printWords("hello world");
        assertEquals("<hello><world>",printerService.getOutput());
    }
}
class PrinterServiceForTests extends PrinterService{
    private String output = "";
    @Override
    public void printWords(String sentence) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            this.output += "<" + word + ">";
        }
    }

    public String getOutput() {
        return output;
    }
}