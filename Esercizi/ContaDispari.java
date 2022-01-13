//PAGINA 303 ESERCIZIO 3

public class ContaDispari
{
    //conta le cifre dispari in un numero
    public static int dispari(int n)
    {
        //TERMINAZIONE: se il numero è 0, non c'è nessuna cifra dispari
        if( n == 0)
            return 0;
        else
        {
            if( (n%10) % 2 == 0 )
                //se la cifra è pari, le cifre dispari sono 0 + tutte le altre dispari
                return dispari(n/10);
            else
                //se la cifra è dispari, le cifre dispari sono 1 + tutte le altre dispari
                return 1 + dispari(n/10);
        }
    }

    public static void main(String[] args)
    {
        int n = 2322;
        System.out.println(dispari(n));
    }
}