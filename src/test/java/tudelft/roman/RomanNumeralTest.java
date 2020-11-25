package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {


    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    @Test
    void invalidCharacter() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IXI");
        Assertions.assertEquals(10, result);
    }

    @Test
    void invalidCombination() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IXII");
        Assertions.assertEquals(11, result);
    }

    @BeforeEach
    public void initialize(){
        System.out.print("This method is called before each test\n");
    }

    @BeforeEach
    public void test_reset(){
        System.out.print("Test initialization...");
    }

}
