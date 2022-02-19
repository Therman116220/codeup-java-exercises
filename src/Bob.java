import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner BossBob = New Scanner(System.in);
    String Talking;
    do {
        Talking = BossBob.nextLine();
        if (Talking.contains("?")) {
            System.out.println("Sure thing");
        } else if (Talking.endsWith("!")) {
            System.out.println("Take it down a few notches friend..");
        } else if (Talking.equals("")) {
            System.out.println("Fine, We do not need to talk. Just hang");
        } else {
            System.out.println("I don't have a comment on that");
        }
        while (Talking.startsWith("Bob,") || Talking.startsWith("") || Talking.startsWith("bob,")) ;


    }
    }
}