package dealer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import db.DbConnection;

public class Dealer {
	public ArrayList<String> displaycustomer()throws Exception
	{
		Connection conn = null;
		  PreparedStatement pstmt = null;
		  ResultSet rs = null;
		  
			 conn=DbConnection.getConnection(); 
			 String ww ="select * from booking ";
			 pstmt = conn.prepareStatement(ww); 
			rs = pstmt.executeQuery();
			
			 ArrayList<String> result = new ArrayList<String>();
				
				while(rs.next())
					 {
					int i1 = rs.getInt(1);
					String s1=rs.getString(2);
					String s2=rs.getString(3);
					long s3=rs.getLong(4);
					String s4 = rs.getString(5);
					
					String s5=" vehicleid:" +i1+"Name : " +s1 + " Email : " +s2+ " Phno : " +s3+ " Address:" +s4  ;
					 result.add(s5);   
					
					 }

		return result;
		
	}

	public ArrayList<String> getdetailsbyid(int orderid)throws Exception
	{
		Connection con = null;
		  PreparedStatement pstmt = null;
		  ResultSet rs = null;
		  con=DbConnection.getConnection(); 
				 String ww ="select *  from booking where oid=?";
				  pstmt = con.prepareStatement(ww); 
				  pstmt.setInt(1,orderid); 
				  rs = pstmt.executeQuery();
				  ArrayList<String> result = new ArrayList<String>();
					
					while(rs.next())
						 {
						int i1 = rs.getInt(1);
						String s1=rs.getString(2);
						String s2=rs.getString(3);
						long s3=rs.getLong(4);
						String s4 = rs.getString(5);
						
						
						
						String s5=" vehicleid:" +i1+"Name : " +s1 + " Email : " +s2+ " Phno : " +s3+ " Address:" +s4  ;
						 result.add(s5);  
						
						 }
					return result;
					
				  
	}	  	

}
