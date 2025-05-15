package refactoring;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;

class FizzBuzz {

    private static final int FIVE = new int[]{0, 0, 0, 0, 0}.length;
    private static final String BUZZ_HEX = "42757a7a";
    private static final String FIZZ_HEX = "46697a7a";
    private int countsUpToOneHundred;
    private int countsUpToThree;
    private int countsDownFromFive = FIVE;
    private static final int ONE_HUNDRED = Byte.MAX_VALUE - 27;

    String doFizzBuzzUpToOneHundred() {
        String resultString = "";
        return getResultString(resultString);
    }

    private String getResultString(String resultString) {
        for (; countsUpToOneHundred < ONE_HUNDRED; countsUpToOneHundred++) resultString += addFizzOrBuzz(countsUpToOneHundred) + " ";
        return resultString.substring(0, resultString.length() - 1);
    }

    private String addFizzOrBuzz(int number) {
        countsUpToThree++;
        countsDownFromFive--;

        boolean divisibleByThreeOrFive = isDivisibleByThree() || isDivisibleByFive();
        String fizzOrBuzz = divisibleByThreeOrFive ? "" : String.valueOf(number + 1);
        if (isDivisibleByThree()) fizzOrBuzz += fizz();
        if (isDivisibleByFive()) fizzOrBuzz += buzz();
        return fizzOrBuzz;
    }

    private boolean isDivisibleByThree() {
        return countsUpToThree == 0b11;
    }

    private boolean isDivisibleByFive() {
        return countsDownFromFive == 0;
    }

    private String buzz() {
        countsDownFromFive = FIVE;
        return getHexString(BUZZ_HEX);
    }

    private String fizz() {
        countsUpToThree = 0;
        return getHexString(FIZZ_HEX);

    }

    private static String getHexString(String hexString) {
        try {
            return new String(Hex.decodeHex(hexString), StandardCharsets.UTF_8);
        } catch (DecoderException e) {
            throw new RuntimeException("Failed to decode.", e);
        }
    }
}
