package pt.ipb.esact.poo.aulas.aula10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Praticar {

    // Solução de: http://www.ipb.pt/~ellobo/poo/#/aula10?p=11:0
    public static void main(String[] args) throws IOException {
        String userHome = System.getProperty("user.home");
        Path dir = Paths.get(userHome, "prog-2017");
        Files.createDirectories(dir);

        try (
                InputStreamReader r = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(r)
        ) {
            Path file = Paths.get(userHome, "prog-2017", "file.txt");
            while (true) {
                String texto = br.readLine();
                // se o texto for 'quit' escrever e sair fora
                if ("quit".equals(texto))
                    break;
                // adicionar um \n ao texto
                texto += "\n";
                Files.write(file, texto.getBytes(),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            System.out.println("Falhou a ler o System.in");
        }

    }

}
