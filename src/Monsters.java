import java.util.ArrayList;

public class Monsters
{
    private String type;
    private int health;
    private String name;

    public Monsters(String name,String type){
        this.name = name;
        this.type = type;
        health = 150;
    }


    public String getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    public void getInfo(){
        System.out.println("Animal: " + name);
        System.out.println("Type: " + type);
    }
}
