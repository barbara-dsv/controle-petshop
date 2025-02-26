public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;


    public void takeShowerInPet (){
        if(this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }

        this.shampoo -= 2;
        pet.setClean(true);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("O pet "  + pet.getName() + " foi banhado e está pronto para ser retirado da máquina");
    }

    public void addWater(){

        if (water >= 30){
            System.out.println("A capacidade de água da máquina está no máximo.");
            return;
        }
        System.out.println("Abastecendo a máquina com 10 litros de água");
        water += 2;
    }

    public void addShampoo(){

        if (shampoo >= 10){
            System.out.println("A capacidade de shampoo da máquina está no máximo.");
            return;
        }
        System.out.println("Abastecendo máquina com 2 litros de shampoo");
        shampoo += 2;
    }

    public int getWater() {
        System.out.println("Há " + water + " litro(s) de água na máquina");
        return water;
    }

    public int getShampoo() {
        System.out.println("Há " + shampoo + " litros(s) de shampoo na máquina");
        return shampoo;
    }


    public boolean hasPet(){
        boolean hasPet = pet != null;
        System.out.println(hasPet ? "Tem pet na máquina, é necessário retira-ló para iniciar outro banho" : "Não há pet na máquina, prossiga prossiga com o banho");
        return hasPet;
    }


    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A máquina está suja, para colocar o pet é necessário limpar.");
            return;
        }

        if(hasPet()){
           return;
        }
        if(water < 10 ){
            System.out.println("Não há água o suficiente na máquina, é preciso reabastecer.");
            return;
        }
        if(shampoo < 2 ){
            System.out.println("Não há shampoo suficiente na máquina, é preciso reabastecer ");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");

        takeShowerInPet();
    }

    public void removePet (){
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi tirado da máquina");
        this.pet = null;
    }

    public void wash(){
        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;
        System.out.println("A máquina foi limpa.");
    }
}
