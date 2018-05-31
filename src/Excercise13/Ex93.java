package Excercise13;

public class Ex93 {
	
	public void main() {
		String s = "((3 + 7) * 2)";
		String h = "(3 + 7) * 2)";
		String t = "((3 + 7) * 2";
		System.out.println(fun1(s));
		System.out.println(fun1(h));
		System.out.println(fun1(t));
	
	}
	public int fun1(String aux) {
		
		int count = 0;
		for (int i = 0; i < aux.length(); i++) {
		char c = aux.charAt(i);
		if (c == '(') {
			count++;
			} 	
		else if (c == ')') {
			count--;
			}
		}
		return count;
		
	}
}
