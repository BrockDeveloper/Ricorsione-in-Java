//PAGINA 304 ESERCIZIO 12

public class ContaVocali 
{
    //conta le vocali in una stringa
    public static int vocali(String s)
    {
        //se la stringa è vuota, non ci sono vocali
        if(s.length() == 0)
            return 0;
        else
        {
            if(s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u')
                //se il carattere attuale è una vocali, le vocali saranno 1 + tutte le altre vocali
                return 1 + vocali(s.substring(1,s.length()));
            else
                //le vocali sono tutte le altre vocali
                return vocali(s.substring(1,s.length()));
        }
    }

    public static void main(String[] args) 
    {
        String s = "aiuola";

        System.out.println(vocali(s));
    }
}