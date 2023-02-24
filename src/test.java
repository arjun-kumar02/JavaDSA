class test{
    public static void binarySearch(int arr[], int first, int last, int key){
      int mid = (first + last)/2;
      while( first <= last ){
         if ( arr[mid] < key ){
           first = mid + 1;   
         }else if ( arr[mid] == key ){
           System.out.println("Element is found at index: " + mid);
           break;
         }else{
            last = mid - 1;
         }
         mid = (first + last)/2;
      }
      if ( first > last ){
         System.out.println("Element is not found!");
      }
    }
    public static void main(String args[]){
           int arr[] = {10,20,30,40,50};
           int key = 30;
           int last=arr.length-1;
           binarySearch(arr,0,last,key);	
    }
   }
   




   
//binarysearch
/**
 * array
 */
// public class array {
//   public static void main(String[] args) {
//     int[] arr = {1,2,3,3,5,9,15};
//     int target = 15;
//     int start=0;
//     int end=arr.length-1;
//     while(start<=end){
//       int mid=(start+end)/2;
//       if(target < arr[mid]){
//         end=mid-1;
//       }
//       else if(target > arr[mid]){
//         start=mid+1;
//       }
//       else{
//         System.out.println(mid);
//         break;
//       }
//     }
//   }
// }










// public class array {
//   public static void main(String[] args) {
//     int[] arr = {50,45,42,39,31,30,25,21,10,5,3,1};
//     int target = 3;
//     int start=0;
//     int end=arr.length-1;
//     while(start<=end){
//       int mid=(start+end)/2;
//       if(target > arr[mid]){
//         end=mid-1;
//       }
//       else if(target < arr[mid]){
//         start=mid+1;
//       }
//       else{
//         System.out.println(mid);
//         break;
//       }
//     }
//   }
// }
