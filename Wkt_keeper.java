import java.util.Scanner;

public class Wkt_keeper extends Batsman{
    private int stumps,catches;
    

    public Wkt_keeper() {
    }

    public Wkt_keeper(int p_id, String p_name, int runs, int fiftees, int hundreds, int stumps, int catches) {
        super(p_id, p_name, runs, fiftees, hundreds);
        this.stumps = stumps;
        this.catches = catches;
    }

    public int getStumps() {
        return stumps;
    }

    public void setStumps(int stumps) {
        this.stumps = stumps;
    }

    public int getCatches() {
        return catches;
    }

    public void setCatches(int catches) {
        this.catches = catches;
    }

    public void read(){
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stumps");
        setStumps(sc.nextInt());
        System.out.println("Enter Catches");
        setCatches(sc.nextInt());
    }

    @Override
    public String toString() {
        return super.toString() + "Wkt_keeper [stumps=" + stumps + ", catches=" + catches + "]";
    }

    
    
}
