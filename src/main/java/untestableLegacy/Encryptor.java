package untestableLegacy;

import java.security.InvalidParameterException;
import java.util.function.Function;

public class Encryptor {
    public String cryptSomeCharsOfAWord(String word) {
        valiteWord(word);
        return applyCesar(word, charValue -> String.valueOf((char) (charValue + 2)));
    }

    public String cryptWordToNumbers(String word) {
        valiteWord(word);
        return applyCesar(word, charValue -> String.valueOf((charValue + 2)));
    }

    public String cryptSentence(String sentence) {
        return applyCesar(sentence, charValue1 -> String.valueOf((char) (charValue1 + 2)));
    }
    public String cryptSomeCharsOfAWord(String word, String charsToReplace) {
        valiteWord(word);
        char[] wordArray = word.toCharArray();
        char[] replacement = charsToReplace.toCharArray();
        char[] result = wordArray.clone();
        for (int i = 0; i < wordArray.length; i++) {
            for (int j = 0; j < replacement.length; j++) {
                if (replacement[j] == wordArray[i]) {
                    int charValue = wordArray[i];
                    result[i] = (char) (charValue + 2);
                }
            }
        }
        return String.valueOf(result);
    }

    private void valiteWord(String word) {
        if (word.contains(" "))
            throw new InvalidParameterException();
    }

    private String applyCesar(String word, Function<Integer, String> function) {
        char[] wordArray = word.toCharArray();
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            int charValue = wordArray[i];
            newWord += function.apply(charValue);
        }
        return newWord;
    }
}
