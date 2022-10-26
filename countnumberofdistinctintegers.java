class Solution {
    public int countDistinctIntegers(int[] nums) {
        ArrayList<Integer> l= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int reverse=0;
            int number=nums[i];
            while(number != 0) {
                int digit= number%10;
                reverse=(reverse*10)+digit;
                number/=10;
            }
            l.add(reverse);
        }
        Set<Integer>s = new HashSet<>(); 
        for (int i=0;i<l.size();i++) 
        {
            s.add(l.get(i));
        }
        return s.size();
    }
}
