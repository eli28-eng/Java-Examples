public class Microwave {
    private String brand;
    private int maxPower;  
    
    public Microwave (String manufacturer, int power) {
        brand = manufacturer;
        maxPower = power;
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
}
