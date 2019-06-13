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

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++)
        {
           for(int j = i + 1; j < nums.length; j++)
           {
               if(nums[i] + nums[j] == target)
               {
                   return new int[] {i,j};
               }
           }
        }
        return null;
    }
}
