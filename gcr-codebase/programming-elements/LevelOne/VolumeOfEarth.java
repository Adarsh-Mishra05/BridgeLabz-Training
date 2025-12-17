public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378;   
        double pi = 3.14159;

        // Volume in cubic kilometers
        double volumeKm = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;

        // Convert km³ to miles³ (1 km = 0.621371 miles)
        double radiusMiles = radiusKm * 0.621371;
        double volumeMiles = (4.0 / 3.0) * pi * radiusMiles * radiusMiles * radiusMiles;

        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm +
            " and cubic miles is " + volumeMiles
        );
    }
}
