package academy.kovalevskyi.codingbootcamp.week0.day4;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Alphabet {
  public static char[] generateAlphabetImperative() {
    char[] charArr = new char[26];
    IntStream.range(0, 26).forEach(startValue -> charArr[startValue] = (char) (startValue + 97));
    return charArr;
  }

  public static char[] generateAlphabet() {
    String alphabet = IntStream.iterate(1, i -> i + 1).limit(26).mapToObj(elem -> (char) (elem + 96)).map(String::valueOf).collect(Collectors.joining());
    return alphabet.toCharArray();
  }

  public static char[] generateReversedAlphabet() {
    String alphabet = IntStream.iterate(26, i -> i - 1).limit(26).mapToObj(elem -> (char) (elem + 96)).map(String::valueOf).collect(Collectors.joining());
    return alphabet.toCharArray();
  }

  public static void main(String[] args) {
    for (char c : generateAlphabetImperative()) {
      System.out.print(c + "\t");

    }
    System.out.println();
    for (char c : generateReversedAlphabet()) {
      System.out.print(c + "\t");
    }
  }
}