import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;                                   
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ajinkya
 */

public class login extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String pgender,comboitem,dgender,comboitem2,docdept;
    boolean check;
  
    
    public login() {
       
        initComponents();
   
        jFrame1.setExtendedState(login.MAXIMIZED_BOTH); 
        jFrame1.setLocationRelativeTo(null);
       
        this.getContentPane().setBackground(new Color(153, 255, 255));
        jFrame1.getContentPane().setBackground(new Color(153, 255, 255));
      
        this.setTitle("Login");
        jFrame1.setTitle("Hospital Management System");
        this.setLocationRelativeTo(null);
                                                     
        dept.removeAllItems();
        showTableData();
        showTableData1();
        showTableData2();
        j1(); 
        j3();
        dept.setSelectedIndex(-1);
        ddept.setSelectedIndex(-1);
        docdept= (String)ddept.getSelectedItem();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
        ImageIcon img = new ImageIcon("C:\\Users\\ajinkya\\Documents\\NetBeansProjects\\project/h2.jpg");
        this.setIconImage(img.getImage());
        ImageIcon img1 = new ImageIcon("C:\\Users\\ajinkya\\Documents\\NetBeansProjects\\project/h1.png");
        jFrame1.setIconImage(img1.getImage());
        
       }
    
   
    
    public void j1()
    {
              
    try
        {
             
             dept.removeAllItems();
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
String sql = "Select name from dept";
pst = con.prepareStatement(sql);
rs = pst.executeQuery();

         while(rs.next())
         {
             String pat = rs.getString("name");
             dept.addItem(pat);
            
         }
         
    
        }

                   catch(SQLException e)
{
    JOptionPane.showMessageDialog(null,e);
}

    }
    
    public void j2()
    {
      
         try
        {
         
            dname.removeAllItems();
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");

String sql = "SELECT name FROM doctor WHERE dept= '" +comboitem+ "'";
pst = con.prepareStatement(sql);
rs = pst.executeQuery();
         while(rs.next())
         {
             String pat1 = rs.getString("name");
             dname.addItem(pat1);
             
         }
            
        }
                   catch(SQLException e)
{

    JOptionPane.showMessageDialog(null,e);
             
}

    }
    
    public void j3()
    {
       try
        {
             
             ddept.removeAllItems();
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
String sql = "Select name from dept";
pst = con.prepareStatement(sql);
rs = pst.executeQuery();

         while(rs.next())
         {
             String pat = rs.getString("name");
             ddept.addItem(pat);
             
         }
         
   
        }

                   catch(SQLException e)
{
    JOptionPane.showMessageDialog(null,e);
}
    }
    
    public void clearfield()
    {
   
     pid.setText("");
     pname.setText("");
     buttonGroup1.clearSelection();
     paddress.setText("");
     pcontact.setText("");
     ptreatment.setText("");
     dept.setSelectedIndex(-1);
    }
    
    public void clearfield1()
    {
     buttonGroup3.clearSelection();
     DID.setText("");
     ddname.setText("");
     dcontact.setText("");
     daddress.setText(""); 
     ddept.setSelectedIndex(-1);
    }
    
    public void clearfield2()
    {
     id.setText("");
     name.setText("");
     hod.setText("");
    }
    
    public void clearfield3()
    {
     ppass.setText("");
     pass1.setText("");
     pass2.setText("");
    }
    
    public void showTableData()
    {
    try
    {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        String sql = "SELECT * FROM patient order by dept";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
    }
    catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null,ex);
    }

    }

    public void showTableData1()
    {
    try
    {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        String sql = "SELECT * FROM doctor order by dept";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        
    }
    catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null,ex);
    }

    }
      
    public void showTableData2()
    {
    try
    {
     
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        String sql = "SELECT * FROM dept ";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        jTable3.setModel(DbUtils.resultSetToTableModel(rs));
        
    }
    catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null,ex);
    }

    }
    
  /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        main = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        paddress = new javax.swing.JTextField();
        pcontact = new javax.swing.JTextField();
        ptreatment = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        padd = new javax.swing.JButton();
        pupdate = new javax.swing.JButton();
        pdel = new javax.swing.JButton();
        psearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pgen1 = new javax.swing.JRadioButton();
        pgen2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        dept = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        dname = new javax.swing.JComboBox<>();
        pclear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        DID = new javax.swing.JTextField();
        ddname = new javax.swing.JTextField();
        dgen1 = new javax.swing.JRadioButton();
        dgen2 = new javax.swing.JRadioButton();
        dcontact = new javax.swing.JTextField();
        daddress = new javax.swing.JTextField();
        ddept = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton17 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        hod = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        changepass = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        userclear = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        ppass = new javax.swing.JPasswordField();
        jLabel33 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        loginbutton = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jFrame1.setLocationByPlatform(true);
        jFrame1.setMinimumSize(new java.awt.Dimension(500, 200));
        jFrame1.setSize(new java.awt.Dimension(1000, 640));
        jFrame1.getContentPane().setLayout(null);

        main.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        main.setAlignmentX(2.0F);
        main.setAlignmentY(2.0F);
        main.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        main.setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel4.setBackground(new java.awt.Color(0, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setForeground(new java.awt.Color(153, 153, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(971, 500));

        jLabel6.setText("Patient name :");

        jLabel7.setText("Address :");

        jLabel8.setText("Contact no. :");

        jLabel9.setText("Treatment for:");

        jLabel10.setText("Department :");

        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });

        paddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paddressActionPerformed(evt);
            }
        });

        pcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcontactActionPerformed(evt);
            }
        });

        ptreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptreatmentActionPerformed(evt);
            }
        });

        jLabel5.setText("ID :");

        pid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pidKeyReleased(evt);
            }
        });

        padd.setBackground(new java.awt.Color(153, 204, 255));
        padd.setText("Add");
        padd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paddActionPerformed(evt);
            }
        });

        pupdate.setBackground(new java.awt.Color(153, 204, 255));
        pupdate.setText("Update");
        pupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pupdateActionPerformed(evt);
            }
        });

        pdel.setBackground(new java.awt.Color(153, 204, 255));
        pdel.setText("Delete");
        pdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdelActionPerformed(evt);
            }
        });

        psearch.setBackground(new java.awt.Color(153, 204, 255));
        psearch.setText("Search");
        psearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psearchActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        buttonGroup1.add(pgen1);
        pgen1.setText("Male");
        pgen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgen1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(pgen2);
        pgen2.setText("Female");
        pgen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgen2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Gender :");

        dept.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                deptItemStateChanged(evt);
            }
        });
        dept.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                deptFocusGained(evt);
            }
        });
        dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptActionPerformed(evt);
            }
        });

        jLabel26.setText("Doctor :");

        dname.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dnameItemStateChanged(evt);
            }
        });
        dname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnameActionPerformed(evt);
            }
        });

        pclear.setBackground(new java.awt.Color(153, 204, 255));
        pclear.setText("Clear");
        pclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(padd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pupdate, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pdel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(psearch, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addComponent(pclear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel26)
                            .addComponent(jLabel10))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pid, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(pname)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(pgen1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pgen2))
                            .addComponent(paddress, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(pcontact, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(ptreatment, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(dept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dname, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pgen1)
                            .addComponent(pgen2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(paddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ptreatment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(dname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(padd)
                    .addComponent(pdel)
                    .addComponent(pclear))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pupdate)
                    .addComponent(psearch))
                .addGap(27, 27, 27))
        );

        main.addTab("Patient", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setPreferredSize(new java.awt.Dimension(967, 500));

        jLabel12.setText("ID :");

        jLabel13.setText("Doctor name :");

        jLabel15.setText("Gender :");

        jLabel16.setText("Address :");

        jLabel17.setText("Contact :");

        jLabel18.setText("Department :");

        DID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DIDKeyReleased(evt);
            }
        });

        ddname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddnameActionPerformed(evt);
            }
        });

        buttonGroup3.add(dgen1);
        dgen1.setText("Male");
        dgen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dgen1ActionPerformed(evt);
            }
        });

        buttonGroup3.add(dgen2);
        dgen2.setText("Female");
        dgen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dgen2ActionPerformed(evt);
            }
        });

        ddept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddeptActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 204, 255));
        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 204, 255));
        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 204, 255));
        jButton8.setText("Delete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 204, 255));
        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton17.setBackground(new java.awt.Color(153, 204, 255));
        jButton17.setText("Clear");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(78, 78, 78))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel14))
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(dgen1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dgen2))
                                .addComponent(daddress)
                                .addComponent(ddept, 0, 132, Short.MAX_VALUE)
                                .addComponent(DID)
                                .addComponent(ddname)
                                .addComponent(dcontact))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 212, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(DID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ddname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dgen1)
                        .addComponent(dgen2))
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(daddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(dcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(ddept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton8)
                    .addComponent(jButton17))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton9))
                .addGap(44, 44, 44))
        );

        main.addTab("Doctor", jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setPreferredSize(new java.awt.Dimension(967, 500));

        jLabel19.setText("ID :");

        jLabel21.setText("Head of Department :");

        jLabel25.setText("Department Name :");

        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(153, 204, 255));
        jButton10.setText("Add");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(153, 204, 255));
        jButton11.setText("Update");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(153, 204, 255));
        jButton12.setText("Delete");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(153, 204, 255));
        jButton13.setText("Search");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jTable3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable3KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jButton18.setBackground(new java.awt.Color(153, 204, 255));
        jButton18.setText("Clear");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel20))
                    .addComponent(jLabel19)
                    .addComponent(jLabel21)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel25))
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hod, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(hod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(jButton11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12)
                            .addComponent(jButton13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton18))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(220, Short.MAX_VALUE))
        );

        main.addTab("Department", jPanel6);

        jPanel7.setBackground(new java.awt.Color(0, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setPreferredSize(new java.awt.Dimension(967, 500));
        jPanel7.setLayout(null);

        jLabel22.setText("Current Password :");
        jPanel7.add(jLabel22);
        jLabel22.setBounds(50, 40, 120, 30);

        jLabel23.setText("New Password :");
        jPanel7.add(jLabel23);
        jLabel23.setBounds(50, 80, 110, 20);

        jLabel24.setText("Confirm Password :");
        jPanel7.add(jLabel24);
        jLabel24.setBounds(50, 120, 120, 30);
        jPanel7.add(pass1);
        pass1.setBounds(200, 80, 130, 30);
        jPanel7.add(pass2);
        pass2.setBounds(200, 121, 130, 30);

        changepass.setBackground(new java.awt.Color(153, 204, 255));
        changepass.setText("Change Password");
        changepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepassActionPerformed(evt);
            }
        });
        jPanel7.add(changepass);
        changepass.setBounds(80, 210, 140, 30);

        logout.setBackground(new java.awt.Color(153, 204, 255));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel7.add(logout);
        logout.setBounds(240, 210, 140, 30);

        userclear.setBackground(new java.awt.Color(153, 204, 255));
        userclear.setText("Clear");
        userclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userclearActionPerformed(evt);
            }
        });
        jPanel7.add(userclear);
        userclear.setBounds(80, 250, 140, 30);

        exit.setBackground(new java.awt.Color(153, 204, 255));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel7.add(exit);
        exit.setBounds(240, 250, 140, 30);
        jPanel7.add(ppass);
        ppass.setBounds(200, 40, 130, 30);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin2.png"))); // NOI18N
        jPanel7.add(jLabel33);
        jLabel33.setBounds(460, 20, 210, 220);

        main.addTab("User", jPanel7);

        jFrame1.getContentPane().add(main);
        main.setBounds(10, 140, 910, 550);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 51));
        jLabel11.setText("Dashboard");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(517, 517, 517)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(599, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jFrame1.getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 16, 1340, 110);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hos2.jpg"))); // NOI18N
        jFrame1.getContentPane().add(jLabel29);
        jLabel29.setBounds(940, 310, 280, 200);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hos.jpeg"))); // NOI18N
        jFrame1.getContentPane().add(jLabel31);
        jLabel31.setBounds(960, 140, 390, 160);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hos5.jpg"))); // NOI18N
        jFrame1.getContentPane().add(jLabel32);
        jLabel32.setBounds(1000, 510, 300, 190);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Username :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Password :");

        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userKeyPressed(evt);
            }
        });

        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });

        loginbutton.setBackground(new java.awt.Color(153, 204, 255));
        loginbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(pass))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginbutton)
                .addGap(101, 101, 101))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(loginbutton)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 120, 279, 180);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.jpg"))); // NOI18N
        getContentPane().add(jLabel30);
        jLabel30.setBounds(330, 100, 190, 220);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 40, 151, 48);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed

        if(user.getText().isEmpty() && pass.getText().isEmpty())
                {
                JOptionPane.showMessageDialog(null,"Please enter Username and Password!");
                }
        
        else{
        
String sql = "select * from login where username = ? and password = ?";
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1,user.getText());
            pst.setString(2,pass.getText());
            rs = pst.executeQuery();
            if(rs.next())
            {
                
                this.setVisible(false);
                jFrame1.setVisible(true);


            }
            else
            {
                JOptionPane.showMessageDialog(null,"Username and password do not match!!");
            }
            
        }
        catch(SQLException ex)
        {
    
            JOptionPane.showMessageDialog(null,ex);
        }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_loginbuttonActionPerformed
      
    private void userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyPressed



