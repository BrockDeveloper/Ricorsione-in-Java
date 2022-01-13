//PAGINA 33 ESERCIZIO 4

public class SommaCifre 
{
    //fa la somma delle cifre di un numero
    public static int cifre(int n)
    {
        //TERMINAZIONE: se il numero raggiunge 0, le cifre sono finite.
        //Infatti per avere ad ogni richiamo ricorsivo la cifra successiva,
        //dividiamo per 10, e quando il numero raggiunge zero vuol dire che 
        //l'ultima cifra è stata eliminata e non ce ne sono altre
        if(n == 0)
            return 0;
        else
            //la somma delle cifre è la cifra attuale + la somma di tutte le altre cifre
            return (n%10) + cifre(n/10);
    }

    public static void main(String[] args)
    {
        int n= 22222;
        System.out.println(cifre(n));
    }
}