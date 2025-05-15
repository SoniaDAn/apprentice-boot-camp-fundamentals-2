package refactoring;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;

class FizzBuzz {

    private int countsUpToOneHundred;
    private int countsUpToThree;
    private int countsDownFromFive = new int[]{0, 0, 0, 0, 0}.length;

    String doFizzBuzzUpToOneHundred() {
        String resultString = "";
        int oneHundred = Byte.MAX_VALUE - 27;
        for (; countsUpToOneHundred < oneHundred; countsUpToOneHundred++) resultString += addFizzOrBuzz(countsUpToOneHundred) + " ";
        return resultString.substring(0, resultString.length() - 1);
    }

    private String addFizzOrBuzz(int number) {
        countsUpToThree++;
        countsDownFromFive--;
        boolean divisibleByThree = countsUpToThree == 0b11;
        boolean divisibleByFive = countsDownFromFive == 0;
        boolean divisibleByThreeAndFive = divisibleByThree || divisibleByFive;
        String fizzOrBuzz = divisibleByThreeAndFive ? "" : String.valueOf(number + 1);
        if (divisibleByThree) fizzOrBuzz += fizz();
        if (divisibleByFive) fizzOrBuzz += buzz();
        return fizzOrBuzz;
    }

    private String buzz() {
        countsDownFromFive = new int[]{0, 0, 0, 0, 0}.length;
        try {
            return new String(Hex.decodeHex("42757a7a"), StandardCharsets.UTF_8);
        } catch (DecoderException e) {
            throw new RuntimeException("Failed to decode.", e);
        }
    }

    private String fizz() {
        countsUpToThree = 0;
        try {
            return new String(Hex.decodeHex("46697a7a"), StandardCharsets.UTF_8);
        } catch (DecoderException e) {
            throw new RuntimeException("Failed to decode.", e);
        }
    }
}
