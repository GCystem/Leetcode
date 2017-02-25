public class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;
        
        for(int i = nums.length-1; i>=0;i--){
            if(nums[i] < third) return true;
            else{
                while(!stack.isEmpty() && nums[i] > stack.peek()){
                    third = stack.pop(); 
                }
                stack.push(nums[i]);
            }
        }
        return false;
    }
}