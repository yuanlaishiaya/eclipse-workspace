package com.sypower.javatest001;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int len=nums.length;
		Map<Integer, Integer> hashMap=new HashMap<>();
		hashMap.put(nums[0], 0);
		for(int i=1;i<len;i++) {
			if(hashMap.containsKey(target-nums[i])) {
				return new int[] {i,hashMap.get(target-nums[i])};
			}
			hashMap.put(nums[i], i);//哈希表中nums[i]为key,i为value。
		}
		return new int[0];
	}

}
