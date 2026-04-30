package bsu.edu.cs.cs222;
public class RomanNumeralConverter {
    public static String convert(int num) {
        if (num > 3000 || num < 0) {
            return "";
        }

        StringBuilder romanNumeral = new StringBuilder();

        int[] numbers = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int ptr = 0;

        while (num > 0) {
            if (num >= numbers[ptr]) {
                romanNumeral.append(numerals[ptr]);
                num -= numbers[ptr];
            } else {
                ptr++;
            }
        }
        return romanNumeral.toString();
    }
}
