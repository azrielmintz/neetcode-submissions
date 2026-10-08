class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean out = false;
        Set<Integer> count = new HashSet<>();

        for(int i = 0; i < nums.length;i++){
            if(count.contains(nums[i])){
                out = true;
            }
            count.add(nums[i]);

        }

                return out;
    }
}