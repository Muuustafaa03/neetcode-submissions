class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int ans = n;

        while(ans != 1) {
            int[] digits = String.valueOf(ans).chars().map(Character::getNumericValue).toArray();
            ans = 0;
            for(int digit : digits) {
                ans+=Math.pow(digit, 2);
            }
            if(ans == 1) {
                return true;
            }
            else if(set.contains(ans)) {
                return false;
            }
            set.add(ans);
        }
        return true;
    }
}
