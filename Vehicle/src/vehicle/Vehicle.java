package vehicle;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import db.DbConnection;

public class Vehicle {
public ArrayList<String> twowheeler() throws Exception
	
	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		conn =DbConnection.getConnection();
		String str="Select * from vehicle where category='T'";
		pstmt=conn.prepareStatement(str);
		rs=pstmt.executeQuery();
		
		
		ArrayList<String> ar=new ArrayList<String>();
		while(rs.next())
		{
			int vid=rs.getInt(1);
			String vname=rs.getString(2);
			String category=rs.getString(3);
			int price=rs.getInt(4);
			//String s3=rs.getString(4);
			//Date d1=rs.getDate(5);
			//String s4=rs.getString(6);
			//int i2=rs.getInt(7);
			//int i3=rs.getInt(8);			
			String display="	 vid:"+vid+"	 	 vname:"+vname+"	 Category:"+category +"		price:"+price;
			ar.add(display);
			
				
			
		}	
			
		
		return ar;
				
	}
public ArrayList<String> fourwheeler() throws Exception
	
	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		conn =DbConnection.getConnection();
		String str="Select * from vehicle where category='F'";
		pstmt=conn.prepareStatement(str);
		rs=pstmt.executeQuery();
		
		
		ArrayList<String> ar=new ArrayList<String>();
		while(rs.next())
		{
			int vid=rs.getInt(1);
			String vname=rs.getString(2);
			String category=rs.getString(3);
			int price=rs.getInt(4);
			/*int i1=rs.getInt(1);
			String s1=rs.getString(2);
			String s2=rs.getString(3);
			String s3=rs.getString(4);
			Date d1=rs.getDate(5);
			String s4=rs.getString(6);
			int i2=rs.getInt(7);
			int i3=rs.getInt(8);	*/		
			String display="	 vid:"+vid+"	 	 vname:"+vname+"	 Category:"+category +"		price:"+price;
			ar.add(display);
			
				
			
		}	
			
		
		return ar;
	}

}
