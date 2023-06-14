package replaceToken;

public class Main {
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
        //newText = transform.Uppercase(newText);

        System.out.println(newText);
    }
}
