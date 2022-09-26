package src;

public class VendingMachineOption {
    public static void main(String[] args) {
        VendingMachineOption OptionOne = new VendingMachineOption();
        VendingMachineOption OptionTwo = new VendingMachineOption();


        System.out.println(OptionOne.type);
        System.out.println(OptionTwo.price());

    }

    private int price() {
        return this.price;
    }
    private void type(String type) {
    }

    int price = 2; // Coke, Sprite, Dr. Pepper
        String type = "Sprite"; //Can, Bottle


    }


