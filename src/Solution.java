import java.util.Arrays;

// /**
//  * Solution
//  */
// public class Solution {
//     public static void main(String[] args) {
//         int [][] accounts={
//             {1,2,3},
//             {3,2,1}
//         };
//         int temp=0;
//         int ans=0;
//         for(int i=0; i<accounts.length; i++){
//             temp=0;
//             for(int j=0; j<accounts[i].length; j++){
//                 temp+=accounts[i][j];
//             }
//             if(temp>ans){
//                 ans=temp;
//             }
//         }
//         System.out.println(ans);
//     }
// }





// 2. [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
/**
 * Solution
 */
// public class Solution {

//     public static void main(String[] args) {
//         int[] nums = {1,2,1};
//         int n=nums.length;
//         int[] ans=new int[n*2];
//         for (int i = 0; i < n; i++) {
//             ans[i]=nums[i];
//             ans[i+n]=nums[i];
//         }
//         System.out.println(Arrays.toString(ans));
//     }
// }





// class Solution {
//     public static void main(String[] args){
//         char[] letters={'c','f','j'};
//         char target = 'a';
//         System.out.println(nextGreatestLetter(letters,target));
//     }
//     static char nextGreatestLetter(char[] letters, char target) {
//         int s=0;
//         int e=letters.length-1;
//         while(s<e){
//             int m=(s+e)/2;
//             if(target<letters[m]){
//                 e=m-1;
//             }
//             else {
//                 s=m+1; 
//             }
//         }
//         return letters[s%letters.length];
//     }
// }





/**
 * Solution
 */
// public class Solution {
//     public static void main(String[] args) {
//         int[] nums={2,7,11,15};
//         int target=18;
//         // System.out.println(TwoSum(nums,target));
//         TwoSum(nums, target);
//     }
//     static int[] TwoSum(int[] nums,int target){
//         int[] ans={0,0};
//         int temp=0;
//         for(int i=0;i<nums.length;i++){
//             temp=temp+nums[i];
//             if(temp==target){
//                 ans[0]=i-1;
//                 ans[1]=i;
//             }
//             else if(i!=0){
//                 temp-=nums[i];
//             }
//             System.out.println(Arrays.toString(ans));
//         }
//         return ans;
//     }
// }






// /**
//  * Solution
//  */
// public class Solution {
//     public static void main(String[] args) {
//         int[] nums={2,7,11,15};
//         int target = 9;
//         Twosum(nums,target);
//     }
//     static int[] Twosum(int[] nums , int target){
//         int[] ans={-1,-1};
//         for (int i = 0; i < nums.length-1; i++) {
//             for (int j = i+1; j < nums.length-1; j++) {
//                 if(target==nums[i]+nums[j]){
//                     ans[0]=i;
//                     ans[1]=j;
//                 }
//                 System.out.println(Arrays.toString(ans));
//             }
//         }
//         return ans;
//     }
// }