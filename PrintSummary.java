import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * PizzaMake is the class that creates the GUI for the print summary menu of the vending machine.
 */
public class PrintSummary extends javax.swing.JFrame {

    /**
     * Creates new form VMView
     */
    public PrintSummary() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Returnbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        summarylabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        startingStock = new javax.swing.JLabel();
        currentStock = new javax.swing.JLabel();
        quantitySold = new javax.swing.JLabel();
        earnings = new javax.swing.JLabel();
        earnings1 = new javax.swing.JLabel();
        quantitySold1 = new javax.swing.JLabel();
        currentStock1 = new javax.swing.JLabel();
        startingStock1 = new javax.swing.JLabel();
        summarylabel2 = new javax.swing.JLabel();
        earnings2 = new javax.swing.JLabel();
        quantitySold2 = new javax.swing.JLabel();
        currentStock2 = new javax.swing.JLabel();
        startingStock2 = new javax.swing.JLabel();
        summarylabel3 = new javax.swing.JLabel();
        earnings3 = new javax.swing.JLabel();
        quantitySold3 = new javax.swing.JLabel();
        currentStock3 = new javax.swing.JLabel();
        startingStock3 = new javax.swing.JLabel();
        summarylabel4 = new javax.swing.JLabel();
        earnings4 = new javax.swing.JLabel();
        quantitySold4 = new javax.swing.JLabel();
        currentStock4 = new javax.swing.JLabel();
        startingStock4 = new javax.swing.JLabel();
        summarylabel5 = new javax.swing.JLabel();
        summarylabel6 = new javax.swing.JLabel();
        startingStock5 = new javax.swing.JLabel();
        currentStock5 = new javax.swing.JLabel();
        quantitySold5 = new javax.swing.JLabel();
        earnings5 = new javax.swing.JLabel();
        summarylabel7 = new javax.swing.JLabel();
        startingStock6 = new javax.swing.JLabel();
        currentStock6 = new javax.swing.JLabel();
        quantitySold6 = new javax.swing.JLabel();
        earnings6 = new javax.swing.JLabel();
        summarylabel8 = new javax.swing.JLabel();
        startingStock7 = new javax.swing.JLabel();
        currentStock7 = new javax.swing.JLabel();
        quantitySold7 = new javax.swing.JLabel();
        earnings7 = new javax.swing.JLabel();
        summarylabel9 = new javax.swing.JLabel();
        startingStock8 = new javax.swing.JLabel();
        currentStock8 = new javax.swing.JLabel();
        quantitySold8 = new javax.swing.JLabel();
        earnings8 = new javax.swing.JLabel();
        earnings9 = new javax.swing.JLabel();
        quantitySold9 = new javax.swing.JLabel();
        currentStock9 = new javax.swing.JLabel();
        startingStock9 = new javax.swing.JLabel();
        summarylabel10 = new javax.swing.JLabel();
        startingStock10 = new javax.swing.JLabel();
        currentStock10 = new javax.swing.JLabel();
        quantitySold10 = new javax.swing.JLabel();
        earnings10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(740, 490));
        setPreferredSize(new java.awt.Dimension(200, 130));

        jPanel3.setBackground(new java.awt.Color(243, 245, 249));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 150));

        jPanel2.setBackground(new java.awt.Color(17, 105, 226));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Summary of Transactions");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(247, 244, 168));
        jLabel3.setText("MCO2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        Returnbtn.setBackground(new java.awt.Color(243, 245, 249));
        Returnbtn.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        Returnbtn.setForeground(new java.awt.Color(17, 105, 226));
        Returnbtn.setText("Return to Test Menu");
        Returnbtn.setBorder(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(17, 105, 226), 2, true));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setBackground(new java.awt.Color(17, 105, 226));
        jLabel28.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(17, 105, 226));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Starting Stock");

        jLabel31.setBackground(new java.awt.Color(17, 105, 226));
        jLabel31.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(17, 105, 226));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Current Stock      Quantity Sold   Earnings");

        jSeparator4.setBackground(new java.awt.Color(17, 105, 226));
        jSeparator4.setForeground(new java.awt.Color(17, 105, 226));

        jLabel29.setBackground(new java.awt.Color(17, 105, 226));
        jLabel29.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(17, 105, 226));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Item");

        summarylabel1.setBackground(new java.awt.Color(51, 51, 51));
        summarylabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        summarylabel1.setForeground(new java.awt.Color(51, 51, 51));
        summarylabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jSeparator5.setBackground(new java.awt.Color(17, 105, 226));
        jSeparator5.setForeground(new java.awt.Color(17, 105, 226));

        jLabel32.setBackground(new java.awt.Color(17, 105, 226));
        jLabel32.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(17, 105, 226));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Total");

        startingStock.setBackground(new java.awt.Color(51, 51, 51));
        startingStock.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        startingStock.setForeground(new java.awt.Color(51, 51, 51));
        startingStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        currentStock.setBackground(new java.awt.Color(51, 51, 51));
        currentStock.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        currentStock.setForeground(new java.awt.Color(51, 51, 51));
        currentStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        quantitySold.setBackground(new java.awt.Color(51, 51, 51));
        quantitySold.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        quantitySold.setForeground(new java.awt.Color(51, 51, 51));
        quantitySold.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        earnings.setBackground(new java.awt.Color(51, 51, 51));
        earnings.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        earnings.setForeground(new java.awt.Color(51, 51, 51));
        earnings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        earnings1.setBackground(new java.awt.Color(51, 51, 51));
        earnings1.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        earnings1.setForeground(new java.awt.Color(51, 51, 51));
        earnings1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        quantitySold1.setBackground(new java.awt.Color(51, 51, 51));
        quantitySold1.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        quantitySold1.setForeground(new java.awt.Color(51, 51, 51));
        quantitySold1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        currentStock1.setBackground(new java.awt.Color(51, 51, 51));
        currentStock1.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        currentStock1.setForeground(new java.awt.Color(51, 51, 51));
        currentStock1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        startingStock1.setBackground(new java.awt.Color(51, 51, 51));
        startingStock1.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        startingStock1.setForeground(new java.awt.Color(51, 51, 51));
        startingStock1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        summarylabel2.setBackground(new java.awt.Color(51, 51, 51));
        summarylabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        summarylabel2.setForeground(new java.awt.Color(51, 51, 51));
        summarylabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        earnings2.setBackground(new java.awt.Color(51, 51, 51));
        earnings2.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        earnings2.setForeground(new java.awt.Color(51, 51, 51));
        earnings2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        quantitySold2.setBackground(new java.awt.Color(51, 51, 51));
        quantitySold2.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        quantitySold2.setForeground(new java.awt.Color(51, 51, 51));
        quantitySold2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        currentStock2.setBackground(new java.awt.Color(51, 51, 51));
        currentStock2.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        currentStock2.setForeground(new java.awt.Color(51, 51, 51));
        currentStock2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        startingStock2.setBackground(new java.awt.Color(51, 51, 51));
        startingStock2.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        startingStock2.setForeground(new java.awt.Color(51, 51, 51));
        startingStock2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        summarylabel3.setBackground(new java.awt.Color(51, 51, 51));
        summarylabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        summarylabel3.setForeground(new java.awt.Color(51, 51, 51));
        summarylabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        earnings3.setBackground(new java.awt.Color(51, 51, 51));
        earnings3.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        earnings3.setForeground(new java.awt.Color(51, 51, 51));
        earnings3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        quantitySold3.setBackground(new java.awt.Color(51, 51, 51));
        quantitySold3.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        quantitySold3.setForeground(new java.awt.Color(51, 51, 51));
        quantitySold3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        currentStock3.setBackground(new java.awt.Color(51, 51, 51));
        currentStock3.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        currentStock3.setForeground(new java.awt.Color(51, 51, 51));
        currentStock3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        startingStock3.setBackground(new java.awt.Color(51, 51, 51));
        startingStock3.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        startingStock3.setForeground(new java.awt.Color(51, 51, 51));
        startingStock3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        summarylabel4.setBackground(new java.awt.Color(51, 51, 51));
        summarylabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        summarylabel4.setForeground(new java.awt.Color(51, 51, 51));
        summarylabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        earnings4.setBackground(new java.awt.Color(51, 51, 51));
        earnings4.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        earnings4.setForeground(new java.awt.Color(51, 51, 51));
        earnings4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        quantitySold4.setBackground(new java.awt.Color(51, 51, 51));
        quantitySold4.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        quantitySold4.setForeground(new java.awt.Color(51, 51, 51));
        quantitySold4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        currentStock4.setBackground(new java.awt.Color(51, 51, 51));
        currentStock4.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        currentStock4.setForeground(new java.awt.Color(51, 51, 51));
        currentStock4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        startingStock4.setBackground(new java.awt.Color(51, 51, 51));
        startingStock4.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        startingStock4.setForeground(new java.awt.Color(51, 51, 51));
        startingStock4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        summarylabel5.setBackground(new java.awt.Color(51, 51, 51));
        summarylabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        summarylabel5.setForeground(new java.awt.Color(51, 51, 51));
        summarylabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        summarylabel6.setBackground(new java.awt.Color(51, 51, 51));
        summarylabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        summarylabel6.setForeground(new java.awt.Color(51, 51, 51));
        summarylabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        startingStock5.setBackground(new java.awt.Color(51, 51, 51));
        startingStock5.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        startingStock5.setForeground(new java.awt.Color(51, 51, 51));
        startingStock5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        currentStock5.setBackground(new java.awt.Color(51, 51, 51));
        currentStock5.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        currentStock5.setForeground(new java.awt.Color(51, 51, 51));
        currentStock5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        quantitySold5.setBackground(new java.awt.Color(51, 51, 51));
        quantitySold5.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        quantitySold5.setForeground(new java.awt.Color(51, 51, 51));
        quantitySold5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        earnings5.setBackground(new java.awt.Color(51, 51, 51));
        earnings5.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        earnings5.setForeground(new java.awt.Color(51, 51, 51));
        earnings5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        summarylabel7.setBackground(new java.awt.Color(51, 51, 51));
        summarylabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        summarylabel7.setForeground(new java.awt.Color(51, 51, 51));
        summarylabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        startingStock6.setBackground(new java.awt.Color(51, 51, 51));
        startingStock6.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        startingStock6.setForeground(new java.awt.Color(51, 51, 51));
        startingStock6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        currentStock6.setBackground(new java.awt.Color(51, 51, 51));
        currentStock6.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        currentStock6.setForeground(new java.awt.Color(51, 51, 51));
        currentStock6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        quantitySold6.setBackground(new java.awt.Color(51, 51, 51));
        quantitySold6.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        quantitySold6.setForeground(new java.awt.Color(51, 51, 51));
        quantitySold6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        earnings6.setBackground(new java.awt.Color(51, 51, 51));
        earnings6.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        earnings6.setForeground(new java.awt.Color(51, 51, 51));
        earnings6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        summarylabel8.setBackground(new java.awt.Color(51, 51, 51));
        summarylabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        summarylabel8.setForeground(new java.awt.Color(51, 51, 51));
        summarylabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        startingStock7.setBackground(new java.awt.Color(51, 51, 51));
        startingStock7.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        startingStock7.setForeground(new java.awt.Color(51, 51, 51));
        startingStock7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        currentStock7.setBackground(new java.awt.Color(51, 51, 51));
        currentStock7.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        currentStock7.setForeground(new java.awt.Color(51, 51, 51));
        currentStock7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        quantitySold7.setBackground(new java.awt.Color(51, 51, 51));
        quantitySold7.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        quantitySold7.setForeground(new java.awt.Color(51, 51, 51));
        quantitySold7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        earnings7.setBackground(new java.awt.Color(51, 51, 51));
        earnings7.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        earnings7.setForeground(new java.awt.Color(51, 51, 51));
        earnings7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        summarylabel9.setBackground(new java.awt.Color(51, 51, 51));
        summarylabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        summarylabel9.setForeground(new java.awt.Color(51, 51, 51));
        summarylabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        startingStock8.setBackground(new java.awt.Color(51, 51, 51));
        startingStock8.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        startingStock8.setForeground(new java.awt.Color(51, 51, 51));
        startingStock8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        currentStock8.setBackground(new java.awt.Color(51, 51, 51));
        currentStock8.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        currentStock8.setForeground(new java.awt.Color(51, 51, 51));
        currentStock8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        quantitySold8.setBackground(new java.awt.Color(51, 51, 51));
        quantitySold8.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        quantitySold8.setForeground(new java.awt.Color(51, 51, 51));
        quantitySold8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        earnings8.setBackground(new java.awt.Color(51, 51, 51));
        earnings8.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        earnings8.setForeground(new java.awt.Color(51, 51, 51));
        earnings8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        earnings9.setBackground(new java.awt.Color(51, 51, 51));
        earnings9.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        earnings9.setForeground(new java.awt.Color(51, 51, 51));
        earnings9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        quantitySold9.setBackground(new java.awt.Color(51, 51, 51));
        quantitySold9.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        quantitySold9.setForeground(new java.awt.Color(51, 51, 51));
        quantitySold9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        currentStock9.setBackground(new java.awt.Color(51, 51, 51));
        currentStock9.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        currentStock9.setForeground(new java.awt.Color(51, 51, 51));
        currentStock9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        startingStock9.setBackground(new java.awt.Color(51, 51, 51));
        startingStock9.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        startingStock9.setForeground(new java.awt.Color(51, 51, 51));
        startingStock9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        summarylabel10.setBackground(new java.awt.Color(51, 51, 51));
        summarylabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        summarylabel10.setForeground(new java.awt.Color(51, 51, 51));
        summarylabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        startingStock10.setBackground(new java.awt.Color(51, 51, 51));
        startingStock10.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        startingStock10.setForeground(new java.awt.Color(51, 51, 51));
        startingStock10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        currentStock10.setBackground(new java.awt.Color(51, 51, 51));
        currentStock10.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        currentStock10.setForeground(new java.awt.Color(51, 51, 51));
        currentStock10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        quantitySold10.setBackground(new java.awt.Color(51, 51, 51));
        quantitySold10.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        quantitySold10.setForeground(new java.awt.Color(51, 51, 51));
        quantitySold10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        earnings10.setBackground(new java.awt.Color(51, 51, 51));
        earnings10.setFont(new java.awt.Font("Leelawadee UI", 1, 16)); // NOI18N
        earnings10.setForeground(new java.awt.Color(51, 51, 51));
        earnings10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(summarylabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(startingStock9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(currentStock9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(quantitySold9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(earnings9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(summarylabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(startingStock8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(currentStock8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(quantitySold8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(earnings8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(summarylabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(startingStock7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(currentStock7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(quantitySold7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(earnings7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(summarylabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(startingStock6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(currentStock6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(quantitySold6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(earnings6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(summarylabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(startingStock5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(currentStock5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(quantitySold5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(earnings5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(summarylabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(startingStock4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(currentStock4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(quantitySold4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(earnings4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(summarylabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(startingStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(currentStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(quantitySold3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(earnings3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(summarylabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(startingStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(currentStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(quantitySold2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(earnings2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(summarylabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(startingStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(currentStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(quantitySold1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(earnings1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel32)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(startingStock10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(currentStock10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(quantitySold10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(earnings10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24))
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(summarylabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(startingStock, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(currentStock, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(quantitySold, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(earnings, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel31)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(summarylabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startingStock, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentStock, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantitySold, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(earnings, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(summarylabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startingStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantitySold1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(earnings1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(summarylabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startingStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantitySold2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(earnings2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(summarylabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startingStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantitySold3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(earnings3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(summarylabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startingStock4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentStock4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantitySold4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(earnings4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(summarylabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startingStock5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentStock5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantitySold5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(earnings5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(summarylabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startingStock6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentStock6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantitySold6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(earnings6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(summarylabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startingStock7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentStock7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantitySold7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(earnings7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(summarylabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startingStock8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentStock8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantitySold8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(earnings8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(summarylabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startingStock9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentStock9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantitySold9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(earnings9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(startingStock10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentStock10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantitySold10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(earnings10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Returnbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(Returnbtn)
                .addGap(14, 14, 14))
        );

        summaryLabels = new ArrayList<JLabel>();

        summaryLabels.add(summarylabel1);
        summaryLabels.add(summarylabel2);
        summaryLabels.add(summarylabel3);
        summaryLabels.add(summarylabel4);
        summaryLabels.add(summarylabel5);
        summaryLabels.add(summarylabel6);
        summaryLabels.add(summarylabel7);
        summaryLabels.add(summarylabel8);
        summaryLabels.add(summarylabel9);
        summaryLabels.add(summarylabel10);

        startingStockLabels = new ArrayList<JLabel>();

        startingStockLabels.add(startingStock);
        startingStockLabels.add(startingStock1);
        startingStockLabels.add(startingStock2);
        startingStockLabels.add(startingStock3);
        startingStockLabels.add(startingStock4);
        startingStockLabels.add(startingStock5);
        startingStockLabels.add(startingStock6);
        startingStockLabels.add(startingStock7);
        startingStockLabels.add(startingStock8);
        startingStockLabels.add(startingStock9);
        startingStockLabels.add(startingStock10);

        currentStockLabels = new ArrayList<JLabel>();

        currentStockLabels.add(currentStock);
        currentStockLabels.add(currentStock1);
        currentStockLabels.add(currentStock2);
        currentStockLabels.add(currentStock3);
        currentStockLabels.add(currentStock4);
        currentStockLabels.add(currentStock5);
        currentStockLabels.add(currentStock6);
        currentStockLabels.add(currentStock7);
        currentStockLabels.add(currentStock8);
        currentStockLabels.add(currentStock9);
        currentStockLabels.add(currentStock10);

        quantitySoldLabels = new ArrayList<JLabel>();
        
        quantitySoldLabels.add(quantitySold);
        quantitySoldLabels.add(quantitySold1);
        quantitySoldLabels.add(quantitySold2);
        quantitySoldLabels.add(quantitySold3);
        quantitySoldLabels.add(quantitySold4);
        quantitySoldLabels.add(quantitySold5);
        quantitySoldLabels.add(quantitySold6);
        quantitySoldLabels.add(quantitySold7);
        quantitySoldLabels.add(quantitySold8);
        quantitySoldLabels.add(quantitySold9);
        quantitySoldLabels.add(quantitySold10);

        earningsLabels = new ArrayList<JLabel>();

        earningsLabels.add(earnings);
        earningsLabels.add(earnings1);
        earningsLabels.add(earnings2);
        earningsLabels.add(earnings3);
        earningsLabels.add(earnings4);
        earningsLabels.add(earnings5);
        earningsLabels.add(earnings6);
        earningsLabels.add(earnings7);
        earningsLabels.add(earnings8);
        earningsLabels.add(earnings9);
        earningsLabels.add(earnings10);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }

    public void setNameLabelVisibility(int index, boolean visibility) {
        summaryLabels.get(index).setVisible(visibility);
    }

    public void setLabelVisibility(int index, boolean visibility) {
        startingStockLabels.get(index).setVisible(visibility);
        currentStockLabels.get(index).setVisible(visibility);
        quantitySoldLabels.get(index).setVisible(visibility);
        earningsLabels.get(index).setVisible(visibility);
    }

    public void setSummaryLabel(int index, String text) {
        summaryLabels.get(index).setText(text);
    }

    public void setStartingStockLabel(int index, int text) {
        startingStockLabels.get(index).setText(Integer.toString(text));
    }

    public void setCurrentStockLabel(int index, int text) {
        currentStockLabels.get(index).setText(Integer.toString(text));
    }

    public void setQuantitySoldLabel(int index, int text) {
        quantitySoldLabels.get(index).setText(Integer.toString(text));
    }

    public void setEarningsLabel(int index, int text) {
        earningsLabels.get(index).setText(Integer.toString(text));
    }

    public void setEarningsLabel(int index, String text) {
        earningsLabels.get(index).setText(text);
    }
    
    public void ReturnbtnActionPerformed(ActionListener actionListener) {
        Returnbtn.addActionListener(actionListener);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Returnbtn;
    private javax.swing.JLabel currentStock;
    private javax.swing.JLabel currentStock1;
    private javax.swing.JLabel currentStock10;
    private javax.swing.JLabel currentStock2;
    private javax.swing.JLabel currentStock3;
    private javax.swing.JLabel currentStock4;
    private javax.swing.JLabel currentStock5;
    private javax.swing.JLabel currentStock6;
    private javax.swing.JLabel currentStock7;
    private javax.swing.JLabel currentStock8;
    private javax.swing.JLabel currentStock9;
    private javax.swing.JLabel earnings;
    private javax.swing.JLabel earnings1;
    private javax.swing.JLabel earnings10;
    private javax.swing.JLabel earnings2;
    private javax.swing.JLabel earnings3;
    private javax.swing.JLabel earnings4;
    private javax.swing.JLabel earnings5;
    private javax.swing.JLabel earnings6;
    private javax.swing.JLabel earnings7;
    private javax.swing.JLabel earnings8;
    private javax.swing.JLabel earnings9;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel quantitySold;
    private javax.swing.JLabel quantitySold1;
    private javax.swing.JLabel quantitySold10;
    private javax.swing.JLabel quantitySold2;
    private javax.swing.JLabel quantitySold3;
    private javax.swing.JLabel quantitySold4;
    private javax.swing.JLabel quantitySold5;
    private javax.swing.JLabel quantitySold6;
    private javax.swing.JLabel quantitySold7;
    private javax.swing.JLabel quantitySold8;
    private javax.swing.JLabel quantitySold9;
    private javax.swing.JLabel startingStock;
    private javax.swing.JLabel startingStock1;
    private javax.swing.JLabel startingStock10;
    private javax.swing.JLabel startingStock2;
    private javax.swing.JLabel startingStock3;
    private javax.swing.JLabel startingStock4;
    private javax.swing.JLabel startingStock5;
    private javax.swing.JLabel startingStock6;
    private javax.swing.JLabel startingStock7;
    private javax.swing.JLabel startingStock8;
    private javax.swing.JLabel startingStock9;
    private javax.swing.JLabel summarylabel1;
    private javax.swing.JLabel summarylabel10;
    private javax.swing.JLabel summarylabel2;
    private javax.swing.JLabel summarylabel3;
    private javax.swing.JLabel summarylabel4;
    private javax.swing.JLabel summarylabel5;
    private javax.swing.JLabel summarylabel6;
    private javax.swing.JLabel summarylabel7;
    private javax.swing.JLabel summarylabel8;
    private javax.swing.JLabel summarylabel9;
    private List<JLabel> summaryLabels;
    private List<JLabel> startingStockLabels;
    private List<JLabel> currentStockLabels;
    private List<JLabel> quantitySoldLabels;
    private List<JLabel> earningsLabels;

    // End of variables declaration    
}
