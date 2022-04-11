package academy.kovalevskyi.codingbootcamp.week0.day4;

public class Numbers {
  public static int[] generateNumbers() {
    int[] numArr = new int[100];
    for (int i = 0; i < 100; i++) {
      numArr[i] += i;
    }
    return numArr;
  }

  public static int[] sortArray(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] < array[j]) {
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    return array;
  }

  public static int findBiggest(int left, int right) {
    return left > right ? left : right > left ? right : left;
  }

  public static int findBiggest(int left, int mid, int right) {
    int[] arrOfNumbers = {left, mid, right};
    int[] sorted = sortArray(arrOfNumbers);
    return sorted[0];
  }

  public static int findBiggest(int[] numbers) {
    int[] sortedArray = sortArray(numbers);
    return sortedArray[0];
  }

  public static int findIndexOfBiggestNumber(int[] numbers) {
    int max = numbers[0];
    int maxIndex = 0;
    for (int i = 0; i < numbers.length; i++) {
      int tmp = numbers[i];
      if (max < tmp) {
        max = tmp;
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  public static boolean isNegative(int number) {
    return number < 0;
  }

  public static char[] convertToCharArray(int number) {
    if (number == 0) {
      return new char[]{'0'};
    }
    if (number == Integer.MIN_VALUE) {
      return new char[]{'-', '2', '1', '4', '7', '4', '8', '3', '6', '4', '8'};
    }
    if (number == Integer.MAX_VALUE) {
      return new char[]{'2', '1', '4', '7', '4', '8', '3', '6', '4', '7'};
    }
    int signValue = 0;
    int amountDigits = number;
    int count = 0;
    if (amountDigits < 0) {
      signValue = 1;
      number *= -1;
    }
    while (amountDigits > 0) {
      count++;
      amountDigits /= 10;
    }
    char[] chars;
    char[] charsDuplicate = new char[signValue + count + 1];
    chars = new char[count];
    int index = 0;
    if (signValue == 1) {
      charsDuplicate[0] = '-';
    }
    while (number > 0) {
      charsDuplicate[++index] = (char) (number % 10 + '0');
      number /= 10;
    }
    for (int i = 0; i < index; i++) {
      chars[i] = charsDuplicate[index - i];
    }
    return chars;
  }

  public static void main(String[] args) {
    //1
//    for (int elem : generateNumbers()) {
//      System.out.print(elem + "\t");
//    }

    //2
//    System.out.println(findBiggest(3, 5));

    //3
//    System.out.println(findBiggest(3, 5, 39));

    //4
//    System.out.println(findBiggest(new int[]{3, 4, 2, 422, 54}));

    //5
//    System.out.println(findIndexOfBiggestNumber(new int[]{3, 5, 10}));

    //6
//    System.out.println(isNegative(-3));
//    System.out.println(isNegative(3));

    //7
    char[] charArr = convertToCharArray(-25);
    for (char c : charArr) {
      System.out.print(c + "\t");
    }
  }
}