package annotations.Usingdeprecated;

class LegacyAPI {

    @Deprecated
    void oldFeature() {
        System.out.println("Old feature (deprecated)");
    }

    void newFeature() {
        System.out.println("New feature (recommended)");
    }
}
