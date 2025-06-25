package models;
public class Pokemon{
    private int id;
    private String name;
    private int level;
    private boolean legendary;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public boolean isLegendary(){
        return legendary;
    }
    public void setLegendary(boolean legendary){
        this.legendary = legendary;
    }
    public Pokemon(int id, String name, int level, boolean legendary){
        this.id = id;
        this.name = name;
        this.level = level;
        this.legendary = legendary;
    }
    public static void crearPokemon(int id, String name, int level, boolean legendary){
        Pokemon newPokemon = new Pokemon(
                id,
                name,
                level,
                legendary);

        System.out.println(newPokemon);
    }
    public String toString(){
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", legendary=" + legendary +
                '}';
    }
}