public class OrderManage{
    public OrderNode first,last;
    
    public OrderManage(){
        first= last = null;
    }
    public boolean isBagEmpty(){
        return first == null;
    }
    
        public void addToBag(double price,String item){ //last in will be first.
    
        first = new OrderNode(price,item ,first );
        if (last ==null)
            last=first;
    }
    
    public double total()
    {    double total=0;
        for(OrderNode t =first; t!=null; t=t.next)
            total+=t.price;
            if(total!=0)
                return total ;

        else
            System.out.println("sorry ..your bag is empty");
            return 0;            
            
    }
    
    public double discount(String code){
    	total();
    	if(code.equals("AL10"))
    		return total()-(total()*0.10);
    	
    	else if(code.equals("AL20"))
    		return total()-(total()*0.20);
    	
    	else if(code.equals("AL30"))
    		return total()-(total()*0.30);
    	else
    		return total();
    }
    
    public void deleteItem(String item){ //detet passed item and print the total price after deleting.
        if(isBagEmpty())
            System.out.println("sorry ..your bag is empty");
            else
            {
                if(first==last&& first.item.equals(item))
                    first=last=null;
                    else if(first.item.equals(item))
                        first=first.next;
                        else
                        {
                            OrderNode p,t;
                            for(p=first,t=first.next;t!=null && !t.item.equals(item);p=p.next, t=t.next);
                        
                           if(t==null)
                               System.out.print(item+" not found");
                               else
                               {
                                   p.next=t.next;
                                   if(last==t){
                                   
                                       last=p;
                                       last.next=null;
                                   }
                               }
                        }
            } 
            
        double total=0;
        for(OrderNode t =first; t!=null; t=t.next)
            total+=t.price;
        
            System.out.println("your Order Total after deleting: " +total+" SR");
        }
    
    public void viewCart(){
    	System.out.println("Your Cart:\n");
    	for(OrderNode t =first; t!=null; t=t.next)
    	{System.out.println("- "+t.item+"\tprice = "+t.price);
    	}
    }
    
    
}