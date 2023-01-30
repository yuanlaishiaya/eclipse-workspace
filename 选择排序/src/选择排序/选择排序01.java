package 选择排序;
import java.util.*;

/*
 * 找到数组中的最小值
 * 将它和数组的第一个元素交换位置
 * 在剩下的元素中找到最小元素
 * 与数组的第二个元素交换位置
 * 如此往返。。。。。。
 */

public class 选择排序01 {
	public static void sort(Comparable[] a) {
		int N = a.length ;       // 数组长度
		for(int i = 0;i<N; i++) {
			//外循环开始遍历数组每个元素
			int min = i;    //每次遍历部位的为最小位置索引
			for(int j = i+1 ; j<N ; j++) {
				//内循环为比较当前元素与目前已知最小元素
				if(less(a[j], a[min])) min = j ;
			}
		each(a , i , min);
		}
	}

}
