package tpe.testate.crypter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test für die Verschlüsselung.
 */
public class CrypterTest {

	// Tests encryption
    @Test
    public void testEncrypt() {
        Crypter c = new CrypterImpl();
        assertEquals("4bcd3fghijk1mn0pqrs7uvwxyzl2ea56t89o",
               c.encrypt("abcdefghijklmnopqrstuvwxyz1234567890"));  // tests letters to numbers

        assertEquals("7p3 im s0s3 2ol6 is7 3in3 sup3r v0r13sung",
                c.encrypt("tpe im sose 2016 ist eine super vorlesung"));   // tests numbers to letters and letters to numbers

        assertEquals("4bcd3fghijk1mn0pqrs7uvwxyzl2ea56t89o",
                c.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"));    // tests upper case encryption

        assertEquals("", c.encrypt(""));
    }

    @Test // Tests decryption
    public void testDecrypt() {
        Crypter c = new CrypterImpl();
        assertEquals("abcdefghijklmnopqrstuvwxyz1234567890",
                c.decrypt("4bcd3fghijk1mn0pqrs7uvwxyzl2ea56t89o"));

        assertEquals("tpe im sose 2016 ist eine super vorlesung",
                c.encrypt("7p3 im s0s3 2ol6 is7 3in3 sup3r v0r13sung"));

        assertEquals("", c.decrypt(""));
    }

    // Tests not allowed letters when decrypting exception
    @Test(expected=IllegalArgumentException.class)
    public void testException1() {
        Crypter c = new CrypterImpl();
        c.decrypt("ÖÄÜ");
    }

    // Tests not allowed symbols when decrypting
    @Test(expected=IllegalArgumentException.class)
    public void testException2() {
        Crypter c = new CrypterImpl();
        c.decrypt("&/)");
    }

    // Tests upper case letters when decrypting
    @Test(expected=IllegalArgumentException.class)
    public void testException3() {
        Crypter c = new CrypterImpl();
        c.decrypt("abcdefghijklmnopqrstuvwXzy");
    }
}
