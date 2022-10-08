class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num = new HashMap<>();
        for( int i = 0; i < nums.length; i++)
        {
                int diff = target - nums[i];
                if(num.containsKey(diff)) {
                    return new int[] {num.get(diff), i};
                }
            num.put(nums[i], i);
        }
        throw new IllegalArgumentException("no match");
    }
}
