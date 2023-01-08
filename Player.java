import java.util.Scanner;
public class Player {
    private int p_id;
    private String p_name;

    public Player(){

    }
    public Player(int p_id, String p_name) {
        this.p_id = p_id;
        this.p_name = p_name;
    }
    public int getP_id() {
        return p_id;
    }
    public void setP_id(int p_id) {
        this.p_id = p_id;
    }
    public String getP_name() {
        return p_name;
    }
    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public void read(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Player ID");
        setP_id(scanner.nextInt());
        System.out.println("Enter Player Name");
        setP_name(scanner.next());
    }
    @Override
    public String toString() {
        return "Player [p_id=" + p_id + ", p_name=" + p_name + "]";
    }
}
