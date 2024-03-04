public class Mammal {
    protected int legs;
    protected boolean alive = true;
    protected String color;
    protected int age;
    protected int hungry = 5;
    protected int energy = 5;

    // constructor   
    Mammal(String color, int age, int legs) {
            this.color = color;
            this.age = age;
            this.legs = legs;
        }

    /// setters getters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void feed() {
        this.feed(1);
    }

    public void feed(int qty) {
        this.hungry -= qty;
    }

    protected void sleep() {
        this.energy++;
        System.out.println("zzzzzzzzzzz");
    }

    protected void sound(String s) {
        System.out.println(s);
    }
}