package MCO2_Lim_Jimenez;
/**
 * VMFactory class is a factory class that creates a RegularVM or a SpecialVM
 */
public class VMFactory {
    private RegularVM vm;
    private boolean isSPecial;

    /**
     * A constructor that creates a VMFactory object.
     */
    public VMFactory() {
        isSPecial = false;
        this.vm = null;
    }

    /**
     * A method that creates a RegularVM object.
     */
    public void createRegularVM() {
        if(vm != null){
            vm.clearBalance();
            vm = null;
        }
        vm = new RegularVM();
        isSPecial = false;
        vm.recordStock();
        System.out.println("\nRegular Vending Machine successfully created!\n");
    }

    /**
     * A method that creates a SpecialVM object.
     */
    public void createSpecialVM() {
        if(vm != null){
            vm.clearBalance();
            vm = null;
        }
        vm = new SpecialVM();
        isSPecial = true;
        vm.recordStock();
        System.out.println("\nSpecial Vending Machine successfully created!\n");
    }

    /**
     * A method that returns the VM object.
     * @return the VM object.
     */
    public RegularVM getVM() {
        return vm;
    }

    /**
     * A method that returns true if the VM is a SpecialVM.
     * @return true if the VM is a SpecialVM.
     */
    public boolean isSpecial() {
        return isSPecial;
    }
}
