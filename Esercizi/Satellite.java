//PAGINA 304 ESERCIZIO 11

public class Satellite 
{
    //questo è un caso in cui il codice è la copia esatta delle parole
    //dell'algoritmo, leggere la traccia sul libro per comprenderlo al meglio
    public static int M(int k)
    {
        if( k == 0 || k == 1)
            return 1;
        else
        {
            if(k == 2 || k == 3)
                return 1;
            else
            {
                return M(k-2) + M(k-3);
            }
        }
    }

    public static void main(String[] args) 
    {
        int k = 5;
        System.out.println(M(k));
    }
}