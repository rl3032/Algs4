package ch1;

import java.util.Arrays;

public class TwoSum {
  public static int CountTwoSum(int [] a){
    // Count pairs that sum to 0.
    Arrays.sort(a);
    int N = a.length;
    int count = 0;
    for (int i = 0; i < N; i++){
      if (BinarySearch.search(a, -a[i]) > i){
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr = {2, -3, 5, -2, 1, -7, 8, 9, -1, 4};
    System.out.println("The number of pairs that sum to 0 is " + CountTwoSum(arr));
  }
}
