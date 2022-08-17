package sortingAlgorithms;

public class MergeSort {

    public static void sort(int[] a, int[] l, int[] r, int mergeleft, int mergeright) {
        int x = 0;
        int i = 0;
        int j = 0;


        while (i < mergeleft && j < mergeright) {
            if (l[i] <= r[j]) {
                 a[x++] = l[i++];
            } else {
                 a[x++] = r[j++];
            }
        }
        while (i < mergeleft) {
              a[x++] = l[i++];

        }
        while (j < mergeright) {
            a[x++] = r[j++];
        }


    }
    public static void main(String[] args) {
        sort(2,9,1,7);
        sort(6,7,2,6);
        sort(1,3,2,8);
        sort(8,3,3,7);
    }





}

