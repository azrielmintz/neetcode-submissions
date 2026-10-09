class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] out = new int[2];
        HashMap<Integer,Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length;i++){
            int dif = target - nums[i];
            if(temp.containsKey(dif)){
               out[1]=i;
               out[0] = temp.get(dif);
                return out;}
                else {
                    temp.put(nums[i],i);
                }
        }
        return out;
    }
}
