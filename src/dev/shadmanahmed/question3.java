package dev.shadmanahmed;
//Find the second smallest number in the given array.
//{100, 45, 35, 67, 77, 12, 27, 77, 30, 90,46, 27}

public class question3 {
    public static void main(String[] args) {
         int[] arr = new int[]{100, 45, 35, 67, 77, 12, 27, 77, 30, 90, 46, 27};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j] > arr [j+1]) {
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j +1] = temp;
                }
            }
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        int ans = 1;

        System.out.println(arr[ans]);


    }
}
