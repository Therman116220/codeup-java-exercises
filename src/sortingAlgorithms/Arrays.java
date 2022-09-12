package sortingAlgorithms;


class  Arrays {

    public static void main(String[] args) {
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




}



