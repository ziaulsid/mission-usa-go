class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            
            if(i == 0 || nums[i] != nums[i-1])
                twoSum(nums, result, i);
        }
        return result;
        
    }
    
    private void twoSum(int[] nums, List<List<Integer>> result, int index){
        
        int left = index + 1;
        int right = nums.length -1;
        
        while(left < right){
            int sum = nums[index] + nums[left] + nums[right];
            
            if(sum == 0){
                List<Integer> triplet = new ArrayList<>();
                triplet.add(nums[index]);
                triplet.add(nums[left]);
                triplet.add(nums[right]);
                
                result.add(triplet); 
                left++;
                right--;
                
                /* We don't want to include the element if previous element was the same */
                while (left < right && nums[left] == nums[left - 1])
                    left++;
                
                while(left < right && nums[right] == nums[right+1])
                    right--;
                
            }else if(sum < 0){
                left++;
            }else
                right--;
        }
    }
}