// TODO add your handling code here:
    }//GEN-LAST:event_userKeyPressed

    private void ddnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddnameActionPerformed

    private void pgen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgen2ActionPerformed
        
        pgender= "female"; 
        // TODO add your handling code here:
    }//GEN-LAST:event_pgen2ActionPerformed

    private void pgen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgen1ActionPerformed
        
        pgender = "male"; 
        
        // TODO add your handling code here:
    }//GEN-LAST:event_pgen1ActionPerformed

    private void psearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psearchActionPerformed

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            String sql = "SELECT * FROM patient WHERE ID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1,pid.getText());
            rs = pst.executeQuery();
            if(rs.next())
            {
                String setpid = rs.getString("ID");
                pid.setText(setpid);

                String setpname = rs.getString("name");
                pname.setText(setpname);

                pgender = rs.getString("gender");
                if(pgender.equals("male"))
                {
                    pgender = "male";
                    pgen1.setSelected(true);
                }
                else if(pgender.equals("female"))
                {
                    pgender = "female";
                    pgen2.setSelected(true);
                }

                else{
                    pgen1.setSelected(false);
                    pgen2.setSelected(false);
                    }

                String setpcontact = rs.getString("contact");
                pcontact.setText(setpcontact);

                String setpaddr = rs.getString("address");
                paddress.setText(setpaddr);

                String setptreat = rs.getString("treatment");
                ptreatment.setText(setptreat);
                
                
                String setdept = rs.getString("dept");
                dept.setSelectedItem(setdept);
                
                String setdname = rs.getString("doctor");
                dname.setSelectedItem(setdname);
                
                

            }
            
        }
        catch(SQLException ex)
        {
            try {
                con.close();
            } catch (SQLException ex1) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }//GEN-LAST:event_psearchActionPerformed

    private void pdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdelActionPerformed
        //DELETE FROM `patient` WHERE 0
        
        try
        {
            String sql = "DELETE FROM patient WHERE ID=?";

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1,pid.getText());

            pst.executeUpdate();
            clearfield();
           
           
        }
        
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }

        showTableData();

    }//GEN-LAST:event_pdelActionPerformed

    private void pupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pupdateActionPerformed

 if(pname.getText().isEmpty() && paddress.getText().isEmpty() && pcontact.getText().isEmpty() && ptreatment.getText().isEmpty() && dept.getSelectedIndex()==-1 && dname.getSelectedIndex()==-1)
                {
                JOptionPane.showMessageDialog(null,"Please enter all fields!");
                }
