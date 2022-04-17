import java.util.*;

public class Player {
    private String name;
    private int score;

    private ArrayList<Monsters> playerInventory;


    public Player(String name)
    {
        this.name = name;
        score = 0;
        playerInventory = new ArrayList<Monsters>();
    }

    public int getScore()
    {
        if (score < 0)
        {
            score = 0;
        } return score;
    }

    public void addScore(){
        score += 100;
    }

    public String getName()
    {
        return name;
    }

    public void addInventory(Monsters newM){
        playerInventory.add(newM);
    }
    public void info(){
        System.out.println(name + " has " + score + " points" );


    }

    public void getInvent(){
        System.out.println("Inventory:");
        for(Monsters cur : playerInventory) {
            System.out.println(cur.getName() + ":");
            System.out.println(cur.getType());
            System.out.println();

        }
    }


}
