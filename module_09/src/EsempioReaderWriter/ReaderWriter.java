package EsempioReaderWriter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReaderWriter
{
    private static final Path FILE_TO_READ = Paths.get("module_09", "src", "EsempioReaderWriter", "test.txt");
    private static final Path FILE_TO_WRITE = Paths.get("module_09", "src", "EsempioReaderWriter", "new_test.txt");

    /**
     * Read all lines from a file and return them.
     *
     * P.S. per leggere semplicemente tutte le righe di un file avremmo potuto anche utilizzare:
     *
     *      List<String> lines = Files.readAllLines(pathToFile);
     *
     *      leggere una riga per volta è comunque l'utilizzo più consigliato per non leggere
     *      interamente file di grandi dimensioni
     */
    private List<String> readFile(Path pathToFile)
    {
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(pathToFile))
        {
            while (br.ready())
            {
                // leggo una riga del file e passo alla successiva
                String line = br.readLine();
                lines.add(line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return lines;
    }

    /**
     * Write in a file the given strings, one per line.
     * Creates a new file if one with the given file name does not exist already.
     */
    private void writeFile(Path pathToFile, List<String> lines)
    {
        try (BufferedWriter br = Files.newBufferedWriter(pathToFile))
        {
            for (String line : lines)
            {
                // scrivo una stringa nel file
                br.write(line);
                // passo alla riga successiva
                br.newLine();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        ReaderWriter rw = new ReaderWriter();
        List<String> lines = rw.readFile(FILE_TO_READ);
        rw.writeFile(FILE_TO_WRITE, lines);
    }
}
