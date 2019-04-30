package Transport;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        PassengerCar passenger = new PassengerCar(750,230,1500,
                "Audi",4,8,"Sedan",4);

        CargoCar cargo = new CargoCar(900,120,4000,
                "MAN",8,8,3500);

        CivilAircraft civil = new CivilAircraft(3500,570,2000,"Boeing",
                50,2000,250,true);

        MilitaryAircraft military = new MilitaryAircraft(4500,650,8000,"F-35",
                15,1500,true,4);


        out.println();
        out.println(passenger.toString());
        out.println();
        out.println(cargo.toString());
        out.println();
        out.println(civil.toString());
        out.println();
        out.println(military.toString());
        out.println();

        out.println(passenger.getTravelInfo(2.5));

        out.println(cargo.loadCapacity(3000));

        out.println(civil.loadCapacity(250));

        out.println(military.toShoot());
        out.println(military.toShoot());
        out.println(military.toShoot());
        out.println(military.toShoot());
        out.println(military.toShoot());

        out.println(military.bailOut());
    }
}
