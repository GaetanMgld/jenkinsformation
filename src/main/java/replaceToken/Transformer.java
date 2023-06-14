package replaceToken;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Transformer {
    private final HashMap<String,String> tokens = new HashMap<>();

    /**
     * Add a new token which will used tranforming
     * @param token Token the identifier of the token, wihout the brackets : "name
     * @param value The value who replace the token
     */
    public void addToken(String token, String value) {
        tokens.put(token,value);
    }

    /**
     * Transform text by a replacing the token
     *
     * Each token should be between brackets , for example :
     *
     * Hello {name}, how are you doing
     * @param text which will be transformed
     * @return The transformed text
     */
    public String transform(String text) {
       // String transformText = text;
        int capacity = (int) (text.length() * 1.2f);
        StringBuilder stringBuilder = new StringBuilder(capacity);

        Pattern pattern = Pattern.compile("\\{(.*?)\\}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find())
        {
            String token = matcher.group(1);

            String value = tokens.get(token);

            if (value != null) {
                matcher.appendReplacement(stringBuilder, value);
            }
            else {
                matcher.appendReplacement(stringBuilder, "{" + token + "}");
            }
            matcher.appendTail(stringBuilder);
        }
        return stringBuilder.toString();
    }

    /**
     * Capitalize my first letter in my text
     * @param text To capitalize my first letter in my text
     * @return The text wich my first character capitalize in my text
     */
    public String Uppercase(String text) {
        String transformText;
        transformText = text;

        if (transformText == null || transformText.length() == 0 ){
           return transformText;

        }
        return transformText.substring(0,1).toUpperCase() + transformText.substring(1);
    }
}
