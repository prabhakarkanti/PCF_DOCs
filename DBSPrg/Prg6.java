
import java.util.HashSet;
import java.util.StringTokenizer;
public class Prg6 {
	

	 

	    
	      
	    private static HashSet<String> allSubsets = new HashSet<>();

	private static Prg6 findSubsetsThatSumToATargetrget;
 
	    private static final String token = " ";

	   
	    public static void findTargetSumSubsets(int[] input, int target, String ramp, int index) {

	        if(index > (input.length - 1)) {
	            if(getSum(ramp) == target) {
	                allSubsets.add(ramp);
	            }
	            return;
	        }

	         
	        findTargetSumSubsets(input, target, ramp + input[index] + token, index + 1);
	         
	        findTargetSumSubsets(input, target, ramp, index + 1);
	    }
 
	    private static int getSum(String intString) {
	        int sum = 0;
	        StringTokenizer sTokens = new StringTokenizer(intString, token);
	        while (sTokens.hasMoreElements()) {
	            sum += Integer.parseInt((String) sTokens.nextElement());
	        }
	        return sum;
	    }

	    
	    public static void main(String[] args) {
	        int [] m =  {24, 1, 15, 3, 4, 15, 3};
	        int counter = 1;
	        findSubsetsThatSumToATargetrget.findTargetSumSubsets(m,25, "", 0);
	        for (String str: allSubsets) {
	            System.out.println(counter + ") " + str);
	            counter++;
	        }
	    }
	}


