import java.util.*;
public class numberGame{
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0 ;
        int roundsPlay = 0 ;
        boolean play = true;
        while(play){
            
            Random random = new Random();
            int randomNum = random.nextInt(100)+1;
            int attemptLeft = 10 ;
            boolean userWon = false;

            while (attemptLeft > 0 ) {
                System.out.println("You Have "+attemptLeft+" Attmepts Left , Now You can Enter a Values From 1 to 100 : ");
                int guessNum = scanner.nextInt();

                if(guessNum > randomNum){
                    System.out.println("Too High");
                }else if(guessNum < randomNum){
                    System.out.println("Too Low");
                }else{
                    System.out.println("Congrats Your Number is Correct");
                    userWon = true;
                    break;
                }
                attemptLeft--;
            }

            if(!userWon) {
                System.out.println("You Dont have any Attempts Left , The Number Was "+randomNum );
            }
        
            roundsPlay++;
           // totalScore += userWon ? attemptLeft :0 ;

            totalScore += randomNum;
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgainInput = scanner.next();
            play = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Game is Over , Your Total Score is "+totalScore+" In "+roundsPlay+" Number of Rounds .");
        scanner.close();
	}
}