package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class represents a map of Middle Earth.
 */
public class MiddleEarthMap {
    /**
     * The list of locations in Middle Earth.
     */
    private ArrayList<String> locations;

    /**
     * Constructs a MiddleEarthMap and loads the locations from a file.
     *
     * @throws FileNotFoundException if the map file is not found
     */
    public MiddleEarthMap() throws FileNotFoundException {
        loadLocations("map.txt");
    }

    /**
     * Loads locations from the specified file.
     *
     * @param fileName the name of the file to load locations from
     * @throws FileNotFoundException if the file is not found
     */
    private void loadLocations(final String fileName)
            throws FileNotFoundException {
        locations = new ArrayList<>();
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + fileName);
        }
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            locations.add(scanner.nextLine());
        }
        scanner.close();
    }

    /**
     * Gets the list of locations in Middle Earth.
     *
     * @return the list of locations
     */
    public ArrayList<String> getLocations() {
        return locations;
    }
}
