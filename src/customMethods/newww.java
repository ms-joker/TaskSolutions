package customMethods;

public class newww {
    public static void main(String[] args) {
        int[] array = {1,1,1,2,2,3,44,44,5};
        System.out.println(frequency(array,1));
    }
    public static int frequency(int[] arr, int num){
        int frequency = 0;
        for (int i : arr) {
            if (i == num){
                frequency++;
            }
        }
        return frequency;
    }
}
/*

    5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5

 */