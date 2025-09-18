public class NumberStairs {
    public static void main(String[] args){
        for(int i = 1; i <= 11; i++){ // Using a for loop to make 10 rows
            for (int j = 1; j < i; j++){ // Using a nested loop to print j so it doesnt print on another line
                System.out.print(j);
            }
            System.out.println(); // This makes sure of a new line after each row. 
        }
        
            
     
    }
}
