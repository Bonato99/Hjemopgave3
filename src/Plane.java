
public class Plane {


    private static final int DEFAULT_ID = 0;

    protected String manufacturer, type;
    int id;

    public Plane(String manufacturer, String type) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = DEFAULT_ID;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String toString() { //returnerer ordet "Plane", værdien for id, manufacturer og type som String
        String s = "Plane" + id + " " + manufacturer + " " + type;
        return s;
    }
    //denne metode skal sammenligne id nr på to objekter af flyver.

    public boolean equals(Plane o) {
        if (this.id == o.id) { //Hvis den forhenværende flyvers id er lig den nyes
            return true;
        } else {
            return false;
        }
    }

    public int getId() {
        return id;
    }
}
