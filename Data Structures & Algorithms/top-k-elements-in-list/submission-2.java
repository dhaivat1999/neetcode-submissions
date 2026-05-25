class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hash = new HashMap<>();
        for(int num:nums){
            hash.put(num,hash.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->hash.get(a)- hash.get(b));
        for(int n:hash.keySet()){
            pq.add(n);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.poll();
        }
        return ans;
    }
}
