//程序3-1
class Customer {
    /* 说明变量屏蔽及作用域实例
    */
    public static void main(String [] args) {
        Customer customer = new Customer();
        String name = "John Smith";
        {
            // 下列说明是非法的
            String name = "Tom David";
            customer.name = name;
            System.out.println(
                    "The customer's name: " + customer.name);
        }
    }
    private String name;
}
