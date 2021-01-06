public class threadtest {
	int variable = 5;
	public static void main(String args[]) {
		threadtest obj = new threadtest();
		obj.method(20);
		obj.method();
	}
	void method(int variable) {
		variable = 10;
		System.out.println("Value of variable :" + this.variable);
	}
	void method() {
		int variable = 40;
		System.out.println("Value of variable :" + this.variable);
	}
}