public class Demo09{
    public static void main(String[] args){
        OrderRepository sqlrepo=new SqlOrderRepository();
        OrderController sqlcontroller=new OrderController(sqlrepo);
        sqlcontroller.create("ORD-1");        
        OrderRepository memrepo=new MemoryOrderRepository();
        OrderController memcontroller=new OrderController(memrepo);
        memcontroller.create("ORD-2");
    }
}
