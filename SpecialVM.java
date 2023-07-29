public class SpecialVM extends RegularVM {
    public SpecialVM(){
        super();
    }

    @Override
    public void displayVendingFeaturesMenu(){
        System.out.println("\n-------Vending Features-------");
        System.out.println("[1] Insert Payment");
        System.out.println("[2] Order Item");
        System.out.println("[3] Order Custom Item");
        System.out.println("[4] Receive Change");
        System.out.println("[5] Return to Test Menu");
    }
}
