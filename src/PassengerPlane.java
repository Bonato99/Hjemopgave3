public class PassengerPlane
        extends Plane {

    int seats;

    public PassengerPlane(String manufacturer, String type, int seats) {
        super(manufacturer, type); //Nedarver fra Plane.Plane
        this.seats = seats;
    }

    @Override
    public String toString(){
        return super.toString() + " seats:" + this.seats; //Tilføjer seats til 'Plane.Plane's toString() metode
    }
}

