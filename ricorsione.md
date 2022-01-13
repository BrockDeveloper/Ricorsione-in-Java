# RICORSIONE IN JAVA
------------
## INTRODUZIONE
La ricorsione in java, la maggior parte delle volte, non prevede nessuno sforzo nella scrittura del codice, ma serve solo attenzione nel capire i passi dell'algoritmo: la scrittura del codice non è altro che una trascrizione dei passi dell'algoritmo.
### IO +  TUTTI GLI ALTRI
Una tecnica ricorsiva comune che si impiega molte volte, quando ad esempio abbiamo a che fare con delle "somme", è la tecnica dell'io + tutti gli altri. Pensiamo per esempio di chiedere a delle persone in una stanza di contarsi:
- delle persone comuni e stupide, si contano in modo iterativo (come siamo abituati a fare noi, puntando il dito e contando persona dopo persona)
- ma se tra quelle persone stupide c'è un programmatore, che stupido non è e soprattutto è molto pigro, a posto di contare lui stesso tutte le persone dice semplicemente che le persone nella stanza sono "me stesso +  tutte le altre". E chi sono tutte le altre? Qualcuno risponderà "me stesso + tutte le altre" e così via... fino a quando nella stanza rimarrà solo uno che dirà "me stesso + tutte le altre, ma tutte le altre sono 0, quindi siamo una persona". E ora, come un boomerang si ritorna indietro, quindi la penultima persona sarà "me stesso + 1", la terzultima "me stesso + 2" e così via.

In questo esempio semplice (e stupido) troviamo tutti gli elementi della ricorsione:
1. CASO DI TERMINAZIONE: qualcosa che blocchi le chiamate ricorsive, in questo caso quando "tutti gli altri" sono zero
2. CHIAMATA RICORSIVA: quando uno dice "me stesso + tutti gli altri" quel "tutti gli altri" non è altro che una chiamata a qualcun altro che rifaccia la stessa identica cosa, ma su un gruppo di persone più piccolo
3. EFFETTO BOOMERANG: la ricorsione è talvolta difficile da comprendere perchè non si capisce come sia possibile usare risultati che ancora non esistono, ebbene in realtà esistono, infatti quando le chiamate ricorsive finiscono tutto torna indietro (una serie di "return" uno dopo l'altro) che arrivano fino alla prima chiamata ricorsiva e quindi generano il risultato.

## CONDIZIONI
Alcune volte, il codice non è cos' lineare come presentato, ma include anche dei controlli che indirizzano la ricorsione su rami diversi, ma per questi casi è meglio considerare i codici seguenti, la teoria non servirebbe a niente.


------------

##ESERCIZI
Di seguito i commenti a due esercizi che presentano due casi tipici: il primo in cui la ricorsione è praticamente già scritta, e il secondo in cui alla ricorsione va accostato un controllo per permettere il corretto svoglimento dell'algoritmo.
In entrambi i casi, è presente il file di riferimento con il codice.

### SOMMA RICORSIVA
###### SommaRicorsiva.java
Il codice della somma ricorsiva è un classico esempio della ricorsione che si traduce dalle parole. Infatti, in parole l'algoritmo è questo:
- dati due numeri a e b
- se b vale 0, la somma è a
- altrimenti la somma è uguale alla somma tra a+1 e b-1

E il codice è praticamente già scritto, infatti confrontado:
- dati due numeri a e b   --->   somma(int a, int b)
- se b vale 0, la somma è a   --->   if(b == 0) return a;
- altrimenti la somma è uguale alla somma tra a+1 e b-1   --->   else return somma(a+1,b-1);

### MCD Ricorsivo
###### MCDRicorsivo.java
Per l'mcd la spiegazione è pressochè identica, solo che qui dobbiamo introdurre un controllo ulteriore: l'algoritmo funziona se e solo se x > y. Quindi, nel caso succeda il contrario dobbiamo solo avere l'accortezza di inverite x e y, come da codice. Si osservi infatti che l'MCD tra x e y è uguale all MCD tra y e x, ma invertendoli possiamo utilizzare questo algoritmo.