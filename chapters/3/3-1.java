//����3-1
class Customer {
    /* ˵���������μ�������ʵ��
    */
    public static void main(String [] args) {
        Customer customer = new Customer();
        String name = "John Smith";
        {
            // ����˵���ǷǷ���
            String name = "Tom David";
            customer.name = name;
            System.out.println(
                    "The customer's name: " + customer.name);
        }
    }
    private String name;
}
