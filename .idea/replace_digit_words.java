package codes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class replace_digit_words {
    public static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(12, "дванадцять");
        map.put(11, "одинадцять");
        map.put(10, "десять");
        map.put(9, "дев'ять");
        map.put(8, "вісім");
        map.put(7, "сім");
        map.put(6, "шість");
        map.put(5, "п'ять");
        map.put(4, "чотири");
        map.put(3, "три");
        map.put(2, "два");
        map.put(1, "один");
        map.put(0, "нуль");
    }

    public static void main(String[] args) {
        String fileName = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException ignore) {
            /* NOP */
        }

        String fileLine;

        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            while ((fileLine = in.readLine()) != null) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    fileLine = fileLine.replaceAll("\\b" + entry.getKey() + "\\b", entry.getValue());
                }
                System.out.println(fileLine);
            }
        } catch (IOException ignore) {
            /* NOP */
        }
    }
}
