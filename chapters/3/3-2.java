//程序3-2
class Customer {
    /* 说明变量屏蔽及作用域实例
    */
    public static void main(String [] args) {
        Customer customer = new Customer();
        String name = "John Smith";
        {
            name = "Tom David";
            customer.name = name;
            System.out.println(
                    "The customer's name: " + customer.name);
        }
    }
    private String name;+
}
