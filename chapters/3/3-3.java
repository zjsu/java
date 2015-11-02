//程序3-3
class Customer {
/* 说明变量屏蔽及作用域实例
*/
	public static void main(String [] args) {
		Customer customer = new Customer();
		{	String name = "Tom David";	//第6行
			customer.name = name;
			System.out.println("The customer's name: " + customer.name);
		}
		// 下面的再说明是正确的
		String name = "John Smith";		//第11行	
		customer.name = name;
		System.out.println(
			"The customer's name: " + customer.name);
	}
	private String name;
}
