package sortingAlgorithms;



class TwoSums {


/*6*/
public int[] twoSums(int[] nums, int target) {
    for (int i = 0;i<nums.length;i++) {
        for (int j = i + 1; j<nums.length;j++) {
        int k = target - nums[i];
        if(k == nums[j]) {
            System.out.println();
           return new int[] {i,j};
        }
        }
    }
    return nums;
}

/*5*/
/*public int[] twoSums(int[] nums, int target) {
    for (int i = 0; i<nums.length; i++) {
        for(int j = i + 1; j<nums.length; j++) {
            int k = target - nums[i];

            if (k == nums[j]) {
                return new int[] {i,j};
            }
        }
    }
    return nums;
}*/
}





    /*4*/
    /*public int[] twoSums(int[] nums, int target) {

        for (int i = 0; i <= nums.length; i++) {
            for(int j = i + 1; j <nums.length; j++) {
                int k = target - nums[i];
                if (k == nums[j]) {
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }
}*/
/*3*/
/*
    public int[] twoSums(int[] nums, int target) {
        for ( int i = 0; i < nums.length; i++) {
            for( int j = i + 1; j < nums.length;j++) {
                int k = target - nums[i];
                if(k == nums[j]) {
                    return new int[] {i,j};
                }
            }
        }
            return nums;
        }
    }*/
/*2*/
    /* public int[] twoSum(int[] nums, int target) {
          for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
               int k = target - nums[i];

               if(nums[j] == k) {
                   return  new int[] {i,j};
               }
            }
        }
        return nums;
 }
}*/
