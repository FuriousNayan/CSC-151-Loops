import java.util.Scanner;

public class RightAlignedStairs {
    public static Scanner input = new Scanner(System.in);

    public static int getIntInput(String prompt){
        System.out.print(prompt);
        return input.nextInt();
    }

    public static void main(String[] args){
        int numRows = getIntInput("Enter a row amount: ");
        for(int i = 0; i < numRows; i++){ // Determining the amount of rows
            for(int j = 0; j < numRows; j++){ // Determining what is going inside each row
                if(j < numRows - i - 1) // Main logic of the code; if j = 0, it is less than 5 - 0 - 1. It keeps going and adding spaces in each until it reaches the else statement where it prints the #
                    System.out.print(" ");
                else
                    System.out.print("#");
                
                }
                System.out.println(); // Puts a new line after each row is done
            }
        }
    }

