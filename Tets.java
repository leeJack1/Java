package xx;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tets {
    public static void seletionSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for (int j = i+1;j<arr.length-1;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if (i!=minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int []arr = new int[]{3,4,2,1,5,6,7,8,30,50,1,33,24,5,-4,7,8};
        seletionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
