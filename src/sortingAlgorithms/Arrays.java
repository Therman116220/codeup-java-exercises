package sortingAlgorithms;


class  Arrays {

/*2*/   //Definition of a brute-force solution
    public static void main(String[] args) {
        String[] movies = new  String[8];

        movies[0] = "Bicentennial Man";
        movies[1] = "I-Robot";
        movies[2] = "The Internship";
        movies[3] = "Remember the Titans";
        movies[4] = "Inception";
        movies[5] = "In Time"; //Error
        movies[6] = "Creed";
        movies[7] = "Edge Of Tomorrow";

        int index = -1;
        for (int i = 0;i<movies.length;i++) {
            if (movies[i] == movies[0]) {
                index = i;
                System.out.println("Your Sunday movie is: " +  movies[i]);
            } else if (movies[i] == movies[1]) {
                index = i;
                System.out.println("Your Monday movie is: " +  movies[i]);
            }  else if (movies[i] == movies[2]) {
                index = i;
                System.out.println("Your Tuesday movie is: " +  movies[i]);
            }  else if (movies[i] == movies[3]) {
                index = i;
                System.out.println("Your Wednesday movie is: " +  movies[i]);
            }  else if (movies[i] == movies[4]) {
                index = i;
                System.out.println("Your Thursday movie is: " +  movies[i]);
            }else if (movies[i] == movies[5]) {
                index = i;
                System.out.println("** Your alternate movie of the week is: " +  movies[i] +" **");
            }  else if (movies[i] == movies[6]) {
                index = i;
                System.out.println("Your Friday movie is: " +  movies[i]);
            }  else if (movies[i] == movies[7]) {
                index = i;
                System.out.println("Your Saturday movie is: " +  movies[i]);
            }  /* else {
                System.out.println("Uh-Oh, Something Went Wrong");
            }*/  // adds

        }
    }



    /*1*/
   /* public static void main(String[] args) {
        int[] nums = new int[7];

        nums[0] = 74;
        nums[1] = -12;
        nums[2] = 12;
        nums[3] = 7;
        nums[4] =44;
        nums[5] = 2;
        nums[6] = -11;


        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -11) {
                index = i;
                System.out.println("Your number is: "+nums[i]);
                break;

            }
        }

        System.out.println("With an index of: " + index);


    }
*/



}



