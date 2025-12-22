package dev.felipe.consumoGenerico;

import dev.felipe.consumoGenerico.enuns.Endpoints;
import dev.felipe.consumoGenerico.model.Comentario;
import dev.felipe.consumoGenerico.model.Post;
import dev.felipe.consumoGenerico.model.Usuario;
import dev.felipe.consumoGenerico.service.ConsomeApi;
import dev.felipe.consumoGenerico.service.LeituraDados;
import dev.felipe.consumoGenerico.service.TransformaDados;
import org.jspecify.annotations.NullMarked;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumoGenericoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConsumoGenericoApplication.class, args);
    }

    @NullMarked
    @Override
    public void run(String... args) throws Exception {
        var leituraDados = new LeituraDados();
        String escolhaEndpoint = leituraDados.pegaOpcaoEscolhidaMenu();
        int escolhaId = leituraDados.pegaIdParaConsulta();

        var consomeApi = new ConsomeApi();
        String json = consomeApi.consomeJsonPlaceHolderPorId(escolhaEndpoint, escolhaId);

        var transformadorDeDados = new TransformaDados();
        Object object;

        if (escolhaEndpoint.equals(Endpoints.USUARIO.getEndpoint())) {
            object = transformadorDeDados.transformaJsonEmObjeto(json, Usuario.class);
        } else if (escolhaEndpoint.equals(Endpoints.POST.getEndpoint())) {
            object = transformadorDeDados.transformaJsonEmObjeto(json, Post.class);
        } else {
            object = transformadorDeDados.transformaJsonEmObjeto(json, Comentario.class);
        }

        System.out.println(object);

    }
}