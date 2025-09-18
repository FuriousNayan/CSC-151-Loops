import java.util.Scanner;
import java.time.LocalTime;


public class MenuRepetition {
    public static Scanner input = new Scanner(System.in);

    public static String getStringInput(String prompt){
        System.out.print(prompt);
        return input.nextLine();
    }

    public static void main(String[] args){
            String userInput = "";

        do {
            // Using the do statement to print out the message and ask for the number
            System.out.println("1 = Say Hello!, 2 = Display current time, 3 = Exit, Choose a number:");
            userInput = getStringInput("Number: ");
             // Using a conditional for menu choices
            if(userInput.equals("1")){
                System.out.println("Hello!");
            } else if(userInput.equals("2")){
                LocalTime myTime = LocalTime.now();
                System.out.println(myTime);
            } else{
                break;
            }
        }
        // It stops when the userInput is equal to 3. 
        while(userInput.equals("3") != true);
    }
}
