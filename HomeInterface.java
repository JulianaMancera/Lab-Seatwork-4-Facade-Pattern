public class HomeInterface {
    private HomeService lights;
    private HomeService tv;
    private HomeService airConditioning;

    public HomeInterface() {
        this.lights = new Lights();
        this.tv = new TV();
        this.airConditioning = new AirConditioning();
    }

    public void turnOnAll() {
        lights.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll() {
        lights.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}
