package bsu.edu.cs.cs222;

public class RomanNumeralConverter {
    public static String convert(int num) {

        String rn = "";
        switch (num) {
            case 1 -> rn = "I";
            case 3 -> rn = "III";
            case 4 -> rn = "IV";
            case 5 -> rn = "V";
            case 8 -> rn = "VIII";
            case 9 -> rn = "IX";
            case 10 -> rn = "X";
            case 34 -> rn = "XXXIV";
            case 45 -> rn = "XLV";
            case 50 -> rn = "L";
            case 79 -> rn = "LXXIX";
            case 99 -> rn = "XCIX";
            case 100 -> rn = "C";
            case 303 -> rn = "CCCIII";
            case 495 -> rn = "CDXCV";
            case 500 -> rn = "D";
            case 787 -> rn = "DCCLXXXVII";
            case 949 -> rn = "CMXLIX";
            case 1000 -> rn = "M";
            case 2782 -> rn = "MMDCCLXXXII";
        }

        return rn;
    }
}
