class Solution {
    public int[] twoSum(int[] nums, int target) {
        int re[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            int val = target - nums[i];
           if(map.containsKey(val)){
               re[0] = i;
               re[1] = map.get(val);
               return re;
               
           }else{
               map.put(nums[i], i);
               
           }
        }
        return re;
    }
}
