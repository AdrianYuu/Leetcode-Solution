class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> hmap = new HashMap<>();

        int len = nums.length;

        for(int i = 0; i < len; i++){
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i], hmap.get(nums[i]) + 1);
            } else {
                hmap.put(nums[i], 1);
            }
        }

        Map.Entry<Integer, Integer>[] entries = hmap.entrySet().toArray(new Map.Entry[0]);
        int entriesLen = entries.length;

        for(int i = 0; i < entriesLen - 1; i++){
            for(int j = 0; j < entriesLen - i - 1; j++){
                if(entries[j].getValue() < entries[j + 1].getValue()){
                    Map.Entry<Integer, Integer> temp = entries[j];
                    entries[j] = entries[j + 1];
                    entries[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < k; i++){
            result[i] = entries[i].getKey();
        }

        return result;
    }
}