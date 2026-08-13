package Exercises.workingWithEnums.enumsWithFields;

public enum Planet {
    // Create an enum named Planet that represents the planets in our solar system with their respective distances
    // from the sun in astronomical units (AU).
    MERCURY("Mercury", 250.00),
    VENUS("Venus", 450.00),
    EARTH("Earth", 740.00),
    MARS("Mars", 920.00),
    JUPITER("Jupiter", 1230.00),
    SATURN("Saturn", 1450.00),
    URANUS("Uranus", 1984.00),
    NEPTUNE("Neptune", 2109.00),
    PLUTO("Pluto", 2563.00);

    private String name;
    private double distanceFromSun;

    Planet(String name, double distanceFromSun){
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }

    public String getName(){
        return name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }
}
