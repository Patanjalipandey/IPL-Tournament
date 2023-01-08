import java.util.Scanner;

public class Tournament extends Team{
    private String name;
    private int year;
    int Team_counter;

    Team team[] = new Team[20];
    
    public Tournament() {
        Team_counter = 0;
    }

    public Tournament(int p_id, String p_name, String tean_name, String ceo, String name, int year) {
        super(p_id, p_name, tean_name, ceo);
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Tournament Name");
        setName(sc.next());
        System.out.println("Enter Tournament year");
        setYear(sc.nextInt());
    }
    public void AddTeam(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Team");
        int not = sc.nextInt();
        for(int i = 0; i<not;i++){
            team[i] = new Team();
            team[i].read();
            team[i].addplayer();
            Team_counter++;
        }
    }

    public void display(){
        System.out.println("Succesfully Created");
    }



    @Override
    public String toString() {
        return super.toString() + "Tournament [name=" + name + ", year=" + year + "]";
    }

    
}
