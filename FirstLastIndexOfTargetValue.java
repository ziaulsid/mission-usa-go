class FirstLastIndexOfTargetValue {
    public int[] searchRange(int[] nums, int target) {

        if(nums.length == 0)
            return new int[]{-1, -1};
        int fistIdx = findFirstIndex(nums, target);
        int secondIdx = findLastIndex(nums, target);
        
        return new int[]{fistIdx, secondIdx};
        
    }
    
    private int findFirstIndex(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int fistIdx = -1;
        while(start <= end){
            
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                fistIdx = mid;
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return fistIdx;
    }
    
    private int findLastIndex(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int secondIdx = -1;
        while(start <= end){
            
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                secondIdx = mid;
                start = mid + 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return secondIdx;
    }
}
