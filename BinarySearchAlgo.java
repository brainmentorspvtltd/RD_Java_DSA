class BinarySearchAlgo {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int search = 70;
        while (low < high) {
            mid = (low + high) / 2;
            if (search == arr[mid]) {
                System.out.println("Element Found...");
                return; // exit from the main function
            }
            if (search > arr[mid]) {
                low = mid + 1; // Left to right
            } else if (search < arr[mid]) {
                high = mid - 1; // right to left
            }
        }
        System.out.println("Element Not Found...");
    }
}