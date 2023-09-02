package dzaimenn.collections;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

public class CityInformation {

    public static void main(String[] args) {
        TreeMap<String, String> cityCountryMap = new TreeMap<>();
        Hashtable<String, Integer> cityPopulationTable = new Hashtable<>();
        initializeCityData(cityCountryMap);
        initializePopulationData(cityPopulationTable);
        displayCityInformation(cityCountryMap, cityPopulationTable);
    }

    private static void initializeCityData(TreeMap<String, String> cityCountryMap) {
        String[] cities = {"Kyiv", "Paris", "Tokyo", "New York", "London"};
        String[] countries = {"Ukraine", "France", "Japan", "USA", "UK"};
        for (int i = 0; i < cities.length; i++) {
            cityCountryMap.put(cities[i], countries[i]);
        }
    }

    private static void initializePopulationData(Hashtable<String, Integer> cityPopulationTable) {
        String[] cities = {"Kyiv", "Paris", "Tokyo", "New York", "London"};
        int[] populations = {2800000, 2141000, 13960000, 8406000, 9300000};
        for (int i = 0; i < cities.length; i++) {
            cityPopulationTable.put(cities[i], populations[i]);
        }
    }

    private static void displayCityInformation(TreeMap<String, String> cityCountryMap, Hashtable<String, Integer> cityPopulationTable) {
        Set<String> cities = cityCountryMap.keySet();
        for (String city : cities) {
            String country = cityCountryMap.get(city);
            int population = cityPopulationTable.get(city);
            System.out.println("City: " + city + ", Country: " + country + ", Population: " + population);
        }
    }

}