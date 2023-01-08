import java.util.Scanner;

public class Team extends Player{
    private String Tean_name,Ceo;

    Player player[];
    int playercounter;

    public Team() {
        player = new Player[20];
        playercounter = 0;
    }

    public Team(int p_id, String p_name, String tean_name, String ceo) {
        super(p_id, p_name);
        Tean_name = tean_name;
        Ceo = ceo;
        player = new Player[20];
        playercounter = 0;
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
        int nop = sc.nextInt();
        for(int i=0;i<nop;i++){
            System.out.println("Enter Type of player");
            System.out.println("1-> Batsman, 2->Bowler, 3->Wicket Keeper");
            int choice = sc.nextInt();
            if(choice == 1){
                player[i] = new Batsman();
                player[i].read();
            }
            else if(choice == 2){
                player[i] = new Bowler();
                player[i].read();
            }
            else{
                player[i] = new Wkt_keeper();
                player[i].read();
            }
            playercounter++;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Team [Tean_name=" + Tean_name + ", Ceo=" + Ceo + "]";
    }

    
    
}
