package replaceToken;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);
    /**
     *
     * @param args
     */
    public static  void main(String [] args)
    {
        String text = "bonjour je suis {name} et je suis avec {bebou} ";
        Transformer transform = new Transformer();

        transform.addToken("name","tata");

        String newText = transform.transform(text);

        logger.info(newText);
    }
}
