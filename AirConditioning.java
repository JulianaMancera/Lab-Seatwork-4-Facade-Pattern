public class AirConditioning implements HomeService{
    @Override
    public void turnOn(){

        System.out.println("Air condition is on...");
    }

    @Override
    public void turnOff(){
        System.out.println("Air condition is off...");
    }
}