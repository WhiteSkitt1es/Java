package generalization;

public class GenericMethod {
    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
        if(x.length != y.length) return false;

        for (int i = 0; i < x.length; i++) {
            if(!x[i].equals(y[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] nums1 = {1, 2, 3, 4, 5};
        Integer[] nums2 = {1, 2, 3, 4, 5};
        Integer[] nums3 = {1, 2, 7, 4, 5};
        Integer[] nums4 = {1, 2, 7, 4, 5, 6};

        if(arraysEqual(nums1, nums1)){
            System.out.println("nums1 equals nums1");
        }
        if (arraysEqual(nums1, nums2)){
            System.out.println("nums1 equals nums2");
        }
        if(!arraysEqual(nums2, nums3)){
            System.out.println("nums2 not equals nums3");
        }
        if(!arraysEqual(nums3, nums4)){
            System.out.println("nums3 not equals nums4");
        }
    }
}
