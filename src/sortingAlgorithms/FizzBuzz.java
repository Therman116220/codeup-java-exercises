package sortingAlgorithms;



class FizzBuzz {

    public static void main(String[] args) {
    fizzBuzz(7);
}
    public static String fizzBuzz(int n) {
        if (n % 3 == 0) {
            if (n % 5 == 0) {
                return "fizzbuzz";
            } else {
                           return "fizz";
            }
            } else if (n % 5 == 0) {
                return "buzz";
            }

            return String.valueOf(n);
        }


    }
