package mainprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import booking.BookDAO;

import booking.Bookservice;
import dealer.Dealer;
import vehicle.Vehicle;

public class Main {
	public static int checkmobileno()
	{
		System.out.println("Enter your Phonenumber");
		 Scanner s=new Scanner(System.in);
		long phne=s.nextLong();
		String phno=Long.toString(phne);
		 String regex = "[6-9][0-9]{9}";
	     if(phno.matches(regex))
	      {
	    	  return 1;
	      }
	     
	      else
	      { 
	    	  System.out.println("Invalid Mobile no..Do it again.");
	    	  checkmobileno();
	      }
		return (int) phne;
	   	
	}
	public static String checkemailid()
	{
		System.out.println("Enter your mailid");
		Scanner s=new Scanner(System.in);
		String email=s.next();
		
		 String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[.]+[a-z]+$";
	     if(email.matches(regex))
	      {
	    	  return " ";
	      }
	     
	      else
	      { 
	    	  System.out.println("Invalid Email id..Do it again.");
	    	  checkemailid();
	      }
		return  email;
	     
		
	}

	public static void main(String[] args) throws Exception {
		System.out.println("*************************************************");
		System.out.println("Welcome to E vehicle Showroom!!!");
		System.out.println("*************************************************");
		System.out.println("Please Login to proceed further!...");
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("");
		System.out.println("1.Dealer");
		System.out.println("2.Customer");
		
		System.out.println("Enter Your choice..");
		
		Scanner s=new Scanner(System.in);
		int ch=s.nextInt();
		switch(ch) {

			
//dealer			
		case 1:
			System.out.println("***Dealer***");
			Scanner s1=new Scanner(System.in);
			Dealer dealer = new Dealer();
		
			System.out.println("Enter 1 to display customer details..");
			System.out.println("Enter 2 to display the specific customer details..");
			System.out.println("Enter your choice:");
			int ch1=s1.nextInt();
			switch(ch1)
			
			{
			case 1:
				ArrayList<String> q=dealer.displaycustomer();
				Iterator<String> i=q.iterator();
				while (i.hasNext())
				{
					System.out.println(i.next());
					
				}
				break;
			case 2:
				System.out.println("Enter the order id:");
				int orderid = s1.nextInt();
				ArrayList<String> e=dealer.getdetailsbyid(orderid);
				Iterator<String> i1=e.iterator();
				while (i1.hasNext())
				{
					System.out.println(i1.next());
					
				}
				break;
			}
			break;
			
			
//customer			
		case 2	:
			System.out.println("**Customer***");
			Scanner s2=new Scanner(System.in);
			Vehicle v=new Vehicle();
			System.out.println("Enter 1 for TwoWheeler..");
			System.out.println("Enter 2 for FourWheeler..");
			System.out.println("Enter Your Choice..");
			int ch2=s2.nextInt();
			
			switch(ch2)
			{
			case 1:
				
				ArrayList<String> q=v.twowheeler();
				Iterator<String> i=q.iterator();
				while (i.hasNext())
				{
					System.out.println(i.next());
					
				}
				break;
				case 2:
					ArrayList<String> e=v.fourwheeler();
					Iterator<String> i1=e.iterator();
					while (i1.hasNext())
					{
						System.out.println(i1.next());
						
					}
					break;
					default:
						System.out.println("Enter the Correct Choice");
			}
			
			System.out.println("---------------------------------------------------------------------------------");
			
			System.out.println("Enter 1 if u want to book vehicle...");
			System.out.println("Press any number  to logout..");
			Scanner s3=new Scanner(System.in);
			
			int ch5= s3.nextInt();
			if(ch5==1)
			{
				Bookservice book=new Bookservice();
				Scanner s4=new Scanner(System.in);
				System.out.println("Going to booking page..");
				System.out.println("enter your vehicle id to be booked");
				int vehicleid=s4.nextInt();
				
				System.out.println("Enter your Name..");
				String name=s4.next();
				

				
				 int phne=checkmobileno();
				String email=checkemailid();
				  
			      		 
				System.out.println("enter your address");
				String address=s4.next();
				
				
				
				book.addbookingservice(vehicleid,name,email,phne,address);
				System.out.println("Booked Succesfully");
				int amt=book.calculation(vehicleid);
				System.out.println("The Net charges..."+amt);
				System.out.println("Payment to be paid on delivery");
				System.out.println("Your Order details will be sent to Your Mail Id by Your Dealer...Thank You!");
				
			}
			else
			{
				System.out.println("Thank you!!!! Visit again.....");
			}
			break;
		default:
			System.out.println("Enter correct choice");
			
			
		}
 
	}

}
