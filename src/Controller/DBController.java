/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Tags;
import MySQL.javaconnect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AlexKarlov
 */
public class DBController {
    Connection conn = null;
    ResultSet rs=null;
    PreparedStatement pst =null; 
    Tags tag;
    
         public DBController() {       
            conn=javaconnect.ConnecrDb();
            tag = new Tags();
         }
            
         
public void  studentTableInsert(String name, String lastName, Calendar dateBirthday){
        Calendar date = dateBirthday;      
        java.sql.Date bDate = null;  
        bDate = new java.sql.Date(date.getTimeInMillis());   
    if (!(name.equals("Имя") )&&(lastName.equals("Фамилия"))){
    try {
            String sql="INSERT INTO "+tag.DB_NAME+"."+tag.STUDENT_TABLE+"("+tag.STUDENT_NAME+","+tag.STUDENT_LASTNAME+","+tag.STUDENT_DATEBIRTHDAY+" ) "
                    + "VALUES('"+name+"', '"+lastName+"', '"+bDate+"')";
            pst =conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        finally {
            try {
                rs.close();
                pst.close();
            }
            catch (Exception e){                
            }
        }
    }
   else {
    JOptionPane.showMessageDialog(null,"Пожжалуйста, ввидете действительніе данные");
   }
}         

public  ResultSet loadTable(String tableName, ResultSet rs){
        try {
            String sql = "select * from "+tableName+" ";
            pst =  conn.prepareStatement(sql);            
            rs=pst.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }        
        return rs;
}

public  void updateTableStudent(int id, String name, String lastName, Calendar birthdayDay){
        Calendar date = birthdayDay;      
        java.sql.Date bDate = null;  
        bDate = new java.sql.Date(date.getTimeInMillis());  
     try {
            String sql = "UPDATE "+tag.DB_NAME+"."+tag.STUDENT_TABLE+" "
                    + "set "+tag.STUDENT_NAME+" = '"+name+"', "+tag.STUDENT_LASTNAME+" = '"+lastName+"',"
                    + " "+tag.STUDENT_DATEBIRTHDAY+" = '"+bDate+"' where id_student = '"+id+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }           
    }

public HashMap getValueFromTableStudent(Integer tableClickId){
    HashMap<String, Object> listValues = new HashMap<String, Object>();
    try {
            String sql = "SELECT * from "+tag.DB_NAME+"."+tag.STUDENT_TABLE+" where id_student='"+tableClickId+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                listValues.put("first_name", rs.getString("first_name"));
                 listValues.put("last_name", rs.getString("last_name"));
                  listValues.put("date_birthday", rs.getDate("date_birthday"));
                  listValues.put("id", rs.getInt("id_student"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        } 
        finally {
            try {
                rs.close();
                pst.close();
            }
            catch (Exception e){
                
            }
        }
        return listValues;
}

public ResultSet searchStudentInTable(String lastName, ResultSet rs){
    String sql = "SELECT * FROM "+tag.DB_NAME+"."+tag.STUDENT_TABLE+" where "+tag.STUDENT_LASTNAME+" = '"+lastName+"'";
    try {
      pst =  conn.prepareStatement(sql);            
            rs=pst.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }        
        return rs;    
}
    

}
