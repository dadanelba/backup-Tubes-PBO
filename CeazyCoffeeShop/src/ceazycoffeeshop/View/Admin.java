/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceazycoffeeshop.View;

import ceazycoffeeshop.Connection.Config;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author M- Jeek
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        setLocationRelativeTo(this);
        listMenu();
        listVoucher();
        tampilAdmin();
        tampilKafe();
    }
    
    public void tampilKafe(){
        try{
            String query = "SELECT * FROM kafe";
            Connection conn = Config.getConnection();
            Statement stat = conn.createStatement();
            ResultSet rs=stat.executeQuery(query);
            
            while (rs.next()) {
                namaKafe.setText(rs.getString("namaKafe"));
                alamat.setText(rs.getString("alamatKafe"));
                notelp.setText(rs.getString("notelpKafe"));
                web.setText(rs.getString("webKafe"));
            };
            stat.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public void tampilAdmin(){
        try{
            String query = "SELECT * FROM admin";
            Connection conn = Config.getConnection();
            Statement stat = conn.createStatement();
            ResultSet rs=stat.executeQuery(query);
            
            while (rs.next()) {
                userName.setText(rs.getString("username"));
            };
            stat.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void listMenu(){
        DefaultTableModel modelMenu = new DefaultTableModel();
        
        tabelMenu.setModel(modelMenu);
        modelMenu.addColumn("ID"); 
        modelMenu.addColumn("Nama Menu");
        modelMenu.addColumn("Harga Menu");
        modelMenu.addColumn("Jenis");

        modelMenu.getDataVector( ).removeAllElements( );
        modelMenu.fireTableDataChanged( );
        try{
            Statement stat = (Statement) Config.getConnection().createStatement( );
            String sql     = "SELECT * FROM menu ORDER BY jenisMenu DESC";
            ResultSet res   = stat.executeQuery(sql);
            while(res.next ()){
                Object[ ] obj = new Object[4];
                obj[0] = res.getInt("id");
                obj[1] = res.getString("namaMenu");
                obj[2] = res.getInt("hargaMenu");
                obj[3] = res.getString("jenisMenu");
                modelMenu.addRow(obj);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
      }
    }
    
    private void listVoucher(){
        DefaultTableModel modelMenu = new DefaultTableModel();   
        tabelVoucher.setModel(modelMenu);
        modelMenu.addColumn("ID"); 
        modelMenu.addColumn("Kode Voucher");
        modelMenu.addColumn("Diskon");
        modelMenu.getDataVector( ).removeAllElements( );
        modelMenu.fireTableDataChanged( );
        try{
            Statement stat = (Statement) Config.getConnection().createStatement( );
            String sql     = "SELECT * FROM vouchers";
            ResultSet res   = stat.executeQuery(sql);
            while(res.next ()){
                Object[ ] obj = new Object[4];
                obj[0] = res.getInt("id");
                obj[1] = res.getString("kode_voucher");
                obj[2] = res.getInt("diskon");
                modelMenu.addRow(obj);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
      }
    }
    
    String active = "listPesanan";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        listPesanan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        listMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        listVoucher = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        listTransaksi = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        notelp = new javax.swing.JLabel();
        namaKafe = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        web = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        namaMenu = new javax.swing.JLabel();
        Container = new javax.swing.JPanel();
        importPesanan = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        importMenu = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelMenu = new javax.swing.JTable();
        importVoucher = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelVoucher = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        importTransaksi = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(153, 102, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listPesanan.setBackground(new java.awt.Color(169, 115, 6));
        listPesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listPesananMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Daftar Pesanan");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceazycoffeeshop/Asset/list.png"))); // NOI18N

        javax.swing.GroupLayout listPesananLayout = new javax.swing.GroupLayout(listPesanan);
        listPesanan.setLayout(listPesananLayout);
        listPesananLayout.setHorizontalGroup(
            listPesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listPesananLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(77, 77, 77))
        );
        listPesananLayout.setVerticalGroup(
            listPesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listPesananLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
            .addGroup(listPesananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(listPesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 334, -1));

        listMenu.setBackground(new java.awt.Color(169, 115, 6));
        listMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listMenuMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Daftar Menu");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceazycoffeeshop/Asset/coffee-cup.png"))); // NOI18N

        javax.swing.GroupLayout listMenuLayout = new javax.swing.GroupLayout(listMenu);
        listMenu.setLayout(listMenuLayout);
        listMenuLayout.setHorizontalGroup(
            listMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listMenuLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listMenuLayout.setVerticalGroup(
            listMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listMenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(listMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(listMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 334, -1));

        listVoucher.setBackground(new java.awt.Color(169, 115, 6));
        listVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listVoucherMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Daftar Voucher");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceazycoffeeshop/Asset/discount-voucher.png"))); // NOI18N

        javax.swing.GroupLayout listVoucherLayout = new javax.swing.GroupLayout(listVoucher);
        listVoucher.setLayout(listVoucherLayout);
        listVoucherLayout.setHorizontalGroup(
            listVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listVoucherLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(84, 84, 84))
        );
        listVoucherLayout.setVerticalGroup(
            listVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listVoucherLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(listVoucherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(listVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 330, -1));

        listTransaksi.setBackground(new java.awt.Color(169, 115, 6));
        listTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listTransaksiMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Daftar Transaksi");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceazycoffeeshop/Asset/transaction.png"))); // NOI18N

        javax.swing.GroupLayout listTransaksiLayout = new javax.swing.GroupLayout(listTransaksi);
        listTransaksi.setLayout(listTransaksiLayout);
        listTransaksiLayout.setHorizontalGroup(
            listTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listTransaksiLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(72, 72, 72))
        );
        listTransaksiLayout.setVerticalGroup(
            listTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listTransaksiLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listTransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(listTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 334, -1));

        jPanel3.setBackground(new java.awt.Color(240, 224, 190));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 250, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceazycoffeeshop/Asset/user.png"))); // NOI18N
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 130, 130));

        notelp.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        notelp.setForeground(new java.awt.Color(255, 255, 255));
        notelp.setText("alamat");
        jPanel7.add(notelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 110, 20));

        namaKafe.setFont(new java.awt.Font("Source Sans Pro Black", 1, 18)); // NOI18N
        namaKafe.setForeground(new java.awt.Color(255, 255, 255));
        namaKafe.setText("namakafe");
        jPanel7.add(namaKafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        alamat.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        alamat.setForeground(new java.awt.Color(255, 255, 255));
        alamat.setText("alamat");
        jPanel7.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 270, 20));

        web.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        web.setForeground(new java.awt.Color(255, 255, 255));
        web.setText("alamat");
        jPanel7.add(web, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 140, 20));

        userName.setFont(new java.awt.Font("Source Sans Pro Semibold", 3, 24)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("Admin");
        jPanel7.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceazycoffeeshop/Asset/logo_small.png"))); // NOI18N
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 690, 100, 50));

        Header.setBackground(new java.awt.Color(153, 153, 153));

        namaMenu.setFont(new java.awt.Font("Source Sans Pro Semibold", 3, 24)); // NOI18N
        namaMenu.setForeground(new java.awt.Color(255, 255, 255));
        namaMenu.setText("Admin Page");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(namaMenu)
                .addGap(46, 46, 46))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(namaMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Source Sans Pro Black", 2, 36)); // NOI18N
        jLabel11.setText("BELUM BERES!!! [Pesanan]");

        javax.swing.GroupLayout importPesananLayout = new javax.swing.GroupLayout(importPesanan);
        importPesanan.setLayout(importPesananLayout);
        importPesananLayout.setHorizontalGroup(
            importPesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, importPesananLayout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        importPesananLayout.setVerticalGroup(
            importPesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(importPesananLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(367, Short.MAX_VALUE))
        );

        Container.add(importPesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 900, 800));

        importMenu.setBackground(new java.awt.Color(255, 255, 255));

        tabelMenu.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tabelMenu);

        javax.swing.GroupLayout importMenuLayout = new javax.swing.GroupLayout(importMenu);
        importMenu.setLayout(importMenuLayout);
        importMenuLayout.setHorizontalGroup(
            importMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        importMenuLayout.setVerticalGroup(
            importMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(importMenuLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 373, Short.MAX_VALUE))
        );

        Container.add(importMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 900, 800));

        importVoucher.setBackground(new java.awt.Color(255, 255, 255));

        tabelVoucher.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tabelVoucher);

        jButton1.setBackground(new java.awt.Color(153, 102, 0));
        jButton1.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tambah");

        javax.swing.GroupLayout importVoucherLayout = new javax.swing.GroupLayout(importVoucher);
        importVoucher.setLayout(importVoucherLayout);
        importVoucherLayout.setHorizontalGroup(
            importVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, importVoucherLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        importVoucherLayout.setVerticalGroup(
            importVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(importVoucherLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 324, Short.MAX_VALUE))
        );

        Container.add(importVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 900, 800));

        jLabel12.setFont(new java.awt.Font("Source Sans Pro Black", 2, 36)); // NOI18N
        jLabel12.setText("BELUM BERES!!! [Transaksi]");

        jPanel1.setBackground(new java.awt.Color(220, 200, 160));

        jButton2.setBackground(new java.awt.Color(153, 102, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceazycoffeeshop/Asset/printing-tool.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setDefaultCapable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout importTransaksiLayout = new javax.swing.GroupLayout(importTransaksi);
        importTransaksi.setLayout(importTransaksiLayout);
        importTransaksiLayout.setHorizontalGroup(
            importTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, importTransaksiLayout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        importTransaksiLayout.setVerticalGroup(
            importTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(importTransaksiLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        Container.add(importTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 1, 900, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listPesananMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPesananMousePressed
        active = "listPesanan";
        namaMenu.setText("Daftar Pesanan");
        listPesanan.setBackground(new Color(169,115,100));
        listMenu.setBackground(new Color(169,115,6));
        listVoucher.setBackground(new Color(169,115,6));
        listTransaksi.setBackground( new Color (169,115,6));
        importPesanan.setVisible(true);
        importMenu.setVisible(false);
        importVoucher.setVisible(false);
        importTransaksi.setVisible(false);
    }//GEN-LAST:event_listPesananMousePressed

    private void listMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMenuMousePressed
        active = "listPesanan";
        namaMenu.setText("Daftar Menu");
        listPesanan.setBackground(new Color(169,115,6));
        listMenu.setBackground(new Color(169,115,100));
        listVoucher.setBackground(new Color(169,115,6));
        listTransaksi.setBackground( new Color (169,115,6));
        importPesanan.setVisible(false);
        importMenu.setVisible(true);
        importVoucher.setVisible(false);
        importTransaksi.setVisible(false);
    }//GEN-LAST:event_listMenuMousePressed

    private void listVoucherMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listVoucherMousePressed
        active = "listPesanan";
        namaMenu.setText("Daftar Voucher");
        listPesanan.setBackground(new Color(169,115,6));
        listMenu.setBackground(new Color(169,115,6));
        listVoucher.setBackground(new Color(169,115,100));
        listTransaksi.setBackground( new Color (169,115,6));
        importPesanan.setVisible(false);
        importMenu.setVisible(false);
        importVoucher.setVisible(true);
        importTransaksi.setVisible(false);
    }//GEN-LAST:event_listVoucherMousePressed

    private void listTransaksiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTransaksiMousePressed
        active = "listPesanan";
        namaMenu.setText("Daftar Transaksi");
        listPesanan.setBackground(new Color(169,115,6));
        listMenu.setBackground(new Color(169,115,6));
        listVoucher.setBackground(new Color(169,115,6));
        listTransaksi.setBackground( new Color (169,115,100));
        importPesanan.setVisible(false);
        importMenu.setVisible(false);
        importVoucher.setVisible(false);
        importTransaksi.setVisible(true);
    }//GEN-LAST:event_listTransaksiMousePressed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel alamat;
    private javax.swing.JPanel importMenu;
    private javax.swing.JPanel importPesanan;
    private javax.swing.JPanel importTransaksi;
    private javax.swing.JPanel importVoucher;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel listMenu;
    private javax.swing.JPanel listPesanan;
    private javax.swing.JPanel listTransaksi;
    private javax.swing.JPanel listVoucher;
    private javax.swing.JLabel namaKafe;
    private javax.swing.JLabel namaMenu;
    private javax.swing.JLabel notelp;
    private javax.swing.JTable tabelMenu;
    private javax.swing.JTable tabelVoucher;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel web;
    // End of variables declaration//GEN-END:variables
}