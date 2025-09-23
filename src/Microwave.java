public class Microwave {
    private String brand;
    private int maxPower;  
    
    public Microwave (String manufacturer, int power) {
        brand = manufacturer;
        maxPower = power;
    }

    public Microwave (int power) {
        brand = "Xiaomi";
        maxPower = power;
    }

    public Microwave () {
        brand = "Xiaomi";
        maxPower = 800;
    }

    public void spin() {

    }

    public void cook(int seconds, int power) {
        System.out.println("Cooking for " + seconds + " seconds at " + power + " W");


    }
    public void cook30() {
        cook(30, maxPower);
    }

    public void beep() {
        System.out.println("Beep");
    }

    public static void main(String[] args) {
        Microwave mycrowave = new Microwave("Hello", 809);
        Microwave m2 = new Microwave();
        Microwave m3 = new Microwave(8000);
    }
}
