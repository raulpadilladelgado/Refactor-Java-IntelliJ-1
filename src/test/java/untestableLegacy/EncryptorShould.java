package untestableLegacy;

import org.junit.Assert;
import org.junit.Test;

public class EncryptorShould {
    @Test
    public void encrypt_a_word() {
    Encryptor encryptor = new Encryptor();
        String result = encryptor.cryptSomeCharsOfAWord("abc");
        Assert.assertEquals("cde",result);
    }
    @Test
    public void encrypt_some_chars_of_a_word(){
        Encryptor encryptor = new Encryptor();
        String result = encryptor.cryptSomeCharsOfAWord("abc","a");
        Assert.assertEquals("cbc",result);
    }
    @Test
    public void encrypt_a_word_to_numbers(){
        Encryptor encryptor = new Encryptor();
        String result = encryptor.cryptWordToNumbers("abc");

        Assert.assertEquals("99100101",result);
    }

    @Test
    public void encrypt_a_sentence() {
        Encryptor encryptor = new Encryptor();
        String result = encryptor.cryptSentence("abc abc");

        Assert.assertEquals("cde\"cde",result);
    }
}