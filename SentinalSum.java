import java.util.Scanner;


public class SentinalSum {
    public static Scanner input = new Scanner(System.in);

    public static int getIntInput(String prompt){
        System.out.print(prompt);
        return input.nextInt();
    }

    public static void main(String[] args){
        int counter = 0; // Initializing counter
        while(true){
            int userInt = getIntInput("Please enter an integer: ");
            counter = userInt + counter; // Adding the integer to the counter that they inputted
            if (userInt == 0){ // If they put in 0, it breaks it and gives out the sum
                System.out.println("The sum of the integers you entered is: " + counter);
                break;
            }
        }
    }
}
