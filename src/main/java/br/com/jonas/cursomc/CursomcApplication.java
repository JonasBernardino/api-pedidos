package br.com.jonas.cursomc;

import br.com.jonas.cursomc.domain.*;
import br.com.jonas.cursomc.domain.enuns.TipoCliente;
import br.com.jonas.cursomc.repository.*;
import ch.qos.logback.core.net.server.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private EstadoRepository estadoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null, "Informatica");
        Categoria cat2 = new Categoria(null, "Escritorio");

        Produto p1 = new Produto(null, "COMPUTADOR", 2000.00);
        Produto p2 = new Produto(null, "IMPRESSORA", 400.00);
        Produto p3 = new Produto(null, "MOUSE", 80.00);

        Estado est1 = new Estado(null, "Minas Gerais");
        Estado est2 = new Estado(null, "São Paulo");
        Cidade c1 = new Cidade(null, "Uberlandia", est1);
        Cidade c2 = new Cidade(null, "São paulo", est2);
        Cidade c3 = new Cidade(null, "campinas", est2);

        cat1.getProdutos().addAll((Arrays.asList(p1, p2, p3)));
        cat2.getProdutos().addAll((Arrays.asList(p2)));

        p1.getCategorias().addAll(Arrays.asList(cat1));
        p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
        p3.getCategorias().addAll(Arrays.asList(cat1));

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
        produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

        est1.getCidades().addAll(Arrays.asList(c1));
        est2.getCidades().addAll(Arrays.asList(c2, c3));

        estadoRepository.saveAll(Arrays.asList(est1, est2));
        cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));

        Cliente cli1 = new Cliente(
                null,
                "Jonas bernardino",
                "jonas@gmail",
                "102666666",
                TipoCliente.PESSOAFISICA);
        cli1.getTelefone().addAll(Arrays.asList("83 987339527", "83 986401218"));
        Endereco e1 = new Endereco(null, "Rua", "ap 140", "dasda", "123123","Jardin", c1, cli1);

        cli1.getEnderecos().add(e1);

        clienteRepository.saveAll(Arrays.asList(cli1));
        enderecoRepository.saveAll(Arrays.asList(e1));
    }

}
