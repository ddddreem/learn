package com.pj.git.HelloGit.structure;

import org.junit.Test;

/**
 * @program: git_workspace
 * @description: 运行测试用例
 * @author: Peng
 * @create: 2022-01-12  11:22
 **/
public class test {
    @Test
    public void testTwoSum(){
        int nums[] = {2, 3, 4};
        int target = 6;
        int result[] = TwoSum.twoSum(nums, nums.length, target, 2);
        System.out.println("[ " + result[0] + ", " + result[1] + " ]");
    }
    @Test
    public void testTwoSum1_0(){
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int result[] = TwoSum.twoSum(nums, nums.length, target, 2);
        System.out.println("[ " + result[0] + ", " + result[1] + " ]");
    }
}
