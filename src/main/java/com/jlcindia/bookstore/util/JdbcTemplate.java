package com.jlcindia.bookstore.util; 
 
import java.sql.Connection; 


import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.util.ArrayList; 
import java.util.List; 

public class JdbcTemplate { 
 

public static int update(String SQL,Object ...params) { 
	System.out.println("JdbcTemplate - update()"); 
    Connection con = null; 
    PreparedStatement ps = null; 
    int x = 0; 
 
    try { 
        con = DataSourceUtil.getConnection(); 
        ps = con.prepareStatement(SQL); //5 
 
        for(int i=0;i<params.length;i++) { 
             ps.setObject(i+1, params[i]); 
             } 
 
        x = ps.executeUpdate(); 
        } catch (Exception ex) {
        	ex.printStackTrace(); 
        	}
    finally { 
    	DataSourceUtil.cleanUp(ps, con); 
	   } 
	 
	return x; 
	} 
	 
	//Any Select Operation with Any table 
	//which return 0 or 1 record 
	public static Object queryForObject(String SQL,RowMapper rowMapper, Object ...params) { 
		System.out.println("JdbcTemplate - queryForObject()"); 
	 
	    Connection con = null; 
	    PreparedStatement ps = null; 
	    ResultSet rs = null; 
	 
	    Object obj = null; 
    	try { 
	       con = DataSourceUtil.getConnection(); 
	       ps = con.prepareStatement(SQL); 
	 
           for(int i=0;i<params.length;i++) { 
        	   ps.setObject(i+1, params[i]); 
        	   } 
	        rs = ps.executeQuery(); 
	        if (rs.next()) { 
	        	obj=rowMapper.mapRow(rs); 
	        	} 
	        }
    	catch (Exception ex) { 
    		ex.printStackTrace(); 
    		}
    	finally { 
    		DataSourceUtil.cleanUp(rs, ps, con); 
    		} 
	 
	return obj; 
	} 
	 
	//Any Select Operation with Any table 
	//which return 0 or many records 
	public static List queryForList(String SQL,RowMapper rowMapper, Object ...params) { 
		System.out.println("JdbcTemplate - queryForList()"); 
	 
	    Connection con = null; 
	    PreparedStatement ps = null; 
	    ResultSet rs = null; 
	 
	 
	 
	    List mylist = new ArrayList(); 
	    try { 
	    	con = DataSourceUtil.getConnection(); 
	        ps = con.prepareStatement(SQL); 
	 
	    for(int i=0;i<params.length;i++) { 
	    	ps.setObject(i+1, params[i]); 
	    	} 
	 
	       rs = ps.executeQuery(); 
	       while (rs.next()) { 
	    	   Object obj= rowMapper.mapRow(rs); 
	    	   mylist.add(obj);
	    	   } 
	       }
	    catch (Exception ex) { 
	    	ex.printStackTrace(); 
	    	} 
	    finally { 
	    DataSourceUtil.cleanUp(rs, ps, con); 
	    } 
	 	return mylist; 
	 	}
	
	} 
