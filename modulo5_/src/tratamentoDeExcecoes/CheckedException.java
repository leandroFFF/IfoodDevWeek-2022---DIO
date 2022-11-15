package tratamentoDeExcecoes;
/*
 * Checked - Exceptions que DEVEM ser evitados e tratados pelo desenvolvedor para o programa funcionar.
 * */
import java.io.*;
//Imprimir um arquivo no Console
public class CheckedException {
    public static void main(String[] args) throws IOException {
        String nomeDoArquivo = "receita-pudim.txt"; //o arquivo txt precisa estar na pasta raiz
        imprimirArquivoNoConsole(nomeDoArquivo);

        System.out.println("Apesar da exception ou não, o programa ...");
    }
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {

        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader((new FileReader(file.getName())));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while (line != null);
        bw.flush();
        br.close();
    }
}
