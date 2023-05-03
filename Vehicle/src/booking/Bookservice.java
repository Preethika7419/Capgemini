package booking;



import booking.Bookbean;

public class Bookservice {
	public int addbookingservice(int vehicleid,String name,String email,long phne,String address)
	{
		BookDAO bk=new BookDAO();
		Bookbean bb=new Bookbean();
		bb.setVehicleid(vehicleid);
		bb.setName(name);
		bb.setEmail(email);
		bb.setPhne(phne);
		bb.setAddress(address);
		
		int result=0;
		 try
		 {
			 result = bk.addbooking(bb);
			 return result;
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.toString());
			 return 0;
		 }
		
		
				
	}
	public int calculation(int vehicleid) throws Exception
	
	{
		BookDAO bk=new BookDAO();
		  int amt=bk.calculate(vehicleid);
		  int gst=7/100*amt;
			int mis_charges=2000;
			int tax=1/100*amt;
			int rto=(int) (2.5/100*amt);
			int netamt=gst+mis_charges+tax+rto+amt;
			
			return netamt;
		 
			
		
		
		
	}


}
