import java.util.*;
public class Pubg {
    public static void main(String[] args) {
        int n,i,score;
        String playername;
        String username;
        String level;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the no of User detail ");
        n=sc.nextInt();
        Player[] playersArray=new Player[n];
        if(n>0 && n<=100)
        {
            for(i=0;i<n;i++)
            {
                sc.nextLine();
                System.out.println("enter "+(i+1)+" User details");
                playername=sc.nextLine().trim();
                username=sc.nextLine().trim();
                level=sc.nextLine().trim();
                score=sc.nextInt();
                playersArray[i]=new Player(playername,username,level,score);
            }
            System.out.println("Player name"+"\t"+"User Name"+"\t"+"Level"+"\t"+"Score");
            // for(i=1;i<=n;i++)
            for(Player player : playersArray)
            {
                System.out.println(player);
            }
            //{
            //  System.out.println(playersarray.toString());
            //}
        }
        else{
            System.out.println("Enter valid Number");
        }
    }
}
class Player{
    private String playername;
    private String username;
    private String level;
    private int score;
    public void setPlayerName( String playername){
        this.playername=playername;
    }
    public void setUserName( String username){
        this.username=username;
    }
    public void setLevel( String level){
        this.level=level;
    }
    public void setScore(int score){
        this.score=score;
    }
    public String getPlayerName(){
        return playername;
    }
    public String getUserName(){
        return username;
    }
    public String getLevel(){
        return level;
    }
    public int getScore(){
        return score;
    }
    public Player(String playername,String username,String level,int score){
        this.playername = playername;
        this.username = username;
        this.level = level;
        this.score = score;

    }
    @Override
    public String toString(){
        return getPlayerName() +"\t\t"+getUserName() + " \t\t"+getLevel()+"\t\t" +getScore();
    }
}

