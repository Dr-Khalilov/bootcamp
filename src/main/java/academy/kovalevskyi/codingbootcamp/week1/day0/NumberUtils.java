package academy.kovalevskyi.codingbootcamp.week1.day0;

public class NumberUtils {
  public static long getFactorial(final int number) throws ArgumentException {
    try {
      long sum = 1;
      long i = 1;
      while (i <= number) {
        sum = sum * i;
        i++;
      }
      return sum;
    } catch (ArgumentException err) {
      throw new ArgumentException();
    }
  }

  public static long factorialRecursive(int number) throws ArgumentException {
    try {
      if (number >= 1) {
        return number * factorialRecursive(number - 1);
      }
      return 1;
    } catch (ArgumentException err) {
      throw new ArgumentException();
    }
  }

  public static double power(double base, int exp) throws ArgumentException {
    try {
      if (exp == 0) {
        return 1;
      }
      if (exp == 1) {
        return base;
      }
      if (exp < 0) {
        base = 1.0 / base;
        base = -base;
      }

      double sum = power(base, exp / 2);
      sum *= sum;
      if (exp % 2 != 0) {
        sum = sum * base;
      }
      return sum;
    } catch (ArgumentException err) {
      throw new ArgumentException();
    }
  }

  public static void main(String[] args) {
    System.out.println(getFactorial(10));
    System.out.println(factorialRecursive(10));
    System.out.println(power(4, -4));
  }
}
