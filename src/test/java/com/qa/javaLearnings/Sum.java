package com.qa.javaLearnings;

public class Sum {
	
	public static void main(String[] args) {
		
		int[] inp = {5,7,2,6};
		int[] res = twoSum(inp,9);
		System.out.println(res[0]+","+res[1]);
		
		int[] inp1 = {3,2,3};
		int[] res1 = twoSum(inp1,6);
		System.out.println(res1[0]+","+res1[1]);
		
	}
	
	public static int[] twoSum(int[] nums, int target) {
	       
        int len = nums.length;
        int[] res = new int[2];
        
        for(int i=0; i<=len-2; i++){
        	for(int j=i+1; j<=len-1; j++) {
        		if(nums[i] + nums[j] == target) {
                	res[0] = i;
                    res[1] = j;
                    break;
                }
        	}
        }  
        return res;
    }

}
