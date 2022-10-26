class Solution {
    public int missingNumber(int[] nums) {
        int size=nums.length;
        int sumofaddition=size*(size+1)/2;
        int givensum=0;
        for(int i=0;i<nums.length;i++){
            givensum+=nums[i];
        }
        return sumofaddition-givensum;
        
    }
}
