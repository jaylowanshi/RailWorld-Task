import java.util.Scanner;
public class Array {
        public static void main(String args[]) {
            int arr[] = new int[]{20, 19, 21, 30,8,66,5};
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                    System.out.println(arr[i]);
                    break;

                }
            }
        }
    }