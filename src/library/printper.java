/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;
import net.sf.dynamicreports.report.builder.column.Columns;
import net.sf.dynamicreports.report.builder.component.Components;
import net.sf.dynamicreports.report.builder.datatype.DataTypes;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.report.exception.DRException;

/**
 *
 * @author kimani kogi
 */
public class printper extends javax.swing.JFrame {
    String  Query;
    
    String tt;
    String p;
    String df;
int pclb=0;
int pccb=0;
int pflb=0;
int pfcb=0;
int ptlb=0;
int ptcb=0;
    /**
     * Creates new form printper
     */
    public printper() {
        initComponents();
          try
    {
      selectname();
    }
    catch (Exception ex)
    {
      Logger.getLogger(printbooklist.class.getName()).log(Level.SEVERE, null, ex);
    }
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("academic.png")));
        this.setTitle(tt);
    }
public void selectname()
    throws Exception
  {
    Connection con = getConnection();
    Statement st2 = con.createStatement();
    
    ResultSet res7 = st2.executeQuery("SELECT name FROM libprefrence  ");
    while (res7.next()) {
      tt=(res7.getString("name"));
    }
    st2.close();
    res7.close();
    con.close();
  }
public Connection getConnection()
  {
    Connection con = null;
    try
    {
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "123ERYcog.");
    }
    catch (Exception ex)
    {
      System.out.println(ex.getMessage());
    }
    return con;
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pcform = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pcclass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        plfb = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ptitle = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setText("PRINT PER CLASS");

        jLabel2.setText("FORM");

        jLabel3.setText("CLASS");

        jButton1.setText("PRINT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("PRINT AS PER FORM");

        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("PRINT AS PER BOOK TITLE");

        jButton3.setText("PRINT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("PRINT ALL LOANED");

        jButton4.setText("PRINT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("PRINT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("PRINT ALL COURSEBOOKS GIVEN ");

        jCheckBox1.setText("LIBRARY");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("COURSE BOOKS");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("LIBRARY");
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("COURSE BOOKS");
        jCheckBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox4ItemStateChanged(evt);
            }
        });
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("LIBRARY");
        jCheckBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox5ItemStateChanged(evt);
            }
        });
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setText("COURSE BOOKS");
        jCheckBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox6ItemStateChanged(evt);
            }
        });
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jLabel8.setText("BY FORM");

        jLabel9.setText("BY TITLE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pcform, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(pcclass, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(plfb, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(176, 176, 176)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jButton2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox3)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox4)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel6))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ptitle)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox6)))
                                .addGap(54, 54, 54)
                                .addComponent(jButton4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jButton5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(ptitle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plfb, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pcform, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pcclass, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton4)
                                .addComponent(jButton5)))
                        .addGap(0, 0, 0)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1116, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
       
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
       
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
      
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
    
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
       
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String fc=  pcform.getText();
      String ff=  pcclass.getText();
        if(ff.equals("")||fc.equals("")){
            JOptionPane.showMessageDialog(null, "ENTER FORM AND CLASS");
                pclb=0;
                pccb=0;
               //jCheckBox1.setSelected(false);
              // jCheckBox2.setSelected(false);
       }
        else if((pclb==1&&pccb==1)||(pclb==0&&pccb==0)){
            JOptionPane.showMessageDialog(null, " YOU MUST CHECK ONE OF THE CHECK BOXES/n");
//             printper b=new printper();
//              b.setVisible(true);
//              this.setVisible(false);
//              this.dispose();
                      
               pclb=0;
               pccb=0;
               try{
              jCheckBox1.setSelected(false);
              jCheckBox2.setSelected(false);
               }
               catch (Exception e)
                       {
                  System.err.println(e);
               }
             }
            else{
                       buttonc();
               } 
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         String fc=  plfb.getText();
      //String ff=  pcflb.getText();
        if(fc.equals("")){
            JOptionPane.showMessageDialog(null, "ENTER FORM ");
               jCheckBox3.setSelected(false);
               jCheckBox4.setSelected(false);        
               pflb=0;
               pfcb=0;
       }
        else if((  pflb==1&&pfcb==1)||(  pflb==0&&pfcb==0)){
            JOptionPane.showMessageDialog(null, " YOU MUST CHECK ONE OF THE CHECK BOXES/n");
            // JOptionPane.showMessageDialog(null, " UNCHECK ALL CHECK BOXES/n" 
                    
         
//              printper b=new printper();
//              b.setVisible(true);
//              this.setVisible(false);
//              this.dispose();
               jCheckBox3.setSelected(false);
               jCheckBox4.setSelected(false);        
               pflb=0;
               pfcb=0;
        }
        else{
           buttonf();
        } 
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
               String fc=  ptitle.getText();
      //String ff=  pcflb.getText();
        if(fc.equals("")){
            JOptionPane.showMessageDialog(null, "ENTER TITLE ");
            ptlb=0;
             ptcb=0;
             jCheckBox5.setSelected(false);
            jCheckBox6.setSelected(false);
       }
        else if((  ptlb==1&&ptcb==1)||(  ptlb==0&&ptcb==0)){
            JOptionPane.showMessageDialog(null, " YOU MUST CHECK ONE OF THE CHECK BOXES/n");
            // JOptionPane.showMessageDialog(null, " UNCHECK ALL CHECK BOXES/n" 
                    
         
//              printper b=new printper();
//              b.setVisible(true);
//              this.setVisible(false);
//              this.dispose();
                      
             ptlb=0;
             ptcb=0;
              jCheckBox5.setSelected(false);
            jCheckBox6.setSelected(false);
        }
        else{
           buttont();
        } 
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       // Query="SELECT sid, title, bid, fname FROM loaned ";      
        buttonal();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       buttonalc();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
    // pclb=1;
     if (pclb==0){
            pclb=1;
            
            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(false);
            

               
        }
        else{
             
            pclb=0;
            jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        if (pccb==0){
            pccb=1;
            jCheckBox2.setSelected(true);
            jCheckBox1.setSelected(false);
        } 
        else{
             
            pccb=0;
            jCheckBox2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
         if (pflb==0){
            pflb=1;
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(false);
        }
        else{
             
            pflb=0;
            jCheckBox3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jCheckBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox4ItemStateChanged
             if (pfcb==0){
            pfcb=1;
            jCheckBox4.setSelected(true);
            jCheckBox3.setSelected(false);
        } 
        else{
             
            pfcb=0;
            jCheckBox4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox4ItemStateChanged

    private void jCheckBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox5ItemStateChanged
         if (ptlb==0){
            ptlb=1;
            jCheckBox5.setSelected(true);
            jCheckBox6.setSelected(false);
        }
        else{
             
            ptlb=0;
            jCheckBox5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox5ItemStateChanged

    private void jCheckBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox6ItemStateChanged
          if (ptcb==0){
            ptcb=1;
            jCheckBox6.setSelected(true);
            jCheckBox5.setSelected(false);
        } 
        else{
             
            ptcb=0;
            jCheckBox6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox6ItemStateChanged
  public void buttonalc(){
       
             p="loanedcourse";
              df=" ALL COURSE BOOKS NOT RETURNED ";
            Query="SELECT sid, title, bid, fname FROM "+p+"";
             printclass();
          
    }
    public void buttonal(){
       
             p="loaned";
              df=" ALL LIBRARY BOOKS NOT RETURNED ";
             
       
          Query="SELECT sid, title, bid, fname FROM "+p+"";
   
          
          
          printclass();
          
    }
    public void buttonc(){
        if((pcform.getText().equals(null))&&pcclass.getText().equals(null)){
        JOptionPane.showMessageDialog(null, "ENTER CORRECT FIELDS");
            pclb=0;
             pccb=0;
             jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
    }
        else{
                if(pclb==1){
             p="loaned";
              df=" BORROWED LIBRARY BOOKS "+pcform.getText()+"  "+pcclass.getText()+" ";
             
         }
         else{
              p="loanedcourse";
              df=" UN-RETURNED COURSE BOOKS "+pcform.getText()+"  "+pcclass.getText()+" ";
         } 
          Query="SELECT sid, title, bid, fname FROM "+p+" WHERE class='"+pcclass.getText()+"'AND form='"+pcform.getText()+" '";
   
          
          
          printclass();
            pclb=0;
             pccb=0;
             jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
                }
    }
    public void buttonf(){
         if(plfb.getText().equals(null)){
        JOptionPane.showMessageDialog(null, "ENTER CORRECT FIELDS");
             pflb=0;
             pfcb=0;
             jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
    }
         else{
              if(pflb==1){
             String kamau=plfb.getText();
             p="loaned";
              df="FORM "+kamau+" LIBRARY BORROWED BOOKS";
             
         }
        //
         else{
            String kamau = plfb.getText();
              p="loanedcourse";
              df="FORM "+kamau+" GIVEN COURSE BOOKS ";
         } 
          Query="SELECT sid, title, bid, fname FROM "+p+" WHERE  form='"+plfb.getText()+" '";
   
          
          
          printclass();
            pflb=0;
             pfcb=0;
             jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
         }
    }
     public void buttont(){
   if(ptitle.getText().equals(null)){
        JOptionPane.showMessageDialog(null, "ENTER CORRECT FIELDS");
             ptlb=0;
             ptcb=0;
             jCheckBox6.setSelected(false);
            jCheckBox5.setSelected(false);
    }
   else{
        if(ptlb==1){
             String kamau=ptitle.getText();
             p="loaned";
              df="  "+kamau+" LOANED LIBRARY BOOKS";
             
         }
        
         else{
            String kamau=ptitle.getText();
              p="loanedcourse";
              df=""+kamau+" GIVEN COURSE BOOKS ";
         } 
        String kamau=ptitle.getText();
          Query="SELECT sid, title, bid, fname FROM "+p+" WHERE  title='"+kamau+" '";
   
          
          
          printclass();
           ptlb=0;
             ptcb=0;
             jCheckBox6.setSelected(false);
            jCheckBox5.setSelected(false);
   }
    }
    
     public void text(){
//         text.append("ytfn"  + "\n");
//          text.append("select 'NOT ALLL' then " + "\n");
//          text.append("enter adm no of those students"  + "\n");
//            text.append("not to be promoted"  + "\n");
//            text.append("And finally click on 'move'  "+ "\n");
//             text.append("IF NO OF THOSE NOT TO BE PROMOTED IS"+ "\n");
//              text.append("MORE THAN 10,YOU WILL UPDATE  "+ "\n");
//               text.append("THE DETAILS OF THE PLUS 10  "+ "\n");
//                text.append("IN THE STUDENTS PAGE "+ "\n");
//                text.append("if not all student to be moved,"  + "\n");
//          text2.append("select 'NOT ALLL' then " + "\n");
//          text2.append("enter adm no of those students"  + "\n");
//            text2.append("not to be promoted"  + "\n");
//            text2.append("And finally click on 'move'  "+ "\n");
//             text2.append("IF NO OF THOSE NOT TO BE PROMOTED IS"+ "\n");
//              text2.append("MORE THAN 10,YOU WILL UPDATE  "+ "\n");
//               text2.append("THE DETAILS OF THE PLUS 10  "+ "\n");
//                text2.append("IN THE STUDENTS PAGE "+ "\n");
//                text3.append("if not all student to be moved,"  + "\n");
//          text3.append("select 'NOT ALLL' then " + "\n");
//          text3.append("enter adm no of those students"  + "\n");
//            text3.append("not to be promoted"  + "\n");
//            text3.append("And finally click on 'move'  "+ "\n");
//             text3.append("IF NO OF THOSE NOT TO BE PROMOTED IS"+ "\n");
//              text3.append("MORE THAN 10,YOU WILL UPDATE  "+ "\n");
//               text3.append("THE DETAILS OF THE PLUS 10  "+ "\n");
//                text3.append("IN THE STUDENTS PAGE "+ "\n");
//                 text3.append("if not all student to be moved,"  + "\n");
//          text4.append("select 'NOT ALLL' then " + "\n");
//          text4.append("enter adm no of those students"  + "\n");
//            text4.append("not to be promoted"  + "\n");
//            text4.append("And finally click on 'move'  "+ "\n");
//             text4.append("IF NO OF THOSE NOT TO BE PROMOTED IS"+ "\n");
//              text4.append("MORE THAN 10,YOU WILL UPDATE  "+ "\n");
//               text4.append("THE DETAILS OF THE PLUS 10  "+ "\n");
//                text4.append("IN THE STUDENTS PAGE "+ "\n");
}
    public  void printclass() {
         
        
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root", "123ERYcog.");
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return;
		}

		JasperReportBuilder report = DynamicReports.report();//a new report
		report
		  .columns(
		  	Columns.column("ADM ", "sid", DataTypes.integerType())
		  		.setHorizontalAlignment(HorizontalAlignment.LEFT),
                          Columns.column("NAME", "fname", DataTypes.stringType()),
		  	Columns.column(" TITLE", "title", DataTypes.stringType()),
                        Columns.column("BOOK NO", "bid", DataTypes.stringType())
		  	.setHorizontalAlignment(HorizontalAlignment.LEFT)
		  	)
		  .title(//title of the report
		  	Components.text(" "+tt+"  \n LIST OF "+df+" ")
		  		.setHorizontalAlignment(HorizontalAlignment.CENTER))
		  .pageFooter(Components.pageXofY())//show page number on the page footer
		  .setDataSource(Query, connection);

		try {
		report.show(false);//show the report
			//report.toPdf(new FileOutputStream("C:\\Users\\kimani kogi\\Documents\\POS\\debtsreport.pdf"));//export the report to a pdf file
		} catch (DRException e) {
			e.printStackTrace();
		}

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
            java.util.logging.Logger.getLogger(printper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(printper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(printper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(printper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new printper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pcclass;
    private javax.swing.JTextField pcform;
    private javax.swing.JTextField plfb;
    private javax.swing.JTextField ptitle;
    // End of variables declaration//GEN-END:variables
}
