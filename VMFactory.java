public class VMFactory {
    RegularVM vm;
    boolean isSPecial;

    public VMFactory() {
        isSPecial = false;
        this.vm = null;
    }

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

    public RegularVM getVM() {
        return vm;
    }

    public boolean isSpecial() {
        return isSPecial;
    }
}
