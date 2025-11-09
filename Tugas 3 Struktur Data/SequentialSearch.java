public class SequentialSearch {
    public static int sequentialSearch (int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
        int[] arr = {10, 15, 20, 25, 30};
        int targetElement = 35;
        int result = sequentialSearch (arr, targetElement);
        if (result != -1) {
            System.out.println("Elemen ditemukan pada indeks ke-" + result);
        } else {
            System.out.println("Elemen tidak ditemukan!");
        }
    }
}
