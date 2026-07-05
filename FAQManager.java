import java.io.*;
import java.util.*;

public class FAQManager {

    private HashMap<String, String> faq = new HashMap<>();

    public FAQManager() {

        try {

            BufferedReader br = new BufferedReader(new FileReader("faq.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split("=");

                if (data.length == 2)
                    faq.put(data[0].toLowerCase(), data[1]);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("FAQ file not found.");
        }
    }

    public String getAnswer(String key) {
        return faq.get(key);
    }

    public Set<String> getKeys() {
        return faq.keySet();
    }
}