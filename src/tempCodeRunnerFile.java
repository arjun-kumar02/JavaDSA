public class array {
  public static void main(String[] args) {
    int[] arr={2,3,5,6,7,8,7,6,5,4,3,2,1};
    int s=0;
    int e=arr.length-1;
    while(s<e){
      int  m=(s+e)/2;
      if(arr[m]>arr[m+1]){
        e=m;        
      }
      else{
        s=m+1;
      }
    }
    System.out.println(arr[s]);
  }
}