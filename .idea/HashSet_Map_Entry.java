import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashSet_Map_Entry {

    void printMap(Map<String, Double> names) {
        Map<String, Double> sortedMap = new TreeMap<>(names);
        for (Map.Entry<String, Double> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }    //  вывод сортированной по ключу мапы на консоль

    void theMostReach(Map<String, Double> names) {
        Double max = Double.MIN_VALUE;

        for (Map.Entry<String, Double> entry : names.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        Map<String, Double> most = new TreeMap<>();
        for (Map.Entry<String, Double> entry1 : names.entrySet()) {
            if (entry1.getValue().equals(max)) {
                most.put(entry1.getKey(), entry1.getValue());
            }
        }
        for (Map.Entry<String, Double> entry : most.entrySet()) {
            System.out.println(entry.getKey());

        }

    }    // нахождение самого большого значения

    void addToMap(HashMap<String, Double> names, String key, double value) {
        if (names.containsKey(key)) {
            Double temp = names.get(key) + value;
            names.put(key, temp);
        } else {
            names.put(key, value);

        }

    }   // добавление в мапу и ++ значения, если ключ уже есть
}

