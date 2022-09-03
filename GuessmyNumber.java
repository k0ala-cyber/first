import java.util.Scanner;

public class GuessmyNumber {
    public static void main(String[] args){
        int secretNumber = 34;

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Guess my Number: ");
            int number = sc.nextInt();

            while(number!=secretNumber){
            if(number>secretNumber){
                System.out.println("Greater than my number. \n Guess my Number");
            }else{
                System.out.println("Less than my number. \n Guess my Number");
            }
                number = sc.nextInt();
            }
            System.out.println("Correct!");
        }

    }
    
}
