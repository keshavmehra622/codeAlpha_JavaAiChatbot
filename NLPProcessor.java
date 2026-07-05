public class NLPProcessor {

    public String process(String text) {

        text = text.toLowerCase();
        text = text.replaceAll("[^a-z ]", "");

        return text.trim();
    }
}