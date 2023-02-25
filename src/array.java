import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.swing.text.AbstractDocument.BranchElement;

//try
/**
 * array
 */
// public class array {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("size of array:");
//         int n=in.nextInt();
//         int arr[]=new int[n];
//         // for(int i=0; i<=arr.length-1; i++){
//         //     arr[i]=in.nextInt();
//         // }

//         //for loop
//         // for(int i=0; i<=arr.length-1;i++){
//         //     System.out.println(arr[i]);
//         // }

//         //for each loop
//         // for (int i : arr) {
//         //     System.out.println(i+" ");
//         // }

//         //passing array in to string
//         //System.out.println(arrays.toString(arr));

//     }
// }







//SWAP to arrray
/**
 * array
 */
// public class array {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("size");
//         int  n=in.nextInt();
//         int arr[]=new int[n];
//         for(int i=0; i<arr.length; i++){
//             arr[i]=in.nextInt();
//         }
//         System.out.println(arrays.toString(arr));
//     }
// }





/**
 * array
 */
// public class array {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//          System.out.println("size");
//         int  n=in.nextInt();
//         int arr[]=new int[n];
//         for(int i=0; i<arr.length; i++){
//             arr[i]=in.nextInt();
//         }
//         System.out.println("Enter number for search:");
//         int t=in.nextInt();
//         System.out.println(arrays.toString(arr));
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]==t){
//                 System.out.println("index at "+i);
//                 break;
//             }
//         }
//     }
// }











 /**
  * array
  */
//  public class array {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("*");
//         int min=0;
//         int[]  arr ={5, 10, 50, 3, 7};
//         min=arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if(arr[i]<min){
//                 min=arr[i];
//             }
//         }
//         System.out.println(min);
//     }
//  }





//search in 2d array
/**
 * array
 */
// public class array {
//   public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     System.out.println("//search in 2d array | enter size of 2 d array");
//     int n1=in.nextInt();
//     int n2=in.nextInt();
//     int [][] arr= new int[n1][n2];
//     System.out.println("Enter element");
//     for (int i = 0; i < arr.length; i++) {
//       for (int j = 0; j < arr[i].length; j++) {
//         arr[i][j]=in.nextInt();
//       }
//     }
//     System.out.println("Enter target number");
//     int target=in.nextInt();
//     search2darray(arr ,target);
//     System.out.println(arrays.deepToString(arr));
//   }


//   static void search2darray(int [][]arr ,int target){
//     for (int i = 0; i < arr.length; i++) {
//       for (int j = 0; j < arr[i].length; j++) {
//         if(arr[i][j]==target){
//           System.out.println("index at: "+i+","+j);
//         }
//       }
//     }
//   }
// }



//to count number of digit in element of an array
/**
 * array
 */
// public class array {
//   public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     System.out.println("arr size");
//     int n=in.nextInt();
//     int[] arr = new int[n];
//     System.out.println("element");
//     for (int i = 0; i < arr.length; i++) {
//       arr[i]=in.nextInt();
//     }
//     countdigit(arr);
//   }
//   static void countdigit(int[] arr){
//     int temp=0;
//     int count=0;
//     for (int i = 0; i < arr.length; i++) {
//       temp=arr[i];
//       while(temp>0){
//         temp/=10;
//         count++;
//       }
//       System.out.println(count);
//       count=0;
//     }
//   }
// }






/**
 * array
 */
// public class array {
//   public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     int [][] arr = new int[2][3];
//     for (int i = 0; i < arr.length; i++) {
//       for (int j = 0; j < arr[i].length; j++) {
//         arr[i][j]=in.nextInt();
//       }
//     }
    
//     System.out.println(arrays.deepToString(arr));


//     int count=0;
//     int even=0;
//     int odd=0;
//     for (int i = 0; i < arr.length; i++) {
//       for (int j = 0; j < arr[i].length; j++) {
//         int temp=arr[i][j];
//         while(temp>0){
//           temp/=10;
//           count++;
//         }
//         System.out.println(count);
//         if(count%2==0){
//           even++;
//         }
//         else{
//           odd++;
//         }
//         count=0;
//       }
//     }
//     System.out.println(even+" "+odd);
//   }
// }







//binary search
/**
 * array
 */
// public class array {
//   public static void main(String[] args) {
//     int[] arr={1 , 5 , 6 , 7 , 9 , 10 , 15 , 18 , 20};
//     int target=11;
//     int ans=binarysearch(arr,target);
//     System.out.println(ans);
//   }
//   static int binarysearch(int[] arr, int target){
//     int start=0;
//     int end=arr.length-1;
//     while(start<=end){
//       int mid=(start+end)/2;
//       if(target > arr[mid]){
//         start=mid+1;
//       }
//       else if(target < arr[mid]){
//         end=mid-1;
//       }
//       else{
//         return mid;
//       }
//     }
//     return -1;
//   }
// }






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





//dec binarysearch
/**
 * array
 */
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











//order agnostic in binary search
/**
* array
 */
// public class array {
//   public static void main(String[] args) {
//     //int[] arr = {50,45,42,39,31,30,25,21,10,5,3,1};
//     int[] arr = {1,2,3,3,5,9,15};
//     int target = 5;
//     int start = 0;
//     int end  = arr.length-1;
//     while(start <=end){
//       int mid=(start+end)/2;
//       if(target==arr[mid] ){
//         System.out.println(mid);
//       }
//       //for ass
//       else if(start < end){
//         if(target > arr[mid]){
//           start=mid+1;
//         }
//         else if(target < arr[mid]){
//           end=mid-1;
//         }
//         System.out.println(mid);
//         break;
//       }
//       //
//       else if(start > end){
//         if(target < arr[mid]){
//           start=mid+1;
//         }
//         else if(target > arr[mid]){
//           end=mid-1;
//         }
//         System.out.println(mid);
//         break;
//       }
//       break;
//     }
//   }
// }







  // binarysearch
  /**
   * array
   */
  // public class array {
  //   public static void main(String[] args) {
  //     Scanner in = new Scanner(System.in);
  //     int[] arr = {50,45,42,39,31,30,25,21,10,5,3,1};
  //     int target =in.nextInt();
  //     int start=0,end=arr.length-1;
  //     while(start<=end){
  //       int mid=(start+end)/2;
  //       if(target<arr[mid]){
  //         start=mid-1;
  //       }
  //       else if(target>arr[mid]){
  //         end=mid+1;
  //       }
  //       else{
  //         System.out.println(mid);
  //         break;
  //       }
  //     }
  //   }
  // }


    /**
     * array
     */
    // public class array {
    // public static void main(String[] args) {
    //   Scanner in = new Scanner(System.in);
    //   int[] arr={1,2,3,3,5,9,15,18,20,22};
    //   int target= in.nextInt();
    //   int start=0,end=arr.length-1;
    //   while(start<=end){
    //     int mid=(start+end)/2;
    //     if(target>arr[mid]){
    //       start=mid+1;
    //     }
    //     else if(target<arr[mid]){
    //       end=mid-1;
    //     }
    //     else{
    //       System.out.println(mid);
    //       break;
    //     }
    //   }
    // }
    //}

/**
 * array
 */
// public class array {

//   public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     int[] arr={1,2,3,3,5,9,15,18,20,22};
//     //int[] arr = {50,45,42,39,31,30,25,21,10,5,3,1};
//     int target=in.nextInt();
//     int start =0;
//     int end=arr.length-1;
//     boolean ordAgn= (arr[0] <arr[end]);
//     while(start<=end){
//       int mid=(start+end)/2;
//       if(target==arr[mid]){
//         System.out.println(mid);
//       }
//       else if(ordAgn){
//         if(target<arr[mid]){
//           end=mid+1;
//         }
//         else if(target>arr[mid]){
//           start=mid-1;
//         }
//         System.out.println(mid);
//         break;
//       }
//       else {
//         if(target>arr[mid]){
//           start=mid+1;
//         }
//         else if(target<arr[mid]){
//           end=mid-1;
//         }
//         System.out.println(mid);
//         break;
//       }
//     }
//   }
// }


/**
 * array
 */
// public class array {
//   public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     int[] arr={1,2,3,3,5,9,15,18,20,22};
//     int target = in.nextInt();
//     int start=0,end=arr.length;
//     while(start<=end){
//       int mid=(start+end)/2;
//       if(target<arr[mid]){
//         end=mid-1;
//       }
//       else if(target>arr[mid]){
//         start=mid+1;
//       }
//       else{
//         System.out.println(mid);
//         break;
//       }
//     }
//   }
// }






/**
 * array
 */
// public class array {
//   public static void main(String[] args) {
//     Scanner in= new Scanner(System.in);
//     int[] arr = {50,45,42,39,31,30,25,21,10,5,3,1};
//     int n=in.nextInt();
//     int l=0;
//     int r=arr.length-1;
//     while(l<=r){
//       int m=(l+r)/2;
//       if(n>arr[m]){
//         r=m-1;
//       }
//       else if(n<arr[m]){
//         l=m+1;
//       }
//       else{
//         System.out.println(m);
//         break;
//       }
//     }
//   }
// }




//ceiling of a number
/**
 * array
 */
// public class array {
//   public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     int[] nums = {50,45,42,39,31,30,25,21,10,5,3,1};
//     int t=in.nextInt();
//     System.out.println(CeilingOfnum(nums,t));
//   } 
//   static int CeilingOfnum(int nums[], int t){
//     int s=0;
//     int e=nums.length-1;
//     while(s<=e){
//       int m=(s+e)/2;
//       if(t==nums[m]){
//         return m;
//       }
//       else if(t<nums[m]){
//         s=m+1;
//       }
//       else if(t>nums[m]){
//         e=m-1;
//       }
//     }
//     return s;
//   }
// }




//find a number in infinate array
/**
 * array
 */
// public class array {
//   public static void main(String[] args) {
//     System.out.println("hello");
//     int[] nums={1,2,3,3,5,9,15,18,20,22,24,25,28,29,30};
//     int target=22;
//     int s=0;
//     int e=1;
//     while(target>nums[e]){
//       int temp=e+1;
//       e=e+(e-s+1)*2;
//       s=temp;
//     }
//     find(nums,target,s,e);
//   }
//   static int find(int[] nums,int target,int s,int e ){
//     while(s<=e){
//       int m=(s+e)/2;
//       if(target==nums[m]){
//         System.out.println(m);
//         return m;
//       }
//       else if(target>nums[m]){
//         s=m+1;
//       }
//       else if(target<nums[m]){
//         e=m-1;
//       }
//       else{
//         System.out.println(m);
//       }
//     }
//     return 0;
//   }
// }





//peak in array
/**
 * array
 */
// public class array {
//   public static void main(String[] args) {
//     int[] nums={2,3,5,6,7,8,7,6,5,4,3,2,1};
//     int s=0;
//     int e=nums.length-1;
//     while(s<e){
//       int m=(s+e)/2;
//       if(nums[m]>nums[m+1]){
//         e=m;
//       }
//       else{
//         s=m+1;
//       }
//     }
//     System.out.println(s);
//   }
// }





/**
 * array
 */
// public class array {
//   public static void main(String[] args) {
//     int[] arr={2,3,5,6,7,8,7,6,5,4,3,2,1};
//     int s=0;
//     int e=arr.length-1;
//     while(s<e){
//       int  m=(s+e)/2;
//       if(arr[m]>arr[m+1]){
//         e=m;        
//       }
//       else{
//         s=m+1;
//       }
//     }
//     System.out.println(arr[s]);
//   }
// }





/**
 * array
 */
// public class array {
//   public static void main(String[] args) {
//     int[][] arr={
//       {10, 20, 30, 40},
//       {15, 25, 35, 45},
//       {28, 29, 37, 49},
//       {33, 34, 38, 50}
//     };
//     int target=37;
//     System.out.println(searchInMatrix(arr, target));
//     System.out.println(Arrays.toString(searchInMatrix(arr, target)));
//   }
//   static int[] searchInMatrix(int[][] martix, int target){
//     int r=0;
//     int c=martix.length-1;
//     while(r<martix.length && c>=0){
//       if(martix[r][c] == target){
//         return new int[]{r,c};
//       } 
//       else if(martix[r][c]<target){
//         r++;
//       }
//       else{
//         c--;
//       }
//     }
//     return new int[]{-1,-1};
//   }
// }






/**
 * array
 */
public class array {

  public static void main(String[] args) {
    System.out.println("hello");
    
  }
}