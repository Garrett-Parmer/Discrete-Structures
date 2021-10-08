public class PrimeEstimation {
  public static void main(String[] args) {

    System.out.println("Number of primes less than 10: ");
    countPrimes(10);
    System.out.println("\nNumber of primes less than 100: ");
    countPrimes(100);
    System.out.println("\nNumber of primes less than 1,000: ");
    countPrimes(1000);
    System.out.println("\nNumber of primes less than 10,000: ");
    countPrimes(10000);
    System.out.println("\nNumber of primes less than 100,000: ");
    countPrimes(100000);
    System.out.println("\nNumber of primes less than 1,000,000: ");
    countPrimes(1000000);
    System.out.println("\nNumber of primes less than 10,000,000: ");
    countPrimes(10000000);
    System.out.println("\nNumber of primes less than 100,000,000: ");
    countPrimes(100000000);
  }

  public static void countPrimes(int maximum) {
    int count = 0;
    int number = 2;


    //Repeatedly find prime numbers
    while (number < maximum) {
      //print the prime number and increase the count
      if (isPrime(number)) {
        count++; //increase the count
      }
      number++;
    }
    System.out.println(count);
  }

  public static boolean isPrime(int number) {
    for (int divisor = 2; divisor <= number / 2; divisor++) {
      if (number % divisor == 0) { //If true, the number is not prime
        return false;
      }
    }

    return true; //Number is prime
  }
}
