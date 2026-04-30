package bsu.edu.cs.cs222;

import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {

    /**
     * Tests all base numbers (1-9)
     * 0 is ignored as there is no way to handle it
     */

    @Test
    public void testOne() {
        assert (RomanNumeralConverter.convert(1).equals("I"));
    }

    @Test
    public void testTwo() {
        assert (RomanNumeralConverter.convert(2).equals("II"));
    }

    @Test
    public void testThree() {
        assert (RomanNumeralConverter.convert(3).equals("III"));
    }

    @Test
    public void testFour() {
        assert (RomanNumeralConverter.convert(4).equals("IV"));
    }

    @Test
    public void testFive() {
        assert (RomanNumeralConverter.convert(5).equals("V"));
    }

    @Test
    public void testSix() {
        assert (RomanNumeralConverter.convert(6).equals("VI"));
    }

    @Test
    public void testSeven() {
        assert (RomanNumeralConverter.convert(7).equals("VII"));
    }

    @Test
    public void testEight() {
        assert (RomanNumeralConverter.convert(8).equals("VIII"));
    }

    @Test
    public void testNine() {
        assert (RomanNumeralConverter.convert(9).equals("IX"));
    }

    /**
     * Tests each advanced numeral place
     * One tests the numeral
     * One checks above but containing numeral
     * One checks above and containing numeral
     */

    @Test
    public void testTen() {
        assert (RomanNumeralConverter.convert(10).equals("X"));
        assert (RomanNumeralConverter.convert(23).equals("XXIII"));
    }

    @Test
    public void testFifty() {
        assert (RomanNumeralConverter.convert(50).equals("L"));
        assert (RomanNumeralConverter.convert(45).equals("XLV"));
        assert (RomanNumeralConverter.convert(79).equals("LIX"));
    }

    @Test
    public void testHundred() {
        assert (RomanNumeralConverter.convert(100).equals("C"));
        assert (RomanNumeralConverter.convert(99).equals("XCIX"));
        assert (RomanNumeralConverter.convert(303).equals("CCCIII"));
    }

    @Test
    public void testFiveHundred() {
        assert (RomanNumeralConverter.convert(500).equals("D"));
        assert (RomanNumeralConverter.convert(495).equals("CDXCV"));
        assert (RomanNumeralConverter.convert(787).equals("DCCLXXXVII"));
    }

    @Test
    public void testThousandths() {
        assert (RomanNumeralConverter.convert(1000).equals("M"));
        assert (RomanNumeralConverter.convert(948).equals("CMXLVIII"));
        assert (RomanNumeralConverter.convert(2789).equals("MMDCCLXXXIX"));
    }

    /**
     * Tests possible errors
     */

    @Test
    public void testZero() {
        assert (RomanNumeralConverter.convert(0).isEmpty());
    }

    @Test
    public void testNegative() {
        assert (RomanNumeralConverter.convert(-17).isEmpty());
    }

    @Test
    public void testOverThreeThousand() {
        assert (RomanNumeralConverter.convert(3001).isEmpty());
    }

    @Test
    public void testBitLimit() {
        assert (RomanNumeralConverter.convert(Integer.MAX_VALUE).isEmpty());
        assert (RomanNumeralConverter.convert(Integer.MIN_VALUE).isEmpty());
    }
}