else{
        try
        {
            String sql = "UPDATE patient SET name=?,gender=?,address=?,contact=?,treatment=?,dept=?,doctor=? WHERE ID=?";                    

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            pst = con.prepareStatement(sql);
            
            pst.setString(1,pname.getText());
            if(pgen1.isSelected())
            {
                pst.setString(2,"male");
            }
            else if(pgen2.isSelected())
            {
                pst.setString(2,"female");
            }
           
            pst.setString(3,paddress.getText());
            pst.setString(4,pcontact.getText());
            pst.setString(5,ptreatment.getText());
            pst.setString(6,(String)dept.getSelectedItem());
            pst.setString(7,(String)dname.getSelectedItem());
            pst.setString(8,pid.getText());
            pst.executeUpdate();

         clearfield();
         
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        showTableData();
}
    }//GEN-LAST:event_pupdateActionPerformed

    private void paddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paddActionPerformed

        if(pname.getText().isEmpty() && paddress.getText().isEmpty() && pcontact.getText().isEmpty() && ptreatment.getText().isEmpty() && dept.getSelectedIndex()==-1 && dname.getSelectedIndex()==-1)
                {
                JOptionPane.showMessageDialog(null,"Please enter all fields!");
                }
                  
        else{
                
                  try
        {

            String sql = "INSERT INTO patient"
            +"(name,gender,address,contact, treatment, dept,doctor)"
            +"VALUES (?,?,?,?,?,?,?)";

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
         
            pst = con.prepareStatement(sql);

            pst.setString(1,pname.getText());
            
            if(pgen1.isSelected())
            {
                pst.setString(2,"male");
            }
            else if(pgen2.isSelected())
            {
                pst.setString(2,"female");
            }
           
            pst.setString(3,paddress.getText());
            
            pst.setString(4,pcontact.getText());
            pst.setString(5,ptreatment.getText());
            pst.setString(6,(String)dept.getSelectedItem());
            pst.setString(7,(String)dname.getSelectedItem());
            pst.executeUpdate();
            
            clearfield();
            
         
        
        }
        catch(SQLException ex)

        {
            
            JOptionPane.showMessageDialog(null,ex);
        }
        showTableData();
                }
                
            
        
       
        
        // TODO add your handling code here:
    }//GEN-LAST:event_paddActionPerformed

    private void ptreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptreatmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptreatmentActionPerformed

    private void pcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcontactActionPerformed

    private void paddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paddressActionPerformed

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        try
        {
            String sql = "DELETE FROM doctor WHERE ID=?";

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1,DID.getText());

            pst.executeUpdate();
           
           clearfield1(); 
           j2();
        }
        
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }  
        showTableData1();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptActionPerformed
        //dept.removeAllItems();
        comboitem = (String) dept.getSelectedItem();
        j1(); 
        dept.setSelectedItem(comboitem);     
        j2();
        
    }//GEN-LAST:event_deptActionPerformed

    private void deptItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_deptItemStateChanged


    }//GEN-LAST:event_deptItemStateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

      if(ddname.getText().isEmpty() && dcontact.getText().isEmpty() && daddress.getText().isEmpty() )                   
                {
                JOptionPane.showMessageDialog(null,"Please enter all fields!");
  
                }
      else{
        try
        {

            String sql = "INSERT INTO doctor"
            +"(name,gender,address,contact, dept)"
            +"VALUES (?,?,?,?,?)";

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
          

            pst = con.prepareStatement(sql);
            pst.setString(1,ddname.getText());
            
            if(dgen1.isSelected())
            {
                pst.setString(2,"male");
            }
            else if(dgen2.isSelected())
            {
                pst.setString(2,"female");
            }
          

            pst.setString(3,dcontact.getText());
            
            
            pst.setString(4,daddress.getText());
            
            pst.setString(5,(String)ddept.getSelectedItem());
            
            pst.executeUpdate();
            
        clearfield1(); 
        j2();
        
        }
        catch(SQLException ex)

        {
            
            JOptionPane.showMessageDialog(null,ex);
        }

 showTableData1();
      }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void dnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnameActionPerformed

