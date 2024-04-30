import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void textoJson(Endereco endereco) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritor = new FileWriter(endereco.cep() + ".json");
        escritor.write(gson.toJson(endereco));
        escritor.close();

    }
}
