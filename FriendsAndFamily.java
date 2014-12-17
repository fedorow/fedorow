import java.util.Scanner;
import java.io.PrintStream;

public class FriendsAndFamily {
	public static void main(String[] args){
Scanner input = new  Scanner(System.in);
//char q;
//Scanner close=new Scanner(System.exit(q));
int discount1;

do {
	System.out.println("\n Enter list prise:");
	double listPrice=input.nextDouble();
	//try{typeOf listPriace!=double}
	if( listPrice== 1000) break;
	
    System.out.println("\n Enter discount %:");
    int discount = input.nextInt();
    discount1=discount;
    System.out.println("you have to pay:"+
    		
    		(-listPrice*discount/100+listPrice));
    Object pay=new Double(-listPrice*discount/100+listPrice);
    Object pay1=new Integer((int)listPrice*discount/100);
    Object []  Pay = new Object [2];
    Pay[0]=pay;
    Pay[1]=pay1;
        System.out.printf("You have to pay only  $%.2f \nYou saved $%d   ", Pay);
        	
        		
	
}while(discount1 <30);
input.close();
System.out.println("\n Sorry , we don't do such discount");
System.out.println("\n File chenched in Git");





}
}
 