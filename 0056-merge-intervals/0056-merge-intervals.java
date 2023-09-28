class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        
        int end=intervals[0][1], start=intervals[0][0], k=0;
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        arr.add(new ArrayList<Integer>());
        arr.get(0).add(intervals[0][0]);
        arr.get(0).add(intervals[0][1]);
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] <= end && intervals[i][1] > end ){
                end = intervals[i][1];
                arr.get(k).set(1,end);
            }
            if(intervals[i][0] > end && intervals[i][1] > end ){
                start = intervals[i][0];
                end = intervals[i][1];
                k++;
                arr.add(new ArrayList<Integer>());
                arr.get(k).add(intervals[i][0]);
                arr.get(k).add(intervals[i][1]);
            }
            
        }

        int[][] ans = new int[arr.size()][2];
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                ans[i][j] = arr.get(i).get(j);
            }
        }
        return ans;
    }
}