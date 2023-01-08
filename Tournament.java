import java.util.Scanner;

public class Tournament extends Team{
    private String name;
    private int year;
    
    public Tournament() {
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
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Tournament Name");
        setName(sc.next());
        System.out.println("Enter Tournament year");
        setYear(sc.nextInt());
    }

    @Override
    public String toString() {
        return "Tournament [name=" + name + ", year=" + year + "]";
    }

    
}
