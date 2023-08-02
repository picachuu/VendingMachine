import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
  

public class TestMenu extends javax.swing.JFrame {

    /**
     * Creates new form VMView
     */
    private CardLayout cardLayout = new CardLayout();
    public TestMenu() {
        initComponents();
        cardLayout = (CardLayout)(testCards.getLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Vendbtn = new javax.swing.JButton();
        Returnbtn = new javax.swing.JButton();
        Maintbtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        testCards = new javax.swing.JPanel();
        vendcard = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        onePesoInsert = new javax.swing.JButton();
        fivePesoInsert = new javax.swing.JButton();
        tenPesoInsert = new javax.swing.JButton();
        twentyPesoInsert = new javax.swing.JButton();
        fiftyPesoInsert = new javax.swing.JButton();
        hundredPesoInsert = new javax.swing.JButton();
        twohundPesoInsert = new javax.swing.JButton();
        fivehundPesoInsert = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        cancelOrderBTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        orderbtn1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vendTestTextArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        vendTestbalance = new javax.swing.JButton();
        orderPrice1 = new javax.swing.JLabel();
        orderbtn2 = new javax.swing.JButton();
        orderPrice2 = new javax.swing.JLabel();
        orderbtn4 = new javax.swing.JButton();
        orderPrice4 = new javax.swing.JLabel();
        orderPrice3 = new javax.swing.JLabel();
        orderbtn3 = new javax.swing.JButton();
        orderbtn6 = new javax.swing.JButton();
        orderPrice6 = new javax.swing.JLabel();
        orderPrice5 = new javax.swing.JLabel();
        orderbtn5 = new javax.swing.JButton();
        orderbtn8 = new javax.swing.JButton();
        orderPrice8 = new javax.swing.JLabel();
        orderPrice7 = new javax.swing.JLabel();
        orderbtn7 = new javax.swing.JButton();
        maintcard = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        maintTestlabel1 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        maintTestPrice1 = new javax.swing.JFormattedTextField();
        maintTestQuantity1 = new javax.swing.JFormattedTextField();
        maintTestQuantity2 = new javax.swing.JFormattedTextField();
        maintTestPrice2 = new javax.swing.JFormattedTextField();
        maintTestlabel2 = new javax.swing.JLabel();
        maintTestQuantity3 = new javax.swing.JFormattedTextField();
        maintTestPrice3 = new javax.swing.JFormattedTextField();
        maintTestlabel3 = new javax.swing.JLabel();
        maintTestQuantity4 = new javax.swing.JFormattedTextField();
        maintTestPrice5 = new javax.swing.JFormattedTextField();
        maintTestlabel4 = new javax.swing.JLabel();
        maintTestQuantity5 = new javax.swing.JFormattedTextField();
        maintTestPrice6 = new javax.swing.JFormattedTextField();
        maintTestlabel5 = new javax.swing.JLabel();
        maintTestQuantity6 = new javax.swing.JFormattedTextField();
        maintTestPrice7 = new javax.swing.JFormattedTextField();
        maintTestlabel6 = new javax.swing.JLabel();
        maintTestQuantity7 = new javax.swing.JFormattedTextField();
        maintTestPrice8 = new javax.swing.JFormattedTextField();
        maintTestlabel7 = new javax.swing.JLabel();
        maintTestlabel8 = new javax.swing.JLabel();
        maintTestPrice9 = new javax.swing.JFormattedTextField();
        maintTestQuantity8 = new javax.swing.JFormattedTextField();
        maintTestQuantity10 = new javax.swing.JFormattedTextField();
        maintTestQuantity9 = new javax.swing.JFormattedTextField();
        maintTestPrice10 = new javax.swing.JFormattedTextField();
        maintTestPrice11 = new javax.swing.JFormattedTextField();
        maintTestlabel10 = new javax.swing.JLabel();
        maintTestlabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jFormattedTextField23 = new javax.swing.JFormattedTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jFormattedTextField24 = new javax.swing.JFormattedTextField();
        jFormattedTextField25 = new javax.swing.JFormattedTextField();
        jLabel49 = new javax.swing.JLabel();
        cRegularVMbtn10 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cSpecialVMbtn2 = new javax.swing.JButton();
        cRegularVMbtn11 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        submitbtn = new javax.swing.JButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(990, 500));
        setPreferredSize(new java.awt.Dimension(990, 500));

        jPanel3.setBackground(new java.awt.Color(17, 105, 226));
        jPanel3.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(247, 244, 168));
        jLabel3.setText("MCO2");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Test Menu");

