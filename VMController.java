import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This is a controller class to connect between the views and model classes.
 */
public class VMController {
    private VMView vmView;
    private CreateMenu createMenu;
    private TestMenu testMenu;
    private ManageMoney manageMoney;
    private PrintSummary printSummary;
    private PizzaMake pizzaMake;
    private VMFactory vmFactory;

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
                    if (index == 0 && vmFactory.getVM() instanceof SpecialVM && vmFactory.getVM().slotList.get(9).size() > 0) {
                        testMenu.setVisible(false);
                        pizzaMake.clearTextArea();
                        for (int i = 0; i < 3; i++)
                            pizzaMake.setSauceIcon(i, "resources/Blank.png");
                        for (int i = 1; i < 11; i++)
                            pizzaMake.setPizzaIcon(i, "resources/Blank.png");
                        

                        //instantiate buttons
                        refreshPizzaMakeScreen();

                        pizzaMake.addTextArea("Dough is being prepared!\n(PHP100)\n");
                        if(((SpecialVM)vmFactory.getVM()).addIngredient(((SpecialVM)vmFactory.getVM()).getPizza(), 9)) {
                            pizzaMake.addTextArea("\nDough is ready!\n");
                            pizzaMake.setPizzaIcon(0, "resources/pizzabase.png");
                            pizzaMake.setPizzaIcon(10, "resources/Blank.png");
                            pizzaMake.buttonsEnabler(true);
                            pizzaMake.setVisible(true);
                    }} else if (index == 0 && vmFactory.getVM() instanceof SpecialVM){
                        vmView.displayErrorMessage("Dough is out of stock!");
                        } else {
                        testMenu.addVendTestArea(vmFactory.getVM().orderItem(index));
                        testMenu.setVendTestbalance(vmFactory.getVM().getBalance());
                    }
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
                            int setTo = testMenu.getQuantityField(i); 
                            vmFactory.getVM().restockItem(i, setTo);
                        }
                        else{
                            error = true;
                            errormsg += String.format("%s\n", vmFactory.getVM().slotRecord.get(i).getName());
                        }
                }

                if(error)
                    vmView.displayErrorMessage(errormsg);
                refreshPizzaMakeScreen();
                refreshTestScreen();
                vmFactory.getVM().recordStock();
            }
        });

        this.testMenu.stockBtnActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (vmFactory.getVM() instanceof SpecialVM) {
                    if(testMenu.getNewItemSlotNumber() > 1 && testMenu.getNewItemSlotNumber() <= 6)
                    {
                        int found = -1;

                    for (int i = 0; i < vmFactory.getVM().extraItems.size(); i++) {
                        if (testMenu.getReplaceItem().equals(vmFactory.getVM().extraItems.get(i).getName())) {
                            found = i;
                        }

                    }
                    ((SpecialVM)vmFactory.getVM()).replaceItem(testMenu.getNewItemSlotNumber() - 1, found);
                } else {
                    if(testMenu.getNewItemSlotNumber() >= 6 && testMenu.getNewItemSlotNumber() <= 10)
                        vmView.displayErrorMessage("Item cannot be replaced.");
                    else
                        vmView.displayErrorMessage("Invalid slot number.");
                }}
                else{
                    if(testMenu.getNewItemSlotNumber() > 0 && testMenu.getNewItemSlotNumber() <= 8)
                    {
                        int index = testMenu.getNewItemSlotNumber() - 1;
                        vmFactory.getVM().addItem(index, testMenu.getNewItemName(), testMenu.getNewItemPrice(), testMenu.getNewItemCalories(), 10);
                    } else {
                        vmView.displayErrorMessage("Invalid slot number.");
                    }
                }
                testMenu.clearStockFields();
                refreshTestScreen();
            }
        });

        //Print Summary
        this.testMenu.printSummaryBtnActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                testMenu.setVisible(false);

                if (vmFactory.getVM() instanceof SpecialVM) {
                    printSummary.setNameLabelVisibility(9, true);
                    printSummary.setLabelVisibility(9, true);
                } else {
                    printSummary.setNameLabelVisibility(9, false);
                    printSummary.setLabelVisibility(9, false);
                    printSummary.setNameLabelVisibility(8, false);
                    printSummary.setLabelVisibility(8, false);
                }

                int totalEarnings = 0;
                int totalStartingStock = 0;
                int totalCurrentStock = 0;

                for (int i = 0; i < vmFactory.getVM().slotList.size(); i++) {
                    if (vmFactory.getVM().slotRecord.get(i).getName().equals("Pizza")){
                        printSummary.setLabelVisibility(i, false);
                    }
                    String name = i + 1 + ".) " + vmFactory.getVM().slotRecord.get(i).getName();
                    printSummary.setSummaryLabel(i, name);
                    String stockname = vmFactory.getVM().slotRecord.get(i).getName();

                    int startingstock = vmFactory.getVM().stockRecordMap.get(stockname);
                    totalStartingStock += startingstock;
                    printSummary.setStartingStockLabel(i, startingstock);

                    int currentstock = vmFactory.getVM().slotList.get(i).size();
                    totalCurrentStock += currentstock;
                    printSummary.setCurrentStockLabel(i, currentstock);

                    int amtsold = vmFactory.getVM().stockRecordMap.get(stockname) - vmFactory.getVM().slotList.get(i).size();
                    printSummary.setQuantitySoldLabel(i, amtsold);
                    int earnings = amtsold * (int)vmFactory.getVM().slotRecord.get(i).getPrice();
                    totalEarnings += earnings;
                    printSummary.setEarningsLabel(i, earnings);
                }

                printSummary.setStartingStockLabel(10, totalStartingStock);
                printSummary.setCurrentStockLabel(10, totalCurrentStock);
                printSummary.setQuantitySoldLabel(10, totalStartingStock - totalCurrentStock);
                printSummary.setEarningsLabel(10, Integer.toString(totalEarnings) + ".00");
                
                printSummary.setVisible(true);
            }
        });

        this.printSummary.ReturnbtnActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printSummary.setVisible(false);
                refreshTestScreen();
                testMenu.setVisible(true);
            }
        });

        //Manage Money
        this.testMenu.manageMoneyBtnActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                testMenu.setVisible(false);
                manageMoney.clearTextArea();
                manageMoney.setVisible(true);
            }
        });

        this.manageMoney.setOnePesoReplenishBTN(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manageMoney.addTextArea(vmFactory.getVM().replenishMoney(1, 1));
            }
        });

        this.manageMoney.setFivePesoReplenishBTN(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manageMoney.addTextArea(vmFactory.getVM().replenishMoney(5, 1));
            }
        });

        this.manageMoney.setTenPesoReplenishBTN(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manageMoney.addTextArea(vmFactory.getVM().replenishMoney(10, 1));
            }
        });

        this.manageMoney.setTwentyPesoReplenishBTN(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manageMoney.addTextArea(vmFactory.getVM().replenishMoney(20, 1));
            }
        });

        this.manageMoney.setFiftyPesoReplenishBTN(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manageMoney.addTextArea(vmFactory.getVM().replenishMoney(50, 1));
            }
        });

        this.manageMoney.setHundredPesoReplenishBTN(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manageMoney.addTextArea(vmFactory.getVM().replenishMoney(100, 1));
            }
        });

        this.manageMoney.setTwoHundredPesoReplenishBTN(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manageMoney.addTextArea(vmFactory.getVM().replenishMoney(200, 1));
            }
        });

        this.manageMoney.setFiveHundredPesoReplenishBTN(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manageMoney.addTextArea(vmFactory.getVM().replenishMoney(500, 1));
            }
        });

        this.manageMoney.ViewDenominations(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manageMoney.clearTextArea();
                manageMoney.addTextArea(vmFactory.getVM().viewDenominations());
            }
        });

        this.manageMoney.setCollectAllBTN(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manageMoney.clearTextArea();
                manageMoney.addTextArea(vmFactory.getVM().collectMoney());
            }
        });

        this.manageMoney.ReturnbtnActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manageMoney.setVisible(false);
                refreshTestScreen();
                testMenu.setVisible(true);
            }
        });

        //Pizza Make
        this.pizzaMake.ReturnbtnActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaMake.setVisible(false);
                refreshTestScreen();
                testMenu.setVisible(true);
            }
        });

        this.pizzaMake.setIngredientBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    int index = Integer.valueOf(e.getActionCommand()) + 1;
                    if(((SpecialVM)vmFactory.getVM()).addIngredient(((SpecialVM)vmFactory.getVM()).getPizza(), index)) {
                        if(index >= 6 && index <=8){
                            pizzaMake.setSauceIcon(index - 6, vmFactory.getVM().slotRecord.get(index).getImage());
                        } else
                            pizzaMake.setPizzaIcon(index + 1, vmFactory.getVM().slotRecord.get(index).getImage());
                        String add = String.format(vmFactory.getVM().slotRecord.get(index).getName() + " added.\n");
                        pizzaMake.addTextArea("\n" + add);
                        ((SpecialVM)vmFactory.getVM()).getPizza().TotalCalories();
                        ((SpecialVM)vmFactory.getVM()).getPizza().TotalPrice();
                        String price = String.format("\nCurrent Price: %.2f\n", ((SpecialVM)vmFactory.getVM()).getPizza().getPrice());
                        String calories = String.format("Current Calories: %.1fkcal calories\n", ((SpecialVM)vmFactory.getVM()).getPizza().getCalories());
                        pizzaMake.addTextArea(price);
                        pizzaMake.addTextArea(calories);
                    } else {
                        String error = String.format("\nSorry, we ran out of\n" + vmFactory.getVM().slotRecord.get(index).getName() + ".\n");
                        pizzaMake.addTextArea(error);
                    }
            
            }
        });

        this.pizzaMake.completeBTN(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaMake.buttonsEnabler(false);
                ((SpecialVM)vmFactory.getVM()).getPizza().TotalCalories();
                ((SpecialVM)vmFactory.getVM()).getPizza().TotalPrice();
                String price = String.format("\n\nYour order will cost: \nP%.2f\n", ((SpecialVM)vmFactory.getVM()).getPizza().getPrice());
                String calories = String.format("Your order will have: \n%.1fkcal calories\n", ((SpecialVM)vmFactory.getVM()).getPizza().getCalories());
                pizzaMake.addTextArea(price);
                pizzaMake.addTextArea(calories);

                if(vmFactory.getVM().getBalance() >= ((SpecialVM)vmFactory.getVM()).getPizza().getPrice()) {
                    pizzaMake.addTextArea(((SpecialVM)vmFactory.getVM()).orderIngredient(((SpecialVM)vmFactory.getVM()).getPizza().getPrice(), ((SpecialVM)vmFactory.getVM()).getPizza().getIngredients()));
                    pizzaMake.addTextArea(((SpecialVM)vmFactory.getVM()).displayPrep(((SpecialVM)vmFactory.getVM()).getPizza()));
                    for (int i = 0; i < 3; i++)
                        pizzaMake.setSauceIcon(i, "resources/Blank.png");
                    for (int i = 0; i < 11; i++)
                        pizzaMake.setPizzaIcon(i, "resources/Blank.png");
                    pizzaMake.setPizzaIcon(10, "resources/boxed.png");
                } else {
                    String error = String.format("\nSorry, you don't have \nenough money to buy this.\nPlease return \nto the menu.\n");
                    pizzaMake.addTextArea(error);
                }     
            }
        });
    }

    //Methods

    /**
     * this refreshes all elements in the test menu screen
     */
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
                        String extra[] = new String[4];
                        for (int i =0; i < 4; i++) {
                            extra[i] = vmFactory.getVM().extraItems.get(i).getName();
                        }
                        testMenu.setComboChoices(extra);
                    }


                    for(int i = 0; i < 8; i++) {
                        if(vmFactory.getVM() instanceof SpecialVM)
                            if(vmFactory.getVM().slotRecord.get(i).getType() != 0 && vmFactory.getVM().slotRecord.get(i).getType() != 2) {                        
                                if(vmFactory.getVM().slotList.get(i).size() == 0) {
                                    testMenu.setOrderBTNText("Empty", i);
                                    testMenu.setPriceLabelText(" ", i);
                                    testMenu.setToolTipText(null, i);
                                } else{
                                    testMenu.setOrderBTNText(vmFactory.getVM().slotRecord.get(i).getName(), i);
                                    String msg = String.format("P%.2f", vmFactory.getVM().slotRecord.get(i).getPrice());
                                    testMenu.setPriceLabelText(msg, i);
                                    String msg2 = String.format("Calories:%.1fkcal", vmFactory.getVM().slotRecord.get(i).getCalories());
                                    testMenu.setToolTipText(msg2, i);
                                }
                            } else {
                                testMenu.setBtnVisibility(false, i);
                                testMenu.setPriceLabelVisibility(i, false);
                            }
                        else {
                            if(vmFactory.getVM().slotList.get(i).size() == 0) {
                                    testMenu.setOrderBTNText("Empty", i);
                                    testMenu.setPriceLabelText(" ", i);
                                    testMenu.setToolTipText(null, i);
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
                        if(vmFactory.getVM() instanceof SpecialVM)
                        if (vmFactory.getVM().slotRecord.get(i).getType() == 3) {
                            testMenu.setPriceLabelText(" ", i);
                            testMenu.setMaintPriceVisibility(i, false);
                            testMenu.setMaintQuantityVisibility(i, false);
                        }
                    }
        }

        /**
         * This refreshes all elements in the make-a-pizza screen
         */
        public void refreshPizzaMakeScreen() {
            for(int i = 0; i < 8; i++) {
                int j = i + 1;
                if(vmFactory.getVM().slotRecord.get(j).getType() != 0 || vmFactory.getVM().slotRecord.get(j).getType() != 3) {                  
                    if(vmFactory.getVM().slotList.get(j).size() == 0) {
                        if (i < 5){
                            pizzaMake.setIngredientLabel(i, "Empty");
                            pizzaMake.setIngredientButtonIcon(i, null);
                            pizzaMake.setIngredientPriceLabel(i, "");                            
                        }
                        else {
                            pizzaMake.setButtonText(i, "   Empty   ");
                            pizzaMake.setToolTipText(i, null);
                        }
                    } else{
                        if(i < 5){
                            pizzaMake.setIngredientLabel(i, vmFactory.getVM().slotRecord.get(j).getName());
                            String msg = String.format("P%.2f", vmFactory.getVM().slotRecord.get(j).getPrice());
                            pizzaMake.setIngredientPriceLabel(i, msg);
                            String msg2 = String.format("Calories: %.1fkcal", vmFactory.getVM().slotRecord.get(j).getCalories());
                            pizzaMake.setToolTipText(i, msg2);
                            String icon = "resources/" + vmFactory.getVM().slotRecord.get(j).getName() + ".png";
                            pizzaMake.setIngredientButtonIcon(i, icon);
                        } else if (i >= 5){
                            pizzaMake.setButtonText(i, vmFactory.getVM().slotRecord.get(j).getName());
                            String msg2 = String.format("Calories: %.1fkcal  Price: %.2f", vmFactory.getVM().slotRecord.get(j).getCalories(), vmFactory.getVM().slotRecord.get(j).getPrice());
                            pizzaMake.setToolTipText(i, msg2);
                        }
                    }
                }
            }
        }
}