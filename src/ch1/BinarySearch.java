package ch1;
import java.util.Arrays;
public class BinarySearch {
  public static int search(int[] arr, int key){
    int low = 0;
    int high = arr.length - 1;

    while (low <= high){
      int mid = (low + high) / 2;
      if (arr[mid] < key){
        low = mid + 1;
      }
      else if (arr[mid] > key){
        high = mid - 1;
      }
      else{
        return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {2, 4, 6, 8, 10, 12, 14};
    int key = 8;

    int result = search(arr, key);
    if (result == -1){
      System.out.println("Key not found in the array.");
    } else {
      System.out.println("Key found at index: " + result);
    }
  }
}
