class Solution {
    public int minSoldiers(int[] arr, int k) {
        // code here
        int []ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%k==0) ans[i]=0;
            else ans[i]=k-(arr[i]%k);
        }
        Arrays.sort(ans);
        int sum=0;
        int n=arr.length%2==0?arr.length/2:(arr.length/2)+1;
        for (int i = 0; i <n; i++)sum+=ans[i];
        return sum;
    }
    
}