class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> tracker = new HashMap<>();
        
        for(int num : nums) {
            tracker.put(num, tracker.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> keys = new ArrayList<>(tracker.keySet());
        keys.sort((a, b) -> tracker.get(b) - tracker.get(a));
        
        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }
        return result;
    }
}