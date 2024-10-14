package exception_;

class Test06{
	public void test1() {
		System.out.println(11111);
		test2();
	
	}
	public void test2() {
		System.out.println(22222);
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Ex06 {
	public static void main(String[] args) {
		Test06 t=new Test06();
		t.test1();	
	}

}
