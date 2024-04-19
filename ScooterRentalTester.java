
public class ScooterRentalTester {

    public static void main(String[] args) {

        RentalCompany rentalCompany = new RentalCompany();

        // Add some scooters to the rental company's fleet
        rentalCompany.addScooter(new Scooter());
        rentalCompany.addScooter(new Scooter());
        rentalCompany.addScooter(new Scooter());


        rentAndTravelToUniversity(rentalCompany);


        rentAndTravelBackHome(rentalCompany);
    }


    private static void rentAndTravelToUniversity(RentalCompany rentalCompany) {

        rentalCompany.rentScooter(0);


        double universityX = 41.7121106;
        double universityY = 44.7489232;
        travelToLocation(rentalCompany, universityX, universityY);


        rentalCompany.returnScooter(0, universityX, universityY);
    }


    private static void rentAndTravelBackHome(RentalCompany rentalCompany) {

        try {
            Thread.sleep(3600000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        rentalCompany.rentScooter(0);


        double homeX = 0 ;
        double homeY = 0 ;
        travelToLocation(rentalCompany, homeX, homeY);


        rentalCompany.returnScooter(0, homeX, homeY);
    }


    private static void travelToLocation(RentalCompany rentalCompany, double x, double y) {

        System.out.println("Traveling to location (x = " + x + ", y = " + y + ")");
    }
}

