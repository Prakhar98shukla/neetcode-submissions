class Solution {
  int minRate=Integer.MAX_VALUE;
  public int minEatingSpeed(int[] piles, int h) {
     //get piles max value using direct function
      int max=Arrays.stream(piles).max().getAsInt();
      
      int l=1,r=max;
      
      while(l<=r){
          int mid=l+(r-l)/2;
         System.out.println("Mid:"+mid);
          if(check(piles,mid,h)){
              r=mid-1;
          }
          else{
              l=mid+1;
          }
      }
      return minRate;
  }
  public boolean check(int[] piles,int mid,int h ){
      int max=0;
      //System.out.println("MinRate:"+minRate);
      for(int i=0;i<piles.length;i++){
           max=max+(int)Math.ceil((double)piles[i]/mid);
           //System.out.print(" max cal: "+piles[i]+"/"+mid+"="+Math.ceil((double)piles[i]/mid));
      }
      System.out.println("MinRate:"+minRate+" for k:"+mid+" max:"+max);
      if(max<=h){
          
          minRate=Math.min(minRate,mid);
          return true;
      }
      return false;
  }
}
