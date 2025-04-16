public class Cow implements Animal{
    private int legs;
    private String sound;
    private String food;
    public Cow(String color, int legs,String food , String sound){
        this.legs =legs;
        this.sound =sound;
        this.food =food;
    }
    public Animal clone(){
        return new Sheep("Poppy", 4,"grass", "meee");
    }
    public void makeSound(){
        System.out.println(this.sound);

    }
    public String getType(){
        return "Im a sheep my name" +  "my legs are" + this.legs+" my food"+ this.food; 

    }
}