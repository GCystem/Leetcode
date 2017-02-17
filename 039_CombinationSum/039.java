public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        if(candidates == null) return null;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        helper(result, candidates, new ArrayList<Integer>(), target, 0);
        return result;
    }
    
    public void helper(List<List<Integer>> result, int[] nums, List<Integer> list, int target, int start){
        
        if(target < 0) return;
        else if(target == 0 ) result.add(new ArrayList(list));
        else{
            for(int i=start;i<nums.length;i++){
            
                list.add(nums[i]);
                helper(result, nums, list, target-nums[i], i);
                list.remove(list.size()-1);
            }
        }
        
    }
}