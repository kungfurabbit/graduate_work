/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Tags;
import MySQL.javaconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AlexKarlov
 */
public class DBControllerGroup {
     Connection conn = null;
    ResultSet rs=null;
    PreparedStatement pst =null; 
    Tags tag;
    public DBControllerGroup() {       
            conn=javaconnect.ConnecrDb();
            tag = new Tags();
         }
    
    public  ArrayList loadToChoice(String tablename, String value){
        ArrayList<String> itemList = new ArrayList<String>();
         try {
             String sql = "SELECT * FROM "+tablename+"";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             while(rs.next()){
                 itemList.add(rs.getString(value));
             }
         } catch (SQLException ex) {
             Logger.getLogger(DBControllerGroup.class.getName()).log(Level.SEVERE, null, ex);
         }
        return itemList;
    }

    public void insertGroup(String teacher_id, String discipline_id, String start_date, String finish_date){
            String sql = "INSERT INTO "+tag.DB_NAME+"."+tag.GROUP_TABLE+"()";
    }
    
    public ResultSet loadtoStudentTableGroup(String tableName, ResultSet rs){
          try {
            String sql = "select * from "+tableName+" ";
            pst =  conn.prepareStatement(sql);            
            rs=pst.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }        
        return rs;
    }
    
       public ResultSet loadStudentGroup(String id, ResultSet rs){
          try {
            String sql = "SELECT\n" +
"group_student.id,\n" +
"group_student.id_group,\n" +
"students.first_name,\n" +
"students.last_name\n" +
"FROM\n" +
"group_student ,\n" +
"students\n" +
"WHERE\n" +
"group_student.id_student = students.id_student and group_student.id_group = '"+id+"'";
            pst =  conn.prepareStatement(sql);            
            rs=pst.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }        
        return rs;
    }
       
          public ResultSet loadStudentGroupClear(ResultSet rs){
          try {
            String sql = "SELECT\n" +
"group_student.id,\n" +
"group_student.id_group,\n" +
"students.first_name,\n" +
"students.last_name\n" +
"FROM\n" +
"group_student ,\n" +
"students\n" +
"WHERE\n" +
"group_student.id_student = students.id_student";
            pst =  conn.prepareStatement(sql);            
            rs=pst.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }        
        return rs;
    }  
  public void  studentTableInsert(String id_group, String id_student){
         
    try {
            String sql="INSERT INTO "+tag.DB_NAME+"."+tag.STUDENTGROUP_TABLE+"("+tag.IDGROUP+","+tag.IDSTUDENT+") "
                    + "VALUES('"+id_group+"', '"+id_student+"')";
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
       
    
}
