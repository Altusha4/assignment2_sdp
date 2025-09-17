public class Main {
    public static void main(String[] args) {
        Logistics RoadLogistics = new RoadLogistics();
        Transport Truck = RoadLogistics.createTransport();
        Truck.deliver();

        Logistics SeaLogistics = new SeaLogistics();
        Transport Ship = SeaLogistics.createTransport();
        Ship.deliver();
    }
}