public class BinarySearch {
    public static void binarySearch (int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Elemen ditemukan pada indeks ke-" + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Elemen tidak ditemukan!");
        }
    }
    public static void main (String args[]) {
        int arr[] = {10, 15, 20, 25, 30};
        int key = 40;
        int last = arr.length - 1;
        binarySearch(arr, 0, last, key);
    }
}
