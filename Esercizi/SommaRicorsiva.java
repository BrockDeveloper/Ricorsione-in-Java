//sommma di due numeri con il metodo ricorsivo

public class SommaRicorsiva
{
    //somma due numeri ricorsivamente
    public static int somma(int a, int b)
    {
        //se il secondo numero è zero, la somma è il primo numero
        if(b == 0)
            return a;
        else
            //la somma di a e b è equivalente alla somma di a+1 con b-1
            return somma(a+1,b-1);
    }

    public static void main(String[] args)
    {
        int a = 3;
        int b = 5;

        System.out.println(somma(a,b));
    }
}