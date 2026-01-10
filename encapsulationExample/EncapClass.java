package encapsulationExample;
//


// Encapsulation wrapping the data and method within in class for Example in car class encapsulation could be use to kept attributes like speed an  fuelLevel private and with public method wth accelerate and reFuel method to modify these attributes safely

public class EncapClass {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}