class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        //3, 0
        //4, 1
        //5, 2
        //6, 3

        //does the map have 7-3
        //yes it has 4
        //return i = 0 = 3
        //return 

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i], i); 
        }
        return new int[]{};
    }
}
