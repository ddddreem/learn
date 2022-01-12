package com.pj.git.HelloGit.structure;

/**
 * @program: git_workspace
 * @description: 两数之和
 * @author: Peng
 * @create: 2022-01-12  10:45
 **/
public class TwoSum {
    public static int[] twoSum(int[] nums, int numSize, int target, int returnSize){
        int result[] = null;
        int mid, low = 0, high = numSize;
        while(low < high){
            mid = (low + high)/2;
            if(nums[mid] == target) return null;
            else if(nums[mid] > target) low = mid + 1;
            else high = mid - 1;
        }
        for(int i = low - 1; i >= 0; i--)
            for(int j = i -1; j >= 0; j--)
                if((nums[i] + nums[j]) == target){
                    result = new int[returnSize];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
        return result;
    }
}
