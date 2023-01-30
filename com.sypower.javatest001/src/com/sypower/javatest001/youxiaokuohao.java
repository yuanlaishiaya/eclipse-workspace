package com.sypower.javatest001;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

import java.util.LinkedList;


/*
 * 1、判断字符串是否为偶数，不是偶数就肯定为false
 * 2、创建哈希表映射，键为右括号，值为左括号插入哈希表
 * 3、创建栈，遍历s字符串
 * 4、如果哈希表的键为true，，
 *    即右括号存在，判断栈是否为空，或者栈顶元素是否和哈希表中对应的值相等
 *              如果栈为空或者栈顶元素和哈希表中的value不等，返回false，说明错误
 *       否则为匹配，执行出栈
 * 5、否则为假，即为左括号，将左括号压入栈
 * 6、最终返回空栈
 * 
 */

public class youxiaokuohao {
	public boolean isValid(String s) {
		int n = s.length();
		if(n%2==1) {
			return false;			//判断字符串长度是否为偶数，不是偶数则肯定无效
		}
		
		Map<Character,Character> pairs=new HashMap<Character,Character>() {{
		put(')','(');
		put(']','[');
		put('}','{');
		}};      //创建哈希表，存储括号
		Deque<Character> stack=new LinkedList<Character>();  //创建栈
		for(int i=0;i<n;i++) {
			char ch=s.charAt(i);
			if(pairs.containsKey(ch)) {
				if(pairs.isEmpty()||stack.peek()!=pairs.get(ch)) {
					return false;
				}
				stack.pop();
			}
			else {
				stack.push(ch);  //哈希表中对应的）]}没有，那就是说只有左括号，将左括号压入栈
			}
			
		
		}
		return stack.isEmpty();
		
		
	}

}
