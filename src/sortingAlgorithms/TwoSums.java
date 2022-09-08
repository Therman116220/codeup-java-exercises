package sortingAlgorithms;

class TwoSums {


    public int[] twoSum(int[] nums, int target) {

        int i;
        for (i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i + j == target) {
                    System.out.println(i + "plus" + j + "equals" + target);
                }
            }
        }
        return nums;


    }
}
