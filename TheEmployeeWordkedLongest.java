class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int r=logs.length;
        int start = 0,max=0,id=0,ans;
        for(int i=0;i<r;i++){
            ans=logs[i][1]-start;
            start=logs[i][1];
            if(ans>max){
                max=ans;
                id=logs[i][0];
            }
            else if(ans==max){
                if(id>logs[i][0]){
                    id=logs[i][0];
                }
            }
        }
        return id;
    }
}
