
import java.util.*;
public class Airport {

    //Danner et nyt HashMap som lagrer data for flyene som integer og string
    HashMap<Integer, String> LandedPlanes = new HashMap<Integer, String>();


    int AirID = 0;

    // Tilføjer et fly, samt giver den et plane id
    public void land(Plane plane) {
        // Hvis et fly der vil lande har Default_id =0 eller et id højere end dem, der allerede er på lufthavnen
        if (plane.id > AirID || plane.id == 0) {

            this.AirID++; //AirID vokser med 1
            plane.setId(AirID); //flyet bliver tildelt værdien for AirId som id
            LandedPlanes.put(Integer.valueOf(plane.id), plane.toString()); //sætter den nye værdi for id ind i Hashmappet

        }
    }

    // Denne metode tjekker om et givent id-nr allerede findes på lufthavnen, og fjerne flyet hvis det gør
    public void start(int id) {
        if (LandedPlanes.containsKey(id)) { //Hvis id-nr er i Hashmappet i forvejen
            LandedPlanes.remove(id); // fjerner id'et fra hashmappet
        }
    }

    // Returnerer alle fly i airport
    public String toString() {
        String text = ""; //danner en tom string
        for (int i = 1; i <= AirID; i++) //for-løkke der går flyene igennem i hashmappet

            if (LandedPlanes.get(i) != null) { // Hvis der er en flyver på indeks i
                text = text + LandedPlanes.get(i) + "\n"; //indsæt flyveren i string
            }
        return text;
    }
}


