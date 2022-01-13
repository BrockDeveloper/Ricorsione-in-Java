//PAGINA 305 ESERCIZIO 14

public class Duplica 
{
    //duplica i caratteri in una stringa
    public static String duplica(String s)
    {
        //se la stringa è vuota, il suo duplicato è la stringa vuota
        if(s.length() == 0)
            return "";
        else
            //se c è il carattere attuale, il duplicato sarà il duplicato di c + tutti gli altri duplicati
            return s.substring(0,1) + s.substring(0,1) + duplica(s.substring(1,s.length()));
    }
    
    public static void main(String[] args) 
    {
        String s = "libro";
        System.out.println(duplica(s));    
    }    
}