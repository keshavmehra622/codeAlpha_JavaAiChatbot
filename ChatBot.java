public class ChatBot {

    FAQManager faq = new FAQManager();
    NLPProcessor nlp = new NLPProcessor();

    public String getResponse(String input) {

        input = nlp.process(input);

        if (input.contains("hello") || input.contains("hi"))
            return "Hello! I am your Java AI ChatBot.";

        if (input.contains("bye"))
            return "Goodbye! Happy Coding.";

        for (String key : faq.getKeys()) {

            if (input.contains(key))
                return faq.getAnswer(key);

        }

        return "Sorry! I don't know the answer.";
    }
}