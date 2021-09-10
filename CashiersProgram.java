import java.util.Scanner;

public class CashiersProgram {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Please input amount total price of items: ");
     double amountCharged = input.nextDouble();
     System.out.println("Please input an amount greater than the total price: ");
     double amountPaid = input.nextDouble();

     double changeDue = amountPaid - amountCharged;
     System.out.println("The change due is " + changeDue);


     double twenties = 0;
     double fives = 0;
     double ones = 0;
     double quarters = 0;
     double dimes = 0;
     double nickels = 0;
     double pennies = 0;

     while(changeDue != 0) {
       if (changeDue >= 20.00) {
         changeDue = changeDue - 20.00;
         twenties = twenties + 1;
       }
       else if (changeDue >= 5.00 && changeDue < 20.00) {
         changeDue = changeDue - 5.00;
         fives = fives + 1;
       }
       else if (changeDue >= 1.00 && changeDue < 5.00) {
         changeDue = changeDue - 1.00;
         ones = ones + 1;
       }
       else if (changeDue >= .25 && changeDue < 1.00) {
         changeDue = changeDue - .25;
         quarters = quarters + 1;
       }
       else if (changeDue >= .10 && changeDue < .25) {
         changeDue = changeDue - .10;
         dimes = dimes + 1;
       }
       else if (changeDue >= .05 && changeDue < .10) {
         changeDue = changeDue - .05;
         nickels = nickels + 1;
       }
       else if (changeDue >= .01 && changeDue < .05) {
        changeDue = changeDue - .01;
        pennies = pennies + 1;
      }
     }

     System.out.println("The change was paid back in " + twenties + " twenties " +
                        fives + " fives " + ones + " ones " + quarters + " quarters " +
                        dimes + " dimes, " + nickels + " nickels, " + dimes + " dimes, " +
                        " and " + pennies + " pennies.");
  }
}
