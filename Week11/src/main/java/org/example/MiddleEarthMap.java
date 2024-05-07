package org.example;

/**
 * Represents a map of Middle Earth.
 */
public class MiddleEarthMap {
    public MiddleEarthMap() {
    }

    /**
     * Navigates to the specified location.
     *
     * @param location        The location to navigate to.
     * @param isSecretPassage Whether to take a secret passage.
     */
    public void navigate(final String location, final boolean isSecretPassage) {
        switch (location) {
            case "Mordor":
                System.out.println("Navigating to Mordor");
                if (isSecretPassage) {
                    System.out.println("Taking a secret passage");
                }
                break;
            case "Shire":
                System.out.println("Navigating to the Shire");
                break; // Add break statement to prevent fallthrough
            case "Gondor":
                System.out.println("Navigating to Gondor");
                break;
            default:
                System.out.println("Unknown location");
        }
        switch (location) {
            case "Lothlórien":
                System.out.println("Navigating to Lothlórien");
        }
        if (isSecretPassage) {
            // Do something if there's a secret passage
        }

        String result = isSecretPassage ? "Secret" : "Normal";
        System.out.println(result);
    }
}
