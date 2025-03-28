package exercicios1;

public class PetMachine {
    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public PetMachine() {

    }
    
    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }
        if (!checkIsThereWater() || !checkIsThereShampoo()) {
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo");
        clean = false;
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }
        water += 10;
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
       return pet != null;
    }
    
    public void setPet(Pet pet) {
        if (!(this.clean)) {
            System.out.println("A máquina está suja, para colocar o pet é necessário limpá-la");
            return;
        } else if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + " está na máquina neste momento");
            return;
        }

        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");
    }

    public void removePet() {
        System.out.println("O pet " + this.pet.getName() + " foi tirado da máquina");
        this.pet = null;
    }

    public void washMachine() {
        if (!checkIsThereWater() || !checkIsThereShampoo()) {
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina foi limpa");
    }

    private boolean checkIsThereWater() {
        if (this.water <= 0) {
            System.out.println("Ops! A máquina está sem água, adicione mais água para poder usá-la");
            return false;
        }
        return true;
    }

    private boolean checkIsThereShampoo() {
        if (this.shampoo <= 0) {
            System.out.println("Ops! A máquina está sem shampoo, adicione mais shampoo para poder usá-la");
            return false;
        }
        return true;
    }
}
