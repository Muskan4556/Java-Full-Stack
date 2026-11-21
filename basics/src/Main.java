//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Car obj = new Car(1, "marron");
        Car obj2 = new Car(2, "navy blue");

        obj.display();
        obj2.display();

        System.out.println("Total no of cars: "+ Car.count);

        System.out.println(args[0]);


    }
}