/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ManagerTools;
import View.TeacherTool;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;

/**
 *
 * @author AlexKarlov
 */

public class Authorization {
    
   
    
    public void auth(String login, String pass){
        if(pass.equals("teach") && login.equals("teach")){
      TeacherTool Teacherframe = new TeacherTool();
      Dimension screenSize = Toolkit.getDefaultToolkit ().getScreenSize ();
      Teacherframe.setSize (screenSize);
      Teacherframe.setExtendedState(MAXIMIZED_BOTH);
      Teacherframe.setVisible(true);
          }
         if(pass.equals("manager") && login.equals("manager")){
          ManagerTools frame = new ManagerTools();
          Dimension screenSize = Toolkit.getDefaultToolkit ().getScreenSize ();
          frame.setSize (screenSize);
          frame.setExtendedState(MAXIMIZED_BOTH);
          frame.setVisible(true); 
            
          }
    }
    
    
}
