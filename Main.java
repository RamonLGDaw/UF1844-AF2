public class Main {
    public static void main(String[] args) {
        Wolf lupa = new Wolf("Lupa", "gray", 5, 4, "F", true);

        System.out.println("Name assigned: " + lupa.getName());
        System.out.println("Life in captivity: " + lupa.getCaptivity());
        System.out.println("Wolf's age: " + lupa.getAge());
        System.out.println("Color: " + lupa.getColor());
        lupa.setColor("gray-dark");
        System.out.println("Color: " + lupa.getColor());
        System.out.print("Wolves sounds like: ");
        lupa.sound("howl");

    }
}
