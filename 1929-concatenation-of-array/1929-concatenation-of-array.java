class Solution {
    public int[] getConcatenation(int[] nums) {
        int j = 0;
        int []arr = new int[nums.length*2];
        for (int i = 0; i<nums.length; i++){
           arr[j] = nums[i];
            j++;
        }
        for (int i = 0; i<nums.length;i++){
            arr[j] = nums[i];
            j++;
        }
        return arr;
}
}