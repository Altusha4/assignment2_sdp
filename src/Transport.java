interface Transport {
    void deliver();
}

class Truck implements Transport {
    public void deliver() {
        System.out.println("Delivering truck");
    }
}

class Ship implements Transport {
    public void deliver() {
        System.out.println("Delivering ship");
    }
}
