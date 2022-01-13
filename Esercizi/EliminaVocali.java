//PAGINA 305 ESERCIZIO 13

public class EliminaVocali 
{
    //elimina tutte le vocali da una stringa
    public static String elimina(String s)
    {
        //se la stringa è vuota, non c'è niente da eliminare
        if(s.length() == 0)
            return "";
        else
        {
            if(s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u')
                //se il carattere attuale è una vocale, non la consideriamo e la nuova stringa sarà tutte le altre consonanti
                return elimina(s.substring(1,s.length()));
            else
                //se è una consonante, allora la nuova stringa sarà il carattere concatenato a tutte le altre consonanti
                return s.charAt(0) + elimina(s.substring(1,s.length()));
        }
    }

    public static void main(String[] args) 
    {
        String s = "casa";
        System.out.println(elimina(s));
    }
}