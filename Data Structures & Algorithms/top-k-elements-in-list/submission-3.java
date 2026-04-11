class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> tracker = new HashMap<>();

        for(int num: nums) {
            tracker.put(num, tracker.getOrDefault(num, 0) + 1);
        }

        List<Integer> sortedKeys = new ArrayList<>(tracker.keySet());
        sortedKeys.sort((a,b) -> tracker.get(b) - tracker.get(a));

        int[] output = new int[k];
        for(int i = 0; i < k; i++){
            output[i] = sortedKeys.get(i);
        }
        return output;
    }
}
