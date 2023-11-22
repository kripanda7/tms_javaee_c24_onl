package by.teachmeskills.lesson30.abstractFactory;

public class Runner {
    public static void main(String[] args) {
        boolean isPassengerDelivery = true;
        TransportAbstractFactory factory;
        if (isPassengerDelivery) {
            factory = new PassengerTransportFactory();
        } else {
            factory = new CargoTransportFactory();
        }
        Car transport = factory.createCar();
        transport.passengerTransportation();
        transport.deliver();
    }
}
