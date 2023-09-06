import java.util.*;
import java.util.stream.IntStream;

public class LeetcodeTask {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searchMatrix(nums,9));
    }

    public static boolean palindrome(String number) { //12321
        String[] array = number.split("");
        int count = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            if (!array[i].equals(array[count])) {
                return false;
            }
            count--;
        }
        return true;
    }
    public static int[] twoSum(int[] nums, int target) { // int[]{2,5,5,15}, int target = 10;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = nums[i];
            int x = target - count;
            if(map.containsKey(x)){
                return new int[]{map.get(x),i};
            }
            map.put(count,i);
        }
        return null;
    }
    public static int romanToInt(String s) { // "MCM"
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n = s.length();
        int sum = map.get(s.charAt(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }
    public static String longestCommonPrefix(String[] strs) { //String[]{"flower","flow","flight"}
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
    public static int maxProfit(int[] prices) { // prices = [7,1,5,3,6,4]
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
    public static int search(int[] nums, int target) { // int[]{4,5,6,7,0,1,2}, target = 0
        int min = 0;
        int max = nums.length - 1;
        while(min <= max){
            int mid = (min + max) / 2;
            if(target == nums[mid]){
                return mid;
            }
            if(nums[mid] > nums[min]){
                if(nums[mid] > target && nums[min] <= target){
                    max = mid - 1;
                } else {
                    min = mid + 1;
                }
            } else {
                if(nums[mid] < target && nums[max] >= target){
                    min = mid + 1;
                } else {
                    max = mid - 1;
                }
            }
        }
        return -1;
    }
    public static boolean isValid(String s) { // ()[]{} - true, (] - false
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) stack.push(ch);
            if (map.containsValue(ch)) {
                if (stack.isEmpty() || map.get(stack.pop()) != ch) {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
    public static int lengthOfLastWord(String s) { // Hello World => 5
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        return arr[arr.length - 1].length();
    }
    public static int[] plusOne(int[] digits) {// [1,2,3] => [1,2,4], [9] => [1,0]
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] array = new int[digits.length + 1];
        array[0] = 1;
        return array;
    }
    public static int missingNumber(int[] nums){ //[3,0,1] => 2
        int sum = IntStream.of(nums).sum();
        int len = nums.length;

        return len * (len + 1) / 2 - sum;
    }
    public static int singleNumber(int[] nums) { // [4,1,2,1,2] => 4
        int result = 0;
        for (int num : nums) {
            result^= num;
        }
        return result;
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int i = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int j = n - 1;

        while (i < m && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }
            if(matrix[i][j] > target){
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
