//PAGINA 304 ESERCIZIO 7

public class SommeCumulative 
{
    //calcola tutte le somme cumulative di un array
    public static int cumulative(int[] A, int[] Somme, int index)
    {
        //TERMINAZIONE: se raggiungo l'inizio dell'array, la somma cumulativa
        //è il primo elemento stesso, e alle chiamate ricorsive restituisco la
        //somma cumulativa che è appunto l'elemento stesso
        if(index == 0)
        {
            Somme[0] = A[0];
            return A[0];
        }
        else
        {
            //la somma cumulativa attuale è l'elemento attuale + la somma cumulativa di tutti gli altri elementi
            Somme[index] = A[index] + cumulative(A,Somme,index-1);
            return Somme[index];
        }
    }

    public static void main(String[] args)
    {
        int[] A = {1,1,1,1,1};
        int[] Somme = new int[A.length];

        //passo al metodo l'array originale e l'array in cui salvare le sommme cumulative
        cumulative(A,Somme,A.length-1);

        for(int i=0; i<Somme.length; i++)
            System.out.println(Somme[i]);
    }
}