/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JLabel;

/**
 *
 * @author AlexKarlov
 */
public class TeacherTool extends javax.swing.JFrame {
int xx;
int yy;
    /**
     * Creates new form TeacherTool
     */
    public TeacherTool() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnl_sidebar = new javax.swing.JPanel();
        menu_item_1 = new javax.swing.JLabel();
        menu_item_2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        pnl_menu = new javax.swing.JLayeredPane();
        pnl_lessons = new javax.swing.JPanel();
        pnl_header = new javax.swing.JPanel();
        lbl_exit_1 = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        lbl_logoName = new javax.swing.JLabel();
        lbl_cmd_header_button_create = new javax.swing.JLabel();
        lbl_cmd_header_buttonNew = new javax.swing.JLabel();
        lessons = new javax.swing.JLayeredPane();
        pnl_lesson_new = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnl_sidebar.setBackground(new java.awt.Color(0, 157, 65));
        pnl_sidebar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_sidebarMouseDragged(evt);
            }
        });
        pnl_sidebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_sidebarMousePressed(evt);
            }
        });

        menu_item_1.setBackground(new java.awt.Color(255, 255, 255));
        menu_item_1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menu_item_1.setForeground(new java.awt.Color(255, 255, 255));
        menu_item_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Resources/1495903055_user_male3.png"))); // NOI18N
        menu_item_1.setText("Урок");
        menu_item_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_item_1MousePressed(evt);
            }
        });

        menu_item_2.setBackground(new java.awt.Color(255, 255, 255));
        menu_item_2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menu_item_2.setForeground(new java.awt.Color(255, 255, 255));
        menu_item_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Resources/1495903068_group.png"))); // NOI18N
        menu_item_2.setText("Тест");
        menu_item_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_2MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menu_item_2MouseReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 83, 34));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Design, Create Awesome Swing UI");

        jLabel9.setForeground(new java.awt.Color(57, 52, 54));
        jLabel9.setText("Odessa, Copyright © 2017 Karlov.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Resources/User-50.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Виктория");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Учитель");

        jPanel2.setBackground(new java.awt.Color(2, 181, 76));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Resources/1495901336_list.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(94, 94, 94))
            .addComponent(jSeparator7)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(17, 17, 17)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout pnl_sidebarLayout = new javax.swing.GroupLayout(pnl_sidebar);
        pnl_sidebar.setLayout(pnl_sidebarLayout);
        pnl_sidebarLayout.setHorizontalGroup(
            pnl_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_sidebarLayout.createSequentialGroup()
                .addGroup(pnl_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_sidebarLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addGroup(pnl_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(pnl_sidebarLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(menu_item_2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnl_sidebarLayout.createSequentialGroup()
                .addGroup(pnl_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_sidebarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menu_item_1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_sidebarLayout.setVerticalGroup(
            pnl_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sidebarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnl_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pnl_sidebarLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(menu_item_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(menu_item_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_menu.setLayout(new javax.swing.OverlayLayout(pnl_menu));

        pnl_header.setBackground(new java.awt.Color(0, 157, 65));
        pnl_header.setPreferredSize(new java.awt.Dimension(453, 206));

        lbl_exit_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_exit_1.setForeground(new java.awt.Color(57, 113, 177));
        lbl_exit_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Resources/1495903985_Gnome-Window-Close-32.png"))); // NOI18N
        lbl_exit_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exit_1MouseClicked(evt);
            }
        });

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Resources/1495925307_SEO_WEB_analytics.png"))); // NOI18N

        lbl_logoName.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_logoName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_logoName.setText("AnalyticToo");

        lbl_cmd_header_button_create.setBackground(new java.awt.Color(0, 157, 65));
        lbl_cmd_header_button_create.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_cmd_header_button_create.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cmd_header_button_create.setText("Урок/Отметки");
        lbl_cmd_header_button_create.setOpaque(true);
        lbl_cmd_header_button_create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cmd_header_button_createMouseClicked(evt);
            }
        });

        lbl_cmd_header_buttonNew.setBackground(new java.awt.Color(4, 136, 58));
        lbl_cmd_header_buttonNew.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_cmd_header_buttonNew.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cmd_header_buttonNew.setText("Новый урок");
        lbl_cmd_header_buttonNew.setOpaque(true);
        lbl_cmd_header_buttonNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cmd_header_buttonNewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_headerLayout = new javax.swing.GroupLayout(pnl_header);
        pnl_header.setLayout(pnl_headerLayout);
        pnl_headerLayout.setHorizontalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(lbl_cmd_header_buttonNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_cmd_header_button_create)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_headerLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(lbl_logo)
                .addGap(18, 18, 18)
                .addComponent(lbl_logoName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_exit_1)
                .addGap(21, 21, 21))
        );
        pnl_headerLayout.setVerticalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_exit_1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_headerLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_headerLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lbl_logoName))
                            .addComponent(lbl_logo, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cmd_header_button_create)
                    .addComponent(lbl_cmd_header_buttonNew)))
        );

        lessons.setLayout(new javax.swing.OverlayLayout(lessons));

        pnl_lesson_new.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_lesson_newLayout = new javax.swing.GroupLayout(pnl_lesson_new);
        pnl_lesson_new.setLayout(pnl_lesson_newLayout);
        pnl_lesson_newLayout.setHorizontalGroup(
            pnl_lesson_newLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        pnl_lesson_newLayout.setVerticalGroup(
            pnl_lesson_newLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        lessons.add(pnl_lesson_new);

        javax.swing.GroupLayout pnl_lessonsLayout = new javax.swing.GroupLayout(pnl_lessons);
        pnl_lessons.setLayout(pnl_lessonsLayout);
        pnl_lessonsLayout.setHorizontalGroup(
            pnl_lessonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_header, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
            .addComponent(lessons)
        );
        pnl_lessonsLayout.setVerticalGroup(
            pnl_lessonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_lessonsLayout.createSequentialGroup()
                .addComponent(pnl_header, 163, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lessons))
        );

        pnl_menu.add(pnl_lessons);

        jLayeredPane1.setLayer(pnl_sidebar, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(pnl_menu, javax.swing.JLayeredPane.MODAL_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(pnl_sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_menu)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_menu)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnl_sidebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_sidebarMousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_pnl_sidebarMousePressed

    private void pnl_sidebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_sidebarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_pnl_sidebarMouseDragged

    private void menu_item_2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_2MouseReleased
        setItemColoer(menu_item_2);
        resetItemColoer(menu_item_1);
    }//GEN-LAST:event_menu_item_2MouseReleased

    private void menu_item_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_2MouseClicked

    }//GEN-LAST:event_menu_item_2MouseClicked

    private void menu_item_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_1MousePressed

    }//GEN-LAST:event_menu_item_1MousePressed

    private void menu_item_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_1MouseClicked

    }//GEN-LAST:event_menu_item_1MouseClicked

    private void lbl_exit_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exit_1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbl_exit_1MouseClicked

    private void lbl_cmd_header_button_createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cmd_header_button_createMouseClicked
      /*  setLblColor(lbl_cmd_header_button_create);
        resetLblColor(lbl_cmd_header_buttonNew);
        pnl_new_group_1.setVisible(false);
        pnl_new_group_2.setVisible(true);*/
    }//GEN-LAST:event_lbl_cmd_header_button_createMouseClicked

    private void lbl_cmd_header_buttonNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cmd_header_buttonNewMouseClicked
      /*  setLblColor(lbl_cmd_header_buttonNew);
        resetLblColor(lbl_cmd_header_button_create);
        pnl_new_group_1.setVisible(true);
        pnl_new_group_2.setVisible(false);*/
    }//GEN-LAST:event_lbl_cmd_header_buttonNewMouseClicked
 private void setItemColoer(JLabel lbl){
        lbl.setForeground(new Color(0, 150, 62));
    }
    
     private void resetItemColoer(JLabel lbl){
        lbl.setForeground(new Color(166, 166, 166));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeacherTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TeacherTool Teacherframe = new TeacherTool();
      Dimension screenSize = Toolkit.getDefaultToolkit ().getScreenSize ();
      Teacherframe.setSize (screenSize);
      Teacherframe.setVisible(true);
      Teacherframe.setExtendedState(MAXIMIZED_BOTH);
      Teacherframe.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lbl_cmd_header_buttonNew;
    private javax.swing.JLabel lbl_cmd_header_button_create;
    private javax.swing.JLabel lbl_exit_1;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_logoName;
    private javax.swing.JLayeredPane lessons;
    private javax.swing.JLabel menu_item_1;
    private javax.swing.JLabel menu_item_2;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JPanel pnl_lesson_new;
    private javax.swing.JPanel pnl_lessons;
    private javax.swing.JLayeredPane pnl_menu;
    private javax.swing.JPanel pnl_sidebar;
    // End of variables declaration//GEN-END:variables
}
