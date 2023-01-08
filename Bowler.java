import java.util.Scanner;

public class Bowler extends Batsman{
    private int overs,wickets;

    public Bowler() {
    }

    public Bowler(int p_id, String p_name, int runs, int fiftees, int hundreds, int overs, int wickets) {
        super(p_id, p_name, runs, fiftees, hundreds);
        this.overs = overs;
        this.wickets = wickets;
    }

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }
    
    public void read(){
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Overs");
        setOvers(sc.nextInt());
        System.out.println("Enter Wickets");
        setWickets(sc.nextInt());

    }

    @Override
    public String toString() {
        return super.toString() + "Bowler [overs=" + overs + ", wickets=" + wickets + "]";
    }

    
}
