package roboResume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBconnection {

public void deleteRecord(String table, String whereColumn, String toDelete) {
		
		
		try {
			Connection con = null;
			PreparedStatement statement = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost/roboresume?user=root&password=password");
			String sql = String.format("delete from %s where %s = ?", table, whereColumn);
			statement = con.prepareStatement(sql);
			statement.setString(1, toDelete);
			statement.executeUpdate();
			
		} catch (SQLException e) {e.printStackTrace();}
		
		
	}
	
	public void addRecord(String table, String column, String toAdd) {
		try {
			Connection con = null;
			PreparedStatement statement = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost/roboresume?user=root&password=password");
			String sql = String.format("insert into %s (%s) values (?)", table, column);
			statement = con.prepareStatement(sql);
			statement.setString(1, toAdd);
			statement.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();}
	}
	
	public void updateRecord(String table, String column, String whereColumn, String columnEquals, String toUpdate){
		try{
			Connection con = null;
			PreparedStatement statement = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost/roboresume?user=root&password=password");
			String sql = String.format("update %s set %s = ? where %s = '%s'",table, column, whereColumn, columnEquals);
			statement = con.prepareStatement(sql);
			statement.setString(1, toUpdate);
			statement.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();}
	}
	
	
	public void getData(String table, String whereColumn, String equals, String... columns){
		try {
			String colString = "";
			for(String col: columns) colString += col + ",";
			colString = colString.substring(0, colString.length() -1);
			Connection con = null;
			PreparedStatement statement = null;
			ResultSet rs = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost/roboresume?user=root&password=password");
			
			String sql = String.format("select %s from %s where %s = %s", colString, table, whereColumn, equals);
			
			System.out.println(sql);
			statement = con.prepareStatement("");
			rs = statement.executeQuery(sql);
			
			
			
			while(rs.next()){
				
				for(String col: columns) System.out.println(rs.getString(col));
				
			}		
		
			} catch (Exception e) {
					e.printStackTrace();
			}
		
	}

		
	}


