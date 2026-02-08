// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// import java.util.Arrays;

// class P1 {
//     public int[] twoSum(int[] nums, int target) {

//       for(int i = 0; i<nums.length;i++){
//         for(int j = i+1;j<nums.length;j++){
//           if(target == nums[i]+nums[j]){
//             return new int[] {i,j};
            

//           }
         
//         }
//       }
//       return new int[]{-1,-1};
        
//     }

//     public static void main(String[] args) {
//       int[] nums = {3,2,4};
//       int target = 6;
//       P1 p = new P1();
//       int[] x = p.twoSum(nums,target);
//       System.out.println(Arrays.toString(x));
     


//     }
// }

import java.util.Arrays;
import java.util.HashMap;

class P1{
  public int[] twoSum(int[] nums, int target){
    
    HashMap<Integer,Integer> e = new HashMap<>();
    for(int i = 0; i<nums.length;i++){
      int no = target - nums[i];
      if(e.containsKey(no)){
        return new int[] {e.get(no), i};
      }
      else{
        e.put(nums[i], i);
      }
    }

    return new int[] {-1,-1};
    

  }
  public static void main(String[] args) {

    int[] nums = {1,2,3,4};
    int target = 3;
    P1 p = new P1();

    int[] x = p.twoSum(nums, target);
    System.out.println(Arrays.toString(x));
    
  }
}

