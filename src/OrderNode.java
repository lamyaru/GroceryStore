public class OrderNode
{
	
    public double price;
    public String item;
    public OrderNode next;
    
    public OrderNode(double a,String b)
        {
            this(a,b,null);
    }
    public OrderNode(double a,String b,OrderNode c)
        {
            price= a;
            item =b;
            next=c;
                }
}