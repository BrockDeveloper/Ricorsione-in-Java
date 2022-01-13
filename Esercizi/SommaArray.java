//PAGINA 304 ESERCIZIO 6

public class SommaArray 
{
    //somma gli elementi di un array
    public static int elementi(int[] A, int index)
    {
        //TERMINAZIONE: se raggiunge la fine, non ha più elementi da sommare
        if(index == A.length)
            return 0;
        else
            //la somma degli elementi è l'elemento attuale + la sommma di tutti gli altri elementi
            return A[index] + elementi(A,index+1);
    }

    public static void main(String[] args) 
    {
        int[] A = {1,2,3,4};
        
        System.out.println(elementi(A,0));
    }    
}