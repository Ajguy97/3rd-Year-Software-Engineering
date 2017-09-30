/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author forCSGOcozcantalttab
 */
public class DAOCustomer {
    private static final String DATABASE_URL = "jdbc:mysql://mysql1.it.nuigalway.ie:3306/mydb3398";
     private static final String USERNAME = "mydb3398ga";
     private static final String PASSWORD = "qu9kim";

//didnt use this method for this assigment
public Customer getCustomer(int custNo){
Customer cust = null;
Connection con = null;
Statement stmt = null;

try{
    con = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
    stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM customers WHERE customerNumber=" + custNo);
    if (rs.next())
           {
                cust = new Customer();
               cust.setCustNo(rs.getInt(1));
                cust.setName(rs.getString(2));
                cust.setCity(rs.getString(8));
                cust.setCreditLimit(rs.getDouble(13));
                cust.setContact(rs.getString(4),rs.getString(3));
                cust.setPhoneNo(rs.getString(5));
                cust.setAddressLine1(rs.getString(6));
                cust.setAddressLine2(rs.getString(7));
                cust.setState(rs.getString(9));
                cust.setPostalCode(rs.getInt(10));
                cust.setCountry(rs.getString(11));
            }
        } catch (SQLException ex)
        {

        } finally
        {
            try
            {
                if (stmt != null)
                {
                    stmt.close();
                }
                if (con != null)
                {
                    con.close();
                }
            } catch (SQLException ex)
            {
                Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
return cust;
}

 public List<Customer> getCustomers()
    {
        List<Customer> list = new ArrayList<>();
        Connection con = null;
        Statement stmt = null;
        try
        {
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM customers ORDER BY customerNumber");
            while (rs.next())
            {
               Customer cust = new Customer();
                cust.setCustNo(rs.getInt(1));
                cust.setName(rs.getString(2));
                cust.setCity(rs.getString(8));
                cust.setCreditLimit(rs.getDouble(13));
                cust.setContact(rs.getString(4),rs.getString(3));
                cust.setPhoneNo(rs.getString(5));
                cust.setAddressLine1(rs.getString(6));
                cust.setAddressLine2(rs.getString(7));
                cust.setState(rs.getString(9));
                cust.setPostalCode(rs.getInt(10));
                cust.setCountry(rs.getString(11));
                list.add(cust);
            }
        } catch (SQLException ex)
        {
        } finally
        {
            try
            {
                if (stmt != null)
                {
                    stmt.close();
                }
                if (con != null)
                {
                    con.close();
                }
            } catch (SQLException ex)
            {

            }
        }
        return list;
    }
}

