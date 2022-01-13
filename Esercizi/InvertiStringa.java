//PAGINA 305 ESERCIZIO 15

public class InvertiStringa 
{
    //inverte i caratteri di una stringa
    public static String inverti(String s)
    {
        //se la stringa è vuota, la sua inversa è la stringa vuota
        if(s.length() == 0)
            return "";
        else
            //se c è il carattere attuale, dato che la stringa deve invertirsi, c va alla fine e la nuova
            //stringa sarà tutti gli altri caratteri invertiti + c
            return inverti(s.substring(1, s.length())) + s.substring(0, 1);
    }

    public static void main(String[] args) 
    {
        String s = "libro";
        System.out.println(inverti(s));
    }    
}