class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> tracker = new HashMap<>();
        
        for(int num : nums) {
            tracker.put(num, tracker.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> keys = new ArrayList<>(tracker.keySet());
        keys.sort((b, a) -> tracker.get(a) - tracker.get(b));
        
        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }
        return result;
    }
}