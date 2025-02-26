import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) {


        var option = -1;
        do{
            System.out.println("==Escolha uma das opções==");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");

            option = scanner.nextInt();

            switch (option){
                case 1 -> petMachine.takeShowerInPet();
                case 2 -> petMachine.addWater();
                case 3 -> petMachine.addShampoo();
                case 4 -> petMachine.getWater();
                case 5 -> petMachine.getShampoo();
                case 6 -> petMachine.hasPet();
                case 7 -> setPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        }  while (true );
    }

    public static void setPetMachine(){
        var name = "";
        while(name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet.");
            name = scanner.nextLine();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);

    }

}