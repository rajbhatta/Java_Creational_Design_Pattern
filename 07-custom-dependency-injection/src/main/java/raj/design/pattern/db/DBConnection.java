package raj.design.pattern.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import raj.design.pattern.model.Order;

public class DBConnection 
{
	private final static String DBURL="jdbc:mysql://localhost:3306/patterndb";
	private final static String DBUSERNAME="root";
	private final static String DBPASSWORD=null;
	
	public static Connection provideDBConnection() throws SQLException
	{
		return DriverManager.getConnection(DBURL,DBUSERNAME, DBPASSWORD);
	}
	
	public static ResultSetMetaData executeSqlQuery(String sqlQuery) throws SQLException
	{
		return provideDBConnection().createStatement().executeQuery(sqlQuery).getMetaData();
		
	}
	
	public static void createOrder(Order order) throws SQLException
	{
	    executeSqlQuery(provideStringQuery(order));
	    
	}
	
	public static String provideStringQuery(Order order)
	{

		StringBuffer insertQuery = new StringBuffer(
	            "insert into order (name, address) values (");
	    String quote = "'";
	    String endQuoteComma = "',";
	    String endingBracket = ")";
	    insertQuery.append(quote);    
	    insertQuery.append(order.getCustomerName());
	    insertQuery.append(endQuoteComma);
	    insertQuery.append(quote);
	    insertQuery.append(order.getAddress());
	    insertQuery.append(endQuoteComma);
	    insertQuery.append(quote);
	    insertQuery.append(endingBracket);
	    return insertQuery.toString();
	}
	
	public static Order getOrder(String sqlQuery) throws SQLException{
		
		Order order=new Order();
		for ( int i=1; i <= executeSqlQuery(sqlQuery).getColumnCount(); i++){
			order.setAddress(executeSqlQuery(sqlQuery).getColumnName(i));
			order.setCustomerName(executeSqlQuery(sqlQuery).getColumnName(i));
		}
		return order;
		
	}

}
