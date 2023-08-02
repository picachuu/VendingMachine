public class MCOMain {
	public static void main(String[] args) {
		VMView vmView = new VMView();
        CreateMenu createMenu = new CreateMenu();
        TestMenu testMenu = new TestMenu();
        ManageMoney manageMoney = new ManageMoney();
        PrintSummary printSummary = new PrintSummary();
        PizzaMake pizzaMake = new PizzaMake();
        VMFactory vmFactory = new VMFactory();

    VMController vmController = new VMController(vmView, createMenu, testMenu, manageMoney, 
                                                printSummary, pizzaMake, vmFactory);
    //VMController vmController = new VMController(vmView, vmFactory);
    }
}
