package practiceWithAlgorithms;

public class ReverseSort {
    public static void main(String[] args) {
      String r = reverse("Goat");
        System.out.println(r);
    }
    public static void reverse(String s) {
        char[] node = new char[s.length()];
        //We want "i" to be the length of our argument - 1 *the last node*
        //If "i", *currently placed at the last node*
        // is greater than or equal to 0 decrement "i"
        int nodeIndex = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            node[nodeIndex] = s.charAt(i);
            nodeIndex++;
        }

    }
    /*1*/
  /*  public static void main(String[] args) {
        String r = reverse("senyah");
        System.out.println(r);
    }

    public static String reverse(String s) {
        char[] node = new char[s.length()];

        int nodeIndex = 0;for (int i = s.length() - 1; i >= 0; i--) {
            node[nodeIndex] = s.charAt(i);
            nodeIndex++;
        }
        //
        StringBuilder reverseContent = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            reverseContent.append(node[i]);
        }
        return reverseContent.toString();
        //  Alternate way to do LINE 19 - 23
       *//* String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            reverseContent = reverseContent + letters[i];*//*
        // *** With a return statement of 'reverseContent'  ***
    }*/
}
