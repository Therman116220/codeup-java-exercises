import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner BossBob = new Scanner(System.in);
        String Talking;
        System.out.println("Talk to me");
            Talking = BossBob.nextLine();
            if (Talking.contains("?")) {
                System.out.println("Sure thing broski");
            } else if (Talking.endsWith("!")) {

                System.out.println("Take it down a few notches friend..");
            } else if (Talking.equals("")) {
                System.out.println("Fine, We do not need to talk. Just hang");
            } else {
                System.out.println("I don't have a comment on that");
            }
          //(Talking.startsWith("Bob,") || Talking.startsWith("") || Talking.startsWith("bob,")) ;



    }
}