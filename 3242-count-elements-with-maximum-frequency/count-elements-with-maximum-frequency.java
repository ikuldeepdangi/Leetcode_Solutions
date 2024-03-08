class Solution {
    public int maxFrequencyElements(int[] nums) {
       Map<Integer,Integer> frequencyMap = new HashMap<>();
       int maxFrequency = 0;

       for(int num : nums){
           int frequency = frequencyMap.getOrDefault(num,0) + 1 ;
           frequencyMap.put(num,frequency);
           maxFrequency = Math.max(maxFrequency , frequency);
       }
       int count = 0;
       for(int frequency : frequencyMap.values()){
           if(frequency == maxFrequency){
               count += frequency;
           }
       }
          return count;
    }
}