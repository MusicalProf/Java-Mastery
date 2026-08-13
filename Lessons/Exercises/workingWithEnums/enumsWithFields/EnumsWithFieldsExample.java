package Exercises.workingWithEnums.enumsWithFields;

public class EnumsWithFieldsExample {
    // Create an enum named Planet that represents the planets in our solar system with their respective distances
    // from the sun in astronomical units (AU).
    public static void main(String[] args) {
        for(Planet planet : Planet.values()){
            System.out.printf("Planet %s is %.2f AU from the sun.\n", planet.getName(), planet.getDistanceFromSun());
        }
    }
}
