public class AlgorithmsSearch {

    public static void main(String[] args) {
        int[] array = new int[]{1,3,5,6};
        System.out.println(binarySearchV2(array,5));
    }
    static int simpleSearch(int[] array, int value) { // O(n)
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearchV1(int[] array, int value, int min, int max) { // O(log n)
        int mid = (max - min) / 2 + min;
        if (max < min) {
            return -1;
        }
        if (array[mid] < value) {
            return binarySearchV1(array, value, mid + 1, max);
        } else {
            if (array[mid] > value) {
                return binarySearchV1(array, value, min, mid - 1);
            } else {
                return mid;
            }
        }
    }

    static int binarySearchV2(int[] array, int value) { // O(Log n)
        int min = 0;
        int max = array.length - 1;
        int mid = (max - min) / 2 + min;

        while (array[mid] != value && min <= max) {
            if (value > array[mid]) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
            mid = (max - min) / 2 + min;
        }
        return mid;
    }
}
