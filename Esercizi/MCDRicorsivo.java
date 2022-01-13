//calcola l'MCD tra due numeri in modo ricorsivo

public class MCDRicorsivo 
{   
    //calcola l'MCD tra due numeri
    public static int mcd(int x, int y)
    {
        //se i due numeri sono uguali, il numero è l'MCD
        if(x == y)
            return x;
        else
            if(x > y)
                //se sono nel giusto ordine, l'MCD tra i due  l'MCD tra x-y e y
                return mcd(x-y, y);
            else
                //CONTROLLO: affinchè l'algoritmo funzioni, nel caso x sia minore di y
                //i due numeri vanno invertiti. Matematicamente, il risultato rimane lo stesso
                return mcd(y-x, x);
    }

    public static void main(String[] args)
    {
        int x = 15;
        int y = 18;
        System.out.println(mcd(x,y));
    }
}