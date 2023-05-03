package admin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Adminfunction {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter 1 to Perform Operations on Vehicle..");
		System.out.println("Enter 2 to Perform Operations on Employee..");
		Scanner s=new Scanner(System.in);
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
			
			AdminDAO adDAO=new AdminDAO();
			ArrayList<String> q=adDAO.allvehicles();
			Iterator i=q.iterator();
			while (i.hasNext())
			{
				System.out.println(i.next());
				
			}
			System.out.println("Select the operations....");
			System.out.println("1.Insert new vehicle..");
			System.out.println("2.Update the Existing Vehicle details...");
			System.out.println("3.Delete the Existing Vehicle..");
			int ch1=s.nextInt();
			switch(ch1)
			{
			case 1:
				System.out.println("Insert new Vehicle..");
				adDAO.insertnewvehicle();
				
				break;
			case 2:
				System.out.println("Update the Existing Vehicle details..");
				System.out.println("Enter the vehicle Id to be updated..");
				int id=s.nextInt();
				adDAO.updatevehicle(id);
				System.out.println("Sussessfully Updated...");
				break;
			case 3:
				System.out.println("Delete the Existing Vehicle..");
				System.out.println("Enter the vehicle Id to be Deleted..");
				int del_id=s.nextInt();
				adDAO.deletevehicle(del_id);
				break;
			default:
				System.out.println("Enter Correct Option...");
				break;
			}
			
		
		
		case 2:
			
			System.out.println("Select the operations....");
			System.out.println("1.Insert new Employee..");
			System.out.println("2.Update the Existing Employee details...");
			System.out.println("3.Delete the Existing Employee..");
			int ch2=s.nextInt();
			switch(ch2)
			{
			case 1:
				System.out.println("Insert new Employee..");
				adDAO.insertemployee();
				break;
			case 2:
				System.out.println("Update the Existing Employee details..");
				adDAO.updateemployee();
				
				break;
			case 3:
				System.out.println("Delete the Existing Employee..");
				adDAO.deleteemployee();
				break;
			default:
				System.out.println("Enter Correct Option...");
				break;
			}
			break;
		}
		
	}

	

	

	
	

	

}
