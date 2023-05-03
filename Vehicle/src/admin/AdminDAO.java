package admin;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import db.DbConnection;

public class AdminDAO {
public ArrayList<String> allvehicles() throws Exception
	
	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		conn =DbConnection.getConnection();
		String str="Select * from vehicles ";
		pstmt=conn.prepareStatement(str);
		rs=pstmt.executeQuery();
		
		
		ArrayList<String> ar=new ArrayList<String>();
		while(rs.next())
		{
			int i1=rs.getInt(1);
			String s1=rs.getString(2);
			String s2=rs.getString(3);
			String s3=rs.getString(4);
			Date d1=rs.getDate(5);
			String s4=rs.getString(6);
			int i2=rs.getInt(7);
			int i3=rs.getInt(8);			
			String s="	 vid:"+i1+"	 cate:"+s1+"	 vname:"+s2+"	 model:"+s3+"	 dom:"+d1+"	 color:"+s4+"	 warranty:"+i2+"	 price:"+i3;
			ar.add(s);
			
				
			
		}	
			
		
		return ar;
				
	}

public  void insertnewvehicle() {
	// TODO Auto-generated method stub
	
}
public  void updatevehicle(int id) {
	// TODO Auto-generated method stub
	
}
public  void deletevehicle(int del_id) {
	// TODO Auto-generated method stub
	
}




public  void insertemployee() {
	// TODO Auto-generated method stub
	
}

public  void updateemployee() {
	// TODO Auto-generated method stub
	
}

public  void deleteemployee() {
	// TODO Auto-generated method stub
	
}



}
