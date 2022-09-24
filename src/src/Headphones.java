package src;

public class Headphones {
    public static void main(String[] args) {
     Headphones h1 = new Headphones();
        /*Properties*/

        System.out.println(h1.color);
        System.out.println(h1.porttype);
        System.out.println(h1.brand);
        System.out.println("$" + h1.price);
        System.out.println(h1.color + " " + h1.brand +" headphones for $" + h1.price + "!");
        /*Actions*/

      /*  System.out.println(m.);*/

    }
/*Actions Declaration*/
  String[] controls =  {
            "volume",
            "powerbtn",
            "play/pause",
            "skip",
  };
  /*Properties Declaration*/
    String porttype = "micro-usb";
    String color = "CandyGreen";
    String brand = "SkullCandy";
    Double price = 14.44;









}


