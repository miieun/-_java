package inheritance_;

import java.util.ArrayList;

class Test01{
	public ArrayList<String> arr;
	public Test01() {
		arr=new ArrayList<String>();
	}
}
public class Ex01 {
public static void main(String[] args) {
	Test01 t= new Test01();
	t.arr.add("aaa");
	System.out.println(t.arr.get(0));
}
}
