/**
 * 
 */
package jdbc.sampledemoapplication;

/**
 * @author ssivakumar
 *
 */
import java.sql.*;

import java.util.*;



public class dummy {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[]args) throws ClassNotFoundException,SQLException{

		String dbURL="jdbc:oracle:thin:@localhost:1521:XE";

		String username="SYSTEM";

		String password="Ss_15032023";

		Connection con=null;

		Statement stat=null;
		//registering the oracle driver

		Class.forName("oracle.jdbc.driver.OracleDriver");

		

		//connecting to the database

		con=DriverManager.getConnection(dbURL,username,password);

		if(con!=null)

		System.out.println("Connected to the database"+" "+con);

		else

		System.out.println("Not connected to the database");

		

		//creation of statement

		stat=con.createStatement();

		

		//execute the statement

		Scanner scan=new Scanner(System.in);

		int row=0;

		System.out.println("Enter choice : ");

		int x=scan.nextInt();

		switch(x) {

		case 1:

		for(int i=0;i<3;i++) {

		System.out.println("Enter the data : ");

		String sql1="insert into SARVESH KUMAR.pet values('"+scan.next()+"','"+scan.next()+"','"+scan.next()+"')";

		row=stat.executeUpdate(sql1);

		}

		break;

		/*if(row>0)

		System.out.println("Row inserted");

		else

		System.out.println("Row not inserted");*/

		

		//execute the queries

		case 2:

		ResultSet rs=null;

		String sql="SELECT * FROM SARVESH KUMAR.pet";

		rs=stat.executeQuery(sql);

		

		while(rs.next()) {

		System.out.println("Name : "+rs.getString(1)+" Owner : "+rs.getString(2)+" Species :"+rs.getString(3));

		}

		break;

		}

		stat.close();

		con.close();

		}

		}
					
						

						
						
					 
		
		
		
			
		

		
		 

	


	


