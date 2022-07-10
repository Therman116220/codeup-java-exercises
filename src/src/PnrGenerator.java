
     /*PNR*/
    /*5 Character Pass*/
    /*T is dropped if it is the first letter*/
import java.util.Random;

    public class PnrGenerator  {
        public PnrGenerator(int i) {
        }

        public static String generateRandomPnr(int len) {
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "1234567890";
            Random PNR = new Random();
            StringBuilder sb = new StringBuilder(len);  //Like StringBuffer
            for (int i = 0; i < len; i++)
                sb.append(chars.charAt(PNR.nextInt(chars.length())));
            return sb.toString();
        }
    }


