package academy.kovalevskyi.codingbootcamp.week0.day3;

public class JavaEntryChallenge {
  public static int sumOfTwoNumbers(int a, int b) {
    return a + b;
  }

  public static int convertMinToSec(int minutes) {
    return minutes * 60;
  }

  public static void compareTwoNumbers(int a, int b) {
    String result = a > b ? "Result: " + a + " is bigger" : a < b ? "Result: " + b
            + " is bigger" : "Result: Numbers are equal";
    System.out.println(result);
  }

  public static void concatTwoStrings(String firstName, String lastName) {
    System.out.println(firstName + " " + lastName);
  }

  public static int remainder(int a, int b) {
    return a % b;
  }

  public static boolean divisibleBy5(int num) {
    return num % 5 == 0;
  }

  public static int firstElementOfArray(int[] arr) {
    return arr[0];
  }

  public static int smallestElementOfArray(int[] arr) {
    int outer = 0;
    while (outer < arr.length - 1) {
      int inner = 0;
      while (inner < arr.length - outer - 1) {
        if (arr[inner] > arr[inner + 1]) {
          int someNumber = arr[inner];
          arr[inner] = arr[inner + 1];
          arr[inner + 1] = someNumber;
        }
        inner++;
      }
      outer++;
    }
    return arr[0];
  }

  public static void checkResultOfWork(boolean quick, boolean efficient, boolean reliable) {
    String resultOfWork = "Result of work: ";
    if (quick && reliable && !efficient) {
      System.out.println(resultOfWork + "poor, but fast enough");
    } else if (efficient && reliable && !quick) {
      System.out.println(resultOfWork + "good, but tired of waiting");
    } else if (efficient && quick && !reliable) {
      System.out.println(resultOfWork + "excellent, but pricey");
    } else if (efficient && quick && reliable) {
      System.out.println(resultOfWork + "excellent, but you are dreaming");
    }
  }


  public static void main(String[] args) {
    //1
    System.out.println(sumOfTwoNumbers(3, 2));
    System.out.println(sumOfTwoNumbers(-3, 2));
    System.out.println(sumOfTwoNumbers(0, 100));

    //2
    System.out.println(convertMinToSec(5));
    System.out.println(convertMinToSec(3));
    System.out.println(convertMinToSec(2));

    //3
    compareTwoNumbers(3, 2);
    compareTwoNumbers(-3, 2);
    compareTwoNumbers(5, 5);

    //4
    concatTwoStrings("Sponge", "Bob");
    concatTwoStrings("Kovalevskyi", "Viacheslav");

    //5
    System.out.println(remainder(3, 3));
    System.out.println(remainder(27, 4));
    System.out.println(remainder(-15, -7));

    //6
    System.out.println(divisibleBy5(5));
    System.out.println(divisibleBy5(23));
    System.out.println(divisibleBy5(-25));
    System.out.println(divisibleBy5(37));

    //7
    int[] array = new int[]{3, 4, 56, 66};
    System.out.println(firstElementOfArray(array));
    array = new int[]{9999};
    System.out.println(firstElementOfArray(array));

    //8
    int[] array2 = new int[]{3, 2, -1};
    int[] array3 = new int[]{100, 10, 1000};
    System.out.println(smallestElementOfArray(array2));
    System.out.println(smallestElementOfArray(array3));

    //9
    checkResultOfWork(true, true, false);
    checkResultOfWork(false, true, true);
    checkResultOfWork(true, true, true);
  }
}
