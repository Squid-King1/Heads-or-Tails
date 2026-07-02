import java.util.Random;
import java.util.Scanner;

public class CoinProgram {
    int headCnt,tailCnt,n;
    String name;

    public CoinProgram(){
        headCnt = tailCnt = 0;
        n = 3;
        Random random = new Random();

        name = Introduce();

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
            System.out.println(name + " won!");
        } else {
            System.out.println(name + " lost!");
        }
    }

    public String Introduce(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Who are you?");
        System.out.print("> ");
        String str = sc.nextLine();
        System.out.println("Hello, " + str + "!");

        sc.close();
        return str;
    }

    public static void main(String[] args){
        new CoinProgram();
    }
}
