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
                System.out.println("Create Menu");
            }
        });

        this.vmView.TestVMbtnActionPerformed(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
                vmView.setVisible(false);
                testMenu.setVisible(true);
                System.out.println("Test Menu");
            }
        });

        //Create Menu Buttons        
        this.createMenu.ReturnbtnActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createMenu.setVisible(false);
                vmView.setVisible(true);
                System.out.println("Return to Main Menu");
            }
        });

        this.createMenu.cRegularVMbtn2ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createMenu.setVisible(false);
                //vmFactory.createRegularVM();
                System.out.println("Create Regular VM");
            }
        });
    }
}