        Vendbtn.setBackground(new java.awt.Color(243, 245, 249));
        Vendbtn.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        Vendbtn.setForeground(new java.awt.Color(17, 105, 226));
        Vendbtn.setText("Vending Features");
        Vendbtn.setPreferredSize(new java.awt.Dimension(250, 40));
        Vendbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendbtnActionPerformed(evt);
            }
        });

        Returnbtn.setBackground(new java.awt.Color(17, 105, 226));
        Returnbtn.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Returnbtn.setForeground(new java.awt.Color(255, 255, 255));
        Returnbtn.setText("Return to Main Menu");
        Returnbtn.setBorder(null);

        Maintbtn.setBackground(new java.awt.Color(243, 245, 249));
        Maintbtn.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        Maintbtn.setForeground(new java.awt.Color(17, 105, 226));
        Maintbtn.setText("Maintenance Features");
        Maintbtn.setPreferredSize(new java.awt.Dimension(250, 40));
        Maintbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaintbtnActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(17, 105, 226));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Maintbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Vendbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Returnbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(52, 52, 52)
                .addComponent(Vendbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(Maintbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Returnbtn)
                .addGap(17, 17, 17))
        );

        jSplitPane1.setLeftComponent(jPanel3);

        testCards.setPreferredSize(new java.awt.Dimension(522, 447));
        testCards.setLayout(new java.awt.CardLayout());

        vendcard.setBackground(new java.awt.Color(255, 255, 255));
        vendcard.setPreferredSize(new java.awt.Dimension(522, 447));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Vending Features");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(17, 105, 226));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 105, 226));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insert Payment:");

        onePesoInsert.setBackground(new java.awt.Color(17, 105, 226));
        onePesoInsert.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        onePesoInsert.setForeground(new java.awt.Color(255, 255, 255));
        onePesoInsert.setText("P1");
        onePesoInsert.setMaximumSize(new java.awt.Dimension(63, 24));
        onePesoInsert.setMinimumSize(new java.awt.Dimension(63, 24));
        onePesoInsert.setPreferredSize(new java.awt.Dimension(63, 24));

        fivePesoInsert.setBackground(new java.awt.Color(17, 105, 226));
        fivePesoInsert.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        fivePesoInsert.setForeground(new java.awt.Color(255, 255, 255));
        fivePesoInsert.setText("P5");
        fivePesoInsert.setPreferredSize(new java.awt.Dimension(250, 40));

        tenPesoInsert.setBackground(new java.awt.Color(17, 105, 226));
        tenPesoInsert.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        tenPesoInsert.setForeground(new java.awt.Color(255, 255, 255));
        tenPesoInsert.setText("P10");
        tenPesoInsert.setPreferredSize(new java.awt.Dimension(250, 40));

        twentyPesoInsert.setBackground(new java.awt.Color(17, 105, 226));
        twentyPesoInsert.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        twentyPesoInsert.setForeground(new java.awt.Color(255, 255, 255));
        twentyPesoInsert.setText("P20");
        twentyPesoInsert.setPreferredSize(new java.awt.Dimension(250, 40));

        fiftyPesoInsert.setBackground(new java.awt.Color(17, 105, 226));
        fiftyPesoInsert.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        fiftyPesoInsert.setForeground(new java.awt.Color(255, 255, 255));
        fiftyPesoInsert.setText("P50");
        fiftyPesoInsert.setPreferredSize(new java.awt.Dimension(250, 40));

        hundredPesoInsert.setBackground(new java.awt.Color(17, 105, 226));
        hundredPesoInsert.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        hundredPesoInsert.setForeground(new java.awt.Color(255, 255, 255));
        hundredPesoInsert.setText("P100");
        hundredPesoInsert.setPreferredSize(new java.awt.Dimension(250, 40));

        twohundPesoInsert.setBackground(new java.awt.Color(17, 105, 226));
        twohundPesoInsert.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        twohundPesoInsert.setForeground(new java.awt.Color(255, 255, 255));
        twohundPesoInsert.setText("P200");
        twohundPesoInsert.setPreferredSize(new java.awt.Dimension(250, 40));

        fivehundPesoInsert.setBackground(new java.awt.Color(17, 105, 226));
        fivehundPesoInsert.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        fivehundPesoInsert.setForeground(new java.awt.Color(255, 255, 255));
        fivehundPesoInsert.setText("P500");
        fivehundPesoInsert.setMaximumSize(new java.awt.Dimension(63, 24));
        fivehundPesoInsert.setMinimumSize(new java.awt.Dimension(63, 24));
        fivehundPesoInsert.setPreferredSize(new java.awt.Dimension(63, 24));

        jSeparator1.setBackground(new java.awt.Color(17, 105, 226));
        jSeparator1.setForeground(new java.awt.Color(17, 105, 226));

        cancelOrderBTN.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        cancelOrderBTN.setForeground(new java.awt.Color(17, 105, 226));
        cancelOrderBTN.setBackground(new java.awt.Color(255, 255, 255));
        cancelOrderBTN.setText("Receive Change");
        cancelOrderBTN.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fivehundPesoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twohundPesoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hundredPesoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiftyPesoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twentyPesoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenPesoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fivePesoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onePesoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelOrderBTN))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(onePesoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fivePesoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tenPesoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(twentyPesoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fiftyPesoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hundredPesoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(twohundPesoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fivehundPesoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelOrderBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(new java.awt.Color(17, 105, 226));
        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 105, 226));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Order Item:");

        jSeparator2.setBackground(new java.awt.Color(17, 105, 226));
        jSeparator2.setForeground(new java.awt.Color(17, 105, 226));

        orderbtn1.setBackground(new java.awt.Color(242, 242, 242));
        orderbtn1.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        orderbtn1.setText("");
        orderbtn1.setToolTipText(null);

        jLabel9.setBackground(new java.awt.Color(17, 105, 226));
        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 105, 226));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("*Hover for details");

        vendTestTextArea.setEditable(false);
        vendTestTextArea.setColumns(20);
        vendTestTextArea.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        vendTestTextArea.setRows(5);
        jScrollPane1.setViewportView(vendTestTextArea);

        jLabel7.setBackground(new java.awt.Color(17, 105, 226));
        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(17, 105, 226));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vending Machine:");

        vendTestbalance.setBackground(new java.awt.Color(247, 244, 168));
        vendTestbalance.setFont(new java.awt.Font("Leelawadee UI", 2, 12)); // NOI18N
        vendTestbalance.setText("Balance: PHP 0");
        vendTestbalance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 242, 242), 3, true));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(vendTestbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendTestbalance)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        orderPrice1.setBackground(new java.awt.Color(17, 105, 226));
        orderPrice1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        orderPrice1.setForeground(new java.awt.Color(17, 105, 226));
        orderPrice1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        orderPrice1.setText("");

        orderbtn2.setBackground(new java.awt.Color(242, 242, 242));
        orderbtn2.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        orderbtn2.setText("");
        orderbtn2.setToolTipText(null);

        orderPrice2.setBackground(new java.awt.Color(17, 105, 226));
        orderPrice2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        orderPrice2.setForeground(new java.awt.Color(17, 105, 226));
        orderPrice2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        orderPrice2.setText("");

        orderbtn4.setBackground(new java.awt.Color(242, 242, 242));
        orderbtn4.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        orderbtn4.setText("");
        orderbtn4.setToolTipText(null);

        orderPrice4.setBackground(new java.awt.Color(17, 105, 226));
        orderPrice4.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        orderPrice4.setForeground(new java.awt.Color(17, 105, 226));
        orderPrice4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        orderPrice4.setText("");

        orderPrice3.setBackground(new java.awt.Color(17, 105, 226));
        orderPrice3.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        orderPrice3.setForeground(new java.awt.Color(17, 105, 226));
        orderPrice3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        orderPrice3.setText("");

        orderbtn3.setBackground(new java.awt.Color(242, 242, 242));
        orderbtn3.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        orderbtn3.setText("");
        orderbtn3.setToolTipText(null);

        orderbtn6.setBackground(new java.awt.Color(242, 242, 242));
        orderbtn6.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        orderbtn6.setText("");
        orderbtn6.setToolTipText(null);

        orderPrice6.setBackground(new java.awt.Color(17, 105, 226));
        orderPrice6.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        orderPrice6.setForeground(new java.awt.Color(17, 105, 226));
        orderPrice6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        orderPrice6.setText("");

        orderPrice5.setBackground(new java.awt.Color(17, 105, 226));
        orderPrice5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        orderPrice5.setForeground(new java.awt.Color(17, 105, 226));
        orderPrice5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        orderPrice5.setText("");

        orderbtn5.setBackground(new java.awt.Color(242, 242, 242));
        orderbtn5.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        orderbtn5.setText("");
        orderbtn5.setToolTipText(null);

        orderbtn8.setBackground(new java.awt.Color(242, 242, 242));
        orderbtn8.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        orderbtn8.setText("");
        orderbtn8.setToolTipText(null);

        orderPrice8.setBackground(new java.awt.Color(17, 105, 226));
        orderPrice8.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        orderPrice8.setForeground(new java.awt.Color(17, 105, 226));
        orderPrice8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        orderPrice8.setText("");

        orderPrice7.setBackground(new java.awt.Color(17, 105, 226));
        orderPrice7.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        orderPrice7.setForeground(new java.awt.Color(17, 105, 226));
        orderPrice7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        orderPrice7.setText("");

        orderbtn7.setBackground(new java.awt.Color(242, 242, 242));
        orderbtn7.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        orderbtn7.setText("");
        orderbtn7.setToolTipText(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(orderPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(orderbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(orderPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(orderbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(orderPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(orderbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(orderPrice4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(orderbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(orderPrice5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(orderbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(orderPrice6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(orderbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(orderPrice7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(orderbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(orderbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(orderPrice8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(orderPrice1)
                                .addGap(0, 0, 0)
                                .addComponent(orderbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(orderPrice2)
                                .addGap(0, 0, 0)
                                .addComponent(orderbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(orderPrice3)
                                .addGap(0, 0, 0)
                                .addComponent(orderbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(orderPrice4)
                                .addGap(0, 0, 0)
                                .addComponent(orderbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(orderPrice5)
                                .addGap(0, 0, 0)
                                .addComponent(orderbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(orderPrice6)
                                .addGap(0, 0, 0)
                                .addComponent(orderbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(orderPrice7)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(orderbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orderbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(orderPrice8)))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout vendcardLayout = new javax.swing.GroupLayout(vendcard);
        vendcard.setLayout(vendcardLayout);
        vendcardLayout.setHorizontalGroup(
            vendcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vendcardLayout.createSequentialGroup()
                .addGroup(vendcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vendcardLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vendcardLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        vendcardLayout.setVerticalGroup(
            vendcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vendcardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(vendcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        testCards.add(vendcard, "card1");

        maintcard.setBackground(new java.awt.Color(255, 255, 255));
        maintcard.setPreferredSize(new java.awt.Dimension(522, 447));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setBackground(new java.awt.Color(17, 105, 226));
        jLabel27.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(17, 105, 226));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Product Management:");

        jSeparator4.setBackground(new java.awt.Color(17, 105, 226));
        jSeparator4.setForeground(new java.awt.Color(17, 105, 226));

        maintTestlabel1.setBackground(new java.awt.Color(51, 51, 51));
        maintTestlabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        maintTestlabel1.setForeground(new java.awt.Color(51, 51, 51));
        maintTestlabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        maintTestlabel1.setText("1.) Pepperoni");

        jLabel36.setBackground(new java.awt.Color(17, 105, 226));
        jLabel36.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(17, 105, 226));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel28.setBackground(new java.awt.Color(17, 105, 226));
        jLabel28.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(17, 105, 226));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Price");

        jLabel31.setBackground(new java.awt.Color(17, 105, 226));
        jLabel31.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(17, 105, 226));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Quantity");

        maintTestPrice1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.##"))));
        maintTestPrice1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestPrice1.setText("P56.00");
        maintTestPrice1.setToolTipText(null);

        maintTestQuantity1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        maintTestQuantity1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestQuantity1.setText("60");
        maintTestQuantity1.setToolTipText(null);

        maintTestQuantity2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        maintTestQuantity2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestQuantity2.setText("60");
        maintTestQuantity2.setToolTipText(null);

        maintTestPrice2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.##"))));
        maintTestPrice2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestPrice2.setText("P56.00");
        maintTestPrice2.setToolTipText(null);


        maintTestlabel2.setBackground(new java.awt.Color(51, 51, 51));
        maintTestlabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        maintTestlabel2.setForeground(new java.awt.Color(51, 51, 51));
        maintTestlabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        maintTestlabel2.setText("1.) Pepperoni");

        maintTestQuantity3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        maintTestQuantity3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestQuantity3.setText("60");
        maintTestQuantity3.setToolTipText(null);


        maintTestPrice3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.##"))));
        maintTestPrice3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestPrice3.setText("P56.00");
        maintTestPrice3.setToolTipText(null);

        maintTestlabel3.setBackground(new java.awt.Color(51, 51, 51));
        maintTestlabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        maintTestlabel3.setForeground(new java.awt.Color(51, 51, 51));
        maintTestlabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        maintTestlabel3.setText("1.) Pepperoni");

        maintTestQuantity4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        maintTestQuantity4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestQuantity4.setText("60");
        maintTestQuantity4.setToolTipText(null);

        maintTestPrice5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.##"))));
        maintTestPrice5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestPrice5.setText("P56.00");
        maintTestPrice5.setToolTipText(null);

        maintTestlabel4.setBackground(new java.awt.Color(51, 51, 51));
        maintTestlabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        maintTestlabel4.setForeground(new java.awt.Color(51, 51, 51));
        maintTestlabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        maintTestlabel4.setText("1.) Pepperoni");

        maintTestQuantity5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        maintTestQuantity5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestQuantity5.setText("60");
        maintTestQuantity5.setToolTipText(null);

        maintTestPrice6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.##"))));
        maintTestPrice6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestPrice6.setText("P56.00");
        maintTestPrice6.setToolTipText(null);

        maintTestlabel5.setBackground(new java.awt.Color(51, 51, 51));
        maintTestlabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        maintTestlabel5.setForeground(new java.awt.Color(51, 51, 51));
        maintTestlabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        maintTestlabel5.setText("1.) Pepperoni");

        maintTestQuantity6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        maintTestQuantity6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestQuantity6.setText("60");
        maintTestQuantity6.setToolTipText(null);

        maintTestPrice7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.##"))));
        maintTestPrice7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestPrice7.setText("P56.00");
        maintTestPrice7.setToolTipText(null);

        maintTestlabel6.setBackground(new java.awt.Color(51, 51, 51));
        maintTestlabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        maintTestlabel6.setForeground(new java.awt.Color(51, 51, 51));
        maintTestlabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        maintTestlabel6.setText("1.) Pepperoni");

        maintTestQuantity7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        maintTestQuantity7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestQuantity7.setText("60");
        maintTestQuantity7.setToolTipText(null);

        maintTestPrice8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.##"))));
        maintTestPrice8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestPrice8.setText("P56.00");
        maintTestPrice8.setToolTipText(null);

        maintTestlabel7.setBackground(new java.awt.Color(51, 51, 51));
        maintTestlabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        maintTestlabel7.setForeground(new java.awt.Color(51, 51, 51));
        maintTestlabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        maintTestlabel7.setText("1.) Pepperoni");

        maintTestlabel8.setBackground(new java.awt.Color(51, 51, 51));
        maintTestlabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        maintTestlabel8.setForeground(new java.awt.Color(51, 51, 51));
        maintTestlabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        maintTestlabel8.setText("1.) Pepperoni");

        maintTestPrice9.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.##"))));
        maintTestPrice9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestPrice9.setText("P56.00");
        maintTestPrice9.setToolTipText(null);

        maintTestQuantity8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        maintTestQuantity8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestQuantity8.setText("60");
        maintTestQuantity8.setToolTipText(null);

        maintTestQuantity10.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        maintTestQuantity10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestQuantity10.setText("60");
        maintTestQuantity10.setToolTipText(null);

        maintTestQuantity9.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        maintTestQuantity9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestQuantity9.setText("60");
        maintTestQuantity9.setToolTipText(null);

        maintTestPrice10.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.##"))));
        maintTestPrice10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestPrice10.setText("P56.00");
        maintTestPrice10.setToolTipText(null);

        maintTestPrice11.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.##"))));
        maintTestPrice11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maintTestPrice11.setText("P56.00");
        maintTestPrice11.setToolTipText(null);

        maintTestlabel10.setBackground(new java.awt.Color(51, 51, 51));
        maintTestlabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        maintTestlabel10.setForeground(new java.awt.Color(51, 51, 51));
        maintTestlabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        maintTestlabel10.setText("1.) Pepperoni");

        maintTestlabel9.setBackground(new java.awt.Color(51, 51, 51));
        maintTestlabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        maintTestlabel9.setForeground(new java.awt.Color(51, 51, 51));
        maintTestlabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        maintTestlabel9.setText("1.) Pepperoni");

        submitbtn.setBackground(new java.awt.Color(17, 105, 226));
        submitbtn.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(255, 255, 255));
        submitbtn.setText("Submit");
        submitbtn.setMaximumSize(new java.awt.Dimension(63, 24));
        submitbtn.setMinimumSize(new java.awt.Dimension(63, 24));
        submitbtn.setPreferredSize(new java.awt.Dimension(63, 24));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(maintTestlabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(maintTestPrice8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(maintTestQuantity7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(maintTestlabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(maintTestPrice7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(maintTestQuantity6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(maintTestlabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(maintTestPrice6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(maintTestQuantity5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(maintTestlabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(maintTestPrice5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(maintTestQuantity4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(maintTestlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(jLabel28))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(maintTestPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(42, 42, 42)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(maintTestQuantity1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(maintTestlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(maintTestPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(maintTestlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(maintTestPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(42, 42, 42)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(maintTestQuantity3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addComponent(maintTestQuantity2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(maintTestlabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(maintTestPrice11, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                                .addComponent(maintTestlabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(maintTestPrice10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(maintTestlabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(maintTestPrice9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(maintTestQuantity9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(maintTestQuantity10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(maintTestQuantity8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 374, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintTestlabel1)
                    .addComponent(maintTestPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintTestQuantity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintTestlabel2)
                    .addComponent(maintTestPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintTestQuantity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintTestlabel3)
                    .addComponent(maintTestPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintTestQuantity3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintTestlabel4)
                    .addComponent(maintTestPrice5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintTestQuantity4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintTestlabel5)
                    .addComponent(maintTestPrice6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintTestQuantity5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintTestlabel6)
                    .addComponent(maintTestPrice7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintTestQuantity6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintTestlabel7)
                    .addComponent(maintTestPrice8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintTestQuantity7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintTestlabel8)
                    .addComponent(maintTestPrice9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintTestQuantity8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintTestlabel9)
                    .addComponent(maintTestPrice10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintTestQuantity9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintTestlabel10)
                    .addComponent(maintTestPrice11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintTestQuantity10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel5);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Leelawadee UI", 1, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Maintenance Features");

        jLabel43.setBackground(new java.awt.Color(17, 105, 226));
        jLabel43.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(17, 105, 226));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel43.setText("Stock New Item:");

        jSeparator5.setBackground(new java.awt.Color(17, 105, 226));
        jSeparator5.setForeground(new java.awt.Color(17, 105, 226));

        jLabel45.setBackground(new java.awt.Color(17, 105, 226));
        jLabel45.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(17, 105, 226));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel46.setBackground(new java.awt.Color(17, 105, 226));
        jLabel46.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 51));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel46.setText("Slot Number:");

        jFormattedTextField23.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFormattedTextField23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormattedTextField23.setToolTipText(null);

        jLabel47.setBackground(new java.awt.Color(17, 105, 226));
        jLabel47.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 51, 51));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setText("Item Name:");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel48.setBackground(new java.awt.Color(17, 105, 226));
        jLabel48.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 51));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel48.setText("Price:");

        jFormattedTextField24.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.##"))));
        jFormattedTextField24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormattedTextField24.setToolTipText(null);

        jFormattedTextField25.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFormattedTextField25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormattedTextField25.setToolTipText(null);

        jLabel49.setBackground(new java.awt.Color(17, 105, 226));
        jLabel49.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(51, 51, 51));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel49.setText("Calories:");

        cRegularVMbtn10.setBackground(new java.awt.Color(17, 105, 226));
        cRegularVMbtn10.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        cRegularVMbtn10.setForeground(new java.awt.Color(255, 255, 255));
        cRegularVMbtn10.setText("Stock");
        cRegularVMbtn10.setMaximumSize(new java.awt.Dimension(63, 24));
        cRegularVMbtn10.setMinimumSize(new java.awt.Dimension(63, 24));
        cRegularVMbtn10.setPreferredSize(new java.awt.Dimension(63, 24));

        jComboBox1.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jComboBox1.setMaximumRowCount(4);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parmesan", "Jalapenos", "Mushroom", "Olives " }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator5)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel47)
                                                .addGap(60, 60, 60)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addComponent(jLabel46)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jFormattedTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel48)
                                                        .addComponent(jLabel49))
                                                    .addGap(76, 76, 76)
                                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jFormattedTextField25, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                        .addComponent(jFormattedTextField24))))))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(cRegularVMbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jFormattedTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jFormattedTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cRegularVMbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(173, 173, 173)
                .addComponent(jLabel45)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        cSpecialVMbtn2.setBackground(new java.awt.Color(243, 245, 249));
        cSpecialVMbtn2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        cSpecialVMbtn2.setForeground(new java.awt.Color(17, 105, 226));
        cSpecialVMbtn2.setText("Manage Money");
        cSpecialVMbtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 105, 226)));
        cSpecialVMbtn2.setPreferredSize(new java.awt.Dimension(250, 40));

        cRegularVMbtn11.setBackground(new java.awt.Color(17, 105, 226));
        cRegularVMbtn11.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        cRegularVMbtn11.setForeground(new java.awt.Color(255, 255, 255));
        cRegularVMbtn11.setText("Print Summary of Transactions");
        cRegularVMbtn11.setPreferredSize(new java.awt.Dimension(250, 40));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cSpecialVMbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cRegularVMbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(cSpecialVMbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cRegularVMbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout maintcardLayout = new javax.swing.GroupLayout(maintcard);
        maintcard.setLayout(maintcardLayout);
        maintcardLayout.setHorizontalGroup(
            maintcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maintcardLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(maintcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maintcardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(221, 221, 221))
        );
        maintcardLayout.setVerticalGroup(
            maintcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maintcardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addGroup(maintcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(maintcardLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        testCards.add(maintcard, "card2");

        jSplitPane1.setRightComponent(testCards);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        buttonList = new ArrayList<JButton>();
        buttonList.add(orderbtn1);
        buttonList.add(orderbtn2);
        buttonList.add(orderbtn3);
        buttonList.add(orderbtn4);
        buttonList.add(orderbtn5);
        buttonList.add(orderbtn6);
        buttonList.add(orderbtn7);
        buttonList.add(orderbtn8);

        for (int index = 0; index < 8; index++) {
            buttonList.get(index).setActionCommand(Integer.toString(index));
        }

        priceList = new ArrayList<JLabel>();
        priceList.add(orderPrice1);
        priceList.add(orderPrice2);
        priceList.add(orderPrice3);
        priceList.add(orderPrice4);
        priceList.add(orderPrice5);
        priceList.add(orderPrice6);
        priceList.add(orderPrice7);
        priceList.add(orderPrice8);

        maintList = new ArrayList<JLabel>();
        maintList.add(maintTestlabel1);
        maintList.add(maintTestlabel2);
        maintList.add(maintTestlabel3);
        maintList.add(maintTestlabel4);
        maintList.add(maintTestlabel5);
        maintList.add(maintTestlabel6);
        maintList.add(maintTestlabel7);
        maintList.add(maintTestlabel8);
        maintList.add(maintTestlabel9);
        maintList.add(maintTestlabel10);

        maintQuantityList = new ArrayList<JFormattedTextField>();
        maintQuantityList.add(maintTestQuantity1);
        maintQuantityList.add(maintTestQuantity2);
        maintQuantityList.add(maintTestQuantity3);
        maintQuantityList.add(maintTestQuantity4);
        maintQuantityList.add(maintTestQuantity5);
        maintQuantityList.add(maintTestQuantity6);
        maintQuantityList.add(maintTestQuantity7);
        maintQuantityList.add(maintTestQuantity8);
        maintQuantityList.add(maintTestQuantity9);
        maintQuantityList.add(maintTestQuantity10);
        
        maintPriceList = new ArrayList<JFormattedTextField>();
        maintPriceList.add(maintTestPrice1);
        maintPriceList.add(maintTestPrice2);
        maintPriceList.add(maintTestPrice3);
        maintPriceList.add(maintTestPrice5);
        maintPriceList.add(maintTestPrice6);
        maintPriceList.add(maintTestPrice7);
        maintPriceList.add(maintTestPrice8);
        maintPriceList.add(maintTestPrice9);
        maintPriceList.add(maintTestPrice10);
        maintPriceList.add(maintTestPrice11);

        pack();
    }
 
    public void ReturnbtnActionPerformed(ActionListener actionListener) {
        this.Returnbtn.addActionListener(actionListener);
    }

    private void VendbtnActionPerformed(java.awt.event.ActionEvent evt) {
        cardLayout.show(testCards, "card1");
    }

    private void MaintbtnActionPerformed(java.awt.event.ActionEvent evt) {
         cardLayout.show(testCards, "card2");
    }

    public void setVendTestbalance(double balance) {
        String displayBalance = "Balance: P" + String.valueOf(balance);
        this.vendTestbalance.setText(displayBalance);
    }

    public void onePesoInsertActionPerformed(ActionListener actionListener) {
        this.onePesoInsert.addActionListener(actionListener);
    } 

    public void fivePesoInsertActionPerformed(ActionListener actionListener) {
        this.fivePesoInsert.addActionListener(actionListener);
    }

    public void tenPesoInsertActionPerformed(ActionListener actionListener) {
        this.tenPesoInsert.addActionListener(actionListener);
    }

    public void twentyPesoInsertActionPerformed(ActionListener actionListener) {
        this.twentyPesoInsert.addActionListener(actionListener);
    }

    public void fiftyPesoInsertActionPerformed(ActionListener actionListener) {
        this.fiftyPesoInsert.addActionListener(actionListener);
    }
    
    public void hundredPesoInsertActionPerformed(ActionListener actionListener) {
        this.hundredPesoInsert.addActionListener(actionListener);
    }

    public void twohundPesoInsertActionPerformed(ActionListener actionListener) {
        this.twohundPesoInsert.addActionListener(actionListener);
    }

    public void fivehundPesoInsertActionPerformed(ActionListener actionListener) {
        this.fivehundPesoInsert.addActionListener(actionListener);
    }

    public void cancelOrderBTNActionPerfomed(ActionListener actionListener) {
        this.cancelOrderBTN.addActionListener(actionListener);
    }

    public void addVendTestArea(String text) {
        this.vendTestTextArea.append(text);
    }

    public void clearVendTestArea() {
        this.vendTestTextArea.setText("");
    }

    public void setOrderBTNText(String text, int index) {
        this.buttonList.get(index).setText(text);
    }

    public void setMaintTestLabelText(String text, int index) {
        this.maintList.get(index).setText(text);
    }

    public void setMaintTestQuantityText(String text, int index) {
        this.maintQuantityList.get(index).setText(text);
    }

    public void setMaintTestPriceText(String text, int index) {
        this.maintPriceList.get(index).setText(text);
    }

    public void setMaintLabelVisibility(int index, boolean visibility) {
        this.maintList.get(index).setVisible(visibility);
        this.maintPriceList.get(index).setVisible(visibility);
        this.maintQuantityList.get(index).setVisible(visibility);
    }

    public void setMaintPriceVisibility(int index, boolean visibility) {
        this.maintPriceList.get(index).setVisible(visibility);
    }

    public void setMaintQuantityVisibility(int index, boolean visibility) {
        this.maintQuantityList.get(index).setVisible(visibility);
    }

    public double getPriceField(int index) {
        return java.lang.Math.abs(Double.valueOf(this.maintPriceList.get(index).getText()));
    }

    public int getQuantityField(int index) {
        return java.lang.Math.abs(Integer.valueOf(this.maintQuantityList.get(index).getText()));
    }

    public void setPriceLabelText(String text, int index) {
        this.priceList.get(index).setText(text);
    }

    public void setPriceLabelVisibility(int index, boolean visibility) {
        this.priceList.get(index).setVisible(visibility);
    }

    public int getOrderBTNIndex(JButton button) {
        int found = -1;
        for (int i = 0; i < 8; i++)
            if (buttonList.get(i) == button)
                found = i;
        return found;
    }

    public void hideStockMenu() {
        this.jLabel47.setForeground(new java.awt.Color(242,242,242));
        this.jLabel48.setForeground(new java.awt.Color(242,242,242));
        this.jLabel49.setForeground(new java.awt.Color(242,242,242));
        this.jFormattedTextField24.setBackground(new java.awt.Color(234,234,234));
        this.jFormattedTextField24.setEditable(false);
        this.jFormattedTextField25.setBackground(new java.awt.Color(234,234,234));
        this.jFormattedTextField25.setEditable(false);
        this.jTextField1.setBackground(new java.awt.Color(242,242,242));
        this.jTextField1.setEditable(false);
    }

    public void showStockMenu() {
        this.jLabel47.setForeground(new java.awt.Color(51,51,51));
        this.jLabel48.setForeground(new java.awt.Color(51,51,51));
        this.jLabel49.setForeground(new java.awt.Color(51,51,51));
        this.jFormattedTextField24.setBackground(new java.awt.Color(255,255,255));
        this.jFormattedTextField24.setEditable(true);
        this.jFormattedTextField25.setBackground(new java.awt.Color(255,255,255));
        this.jFormattedTextField25.setEditable(true);
        this.jTextField1.setBackground(new java.awt.Color(255,255,255));
        this.jTextField1.setEditable(true);
    }

    public void orderbtnActionPerformed(ActionListener actionListener) {
        this.orderbtn1.addActionListener(actionListener);
        this.orderbtn2.addActionListener(actionListener);
        this.orderbtn3.addActionListener(actionListener);
        this.orderbtn4.addActionListener(actionListener);
        this.orderbtn5.addActionListener(actionListener);
        this.orderbtn6.addActionListener(actionListener);
        this.orderbtn7.addActionListener(actionListener);
        this.orderbtn8.addActionListener(actionListener);
    }

    public void setToolTipText(String text, int index) {
        this.buttonList.get(index).setToolTipText(text);
    }

    public void setBtnVisibility(boolean visibility, int index) {
        this.buttonList.get(index).setVisible(visibility);
    }

    public void setComboVisibility(boolean visibility) {
        this.jComboBox1.setVisible(visibility);
    }

    public void submitbtnActionPerformed(ActionListener actionListener) {
        this.submitbtn.addActionListener(actionListener);
    }

    public String getNewItemName() {
        return this.jTextField1.getText();
    }

    public int getNewItemSlotNumber() {
        return Integer.valueOf(this.jFormattedTextField23.getText());
    }

    public double getNewItemPrice() {
        return Double.valueOf(this.jFormattedTextField24.getText());
    }

    public int getNewItemCalories() {
        return Integer.valueOf(this.jFormattedTextField25.getText());
    }

    public String getReplaceItem() {
        return this.jComboBox1.getSelectedItem().toString();
    }

    public void stockBtnActionPerformed(ActionListener actionListener) {
        this.cRegularVMbtn10.addActionListener(actionListener);
    }

    public void clearStockFields() {
        this.jTextField1.setText("");
        this.jFormattedTextField23.setText("");
        this.jFormattedTextField24.setText("");
        this.jFormattedTextField25.setText("");
    }

    public void manageMoneyBtnActionPerformed(ActionListener actionListener) {
        this.cSpecialVMbtn2.addActionListener(actionListener);
    }

    public void printSummaryBtnActionPerformed(ActionListener actionListener) {
        this.cRegularVMbtn11.addActionListener(actionListener);
    }

    // Variables declaration
    private javax.swing.JButton Maintbtn;
    private javax.swing.JButton Returnbtn;
    private javax.swing.JButton Vendbtn;
    private javax.swing.JButton cRegularVMbtn10;
    private javax.swing.JButton cRegularVMbtn11;
    private javax.swing.JButton cSpecialVMbtn2;
    private javax.swing.JButton cancelOrderBTN;
    private javax.swing.JButton fiftyPesoInsert;
    private javax.swing.JButton fivePesoInsert;
    private javax.swing.JButton fivehundPesoInsert;
    private javax.swing.JButton hundredPesoInsert;
    private javax.swing.JFormattedTextField jFormattedTextField23;
    private javax.swing.JFormattedTextField jFormattedTextField24;
    private javax.swing.JFormattedTextField jFormattedTextField25;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JFormattedTextField maintTestPrice1;
    private javax.swing.JFormattedTextField maintTestPrice10;
    private javax.swing.JFormattedTextField maintTestPrice11;
    private javax.swing.JFormattedTextField maintTestPrice2;
    private javax.swing.JFormattedTextField maintTestPrice3;
    private javax.swing.JFormattedTextField maintTestPrice5;
    private javax.swing.JFormattedTextField maintTestPrice6;
    private javax.swing.JFormattedTextField maintTestPrice7;
    private javax.swing.JFormattedTextField maintTestPrice8;
    private javax.swing.JFormattedTextField maintTestPrice9;
    private javax.swing.JFormattedTextField maintTestQuantity1;
    private javax.swing.JFormattedTextField maintTestQuantity10;
    private javax.swing.JFormattedTextField maintTestQuantity2;
    private javax.swing.JFormattedTextField maintTestQuantity3;
    private javax.swing.JFormattedTextField maintTestQuantity4;
    private javax.swing.JFormattedTextField maintTestQuantity5;
    private javax.swing.JFormattedTextField maintTestQuantity6;
    private javax.swing.JFormattedTextField maintTestQuantity7;
    private javax.swing.JFormattedTextField maintTestQuantity8;
    private javax.swing.JFormattedTextField maintTestQuantity9;
    private javax.swing.JLabel maintTestlabel1;
    private javax.swing.JLabel maintTestlabel10;
    private javax.swing.JLabel maintTestlabel2;
    private javax.swing.JLabel maintTestlabel3;
    private javax.swing.JLabel maintTestlabel4;
    private javax.swing.JLabel maintTestlabel5;
    private javax.swing.JLabel maintTestlabel6;
    private javax.swing.JLabel maintTestlabel7;
    private javax.swing.JLabel maintTestlabel8;
    private javax.swing.JLabel maintTestlabel9;
    private javax.swing.JPanel maintcard;
    private javax.swing.JButton onePesoInsert;
    private javax.swing.JLabel orderPrice1;
    private javax.swing.JLabel orderPrice2;
    private javax.swing.JLabel orderPrice3;
    private javax.swing.JLabel orderPrice4;
    private javax.swing.JLabel orderPrice5;
    private javax.swing.JLabel orderPrice6;
    private javax.swing.JLabel orderPrice7;
    private javax.swing.JLabel orderPrice8;
    private javax.swing.JButton orderbtn1;
    private javax.swing.JButton orderbtn2;
    private javax.swing.JButton orderbtn3;
    private javax.swing.JButton orderbtn4;
    private javax.swing.JButton orderbtn5;
    private javax.swing.JButton orderbtn6;
    private javax.swing.JButton orderbtn7;
    private javax.swing.JButton orderbtn8;
    private javax.swing.JButton tenPesoInsert;
    private javax.swing.JPanel testCards;
    private javax.swing.JButton twentyPesoInsert;
    private javax.swing.JButton twohundPesoInsert;
    private javax.swing.JTextArea vendTestTextArea;
    private javax.swing.JButton vendTestbalance;
    private javax.swing.JPanel vendcard;
    private javax.swing.JComboBox<String> jComboBox1;
    private List<JButton> buttonList;
    private List<JLabel> priceList;
    private List<JLabel> maintList;
    private List<JFormattedTextField> maintQuantityList;
    private List<JFormattedTextField> maintPriceList;
    private javax.swing.JButton submitbtn;
    // End of variables
}
