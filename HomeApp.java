public class HomeApp{

    public static void main(String[] args) {
        
        HomeInterface homeInterface = new HomeInterface();
        
        // Turn on all services
        System.out.println("Turn On:");
        homeInterface.turnOnAll();
        
        // Turn off all services
        System.out.println("\nTurn Off:");
        homeInterface.turnOffAll();
    }
}
    
