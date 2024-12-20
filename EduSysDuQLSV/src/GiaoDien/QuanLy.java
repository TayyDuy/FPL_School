/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import static GiaoDien.DangNhap.user;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class QuanLy extends javax.swing.JFrame {

    /**
     * Creates new form QuanLy
     */
    
    public static int tongHop;
    
    public QuanLy() {
        initComponents();
        setLocationRelativeTo(null);
        init();
    }
    
    void init(){
        if(user == true){
            mnuIQLNV.setEnabled(false);
            mnuThongKe.setEnabled(false);
        }
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                Calendar cal = Calendar.getInstance();
                lbTime.setText(sdf.format(cal.getTime()));
            }
        }).start();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        pnBackGround1 = new javax.swing.JPanel(){
            URL erlicon = QuanLy.class.getResource("/Image/logo.png");
            Image img = new ImageIcon(erlicon).getImage();
            ImageIcon icon = new ImageIcon(img);
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, this);
                setOpaque(false);
                super.paintComponent(g);
            }};
            jMenuBar1 = new javax.swing.JMenuBar();
            jMenu1 = new javax.swing.JMenu();
            jMenuItem1 = new javax.swing.JMenuItem();
            jMenuItem2 = new javax.swing.JMenuItem();
            jMenuItem3 = new javax.swing.JMenuItem();
            jMenuItem4 = new javax.swing.JMenuItem();
            jMenu2 = new javax.swing.JMenu();
            jMenuItem5 = new javax.swing.JMenuItem();
            jMenuItem6 = new javax.swing.JMenuItem();
            jMenuItem7 = new javax.swing.JMenuItem();
            jMenuItem8 = new javax.swing.JMenuItem();
            mnuIQLNV = new javax.swing.JMenuItem();
            mnuThongKe = new javax.swing.JMenu();
            jMenuItem9 = new javax.swing.JMenuItem();
            jSeparator1 = new javax.swing.JPopupMenu.Separator();
            jMenuItem10 = new javax.swing.JMenuItem();
            jMenuItem11 = new javax.swing.JMenuItem();
            jSeparator2 = new javax.swing.JPopupMenu.Separator();
            jMenuItem12 = new javax.swing.JMenuItem();
            jMenu4 = new javax.swing.JMenu();
            jMenuItem13 = new javax.swing.JMenuItem();
            jMenuItem14 = new javax.swing.JMenuItem();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Lập trình City");

            jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
            jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            jToolBar1.setRollover(true);

            jButton1.setForeground(new java.awt.Color(0, 204, 0));
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Exit.png"))); // NOI18N
            jButton1.setText("Đăng xuất");
            jButton1.setFocusable(false);
            jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });
            jToolBar1.add(jButton1);

            jButton2.setForeground(new java.awt.Color(0, 204, 0));
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Stop sign.png"))); // NOI18N
            jButton2.setText("Kết thúc");
            jButton2.setFocusable(false);
            jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });
            jToolBar1.add(jButton2);
            jToolBar1.add(jSeparator4);

            jButton3.setForeground(new java.awt.Color(0, 204, 0));
            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/List.png"))); // NOI18N
            jButton3.setText("Chuyên đề");
            jButton3.setFocusable(false);
            jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });
            jToolBar1.add(jButton3);

            jButton6.setForeground(new java.awt.Color(0, 204, 0));
            jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/People.png"))); // NOI18N
            jButton6.setText("Người học");
            jButton6.setFocusable(false);
            jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            jButton6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton6ActionPerformed(evt);
                }
            });
            jToolBar1.add(jButton6);

            jButton4.setForeground(new java.awt.Color(0, 204, 0));
            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Bee.png"))); // NOI18N
            jButton4.setText("Khoá học");
            jButton4.setFocusable(false);
            jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton4ActionPerformed(evt);
                }
            });
            jToolBar1.add(jButton4);

            jButton7.setForeground(new java.awt.Color(0, 204, 51));
            jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Female.png"))); // NOI18N
            jButton7.setText("Học Viên");
            jButton7.setFocusable(false);
            jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            jButton7.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton7ActionPerformed(evt);
                }
            });
            jToolBar1.add(jButton7);
            jToolBar1.add(jSeparator3);

            jButton5.setForeground(new java.awt.Color(0, 204, 0));
            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Earth.png"))); // NOI18N
            jButton5.setText("Hướng dẫn");
            jButton5.setFocusable(false);
            jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            jButton5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton5ActionPerformed(evt);
                }
            });
            jToolBar1.add(jButton5);

            jPanel1.setBackground(new java.awt.Color(255, 204, 204));
            jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel2.setForeground(new java.awt.Color(0, 0, 255));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Info.png"))); // NOI18N
            jLabel2.setText("Hệ thống quản lí đào tạo");

            lbTime.setForeground(new java.awt.Color(255, 0, 51));
            lbTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Alarm.png"))); // NOI18N
            lbTime.setText("Time");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                    .addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(69, 69, 69))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(lbTime))
            );

            javax.swing.GroupLayout pnBackGround1Layout = new javax.swing.GroupLayout(pnBackGround1);
            pnBackGround1.setLayout(pnBackGround1Layout);
            pnBackGround1Layout.setHorizontalGroup(
                pnBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE)
            );
            pnBackGround1Layout.setVerticalGroup(
                pnBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 525, Short.MAX_VALUE)
            );

            jMenu1.setText("Hệ Thống");

            jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
            jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Blue key.png"))); // NOI18N
            jMenuItem1.setText("Đăng nhập");
            jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem1ActionPerformed(evt);
                }
            });
            jMenu1.add(jMenuItem1);

            jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
            jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Exit.png"))); // NOI18N
            jMenuItem2.setText("Đăng xuất");
            jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem2ActionPerformed(evt);
                }
            });
            jMenu1.add(jMenuItem2);

            jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
            jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sync.png"))); // NOI18N
            jMenuItem3.setText("Đổi mật khẩu");
            jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem3ActionPerformed(evt);
                }
            });
            jMenu1.add(jMenuItem3);

            jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
            jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Stop sign.png"))); // NOI18N
            jMenuItem4.setText("Kết thúc");
            jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem4ActionPerformed(evt);
                }
            });
            jMenu1.add(jMenuItem4);

            jMenuBar1.add(jMenu1);

            jMenu2.setText("Quản Lý");

            jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/People.png"))); // NOI18N
            jMenuItem5.setText("Người học");
            jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem5ActionPerformed(evt);
                }
            });
            jMenu2.add(jMenuItem5);

            jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Bee.png"))); // NOI18N
            jMenuItem6.setText("Khoá học");
            jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem6ActionPerformed(evt);
                }
            });
            jMenu2.add(jMenuItem6);

            jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/List.png"))); // NOI18N
            jMenuItem7.setText("Chuyên đề");
            jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem7ActionPerformed(evt);
                }
            });
            jMenu2.add(jMenuItem7);

            jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Female.png"))); // NOI18N
            jMenuItem8.setText("Học Viên");
            jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem8ActionPerformed(evt);
                }
            });
            jMenu2.add(jMenuItem8);

            mnuIQLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/User group.png"))); // NOI18N
            mnuIQLNV.setText("Quản Lý Nhân Viên");
            mnuIQLNV.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    mnuIQLNVActionPerformed(evt);
                }
            });
            jMenu2.add(mnuIQLNV);

            jMenuBar1.add(jMenu2);

            mnuThongKe.setText("Thống Kê");

            jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Female.png"))); // NOI18N
            jMenuItem9.setText("Người học từng năm");
            jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem9ActionPerformed(evt);
                }
            });
            mnuThongKe.add(jMenuItem9);
            mnuThongKe.add(jSeparator1);

            jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Text.png"))); // NOI18N
            jMenuItem10.setText("Bảng điểm từng khoá");
            jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem10ActionPerformed(evt);
                }
            });
            mnuThongKe.add(jMenuItem10);

            jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/3d bar chart.png"))); // NOI18N
            jMenuItem11.setText("Điểm từng khoá học");
            jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem11ActionPerformed(evt);
                }
            });
            mnuThongKe.add(jMenuItem11);
            mnuThongKe.add(jSeparator2);

            jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Dollar.png"))); // NOI18N
            jMenuItem12.setText("Doanh thu từng chuyên đề");
            jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem12ActionPerformed(evt);
                }
            });
            mnuThongKe.add(jMenuItem12);

            jMenuBar1.add(mnuThongKe);

            jMenu4.setText("Trợ Giúp");

            jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Earth.png"))); // NOI18N
            jMenuItem13.setText("Hướng dẫn sử dụng");
            jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem13ActionPerformed(evt);
                }
            });
            jMenu4.add(jMenuItem13);

            jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Home.png"))); // NOI18N
            jMenuItem14.setText("Giới thiệu sản phẩm");
            jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem14ActionPerformed(evt);
                }
            });
            jMenu4.add(jMenuItem14);

            jMenuBar1.add(jMenu4);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnBackGround1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pnBackGround1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new DangNhap(null, true).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new QuanLyKhoaHoc(null, true).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new DangNhap(null, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new DoiMatKhau(null, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát khỏi ứng dụng không");
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        new QuanLyNguoiHoc(null, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        new QuanLyKhoaHoc(null, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        new QuanLyChuyenDe(null, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void mnuIQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIQLNVActionPerformed
        // TODO add your handling code here:
        new QuanLyNhanVienQuanTri(null, true).setVisible(true);
    }//GEN-LAST:event_mnuIQLNVActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        new TongHopThongKe(null, true).setVisible(true);
        tongHop = 0;
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        new TongHopThongKe(null, true).setVisible(true);
        tongHop = 1;
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        new TongHopThongKe(null, true).setVisible(true);
        tongHop = 2;
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        new TongHopThongKe(null, true).setVisible(true);
        tongHop = 3;
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        new HuongDanSuDung(null, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        new GioiThieuSP(null, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát khỏi ứng dụng không");
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new QuanLyChuyenDe(null, true).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new QuanLyNguoiHoc(null, true).setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new QuanLyHocVien(null, true).setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        new QuanLyHocVien(null, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbTime;
    private javax.swing.JMenuItem mnuIQLNV;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JPanel pnBackGround1;
    // End of variables declaration//GEN-END:variables
}
