public class Dog {
    private String name, breed, color;
    private int size;

    public Dog(String name, String breed, String color, int size){
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }

    public boolean equals(Dog other){
        if (name.equals(other.getName()) && breed.equals(other.getBreed()) && color.equals(other.getColor()) && size == other.getSize()){
            return true;
        }
        return false;
    }

    public String toString(){
        return "A " + size + "lb. " + color + " " + breed + " named " + name + ".";
    }
}
