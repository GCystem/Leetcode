public class Solution {
    public List<String> generateParenthesis(int n) {
        if(n<= 0) return null;
        List<String> result = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        helper(result, sb, 1, 0, n);
        return result;
    }
    
	// String vs StringBuilder 
    private void helper(List<String> result, StringBuilder sb, int left, int right, int n){
        
        if(left == n) {
            if(right == n){
                result.add(sb.toString());
            }
            else{
                sb.append(")");
                helper(result, sb , left, right+1, n);
                sb.deleteCharAt(sb.length()-1);
            }
        }    
        else if(left < n){
            if(left > right){
                sb.append(")");
                helper(result, sb, left, right+1, n );
                sb.deleteCharAt(sb.length()-1);
                sb.append("(");
                helper(result, sb, left+1, right, n);
                sb.deleteCharAt(sb.length()-1);
            }
            else if(left == right){
                sb.append("(");
                helper(result, sb, left+1, right, n);
                sb.deleteCharAt(sb.length()-1);
            }
            
        }
    }
    
}