//����3-3
class Customer {
/* ˵���������μ�������ʵ��
*/
	public static void main(String [] args) {
		Customer customer = new Customer();
		{	String name = "Tom David";	//��6��
			customer.name = name;
			System.out.println("The customer's name: " + customer.name);
		}
		// �������˵������ȷ��
		String name = "John Smith";		//��11��	
		customer.name = name;
		System.out.println(
			"The customer's name: " + customer.name);
	}
	private String name;
}
