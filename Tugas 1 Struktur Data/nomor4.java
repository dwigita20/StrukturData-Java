import java.util.*;
public class nomor4 {
    public static void main(String[] args) {
        int[][] arrayDua = {
                {12, 10, 40},
                {13, 11, 41},
                {14, 12, 42}
        };

        System.out.println(Arrays.deepToString(arrayDua));
        for (int[] arr : arrayDua) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
