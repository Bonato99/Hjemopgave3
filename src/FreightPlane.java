
public class FreightPlane
        extends Plane {

    int payload;

    public FreightPlane(String manufacturer, String type, int payload) {
        super(manufacturer, type); //Nedarver fra Plane.Plane
        this.payload = payload;
    }

    @Override
    public String toString(){
        return super.toString() + " payload:" + this.payload; //Tilføjer payload til 'Plane.Plane's toString() metode
    }
}