public class CountingSort {
    public static void countingSort(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; ++i)
            if (arr[i] > max)
                max = arr[i];
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; ++i)
            count[arr[i]]++;
        int[] output = new int [arr.length];
        int k = 0;
        for (int i = 0; i <= max; ++i)
            while (count[i]-- > 0)
                output[k++] = i;
        for (int i = 0; i < arr.length; ++i)
            arr[i] = output[i];
    }

    public static void main(String args[]) {
        int[] arr = {20,15,25,23,18,10};
        int n = arr.length;
        System.out.println("Angka sebelum diurutkan");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        countingSort(arr);
        System.out.println("Angka setelah diurutkan");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
