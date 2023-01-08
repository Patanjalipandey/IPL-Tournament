import java.util.Scanner;

public class Batsman extends Player{
    private int runs,fiftees,hundreds;

    public Batsman() {
    }

    public Batsman(int p_id, String p_name, int runs, int fiftees, int hundreds) {
        super(p_id, p_name);
        this.runs = runs;
        this.fiftees = fiftees;
        this.hundreds = hundreds;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getFiftees() {
        return fiftees;
    }

    public void setFiftees(int fiftees) {
        this.fiftees = fiftees;
    }

    public int getHundreds() {
        return hundreds;
    }

    public void setHundreds(int hundreds) {
        this.hundreds = hundreds;
    }

    public void read(){
        
        Scanner sc = new Scanner(System.in);
        super.read();
        System.out.println("Enter Total Runs");
        setRuns(sc.nextInt());
        System.out.println("Enter fiftees");
        setFiftees(sc.nextInt());
        System.out.println("Enter Hundreds");
        setHundreds(sc.nextInt());
    }

    @Override
    public String toString() {
        return super.toString() + "Batsman [runs=" + runs + ", fiftees=" + fiftees + ", hundreds=" + hundreds + "]";
    }

    
    
}
