import java.util.*;

class  DSA {

        public static void main(String[] args) {


                        int[] arr = { 4};
                        arr = mergesort(arr);
                        System.out.println(Arrays.toString(arr));


        }


        //devide
        static int [] mergesort(int[] arr) {
                if (arr.length == 1) {
                        return arr;
                }
                int mid = arr.length / 2;
                int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
                int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
                return Merge(left, right);

        }

        private static int[] Merge(int[] first, int[] second) {
                int[] mix = new int[first.length + second.length];
                int i = 0;
                int j = 0;
                int k = 0;
                while (i < first.length && j < second.length) {
                        if (first[i] < second[j]) {
                                mix[k] = first[i];
                                i++;
                        } else {
                                mix[k] = second[j];
                                j++;
                        }
                        k++;
                }

                while (i < first.length) {
                        mix[k] = first[i];
                        i++;
                        k++;

                }
                while (j < second.length) {
                        mix[k] = second[j];
                        j++;
                        k++;
                }


                return mix;


        }
}