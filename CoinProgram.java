import java.util.Random;

public class CoinProgram {
    int headCnt,tailCnt,n;

    public CoinProgram(){
        headCnt = tailCnt = 0;
        n = 3;
        Random random = new Random();

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
    }

    public static void main(String[] args){
        new CoinProgram();
    }
}