//dept.removeAllItems();
        // TODO add your handling code here:
    }//GEN-LAST:event_dnameActionPerformed

    private void dnameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dnameItemStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_dnameItemStateChanged

    private void deptFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_deptFocusGained
//dept.removeAllItems();

        // TODO add your handling code here:
    }//GEN-LAST:event_deptFocusGained

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){

String sql = "select * from login where username = ? and password = ?";
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1,user.getText());
            pst.setString(2,pass.getText());
            rs = pst.executeQuery();
            if(rs.next())
            {
                //JOptionPane.showMessageDialog(null,"username and password matched");
                this.setVisible(false);
                jFrame1.setVisible(true);


            }
            else
            {
                JOptionPane.showMessageDialog(null,"username and password do not match");
            }
            
        }
        catch(SQLException ex)
        {
    
            JOptionPane.showMessageDialog(null,ex);
        }
    

}
        

        // TODO add your handling code here:
    }//GEN-LAST:event_passKeyPressed

    private void dgen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dgen1ActionPerformed
                dgender = "male";        // TODO add your handling code here:
    }//GEN-LAST:event_dgen1ActionPerformed

    private void dgen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dgen2ActionPerformed
                dgender= "female";        // TODO add your handling code here:
    }//GEN-LAST:event_dgen2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        
        
        try
        {
            String sql = "UPDATE doctor SET name=?,gender=?,address=?,contact=?,dept=? WHERE ID=?";

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            pst = con.prepareStatement(sql);
            
            pst.setString(1,ddname.getText());
            if(dgen1.isSelected())
            {
                pst.setString(2,"male");
            }
            else if(dgen2.isSelected())
            {
                pst.setString(2,"female");
            }
          
            
            pst.setString(3,daddress.getText());
            pst.setString(4,dcontact.getText());
            pst.setString(5,(String)ddept.getSelectedItem());
            pst.setString(6,DID.getText());
            pst.executeUpdate();
            
         clearfield1();
         j2();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }   
             showTableData2();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            String sql = "SELECT * FROM doctor WHERE ID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1,DID.getText());
            rs = pst.executeQuery();
            if(rs.next())
            {
                String setdpid = rs.getString("ID");
                DID.setText(setdpid);

                String setdname = rs.getString("name");
                ddname.setText(setdname);

                dgender = rs.getString("gender");
                if(dgender.equals("male"))
                {
                    dgender = "male";
                    dgen1.setSelected(true);
                }
                else if(dgender.equals("female"))
                {
                    dgender = "female";
                    dgen2.setSelected(true);
                }

                else{
                    dgender = "male";
                      dgen1.setSelected(true);
                    }

                String setdcontact = rs.getString("contact");
                daddress.setText(setdcontact);

                String setdaddr = rs.getString("address");
                dcontact.setText(setdaddr);
                String setddept = rs.getString("dept");
                ddept.setSelectedItem(setddept);
                
                
                
                //String setpdept = rs.getString("dept");
               //d pdept.setText(setpdept);

            }
            
        }
        catch(SQLException ex)
        {
            try {
                con.close();
            } catch (SQLException ex1) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }  
        showTableData1();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        if(name.getText().isEmpty() && hod.getText().isEmpty() )                   
                {
                JOptionPane.showMessageDialog(null,"Please enter all fields!");
  
                }
        else{
        
        try
        {

            String sql = "INSERT INTO dept"
            +"(name,head)"
            +"VALUES (?,?)";

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");

            pst = con.prepareStatement(sql);
            pst.setString(1,name.getText());
           
            pst.setString(2,hod.getText());
            
            pst.executeUpdate();

        
       comboitem = (String) dept.getSelectedItem();
        
        
        j1(); 
        dept.setSelectedItem(comboitem);
        
       comboitem2 = (String) ddept.getSelectedItem();
        
       j3(); 
        ddept.setSelectedItem(comboitem2); 
        clearfield2();
        
        }
        
        catch(SQLException ex)

        {
            
            JOptionPane.showMessageDialog(null,ex);
        }        // TODO add your handling code here:
        
        showTableData2();}
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        if(name.getText().isEmpty() && hod.getText().isEmpty() )                   
                {
                JOptionPane.showMessageDialog(null,"Please enter all fields!");
  
                }
        
        else{
        try
        {
            String sql = "UPDATE dept SET name=?,head=? WHERE DID=?";

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            pst = con.prepareStatement(sql);
            
            pst.setString(1,name.getText());
          
            pst.setString(2,hod.getText());
      
            pst.setString(3,id.getText());
            pst.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Data updated succesfully!!");
         
             comboitem = (String) dept.getSelectedItem();
        
        
        j1(); 
        dept.setSelectedItem(comboitem);
        
       comboitem2 = (String) ddept.getSelectedItem();
        
       j3(); 
        ddept.setSelectedItem(comboitem2);
        
        clearfield2();
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        } 
 showTableData2();
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        try
        {
            String sql = "DELETE FROM dept WHERE DID=?";

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1,id.getText());

            pst.executeUpdate();
             comboitem = (String) dept.getSelectedItem();
        
        
        j1(); 
        dept.setSelectedItem(comboitem);
        
       comboitem2 = (String) ddept.getSelectedItem();
        
       j3(); 
        ddept.setSelectedItem(comboitem2);
           clearfield2(); 
           
        }
        
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
showTableData2();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void changepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepassActionPerformed
if(ppass.getText().isEmpty() && pass1.getText().isEmpty() && pass2.getText().isEmpty())
{
    JOptionPane.showMessageDialog(null,"Please enter all fields!!");
}
else{
String sql = "select * from login where password = ?";
    try{    
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1,ppass.getText());
            
            rs = pst.executeQuery();
            if(rs.next())
            {
               if(pass1.getText().equals(pass2.getText())){
        
            String sql1 = "UPDATE login SET password = ?";

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");

            pst = con.prepareStatement(sql1);
            pst.setString(1,pass1.getText());
           
            pst.executeUpdate();
          
            clearfield3();
        JOptionPane.showMessageDialog(null,"Password Changed successfully!!");
        


            
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Passwords do not match");
            }
            
                       
               
            }
            else{
            JOptionPane.showMessageDialog(null,"Current password is wrong");
            }
     

        
    }
