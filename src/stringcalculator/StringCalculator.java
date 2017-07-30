package stringcalculator;

import java.util.Scanner;

public class StringCalculator {
	String inputStr() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}
	
	String processStr(String str) {
		if(str.contains(":") || str.contains(",")) {
			return basicProcessStr(str);
		} else if(str.contains("//") && str.contains("\n")) {
			return customProcessStr(str);
		} else return "";
	}
	
	String customProcessStr(String str) {
		if(str.contains("//") && str.contains("\n")) {
			String[] strArr = str.split("\n");
			String splitor = strArr[0].replaceAll("//", "");
			String temp = strArr[1];
			return strSpliter(temp, splitor);
		} else return "";
	}
	
	String basicProcessStr(String str) {
		if(str.contains(":")) {
			return strSpliter(str, ":");
		} else if(str.contains(",")) {
			return strSpliter(str, ",");
		} else {
			return "";
		}
	}
	
	String strSpliter(String str, String splitStr) {
		int result = 0;
		String[] strArr = str.split(splitStr);
		for(String temp : strArr) {
			result += Integer.parseInt(temp); 
		}
		return result + "";
	}
}
