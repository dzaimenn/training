package dzaimenn.collections;

import java.util.Hashtable;
import java.util.Map;
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
        cityCountryMap.put("Kyiv", "Ukraine");
        cityCountryMap.put("Paris", "France");
        cityCountryMap.put("Tokyo", "Japan");
    }

    private static void initializePopulationData(Hashtable<String, Integer> cityPopulationTable) {
        cityPopulationTable.put("Kyiv", 2800000);
        cityPopulationTable.put("Paris", 2141000);
        cityPopulationTable.put("Tokyo", 13960000);
    }

    private static void displayCityInformation(TreeMap<String, String> cityCountryMap, Hashtable<String, Integer> cityPopulationTable) {
        Set<Map.Entry<String, String>> cityCountryEntries = cityCountryMap.entrySet();
        Set<Map.Entry<String, Integer>> cityPopulationEntries = cityPopulationTable.entrySet();
        for (Map.Entry<String, String> entry : cityCountryEntries) {
            String city = entry.getKey();
            String country = entry.getValue();
            int population = cityPopulationTable.get(city);
            System.out.println("City: " + city + ", Country: " + country + ", Population: " + population);
        }
    }

}