package com.bilgeadam.melih.lesson19;

import java.util.Stack;

import com.bilgeadam.BAUtils.BAUtils;

public class RomanNumerals2Integer {

	static Stack<Character> stack = new Stack<Character>();
	public static void main(String[] args) {
		String roman = BAUtils.readString("Bir Roma Rakamı Giriniz: (I, V, X, L, D, C, M)");
		int integer = convert(roman);
		System.out.println(integer);
	}

	private static int convert(String roman) {
		int  retVal =0;
		for (int i = 0; i < roman.length(); i++) {
			stack.push(roman.charAt(i));
		}
		while (!stack.empty()) {
			int popped = convert(stack.pop());
			int peeked = 0 ;
			if (!stack.empty()) {
			peeked = convert(stack.peek());
			}
			int num = calcNumber(popped, peeked);
			if (num>0)
			retVal += num;
		}
		return retVal;
	}

	private static int convert(Character romanValue) {
		int intvalue = switch (romanValue) {
		case 'I': {
			
			yield 1;
		}
		case 'V': {
			
			yield 5;
		}
		case 'X': {
			
			yield 10;
		}
		case 'L': {
			
			yield 50;
		}
		case 'C': {
			
			yield 100;
		}
		case 'D': {
			
			yield 500;
		}
		case 'M': {
			
			yield 1000;
		}
		default:
			yield -10000;
		};
		return intvalue;
	}

	private static int calcNumber(int popped, int peeked) {
		int retVal = popped;
		if (popped >peeked && peeked !=0) {
			retVal = popped - peeked;
			stack.pop();
		} 
		return retVal;
	}
}
