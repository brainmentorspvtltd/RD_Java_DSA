public class ArrayFirstIndexLastIndex {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 5, 5 };
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int firstIndex = -1;
        int lastIndex = -1;
        int search = 3;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == search) {
                firstIndex = mid;
                high = mid - 1; // right to left because of firstIndex
            } else if (search > arr[mid]) {
                low = mid + 1;
            } else if (search < arr[mid]) {
                high = mid - 1;
            }
        }
        System.out.println("First Index of " + search + " is " + firstIndex);
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == search) {
                lastIndex = mid;
                low = mid + 1; // left to right because of lastIndex
            } else if (search > arr[mid]) {
                low = mid + 1;
            } else if (search < arr[mid]) {
                high = mid - 1;
            }
        }
        System.out.println("Last Index of " + search + " is " + lastIndex);
    }
}