catch(SQLException ex)
    {
             JOptionPane.showMessageDialog(null,ex);  
    }
    }//GEN-LAST:event_changepassActionPerformed
    }
    
    
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            String sql = "SELECT * FROM dept WHERE DID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1,id.getText());
            rs = pst.executeQuery();
            if(rs.next())
            {
                String did = rs.getString("DID");
                id.setText(did);

                String dname = rs.getString("name");
                name.setText(dname);

                String sethod = rs.getString("head");
                hod.setText(sethod);

                

            }
            
        }
        catch(SQLException ex)
        {
            try {
                con.close();
            } catch (SQLException ex1) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
showTableData2();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void ddeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddeptActionPerformed

        comboitem2 = (String) ddept.getSelectedItem();
        
       j3(); 
        ddept.setSelectedItem(comboitem2);        // TODO add your handling code here:
    }//GEN-LAST:event_ddeptActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        jFrame1.dispose();
        user.setText("");
        pass.setText("");
        new login().setVisible(true);
           
    }//GEN-LAST:event_logoutActionPerformed

    private void pclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pclearActionPerformed
clearfield();        // TODO add your handling code here:
    }//GEN-LAST:event_pclearActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
clearfield1();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
clearfield2();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void userclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userclearActionPerformed
clearfield3();        // TODO add your handling code here:
    }//GEN-LAST:event_userclearActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

