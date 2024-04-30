import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o CEP que pretende buscar");
        var cep = leitura.nextLine();

        consultaCEP consultarCEP = new consultaCEP();
        try {
            Endereco novoEndereco = consultarCEP.buscarEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerarArquivo = new GeradorDeArquivo();
            gerarArquivo.textoJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}