import javax.swing.ImageIcon;
import java.awt.event.ActionListener;

public class CreateMenu extends javax.swing.JFrame {

    /**
     * Creates new form VMView
     */
    public CreateMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        Returnbtn = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        cSpecialVMbtn2 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        cRegularVMbtn2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cRegularVMbtn1 = new javax.swing.JLabel();
        cSpecialVMbtn1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(740, 520));
        setPreferredSize(new java.awt.Dimension(740, 520));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 150));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 105, 226));
        jLabel3.setText("MCO2");

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel4.setText("Create Menu");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(400, 100));

        Returnbtn.setBackground(new java.awt.Color(243, 245, 249));
        Returnbtn.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        Returnbtn.setText("Return to Main Menu");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(350, 50));

        cSpecialVMbtn2.setBackground(new java.awt.Color(243, 245, 249));
        cSpecialVMbtn2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        cSpecialVMbtn2.setForeground(new java.awt.Color(17, 105, 226));
        cSpecialVMbtn2.setText("Special Vending Machine");
        cSpecialVMbtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 105, 226)));
        cSpecialVMbtn2.setPreferredSize(new java.awt.Dimension(250, 40));

        jPanel10.add(cSpecialVMbtn2);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(350, 50));

        cRegularVMbtn2.setBackground(new java.awt.Color(17, 105, 226));
        cRegularVMbtn2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        cRegularVMbtn2.setForeground(new java.awt.Color(255, 255, 255));
        cRegularVMbtn2.setText("Regular Vending Machine");
        cRegularVMbtn2.setPreferredSize(new java.awt.Dimension(250, 40));

        jPanel11.add(cRegularVMbtn2);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(Returnbtn)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Returnbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        cRegularVMbtn1.setBackground(new java.awt.Color(255, 255, 255));
        cRegularVMbtn1.setForeground(new java.awt.Color(255, 255, 255));
        cRegularVMbtn1.setIcon(new ImageIcon("MCO2_Lim_Jimenez/resources/regularmachine.png"));
        cRegularVMbtn1.setBorder(null);

        cSpecialVMbtn1.setBackground(new java.awt.Color(255, 255, 255));
        cSpecialVMbtn1.setForeground(new java.awt.Color(255, 255, 255));
        cSpecialVMbtn1.setIcon(new ImageIcon("MCO2_Lim_Jimenez/resources/specialmachine.png"));
        cSpecialVMbtn1.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100,100,100)
                .addComponent(cRegularVMbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(cSpecialVMbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cRegularVMbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(cSpecialVMbtn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }
 
    public void ReturnbtnActionPerformed(ActionListener actionListener) {
        this.Returnbtn.addActionListener(actionListener);
    }

    public void cSpecialVMbtn2ActionPerformed(ActionListener actionListener) {
        this.cSpecialVMbtn2.addActionListener(actionListener);
    }

    public void cRegularVMbtn2ActionPerformed(ActionListener actionListener) {
        this.cRegularVMbtn2.addActionListener(actionListener);
    }

    public void setcRegularVMbtn2Text(String text) {
        this.cRegularVMbtn2.setText(text);
    }

    public void setcSpecialVMbtn2Text(String text) {
        this.cSpecialVMbtn2.setText(text);
    }

    // Variables declaration
    private javax.swing.JButton Returnbtn;
    private javax.swing.JLabel cRegularVMbtn1;
    private javax.swing.JButton cRegularVMbtn2;
    private javax.swing.JLabel cSpecialVMbtn1;
    private javax.swing.JButton cSpecialVMbtn2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration
}
