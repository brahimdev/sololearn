package com.sololearn.karperkars;

import java.util.Arrays;

public class KaprekarsConst
{
	public boolean isRepetitive (int num) {
		char[] numarr = (num+"").toCharArray();
		Arrays.sort(numarr);
		int count = 0;
		if (numarr.length == 4) {
			for (int i = 1; i < numarr.length; i++) {
				if (numarr[i] == numarr[i-1] && count == 2) {
					System.out.println("Four symbols.\nThree or more repetitions.");
					return false;
				}
				else if (numarr[i] == numarr[i-1]) {
					count += 1;
				}
			}
		}
		if (numarr.length == 3) {
			for (int i = 1; i < numarr.length; i++) {
				if (numarr[i] == numarr[i-1]) {
					System.out.println("Three symbols.\nTwo repetitions.");
					return false;
				}
			}
		}
		System.out.println("Go on.");
		return true;
	}
	public int Operation(int num) {
		char[] array = (num+"").toCharArray();
		if (array.length == 3) {
			char[] newArray = new char[4];
			for (int i = 0; i < 3; i ++) {
				newArray[i] = array[i];
			}
			newArray[3] = '0';
			System.out.println(newArray);
			array = newArray;
		}
		Arrays.sort(array);
		String numStr = new String(array);
		String reversedNum = new StringBuffer(numStr).reverse().toString();
		int result = Integer.parseInt(reversedNum) - Integer.parseInt(numStr);
		System.out.println(reversedNum +"-"+ numStr + "= " + result);
		return result;
	}
	
    public static void main(String[] args) {
        KaprekarsConst kp = new KaprekarsConst();
        int num = 1423;
        if (kp.isRepetitive(num) == true) {
	        while (num != 6174) {
	        	num = kp.Operation(num);
	        }
        }
    }
}