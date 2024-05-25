class Solution {
    public int[] twoSum(int[] nums, int target) {
        int num1[]=new int[2];

        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    num1[0]=i;
                    num1[1]=j;
                    return num1;
                }
            }    
        }
        return num1;

    }
}
