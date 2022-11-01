package multiDimensional;

import java.util.Arrays;

public class ReversedNum {
    public static void main(String[] args) {
        int[][] array = { {1,2,3}, {4,5,6}};
        int[][] temp = new int[array.length][array[0].length];
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(Arrays.toString(array[i]));
            for (int j = array[i].length - 1 , k=0; j >= 0; j--,k++) {
                System.out.print(array[i][j] + " ");
                temp[i][k] = array[i][j];
            }
            System.out.println(Arrays.toString(temp[i]));
        }
    }
}
