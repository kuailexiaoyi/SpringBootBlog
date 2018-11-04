package com.springboot.mybatis.plus;

//@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
//        int[] nums = {1,2,3};
//        rotate(nums,1);
//        for (int i:nums){
//            System.out.println(i);
//        }
	}

	public static void rotate(int[] nums, int k) {
        int len = nums.length;

        while (k > 0){
            int t = 0;
            t = nums[len-1];
            for(int i = len-2;i>=0;i--) {
                nums[i+1] = nums[i];
            }
            nums[0]=t;
            k--;
        }
	}
}
