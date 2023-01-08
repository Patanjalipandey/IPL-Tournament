import java.util.Scanner;

public class Team extends Player{
    private String Tean_name,Ceo,track;

    Player player[] = new Player[20];
    int playercounter;

    public Team() {
    }

    public Team(int p_id, String p_name, String tean_name, String ceo) {
        super(p_id, p_name);
        Tean_name = tean_name;
        Ceo = ceo;
    }

    public String getTean_name() {
        return Tean_name;
    }

    public void setTean_name(String tean_name) {
        Tean_name = tean_name;
    }

    public String getCeo() {
        return Ceo;
    }

    public void setCeo(String ceo) {
        Ceo = ceo;
    }

    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Team Name");
        setTean_name(sc.next());
        System.out.println("Enter Tea Ceo Name");
        setCeo(sc.next());
    }

    public void addplayer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Player That you Wnat to add");
        playercounter = sc.nextInt();

        for(int i=0;i<playercounter;i++){
            super.read();
        }
    }

    @Override
    public String toString() {
        return"Team [Tean_name=" + Tean_name + ", Ceo=" + Ceo + "]";
    }

    
    
}
