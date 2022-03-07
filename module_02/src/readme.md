# Matrici

Oggi faremo un'esercitazione sulle matrici

<p align="center">
<img src="https://m.media-amazon.com/images/M/MV5BNzQzOTk3OTAtNDQ0Zi00ZTVkLWI0MTEtMDllZjNkYzNjNTc4L2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_FMjpg_UX1000_.jpg" height="480" class="center">
</p>

## Cosa sono le matrici?

Le matrici sono zone di memoria contigua dove possiamo salvare in nostri dati in maniera molto analoga agli array. Non c'è alcuna differenza a livello di consumo di memoria tra un array di lunghezza 40 e una matrice 4\*10 (discorso identico ad una matrice 10\*4 o 20\*2), quello che cambia sarà il modo in cui accediamo ai dati che per la matrice sarà utilizzando due indici. Potete immaginare le matrici come array di array.

```java
        int[][] matrix = new int [5][10]; // Dichiaro e istanzio una matrice di interi
        matrix[0][0] = 5; // Inserisco il valore 5 nel primo elemento della prima riga
        System.out.println(matrix[0][0]); // stampo il primo elemento
        System.out.println(matrix[0]); // stampo la prima riga della matrice

        for(int row = 0; row < matrix.length; row++)
            for(int col = 0; col < matrix[0].length; col++)
                matrix[row][col] = 6;

        //Il doppio ciclo for scrive 6 dentro ogni cella della matrice
```

# F.A.Q.

## Posso avere una matrice le cui righe o colonne abbiano dimensioni diverse tra di loro (tipo che una riga sia lunga 20 e quella successiva 10)?

Una matrice per definizione ha tutte le righe di una certa lunghezza e tutte le colonne di una certa lunghezza. È possibile creare una struttura dati come quella della domanda ma con strumenti diversi

## posso avere matrici di tipo di un oggetto Java da me creato?

Assolutamente si!

## Posso avere una matrice 3D?

Certo che si:

```java
        int[][][] matrix = new int [5][10][2];
```

## E 6D invece?

Anche:

```java
        int[][][][][][] matrix = new int [5][10][2][5][1][18];
```



# A che servono le matrici?

In informatica le matrici sono largamente utilizzate in moltissimi ambiti. Sono una struttura dati base e molte strutture dati complesse all'interno immagazzinano dati in forma matriciale. Nella pratica moltissimi problemi se organizzati utilizzando una matrice risultano molto più semplici da risolvere per noi umani piuttosto che utilizzando un array. Pensate per esempio alle immagini che sono pixel salvati dentro una matrice (SPOILER: prossima settimana li vedremo per bene)

# Kickstarter

Qui di seguito un codice che istanzia la matrice di interi e vi permette di inserire i suoi valori a mano da tastiera:

```java
import java.util.Scanner;

public class MatriciCode {

    public static void main(String[] args) {
        int[][] matrix = new int[2][3]; //Istanzio matrice

        Scanner keyboard = new Scanner(System.in);

        //Riempio matrice
        for (int row = 0; row < matrix.length; row++)
            for (int col = 0; col < matrix[0].length; col++)
                matrix[row][col] = keyboard.nextInt(); 

        //Stampo matrice sotto forma di matrice
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
                System.out.print(matrix[row][col] + " ");
            System.out.println();
        }
    }
}
```

# Esercizi

Esercizio | Difficoltà
------------ | -------------
[Diagonale](https://github.com/Backend-Developer-School-Tree/Corso-Java-Backend-2021-02/tree/main/module_02/Matrix/01-Diagonale) | :kick_scooter:
[Tabelline](https://github.com/Backend-Developer-School-Tree/Corso-Java-Backend-2021-02/tree/main/module_02/Matrix/02-Tabelline_in_matrice) | :kick_scooter:
[Tombola](https://github.com/Backend-Developer-School-Tree/Corso-Java-Backend-2021-02/tree/main/module_02/Matrix/03-Tombola) | :motor_scooter:
[Match three](https://github.com/Backend-Developer-School-Tree/Corso-Java-Backend-2021-02/tree/main/module_02/Matrix/04-MatchThree) | :motorcycle:
[Crucipuzzle](https://github.com/Backend-Developer-School-Tree/Corso-Java-Backend-2021-02/tree/main/module_02/Matrix/05-CruciPuzzle) |  :motorcycle: