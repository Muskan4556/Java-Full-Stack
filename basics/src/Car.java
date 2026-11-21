public class Car {

    public int id;
    public String color;

    public static int count = 0;

    Car(){}

    Car(int id, String color) {
        this.id = id;
        this.color = color;

        count++;
    }

    void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Color: " + this.color);
    }

}
