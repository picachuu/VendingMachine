import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;    

public class PizzaMake extends javax.swing.JFrame {

    /**
     * Creates new form VMView
     */
    public PizzaMake() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */                         
    private void initComponents() {

        vendcard = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        baconBTN = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        completeBTN = new javax.swing.JButton();
        pepperoniBTN = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cheeseBTN = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        onionsBTN = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        olivesBTN = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        makePizzaVMText = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        Returnbtn1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pestoSauceBTN = new javax.swing.JButton();
        tomatoSauceBTN = new javax.swing.JButton();
        cheeseSauceBTN = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Maintbtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        pizzaBoxedIMG = new javax.swing.JLabel();
        pizzaBellPeppersIMG = new javax.swing.JLabel();
        pizzaBasilIMG = new javax.swing.JLabel();
        pizzaTomatoIMG = new javax.swing.JLabel();
        pizzaEggIMG = new javax.swing.JLabel();
        pizzaOlivesIMG = new javax.swing.JLabel();
        pizzaPepperoniIMG = new javax.swing.JLabel();
        pizzaCheeseIMG = new javax.swing.JLabel();
        pizzaBaconIMG = new javax.swing.JLabel();
        pizzaOnionsIMG = new javax.swing.JLabel();
        pizzaCheeseSauceIMG = new javax.swing.JLabel();
        pizzaPestoIMG = new javax.swing.JLabel();
        pizzaTomatoSauceIMG = new javax.swing.JLabel();
        pizzaBaseIMG = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1180, 500));
        setPreferredSize(new java.awt.Dimension(1180, 530));
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        vendcard.setBackground(new java.awt.Color(255, 255, 255));
        vendcard.setMinimumSize(new java.awt.Dimension(1200, 0));
        vendcard.setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(new java.awt.Color(17, 105, 226));
        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 105, 226));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Toppings");

        jSeparator2.setBackground(new java.awt.Color(17, 105, 226));
        jSeparator2.setForeground(new java.awt.Color(17, 105, 226));

        jLabel9.setBackground(new java.awt.Color(17, 105, 226));
        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 105, 226));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("*Hover for details");

        jLabel11.setBackground(new java.awt.Color(17, 105, 226));
        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(17, 105, 226));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("P53.00");

        baconBTN.setBackground(new java.awt.Color(242, 242, 242));
        baconBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        baconBTN.setIcon(new ImageIcon("resources/bacon.png"));
        baconBTN.setToolTipText("Calories: 40");

        jLabel12.setBackground(new java.awt.Color(17, 105, 226));
        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(17, 105, 226));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("P69.00");

        completeBTN.setBackground(new java.awt.Color(17, 105, 226));
        completeBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        completeBTN.setForeground(new java.awt.Color(255, 255, 255));
        completeBTN.setIcon(new ImageIcon("resources/pizzabox.png"));
        completeBTN.setMaximumSize(new java.awt.Dimension(63, 24));
        completeBTN.setMinimumSize(new java.awt.Dimension(63, 24));
        completeBTN.setPreferredSize(new java.awt.Dimension(63, 24));

        pepperoniBTN.setBackground(new java.awt.Color(242, 242, 242));
        pepperoniBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        pepperoniBTN.setIcon(new ImageIcon("resources/pepperoni.png"));
        pepperoniBTN.setToolTipText("Calories: 136");

        jLabel18.setBackground(new java.awt.Color(17, 105, 226));
        jLabel18.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(17, 105, 226));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Pepperoni");

        jLabel19.setBackground(new java.awt.Color(17, 105, 226));
        jLabel19.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(17, 105, 226));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Bacon");

        cheeseBTN.setBackground(new java.awt.Color(242, 242, 242));
        cheeseBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        cheeseBTN.setIcon(new ImageIcon("resources/cheese.png"));
        cheeseBTN.setToolTipText("Calories: 215");

        jLabel13.setBackground(new java.awt.Color(17, 105, 226));
        jLabel13.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(17, 105, 226));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("P55.00");

        jLabel14.setBackground(new java.awt.Color(17, 105, 226));
        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(17, 105, 226));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("P55.00");

        onionsBTN.setBackground(new java.awt.Color(242, 242, 242));
        onionsBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        onionsBTN.setIcon(new ImageIcon("resources/onion.png"));
        onionsBTN.setToolTipText("Calories: 210");

        jLabel20.setBackground(new java.awt.Color(17, 105, 226));
        jLabel20.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(17, 105, 226));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Onions");

        jLabel21.setBackground(new java.awt.Color(17, 105, 226));
        jLabel21.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(17, 105, 226));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Mozarella");

        olivesBTN.setBackground(new java.awt.Color(242, 242, 242));
        olivesBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        olivesBTN.setIcon(new ImageIcon("resources/olives.png"));
        olivesBTN.setToolTipText("Calories: 85");

        jLabel15.setBackground(new java.awt.Color(17, 105, 226));
        jLabel15.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(17, 105, 226));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("P40.00");

        jLabel22.setBackground(new java.awt.Color(17, 105, 226));
        jLabel22.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(17, 105, 226));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Olives");

        jLabel23.setBackground(new java.awt.Color(17, 105, 226));
        jLabel23.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(17, 105, 226));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Complete");

        makePizzaVMText.setEditable(false);
        makePizzaVMText.setBackground(new java.awt.Color(255, 255, 255));
        makePizzaVMText.setColumns(20);
        makePizzaVMText.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        makePizzaVMText.setRows(5);
        jScrollPane1.setViewportView(makePizzaVMText);

        jLabel7.setBackground(new java.awt.Color(17, 105, 226));
        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(17, 105, 226));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vending Machine:");

        Returnbtn1.setBackground(new java.awt.Color(242, 242, 242));
        Returnbtn1.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        Returnbtn1.setForeground(new java.awt.Color(17, 105, 226));
        Returnbtn1.setText("Return to Test Menu");
        Returnbtn1.setBorder(null);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Returnbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Returnbtn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pepperoniBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(baconBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(43, 43, 43)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(olivesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(onionsBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cheeseBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(completeBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(baconBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pepperoniBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cheeseBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onionsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(olivesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(completeBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22)))
                        .addComponent(jLabel9))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(17, 105, 226));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sauces");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        pestoSauceBTN.setBackground(new java.awt.Color(242, 242, 242));
        pestoSauceBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        pestoSauceBTN.setText("Pesto Sauce");
        pestoSauceBTN.setToolTipText("Calories: Stock:");

        tomatoSauceBTN.setBackground(new java.awt.Color(242, 242, 242));
        tomatoSauceBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        tomatoSauceBTN.setText("Tomato Sauce");
        tomatoSauceBTN.setToolTipText("Calories: Stock:");

        cheeseSauceBTN.setBackground(new java.awt.Color(242, 242, 242));
        cheeseSauceBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        cheeseSauceBTN.setText("Cheese Sauce");
        cheeseSauceBTN.setToolTipText("Calories: Stock:");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cheeseSauceBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pestoSauceBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tomatoSauceBTN, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(tomatoSauceBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pestoSauceBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cheeseSauceBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(17, 105, 226));
        jPanel3.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(247, 244, 168));
        jLabel3.setText("MCO2");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Make-A-Pizza");

        Maintbtn.setBackground(new java.awt.Color(243, 245, 249));
        Maintbtn.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        Maintbtn.setForeground(new java.awt.Color(17, 105, 226));
        Maintbtn.setText("Maintenance Features");
        Maintbtn.setPreferredSize(new java.awt.Dimension(250, 40));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Maintbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(jLabel4)))
                        .addGap(0, 286, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(150, 150, 150)
                .addComponent(Maintbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setLayout(new javax.swing.OverlayLayout(jPanel4));

        pizzaBoxedIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaBoxedIMG.setIcon(new ImageIcon("resources/boxed.png"));
        jPanel4.add(pizzaBoxedIMG);

        pizzaBellPeppersIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaBellPeppersIMG.setIcon(new ImageIcon("resources/pizzaolives.png"));
        pizzaBellPeppersIMG.setAlignmentX(0.1F);
        jPanel4.add(pizzaBellPeppersIMG);

        pizzaBasilIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaBasilIMG.setIcon(new ImageIcon("resources/pizzaolives.png"));
        pizzaBasilIMG.setAlignmentX(0.1F);
        jPanel4.add(pizzaBasilIMG);

        pizzaTomatoIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaTomatoIMG.setIcon(new ImageIcon("resources/pizzaolives.png"));
        pizzaTomatoIMG.setAlignmentX(0.1F);
        jPanel4.add(pizzaTomatoIMG);

        pizzaEggIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaEggIMG.setIcon(new ImageIcon("resources/pizzaolives.png"));
        pizzaEggIMG.setAlignmentX(0.1F);
        jPanel4.add(pizzaEggIMG);

        pizzaOlivesIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaOlivesIMG.setIcon(new ImageIcon("resources/pizzaolives.png"));
        pizzaOlivesIMG.setAlignmentX(0.1F);
        jPanel4.add(pizzaOlivesIMG);

        pizzaPepperoniIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaPepperoniIMG.setIcon(new ImageIcon("resources/pizzapepperoni.png"));
        pizzaPepperoniIMG.setAlignmentX(0.1F);
        jPanel4.add(pizzaPepperoniIMG);

        pizzaCheeseIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaCheeseIMG.setIcon(new ImageIcon("resources/pizzacheese.png"));
        pizzaCheeseIMG.setAlignmentX(0.1F);
        jPanel4.add(pizzaCheeseIMG);

        pizzaBaconIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaBaconIMG.setIcon(new ImageIcon("resources/pizzabacon.png"));
        pizzaBaconIMG.setAlignmentX(0.1F);
        jPanel4.add(pizzaBaconIMG);

        pizzaOnionsIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaOnionsIMG.setIcon(new ImageIcon("resources/pizzaonions.png"));
        pizzaOnionsIMG.setAlignmentX(0.1F);
        jPanel4.add(pizzaOnionsIMG);

        pizzaCheeseSauceIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaCheeseSauceIMG.setIcon(new ImageIcon("resources/pizzacheesesauce.png"));
        pizzaCheeseSauceIMG.setAlignmentX(0.1F);
        jPanel4.add(pizzaCheeseSauceIMG);

        pizzaPestoIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaPestoIMG.setIcon(new ImageIcon("resources/pizzapesto.png"));
        pizzaPestoIMG.setAlignmentX(0.1F);
        jPanel4.add(pizzaPestoIMG);

        pizzaTomatoSauceIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaTomatoSauceIMG.setIcon(new ImageIcon("resources/pizzatomatosauce.png"));
        pizzaTomatoSauceIMG.setAlignmentX(0.1F);
        jPanel4.add(pizzaTomatoSauceIMG);

        pizzaBaseIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaBaseIMG.setIcon(new ImageIcon("resources/pizzabase.png"));
        pizzaBaseIMG.setAlignmentX(0.1F);
        jPanel4.add(pizzaBaseIMG);

        jProgressBar1.setAlignmentY(0.8F);
        jProgressBar1.setPreferredSize(new java.awt.Dimension(50, 10));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout vendcardLayout = new javax.swing.GroupLayout(vendcard);
        vendcard.setLayout(vendcardLayout);
        vendcardLayout.setHorizontalGroup(
            vendcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vendcardLayout.createSequentialGroup()
                .addGroup(vendcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vendcardLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        vendcardLayout.setVerticalGroup(
            vendcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vendcardLayout.createSequentialGroup()
                .addGroup(vendcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(vendcardLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(vendcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 199, Short.MAX_VALUE))
        );

        jProgressBar1.setVisible(false);

        buttonList = new ArrayList<JButton>();
        buttonList.add(pepperoniBTN);
        buttonList.add(baconBTN);
        buttonList.add(onionsBTN);
        buttonList.add(cheeseBTN);
        buttonList.add(olivesBTN);
        buttonList.add(tomatoSauceBTN); //5
        buttonList.add(pestoSauceBTN); //6 
        buttonList.add(cheeseSauceBTN); //7

        for (int index = 0; index < 8; index++) {
            buttonList.get(index).setActionCommand(Integer.toString(index));
        }

        pricelabelList = new ArrayList<JLabel>();
        pricelabelList.add(jLabel11);
        pricelabelList.add(jLabel12);
        pricelabelList.add(jLabel14);
        pricelabelList.add(jLabel13);
        pricelabelList.add(jLabel15);

        labellist = new ArrayList<JLabel>();
        labellist.add(jLabel18);
        labellist.add(jLabel19);
        labellist.add(jLabel20);
        labellist.add(jLabel21);
        labellist.add(jLabel22);

        getContentPane().add(vendcard);

        pack();
    }

    public void ReturnbtnActionPerformed(ActionListener actionListener) {
        this.Returnbtn1.addActionListener(actionListener);
    }

    public void setSauceBtn(ActionListener actionListener) {
        this.pestoSauceBTN.addActionListener(actionListener);
        this.tomatoSauceBTN.addActionListener(actionListener);
        this.cheeseSauceBTN.addActionListener(actionListener);
    }

    public void setIngredientBtn(ActionListener actionListener) {
        this.pepperoniBTN.addActionListener(actionListener);
        this.baconBTN.addActionListener(actionListener);
        this.onionsBTN.addActionListener(actionListener);
        this.cheeseBTN.addActionListener(actionListener);
        this.olivesBTN.addActionListener(actionListener);
        this.tomatoSauceBTN.addActionListener(actionListener);
        this.pestoSauceBTN.addActionListener(actionListener);
        this.cheeseSauceBTN.addActionListener(actionListener);
    }

    public void setIngredientLabel(int index, String label) {
        this.labellist.get(index).setText(label);
    }

    public void setIngredientPriceLabel(int index, String price) {
        this.pricelabelList.get(index).setText(price);
    }

    public void setToolTipText(int index, String text) {
        this.buttonList.get(index).setToolTipText(text);
    }

    public void setButtonText(int index, String text) {
        this.buttonList.get(index).setText(text);
    }

    public void setIngredientButtonIcon(int index, String file) {
        this.buttonList.get(index).setIcon(new ImageIcon(file));
    }
 
    public void addTextArea(String text) {
        this.makePizzaVMText.append(text);
    }   

    public void clearTextArea() {
        this.makePizzaVMText.setText("");
    }
    
    public void setProgressBar(int value) {
        this.jProgressBar1.setValue(value);
    }
    
    public void completeBTN(ActionListener actionListener) {
        this.completeBTN.addActionListener(actionListener);
    }

    // Variables declaration                   
    private javax.swing.JButton Maintbtn;
    private javax.swing.JButton Returnbtn1;
    private javax.swing.JButton baconBTN;
    private javax.swing.JButton cheeseBTN;
    private javax.swing.JButton cheeseSauceBTN;
    private javax.swing.JButton completeBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea makePizzaVMText;
    private javax.swing.JButton olivesBTN;
    private javax.swing.JButton onionsBTN;
    private javax.swing.JButton pepperoniBTN;
    private javax.swing.JButton pestoSauceBTN;
    private javax.swing.JLabel pizzaBaconIMG;
    private javax.swing.JLabel pizzaBaseIMG;
    private javax.swing.JLabel pizzaBasilIMG;
    private javax.swing.JLabel pizzaBellPeppersIMG;
    private javax.swing.JLabel pizzaBoxedIMG;
    private javax.swing.JLabel pizzaCheeseIMG;
    private javax.swing.JLabel pizzaCheeseSauceIMG;
    private javax.swing.JLabel pizzaEggIMG;
    private javax.swing.JLabel pizzaOlivesIMG;
    private javax.swing.JLabel pizzaOnionsIMG;
    private javax.swing.JLabel pizzaPepperoniIMG;
    private javax.swing.JLabel pizzaPestoIMG;
    private javax.swing.JLabel pizzaTomatoIMG;
    private javax.swing.JLabel pizzaTomatoSauceIMG;
    private javax.swing.JButton tomatoSauceBTN;
    private javax.swing.JPanel vendcard;
    private List<JButton> buttonList;
    private List<JLabel> labellist;
    private List<JLabel> pricelabelList;
    // End of variables declaration                   
}
