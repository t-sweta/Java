import java.util.Arrays;
import java.util.*;
public class frequencyArray {
  public static void main(String[] args) {

    int[] arr = { 0, 1, 2, 3, 1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3, 1, 2, 3 };

    int[] freq = new int[6];
    for (int i = 0; i < arr.length; i++) {
      freq[arr[i]]++;
    }
    System.out.println(Arrays.toString(freq));
    // sorting code
    int j = 0;
    for (int i = 0; i < freq.length; i++) {
      int n = freq[i];
      while (n-- > 0) {
        arr[j] = i;
        j++;
      }
    }
    System.out.println(Arrays.toString(arr));
  }

}
