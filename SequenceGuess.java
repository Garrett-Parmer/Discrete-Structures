import java.util.Scanner;

public class SequenceGuess {
  public static void main(String[] args) {

    System.out.println("This is a program that will generate a sequence from " +
                        "\ndifferent rule sets. It will give you the first four" +
                        "\nnumbers in the sequence and have you guess the fifth.");

    int ruleSelection = getRuleSelection();
    System.out.println("Rule: " + ruleSelection);

    int nextNumber = 0;

    switch(ruleSelection) {
      case 1: nextNumber = runArithmeticSequence(); break;
      case 2: nextNumber = runGeometricSequence(); break;
      case 3: nextNumber = runRecurrenceSequence(); break;
      case 4: nextNumber = runFibonacciSequence();
    }

    Scanner input = new Scanner(System.in);
    System.out.println("Your answer: ");
    int userAnswer = input.nextInt();

    if(userAnswer == nextNumber) {
      System.out.println("You are correct!");
    }
    else {
      System.out.println("Git gud. You lose. Loser. Try again.");
      System.out.println("The answer was: " + nextNumber);
    }
  }

  private static int getRuleSelection() {

    return (int)(Math.random() * 4 + 1);
  }

  private static int runArithmeticSequence() {
    System.out.print("This is an Arithmetic Sequence.");

    int startingTerm = (int)(Math.random() * 100 + 1);
    int difference = (int)(Math.random() * 10 + 1);

    for(int index = 0; index < 4; index++) {
      System.out.println("Index: " + index);
      System.out.println("Term: " + (startingTerm + (difference * index)));
    }

    return (int)(startingTerm + (difference * 4));

  }

  private static int runGeometricSequence() {
    System.out.println("This is a geometric sequence.");

    int startingTerm = (int)(Math.random() * 15 + 1);
    int commonRatio = (int)(Math.random() * 10 + 1);

    for(int index = 0; index < 4; index++) {
      System.out.println("Index: " + index);
      System.out.println("Term: " + startingTerm * Math.pow(commonRatio, index));
    }

    return (int)(startingTerm * Math.pow(commonRatio, 4));
  }

  private static int runRecurrenceSequence() {
    System.out.println("This is a recurrence sequence.");

    int startingTerm = (int)(Math.random() * 40 + 1);
    int difference = (int)(Math.random() * 10 + 1);

    for (int iterations = 0; iterations < 4; iterations++) {

			System.out.println(startingTerm * iterations + difference);
    }

    return (startingTerm * 4 + difference);
  }

  private static int runFibonacciSequence() {
    System.out.println("This is a Fibonacci Sequence.");

    int startingTerm = (int)(Math.random() * 20 + 10);

    for(int index = 0; index < 4; index++) {
      System.out.println("Index: " + index);
      System.out.println("Term: " + fib(startingTerm + index));
    }

    return (int)(fib(startingTerm + 4));
  }

  private static long fib(int n) {
		if ((n == 0) || (n == 1))
			return n;
		else
			return fib(n - 1) + fib(n - 2);
    }
}
