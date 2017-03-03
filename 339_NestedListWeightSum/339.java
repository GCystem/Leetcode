public class Solution {
    public int depthSum(List<NestedInteger> input) {
		if(input == null || input.size() == 0) return 0;
		
		return helper(input, 0);
		
    }
	
	public int helper(List<NestedInteger> input,, int depth){

		int result = 0;
		
		for(int i = 0;i < input.size(); i++){
			if(input.get(i).isInteger()){
				result += (input.get(i).getInteger() * depth);
			}
			else{
				result += helper(input, input.get(i), depth + 1);
			}			
		}
		
		return result;
		
		
	}
	
	
	
}