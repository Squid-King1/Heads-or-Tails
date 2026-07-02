import java.util.Random;
import java.util.Scanner;

public class CoinProgram {
    int headCnt,tailCnt,n;

    public CoinProgram(){
        headCnt = tailCnt = 0;
        n = 3;
        Random random = new Random();

        Introduce();

        System.out.println("Tossing a coin...");
        for(int i = 1;i <= n;i++){
            int judge = random.nextInt(2);

            System.out.print("Round " + i +": ");
            if(judge == 1){
                System.out.println("Heads");
                headCnt++;
            } else {
                System.out.println("Tails");
                tailCnt++;
            }
        }

        System.out.println("Heads: " + headCnt + ", Tails: " + tailCnt);

        if(headCnt > tailCnt){
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }

    public void Introduce(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Who are you?");
        System.out.print("> ");
        String str = sc.nextLine();
        System.out.println("Hello, " + str + "!");

        sc.close();
    }

    public static void main(String[] args){
        new CoinProgram();
    }
}
