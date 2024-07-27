
    class ToSum2DArray {
        public int maximumWealth(int[][] accounts) {
            int ans = Integer.MIN_VALUE;
            for(int[] ant: accounts){
                int rowsum =0;
                for(int ants: ant){
                    rowsum =rowsum + ants;
                }
                if(rowsum> ans){
                    ans= rowsum;
                }
            }
            return ans;

        }
    }

