package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void evenLengthTwoGs() {
        GHappy gHappy = new GHappy();

        boolean result = gHappy.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void singleG() {
        GHappy gHappy = new GHappy();

        boolean result = gHappy.gHappy("xxgxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void threeGs() {
        GHappy gHappy = new GHappy();

        boolean result = gHappy.gHappy("xxggyygxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void loneG() {
        GHappy gHappy = new GHappy();

        boolean result = gHappy.gHappy("g");
        Assertions.assertTrue(result);
    }
}
