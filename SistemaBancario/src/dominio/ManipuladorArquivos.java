package dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManipuladorArquivos {
    public static String[] leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        List<String> linhas = new ArrayList<>();
        String linha = "";
        while (true) {
            linha = buffRead.readLine();
            if (linha != null) {
                linhas.add(linha);
            } else {
                break;
            }
        }
        buffRead.close();
        return linhas.toArray(new String[0]);
    }
}