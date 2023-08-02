import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VMController {
    private VMView vmView;
    private CreateMenu createMenu;
    private TestMenu testMenu;
    private ManageMoney manageMoney;
    private PrintSummary printSummary;
    private PizzaMake pizzaMake;
    private VMFactory vmFactory;

    //public VMController(VMView vmView, VMFactory vmFactory) {
    public VMController(VMView vmView, CreateMenu createMenu, TestMenu testMenu, ManageMoney manageMoney, 
                        PrintSummary printSummary, PizzaMake pizzaMake, VMFactory vmFactory) {

        this.vmView = vmView;
        this.createMenu = createMenu;
        this.testMenu = testMenu;
        this.manageMoney = manageMoney;
        this.printSummary = printSummary;
        this.pizzaMake = pizzaMake;
        this.vmFactory = vmFactory;

        //VMView Buttons
        this.vmView.CreateVMbtnActionPerformed(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
                vmView.setVisible(false);
                createMenu.setVisible(true);
            }
        });

        this.vmView.TestVMbtnActionPerformed(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
                if (vmFactory.getVM() == null) {
                    vmView.displayErrorMessage("Please create a vending machine first!");
                } else {
                    vmView.setVisible(false);
                    refreshTestScreen();           
                    testMenu.setVisible(true);
                }
            }
        });

        
        //Create Menu Buttons        
        this.createMenu.ReturnbtnActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createMenu.setVisible(false);
                vmView.setVisible(true);
            }
        });

        this.createMenu.cRegularVMbtn2ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vmFactory.createRegularVM();
                createMenu.setVisible(false);
                vmView.setVisible(true);
            }
        });

        this.createMenu.cSpecialVMbtn2ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vmFactory.createSpecialVM();
                createMenu.setVisible(false);
                vmView.setVisible(true);
            }
        });

        //Test Menu Buttons
        this.testMenu.ReturnbtnActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                testMenu.setVisible(false);
                vmView.setVisible(true);
            }
        });

        //Vending Feature Buttons
        this.testMenu.onePesoInsertActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vmFactory.getVM().insertPayment(1);
                testMenu.setVendTestbalance(vmFactory.getVM().getBalance());
            }
        });

        this.testMenu.fivePesoInsertActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vmFactory.getVM().insertPayment(5);
                testMenu.setVendTestbalance(vmFactory.getVM().getBalance());
            }
        });

        this.testMenu.tenPesoInsertActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vmFactory.getVM().insertPayment(10);
                testMenu.setVendTestbalance(vmFactory.getVM().getBalance());
            }
        });

        this.testMenu.twentyPesoInsertActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vmFactory.getVM().insertPayment(20);
                testMenu.setVendTestbalance(vmFactory.getVM().getBalance());
            }
        });

        this.testMenu.fiftyPesoInsertActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vmFactory.getVM().insertPayment(50);
                testMenu.setVendTestbalance(vmFactory.getVM().getBalance());
            }
        });

        this.testMenu.hundredPesoInsertActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vmFactory.getVM().insertPayment(100);
                testMenu.setVendTestbalance(vmFactory.getVM().getBalance());
            }
        });

        this.testMenu.twohundPesoInsertActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vmFactory.getVM().insertPayment(200);
                testMenu.setVendTestbalance(vmFactory.getVM().getBalance());
            }
        });

        this.testMenu.fivehundPesoInsertActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vmFactory.getVM().insertPayment(500);
                testMenu.setVendTestbalance(vmFactory.getVM().getBalance());
            }
        });

        this.testMenu.cancelOrderBTNActionPerfomed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    testMenu.clearVendTestArea();
                    testMenu.addVendTestArea(vmFactory.getVM().receiveChange());
                    testMenu.setVendTestbalance(vmFactory.getVM().getBalance());
            }
        });

        this.testMenu.orderbtnActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    int index = Integer.valueOf(e.getActionCommand());
                    //testMenu.clearVendTestArea();
                    testMenu.addVendTestArea(vmFactory.getVM().orderItem(index));
                    testMenu.setVendTestbalance(vmFactory.getVM().getBalance());
            }
        });

        //Maintenance Feature Buttons
        this.testMenu.submitbtnActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String errormsg = String.format("Stock must be less than twenty.\nThe following product stock remain unchanged:\n");
                             
                boolean error = false;

                for(int i = 0; i < vmFactory.getVM().slotRecord.size(); i++) {
                        vmFactory.getVM().setPrice(i, testMenu.getPriceField(i));
                        if(testMenu.getQuantityField(i) <= 20) {
                            int add = testMenu.getQuantityField(i) - vmFactory.getVM().slotList.get(i).size();
                            vmFactory.getVM().restockItem(i, add);
                        }
                        else{
                            error = true;
                            errormsg += String.format("%s\n", vmFactory.getVM().slotRecord.get(i).getName());
                        }
                }

                if(error)
                    vmView.displayErrorMessage(errormsg);
                
                refreshTestScreen();
            }
        });

        this.testMenu.stockBtnActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (vmFactory.getVM() instanceof SpecialVM) {
                    if(testMenu.getNewItemSlotNumber() > 0 && testMenu.getNewItemSlotNumber() <= 8)
                    {
                        int found = -1;

                    for (int i = 0; i < vmFactory.getVM().slotRecord.size(); i++) {
                        System.out.println(testMenu.getReplaceItem().equals(vmFactory.getVM().extraItems.get(i).getName()));
                        if (testMenu.getReplaceItem().equals(vmFactory.getVM().extraItems.get(i).getName())) {
                            found = i;
                        }
                        ((SpecialVM)vmFactory.getVM()).replaceItem(testMenu.getNewItemSlotNumber() - 1, found);

                    }
                } else {
                    vmView.displayErrorMessage("Invalid slot number.");
                }}
                else{
                    if(testMenu.getNewItemSlotNumber() > 0 && testMenu.getNewItemSlotNumber() <= 8)
                    {
                        int index = testMenu.getNewItemSlotNumber() - 1;
                        vmFactory.getVM().addItem(index, testMenu.getNewItemName(), testMenu.getNewItemPrice(), testMenu.getNewItemCalories(), 0);
                    } else {
                        vmView.displayErrorMessage("Invalid slot number.");
                    }
                }
                testMenu.clearStockFields();
                refreshTestScreen();
            }
        });
    }



    public void refreshTestScreen(){
            testMenu.setVendTestbalance(vmFactory.getVM().getBalance());
                    testMenu.clearVendTestArea();
                    if (!(vmFactory.getVM() instanceof SpecialVM)) {
                        testMenu.setMaintLabelVisibility(9, false);
                        testMenu.setMaintLabelVisibility(8, false);
                        testMenu.setComboVisibility(false);
                        testMenu.showStockMenu();
                    }
                    else{
                        testMenu.setMaintLabelVisibility(9, true);
                        testMenu.setMaintLabelVisibility(8, true);
                        testMenu.setComboVisibility(true);
                        testMenu.hideStockMenu();
                    }


                    for(int i = 0; i < 8; i++) {
                        if(vmFactory.getVM() instanceof SpecialVM)
                            if(vmFactory.getVM().slotRecord.get(i).getType() == 1 || vmFactory.getVM().slotRecord.get(i).getType() == 3) {                        
                                if(vmFactory.getVM().slotList.get(i).size() == 0) {
                                    testMenu.setOrderBTNText("Empty", i);
                                    testMenu.setPriceLabelText(" ", i);
                                    testMenu.setToolTipText("", i);
                                } else{
                                testMenu.setOrderBTNText(vmFactory.getVM().slotRecord.get(i).getName(), i);
                                String msg = String.format("P%.2f", vmFactory.getVM().slotRecord.get(i).getPrice());
                                testMenu.setPriceLabelText(msg, i);
                                String msg2 = String.format("Calories:%.1fkcal", vmFactory.getVM().slotRecord.get(i).getCalories());
                                testMenu.setToolTipText(msg2, i);
                                }
                            } else 
                                testMenu.setBtnVisibility(false, i);
                        else {
                            if(vmFactory.getVM().slotList.get(i).size() == 0) {
                                    testMenu.setOrderBTNText("Empty", i);
                                    testMenu.setPriceLabelText(" ", i);
                                    testMenu.setToolTipText("", i);
                                } else{
                                testMenu.setOrderBTNText(vmFactory.getVM().slotRecord.get(i).getName(), i);
                                String msg = String.format("P%.2f", vmFactory.getVM().slotRecord.get(i).getPrice());
                                testMenu.setPriceLabelText(msg, i);
                                String msg2 = String.format("Calories:%.1fkcal", vmFactory.getVM().slotRecord.get(i).getCalories());
                                testMenu.setToolTipText(msg2, i);
                                }
                            }
                    }

                    for(int i = 0; i < vmFactory.getVM().slotRecord.size(); i++) {
                        String name = i + 1 + ".) " + vmFactory.getVM().slotRecord.get(i).getName();
                        testMenu.setMaintTestLabelText(name, i);
                        String price = String.format("%.2f", vmFactory.getVM().slotRecord.get(i).getPrice());
                        testMenu.setMaintTestPriceText(price, i);
                        String quantity = String.format("%d", vmFactory.getVM().slotList.get(i).size());
                        testMenu.setMaintTestQuantityText(quantity, i);
                    }
        }
}