DefaultTableModel model = (DefaultTableModel)jTable2.getModel();   
int selectedRowIndex = jTable2.getSelectedRow();

                DID.setText(model.getValueAt(selectedRowIndex,0).toString());
                
                ddname.setText(model.getValueAt(selectedRowIndex,1).toString());

                dgender = (model.getValueAt(selectedRowIndex,2).toString());
                if(dgender.equals("male"))
                {
                    dgender = "male";
                    dgen1.setSelected(true);
                }
                else if(dgender.equals("female"))
                {
                    dgender = "female";
                    dgen2.setSelected(true);
                }

                else{
                    dgender = "male";
                      dgen1.setSelected(true);
                    }

                daddress.setText(model.getValueAt(selectedRowIndex,3).toString());

               
                dcontact.setText(model.getValueAt(selectedRowIndex,4).toString());
               
                ddept.setSelectedItem(model.getValueAt(selectedRowIndex,5).toString());
                


// TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
DefaultTableModel model = (DefaultTableModel)jTable1.getModel();   
int selectedRowIndex = jTable1.getSelectedRow();

pid.setText(model.getValueAt(selectedRowIndex,0).toString());
pname.setText(model.getValueAt(selectedRowIndex,1).toString());
pgender = (model.getValueAt(selectedRowIndex,2).toString());

 if(pgender.equals("male"))
                {
                    pgender = "male";
                    pgen1.setSelected(true);
                }
                else if(pgender.equals("female"))
                {
                    pgender = "female";
                    pgen2.setSelected(true);
                }

                else{
                    pgen1.setSelected(true);
                    }

 paddress.setText(model.getValueAt(selectedRowIndex,3).toString());
 pcontact.setText(model.getValueAt(selectedRowIndex,4).toString());
 ptreatment.setText(model.getValueAt(selectedRowIndex,5).toString());
 
  String setdept = model.getValueAt(selectedRowIndex,6).toString();
                dept.setSelectedItem(setdept);
                
                String setdname = model.getValueAt(selectedRowIndex,7).toString();
                dname.setSelectedItem(setdname);
 
 
 
 
 
 
 
// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable3KeyPressed


        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3KeyPressed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked

DefaultTableModel model = (DefaultTableModel)jTable3.getModel();   
int selectedRowIndex = jTable3.getSelectedRow();

       id.setText(model.getValueAt(selectedRowIndex,0).toString());
       name.setText(model.getValueAt(selectedRowIndex,1).toString());
       hod.setText(model.getValueAt(selectedRowIndex,2).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void pidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pidKeyReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_pidKeyReleased

    private void DIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DIDKeyReleased




        // TODO add your handling code here:
    }//GEN-LAST:event_DIDKeyReleased

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased

// TODO add your handling code here:
    }//GEN-LAST:event_idKeyReleased

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>




        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login().setVisible(true);
                
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DID;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton changepass;
    private javax.swing.JTextField daddress;
    private javax.swing.JTextField dcontact;
    private javax.swing.JComboBox<String> ddept;
    private javax.swing.JTextField ddname;
    private javax.swing.JComboBox<String> dept;
    private javax.swing.JRadioButton dgen1;
    private javax.swing.JRadioButton dgen2;
    private javax.swing.JComboBox<String> dname;
    private javax.swing.JButton exit;
    private javax.swing.JTextField hod;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton loginbutton;
    private javax.swing.JButton logout;
    private javax.swing.JTabbedPane main;
    private javax.swing.JTextField name;
    private javax.swing.JButton padd;
    private javax.swing.JTextField paddress;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JButton pclear;
    private javax.swing.JTextField pcontact;
    private javax.swing.JButton pdel;
    private javax.swing.JRadioButton pgen1;
    private javax.swing.JRadioButton pgen2;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JPasswordField ppass;
    private javax.swing.JButton psearch;
    private javax.swing.JTextField ptreatment;
    private javax.swing.JButton pupdate;
    private javax.swing.JTextField user;
    private javax.swing.JButton userclear;
    // End of variables declaration//GEN-END:variables
}
