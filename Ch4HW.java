public class Ch4HW {
  public static void main(String[] args) {
    double quotient = 0;
    double remainder = 0;
    System.out.println("Section 4.1, questions 13, 14, 15.");
    System.out.println("\n#13 What are the quotient and remainder when: ");
      System.out.println("\n19 is divided by 7?");
      quotient = getQuotient(19, 7);
      remainder = getRemainder(19, 7);
    System.out.println("The quotient is " + quotient + " with a remainder of "
      + remainder);
      System.out.println("-111 is divided by 11?");
      quotient = getQuotient(-111, 11);
      remainder = getRemainder(-111, 11);
      System.out.println("The quotient is " + quotient + " with a remainder of "
        + remainder);
    System.out.println("789 is divided by 23?");
      quotient = getQuotient(789, 23);
      remainder = getRemainder(789, 23);
      System.out.println("The quotient is " + quotient + " with a remainder of "
        + remainder);
    System.out.println("1001 is divided by 13?");
      quotient = getQuotient(1001, 13);
      remainder = getRemainder(1001, 13);
      System.out.println("The quotient is " + quotient + " with a remainder of "
        + remainder);
    System.out.println("0 is divided by 19?");
      quotient = getQuotient(0, 19);
      remainder = getRemainder(0, 19);
      System.out.println("The quotient is " + quotient + " with a remainder of "
        + remainder);
    System.out.println("3 is divided by 5?");
      quotient = getQuotient(3, 5);
      remainder = getRemainder(3, 5);
      System.out.println("The quotient is " + quotient + " with a remainder of "
        + remainder);
    System.out.println("-1 is divided by 3?");
      quotient = getQuotient(-1, 3);
      remainder = getRemainder(-1, 3);
      System.out.println("The quotient is " + quotient + " with a remainder of "
        + remainder);
    System.out.println("4 is divided by 1?");
      quotient = getQuotient(4, 1);
      remainder = getRemainder(4, 1);
      System.out.println("The quotient is " + quotient + " with a remainder of "
        + remainder);

    System.out.println("\n--------------------");
    System.out.println("#14 What are the quotient and remainder when: ");
    System.out.println("\n44 is divided by 8?");
      quotient = getQuotient(44, 8);
      remainder = getRemainder(44, 8);
      System.out.println("The quotient is " + quotient + " with a remainder of "
        + remainder);
    System.out.println("777 is divided by 21?");
      quotient = getQuotient(777, 21);
      remainder = getRemainder(777, 21);
      System.out.println("The quotient is " + quotient + " with a remainder of "
        + remainder);
    System.out.println("-123 is divided by 19?");
      quotient = getQuotient(-123, 19);
      remainder = getRemainder(-123, 19);
      System.out.println("The quotient is " + quotient + " with a remainder of "
        + remainder);
    System.out.println("-1 is divided by 23?");
      quotient = getQuotient(-1, 23);
      remainder = getRemainder(-1, 23);
      System.out.println("The quotient is " + quotient + " with a remainder of "
        + remainder);
    System.out.println("-2002 is divided by 87?");
      quotient = getQuotient(-2002, 87);
      remainder = getRemainder(-2002, 87);
      System.out.println("The quotient is " + quotient + " with a remainder of "
        + remainder);
    System.out.println("0 is divided by 17?");
      quotient = getQuotient(0, 17);
      remainder = getRemainder(0, 17);
      System.out.println("The quotient is " + quotient + " with a remainder of "
        + remainder);
    System.out.println("1234567 is divided by 1001?");
      quotient = getQuotient(1234567, 1001);
      remainder = getRemainder(1234567, 1001);
      System.out.println("The quotient is " + quotient + " with a remainder of "
        + remainder);
    System.out.println("-100 is divided by 101?");
      quotient = getQuotient(-100, 101);
      remainder = getRemainder(-100, 101);
      System.out.println("The quotient is " + quotient + " with a remainder of "
        + remainder);

    System.out.println("\n-------------------");
    System.out.println("What time does a 12-hour clock read: ");
    System.out.println("80 hours after it reads 11:00");
      quotient = getQuotient(80, 12);
      remainder = getRemainder(80, 12);
      System.out.println("The clock will rotate a full 12 hours " + quotient + " times.");
      System.out.println("Which leaves us with a remainder of " + remainder + " hours.");
      System.out.println("So it will be " + (11 + remainder - 12) + " o'clock.");
    System.out.println("\n40 hours after it reads 12:00");
      quotient = getQuotient(40, 12);
      remainder = getRemainder(40, 12);
      System.out.println("The clock will rotate a full 12 hours " + quotient + " times.");
      System.out.println("Which leaves us with a remainder of " + remainder + " hours.");
      System.out.println("So it will be " + (12 + remainder - 12) + " o'clock.");
    System.out.println("\n100 hours after it reads 6:00");
      quotient = getQuotient(100, 12);
      remainder = getRemainder(100, 12);
      System.out.println("The clock will rotate a full 12 hours " + quotient + " times.");
      System.out.println("Which leaves us with a remainder of " + remainder + " hours.");
      System.out.println("So it will be " + (6 + remainder) + " o'clock.");

      System.out.println("\n--------------------");
      System.out.println("Section 4.2: ");
      System.out.println("Convert the following hexadecimal expansion to its binary expansion.");
      String hex = "BADFACE";
      int dec = Integer.parseInt(hex, 16);
      System.out.println("The decimal form of " + hex + " is " + dec);
      System.out.println("The binary form of " + dec + " is " +
        Integer.toBinaryString(dec));
      System.out.println("\nConvert the following hexadecimal expansion to its binary expansion.");
      hex = "ABCDEF";
      dec = Integer.parseInt(hex, 16);
      System.out.println("The decimal form of " + hex + " is " + dec);
      System.out.println("The binary form of " + dec + " is " +
        Integer.toBinaryString(dec));
      System.out.println("\nConvert the following binary expansion to its hexadecimal expansion.");
      String binary = "101101111011";
      dec = Integer.parseInt(binary, 2);
      System.out.println("The decimal form of " + binary + " is " + dec);
      System.out.println("The hexadecimal form of " + dec + " is " +
        Integer.toHexString(dec));

      System.out.println("\n----------------------");
      System.out.println("Section 4.3: ");
      System.out.println("\n#3: Find the prime factorization for each of these integers.");
      System.out.println("88:");
      PrimeFactors(88);
      System.out.println("---");
      System.out.println("\n126:");
      PrimeFactors(126);
      System.out.println("---");
      System.out.println("\n729:");
      PrimeFactors(729);
      System.out.println("---");
      System.out.println("\n1001:");
      PrimeFactors(1001);
      System.out.println("---");
      System.out.println("\n1111:");
      PrimeFactors(1111);
      System.out.println("---");
      System.out.println("\n909090:");
      PrimeFactors(909090);
      System.out.println("---");

      System.out.println("\n#4: Find the prime factorization for each of these integers.");
      System.out.println("39:");
      PrimeFactors(39);
      System.out.println("---");
      System.out.println("\n81:");
      PrimeFactors(81);
      System.out.println("---");
      System.out.println("\n101:");
      PrimeFactors(101);
      System.out.println("---");
      System.out.println("\n143:");
      PrimeFactors(143);
      System.out.println("---");
      System.out.println("\n289:");
      PrimeFactors(289);
      System.out.println("---");
      System.out.println("\n899:");
      PrimeFactors(899);
      System.out.println("---");

      System.out.println("\n#5: Find the prime factorization of 10!");
      PrimeFactors(3628800);
  }

  public static double getQuotient(double a, double b) {
    double quotient = a / b;

    return quotient;
  }

  public static double getRemainder(double a, double b) {
     double remainder = a % b;

    return remainder;
  }

  public static int PrimeFactors(int number) {
    for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.println(i+" ");
            number = number/i;
         }
      }
      if(number >2) {
         System.out.println(number);
      }
      return number;
  }

}
