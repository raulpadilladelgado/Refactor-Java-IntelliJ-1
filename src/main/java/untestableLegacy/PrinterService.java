package untestableLegacy;

public class PrinterService {
    public PrinterService() {
    }

    public void printWords(String sentence) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.print("<" + word + ">");
        }
    }
}