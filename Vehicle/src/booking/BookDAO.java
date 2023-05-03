package booking;

import java.sql.Connection;
import java.sql.PreparedStatement;




import java.sql.ResultSet;

import db.DbConnection;
import booking.Bookbean;

public class BookDAO {


	public int addbooking(Bookbean bb) {
		Connection con = null;
		  PreparedStatement pstmt = null;
		  try
		  	{
			  con=DbConnection.getConnection(); 
			  String ins_str ="insert into booking values(?,?,?,?,?)";
			  pstmt = con.prepareStatement(ins_str);
			  pstmt.setInt(1,bb.getVehicleid());
			  pstmt.setString(2,bb.getName());
			  pstmt.setString(3,bb.getEmail());
			  pstmt.setLong(4,bb.getPhne());
			  pstmt.setString(5,bb.getAddress());
			  
			  int updateCount = pstmt.executeUpdate();
			  con.close();
			  return updateCount;
		  	}
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			  return 0;
		  }  
		  
		  
	}
	public int calculate(int vehicleid) 
	{
		
		Connection con = null;
		  PreparedStatement pstmt = null;
		  //ResultSet resultSet = null;
		  ResultSet rs = null;
		  int updatecount = 0;
		  try
		  	{
			  con=DbConnection.getConnection(); 
			 String ww ="select price from vehicles where vehicleId=?";
			  pstmt = con.prepareStatement(ww); 
			  pstmt.setInt(1,vehicleid);  
			  ///resultSet =pstmt.executeQuery();
			  rs = pstmt.executeQuery();
			  while(rs.next())
			  {
				  updatecount=rs.getInt(1);
			  }
			  con.close();
			  
		  	}
		  catch(Exception ex)
		  {
					  
					  System.out.println(ex.toString());
			  
		  	}
		  return updatecount; 
			
	
		
		
	}

}
