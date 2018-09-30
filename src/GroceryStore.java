import java.util.Scanner;
public class GroceryStore{
    public static void main(String[]args){
    
    String veg;
    double p=0 ,Potatoe=6,Onione=3 ,Tomatoe=8,Grape=0.89 ,Mango=4 ,Orange=10,Chicken=135,Salmon=286,Egg=30,Milk=12,Bread=5,Towel=15,Soap=34;
    
    
    Scanner input = new Scanner(System.in);
    OrderManage bag =new OrderManage();
    System.out.println("Hello This is A&L Grocery Store..\nto start enter Y");
    char cont = input.next().charAt(0);
    if(!(cont+"").toLowerCase().equals("y"))
    {System.out.println("Invalid Entry Run the program Again");
      System.exit(0);}
    while((cont +"").toLowerCase().equals("y")){
    System.out.println("Now choose the category you wish to purchase from \n *please write the corresponding letter .. \n a.Vegetables and Fruits. \n b.Meat. \n c.Dairy. \n d.Household.");
    char cate = input.next().charAt(0);
//-------------------------------------Vegetables and Fruits--------------------------------    
    if((cate +"").toLowerCase().equals("a"))
    {
     System.out.println("Choose from the list below \n a.Potatoe.6 SR/Kg \n b.Onione.3 SR/Kg \n c.Tomatoe.8 SR/Kg \n d.Grape.0.89 SR/Kg \n e.Mango.4 SR/Kg");
     char x = input.next().charAt(0);
     System.out.println("How many kilograms you want?");
     int kg = input.nextInt();
     
     if(kg==0 || kg<0)
         System.out.println("Invalid entey");//break statment is needed here.
         
     else{
     
     if((x+"").toLowerCase().equals("a")){
         
         for(int i=kg;i>=1;--i)
             p+=Potatoe;
             bag.addToBag(p,"POTATOE");
     System.out.println(kg+" kilograms of Potatoe are added to your basket (Order total:"+p+" SR)");        
         
    }
    else if((x+"").toLowerCase().equals("b")){
         

         for(int i=kg;i>=1;--i)
             p+=Onione;
             bag.addToBag(p,"ONIONE");
     System.out.println(kg+" kilograms of Onione are added to your basket (Order total:"+p+" SR)");
    }        
         

        else if((x+"").toLowerCase().equals("c")){
         
         for(int i=kg;i>=1;--i)
             p+=Tomatoe;
             bag.addToBag(p,"TOMATOS");
     System.out.println(kg+" kilograms of Tomatos are add to your basket (Order total:"+p+" SR)");        
         
    }
        else if((x+"").toLowerCase().equals("d")){
         
         for(int i=kg;i>=1;--i)
             p+=Grape;
             bag.addToBag(p,"GRAPES");
     System.out.println(kg+" kilograms of Grape are add to your basket (Order total:"+p+" SR)");        
         
    }
    else if((x+"").toLowerCase().equals("e")){
         
         for(int i=kg;i>=1;--i)
             p+=Mango;
             bag.addToBag(p,"MANGO");
     System.out.println(kg+" kilograms of Mango are added to your basket (Order total:"+p+" SR)");        
         
    }
        else
            System.out.println("you have enterd a wrong letter");
    }
     }
//-------------------------------------Meat--------------------------------
    else if((cate +"").toLowerCase().equals("b"))
    {
     System.out.println("Choose from the list below \n a.Frozen Chicken. (450 gm Carton 135 SR) \n b.Salmon Fish. (450 gm Carton 286 SR) ");
     char x = input.next().charAt(0);
     System.out.println("How many Cartons you want?");
     int c = input.nextInt();
     
     if(c==0 || c<0)
         System.out.println("Invalid entey");//break statment is needed here.
         
     else{
     
     if((x+"").toLowerCase().equals("a")){
         
         for(int i=c;i>=1;--i)
             p+=Chicken;
             bag.addToBag(p,"CHICKEN");
     System.out.println(c+" Cartons of Chicken are added to your basket (Order total:"+p+" SR)");        
         
    }
         else if((x+"").toLowerCase().equals("b")){
         
         for(int i=c;i>=1;--i)
             p+=Salmon;
             bag.addToBag(p,"SALMON");
     System.out.println(c+" Cartons of Salmon Fish are added to your basket (Order total:"+p+" SR)");        
         
    }
        else
            System.out.println("you have enterd a wrong letter");
    }
}
//-------------------------------------Dairy--------------------------------
    else if((cate +"").toLowerCase().equals("c"))
    {
     System.out.println("Choose from the list below \n a.Eggs. (6 pcs 30 SR) \n b.Milk. (1 ltr Carton 12 SR) \n c.Bread. (400 gm 5 SR)");
     char x = input.next().charAt(0);
     System.out.println("How many packs?");
     int c = input.nextInt();
     
     if(c==0 || c<0)
         System.out.println("Invalid entey");//break statment is needed here.
         
     else{
     
     if((x+"").toLowerCase().equals("a")){
         
         for(int i=c;i>=1;--i)
             p+=Egg;
             bag.addToBag(p,"EGGS");
     System.out.println((6*c)+" pcs of Eggs are added to your basket (Order total:"+p+" SR)");        
         
    }
    else if((x+"").toLowerCase().equals("b")){
         
         for(int i=c;i>=1;--i)
             p+=Milk;
             bag.addToBag(p,"MILK");
     System.out.println(c+" Cartons of Milk are added to your basket (Order total:"+p+" SR)");        
         
    }
   else if((x+"").toLowerCase().equals("c")){
         
         for(int i=c;i>=1;--i)
             p+=Bread;
             bag.addToBag(p,"BREAD");
     System.out.println((400*c)+" gm of Bread are added to your basket (Order total:"+p+" SR)");        
         
    }
    else
        System.out.println("you have enterd a wrong letter");
    }
    }
//-----------------------------------Household------------------------
    else if((cate +"").toLowerCase().equals("d"))
    {
     System.out.println("Choose from the list below \n a.Hand Towel. (3 pcs 15 SR) \n b.Soap (3 Bars 34 SR)");
     char x = input.next().charAt(0);
     System.out.println("How many packs?");
     int c = input.nextInt();
     
     if(c==0 || c<0)
         System.out.println("Invalid entey");//break statment is needed here.
         
     else{
     
     if((x+"").toLowerCase().equals("a")){
         
         for(int i=c;i>=1;--i)
             p+=Towel;
             bag.addToBag(p,"HANDTOWEL");
     System.out.println((3*c)+" pcs of Hand Towel are added to your basket (Order total:"+p+" SR)");        
         
    }
    else if((x+"").toLowerCase().equals("b")){
         
         for(int i=c;i>=1;--i)
             p+=Soap;
             bag.addToBag(p,"SAOP");
     System.out.println((3*c)+"  Bars of Saop are added to your basket (Order total:"+p+" SR)");        
         
    }

    else
        System.out.println("you have enterd a wrong letter");
    }
    }
    else
    System.out.println("you have enterd a wrong letter");
    System.out.println("\n If you wish to continue shopping and go back to home enter Y \nto proceed to checkout and view your cart enter anything else");
     cont = input.next().charAt(0);
    }

    
    	bag.viewCart();
    System.out.println("Total price is: "+bag.total());
    System.out.println("\n If you want to Delete any item from your bag enter D if not enter anything else");
     char del = input.next().charAt(0);
     while((del +"").toLowerCase().equals("d")){
         System.out.println("Corrctly enter the name of the item you wish to delet from your bag ");
         String itemp= input.next();
         bag.deleteItem(itemp.toUpperCase());
         System.out.println(" If you want to Delete another item from your bag enter D if not enter anything else");
        del = input.next().charAt(0);
     }
     if(!(del+"").toLowerCase().equals("d"))
     {  System.out.println("\nIf you have a voucher please enter it to get a dicount if not just enter anything:\nnote:free welcoming voucher ;)\t AL10");
     String dicountCode = input.next();
     System.out.print("Total price after discount is: "+bag.discount(dicountCode));}
    System.out.println("\nThank you for choosing A&L");
//---

}
}