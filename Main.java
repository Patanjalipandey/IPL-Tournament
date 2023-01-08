import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tournament tur = new Tournament();

        tur.read();
        int choice;

        do{
            System.out.println("Select the Method that you want to use");
            System.out.println("1-> Add Teams 2->Display Teams 3->Exit");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    tur.AddTeam();
                    break;
                case 2:
                    tur.display();
                    break;
                default:
                    break;
            }
        }
        while(choice != 3);

        
    }
}
