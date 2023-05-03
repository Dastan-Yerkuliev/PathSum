import java.util.HashSet;

public class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();
        int sum = 0;
        for(int num: nums) {
            if(!unique.contains(num)) {
                sum += num;
                unique.add(num);
            } else {
                sum -=num;
            }
        }
        return sum;
    }
}
