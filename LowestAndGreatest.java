public class LowestAndGreatest {
    public static void main(String[] args) {
        int arr[] = { 10, 12, 15, 17, 19, 20, 25, 27, 30, 35, 40 };
        int search = 29;
        int nearestLowest = 0;
        int nearestGreater = 0;
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        for (int i = 0; i < arr.length; i++) {
            mid = (low + high) / 2;

            if (search > arr[mid]) {
                low = mid + 1; // Left to right
                nearestLowest = arr[mid];

            } else if (search < arr[mid]) {
                high = mid - 1; // right to left
                nearestGreater = arr[mid];
            } else {
                nearestLowest = nearestGreater = arr[mid];
                break;
            }
        }
        System.out.println("Lowest " + nearestLowest + " Greater " + nearestGreater);
    }
}
