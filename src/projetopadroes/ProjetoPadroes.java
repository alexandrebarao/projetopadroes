/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadroes;

import adapter.CarregadorComAdaptador;
import adapter.CaboMicroUSB;
import adapter.CarregadorUSB;
import adapter2.AudioPlayer;
import command.Comando;
import command.Executor;
import command.Servidor;
import command.SistemaDetecaoIntrusos;
import composto.Composto;
import composto.Simples;
import decorator.Contacto;
import decorator.ContactoCidadao;
import decorator.ContactoEmpresa;
import decorator.Empresa;
import decorator.Pessoa;
import facade.TarifadorFacade;
import factory.Fabrica;
import factory.Motor;
import java.util.ArrayList;
import java.util.List;
import observer.Aluno;
import observer.Professor;
import singleton.AppDespertador;
import singleton.Singleton;
import state.ContextoEstado;
import state.ProdutoEncomendado;
import state.ProdutoEnviado;
import state.ProdutoRecebido;
import strategy.Contexto;
import strategy.MensalidadeAlunoVip;
import strategy.MensalidadeClienteEmpresa;
import strategy.MensalidadeClienteParticular;
import strategy.MensalidadeClienteParticularVip;
import template.CartaoCredito;
import template.CartaoCreditoEmpresa;
import template.CartaoCreditoParticular;

/**
 *
 * @author Administrator
 */
public class ProjetoPadroes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Demonstração Singleton
        Singleton instance = Singleton.getInstance();
        AppDespertador meuDespertador = AppDespertador.getIntanciaApp(); 
        meuDespertador.setNumeroSerie("SN10001");
        System.out.println(meuDespertador.getNumeroSerie());
        AppDespertador mesmoDespertador = AppDespertador.getIntanciaApp(); 
        System.out.println(mesmoDespertador.getNumeroSerie());
         */
        /*
        Demonstração composto
        Simples t1 = new Simples();
        t1.setNome("Q");
        Simples t2 = new Simples();
        t2.setNome("W");
        Simples t3 = new Simples();
        t3.setNome("E");
        Simples t4 = new Simples();
        t4.setNome("R");
        Simples t5 = new Simples();
        t5.setNome("T");
        Composto tec1 = new Composto();
        tec1.setNome("Genius");
        tec1.adiciona(t1);
        tec1.adiciona(t2);
        tec1.adiciona(t3);
        tec1.adiciona(t4);
        tec1.adiciona(t5);
        Composto pc = new Composto();
        pc.setNome("Mac");
        Simples monitor = new Simples();
        monitor.setNome("ASUS");
        pc.adiciona(monitor);
        pc.adiciona(tec1);
        pc.executa();
         */
        /*
        Demonstração Observer
        Professor p = new Professor();
        Aluno a1 = new Aluno(p);
        Aluno a2 = new Aluno(p);
        Aluno a3 = new Aluno(p);
        a1.setNumeroAluno(1);
        a2.setNumeroAluno(2);
        a3.setNumeroAluno(3);
        p.publicacaoNovoConteudo("primeira aula");
        p.deleteObserver(a2);
        p.publicacaoNovoConteudo("segunda aula");
        p.addObserver(a2);
        p.publicacaoNovoConteudo("terceira aula");
         */
        /*
        Demonstração Factory
        Fabrica f = new Fabrica();
        Motor motor1 = f.getAutomovel("GASOLINA");
        motor1.ligar();
        Motor motor2 = f.getAutomovel("GASOLEO");
        motor2.ligar();
        Motor motor3 = f.getAutomovel("ELETRICO");
        motor3.ligar();
         */
        /*
        demonstração adapter (com mecanismo de herança)
        CarregadorUSB u = new CarregadorUSB();
        u.ligar();
        System.out.println("-----------------------------------");
        CaboMicroUSB p = new CaboMicroUSB();
        CarregadorComAdaptador a = new CarregadorComAdaptador(p);
        a.ligar();
         */
        /*
        Demonstração Adapter
        // Bloco de código deste exemplo Adapter de;
        // https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
         */
        /*
        demonstração do padrão decorator
        Contacto p  = new Pessoa("Filipe", "111222333");
        Contacto cidadao = new ContactoCidadao(new Pessoa("Warley", "444555777"));
        p.informacao();
        cidadao.informacao();
        Contacto e  = new Empresa("XPTO S.A.", "500300200");
        Contacto empresa = new ContactoEmpresa(new Empresa("XYZ S.A", "500200100"));
        e.informacao();
        empresa.informacao();
         */
        
        /*
        // Demonstração do Padrão Facade
        TarifadorFacade tarifador = new TarifadorFacade();
         
        System.out.println(tarifador.pagamentoMensalParticular());
        System.out.println(tarifador.pagamentoMensalEmpresa());
        */
        
        /*
        // Demonstraçao do Padrão Strategy
        Contexto contexto;
        
        contexto = new Contexto(new MensalidadeClienteParticular());
        System.out.println(contexto.executaEstrategia(500));
        
        contexto = new Contexto(new MensalidadeClienteEmpresa());
        System.out.println(contexto.executaEstrategia(500));
        
        contexto = new Contexto(new MensalidadeClienteParticularVip());
        System.out.println(contexto.executaEstrategia(500));
        
        contexto = new Contexto(new MensalidadeAlunoVip());
        System.out.println(contexto.executaEstrategia(500));
        */
        
        /*
        // Demonstração do Padrão State
        ContextoEstado contexto = new ContextoEstado();
        
        
        ProdutoEncomendado estadoInicial = new ProdutoEncomendado();
        estadoInicial.executaAcao(contexto);
        System.out.println(contexto.getEstado().toString());


        ProdutoEnviado estadoIntermedio = new ProdutoEnviado();
        estadoIntermedio.executaAcao(contexto);
        System.out.println(contexto.getEstado().toString());
        
        
        ProdutoRecebido estadoFinal = new ProdutoRecebido();
        estadoFinal.executaAcao(contexto);
        System.out.println(contexto.getEstado().toString());
        */ 
        
        
        /*
        // Demonstraçao do padrão Command
        List<Comando> listaComandos = new ArrayList<>();
        listaComandos.add(new Servidor( "Ligar servidor" ));
        listaComandos.add(new Servidor( "Ligar firewall" ));
        listaComandos.add(new SistemaDetecaoIntrusos( "Analisar tráfego irregular no servidor" ));
        listaComandos.add(new SistemaDetecaoIntrusos( "Registar logs de análise de tráfego" ));
        listaComandos.add(new SistemaDetecaoIntrusos( "Analisar firewall" ));
        listaComandos.add(new SistemaDetecaoIntrusos( "Registar logs de análise de firewall" ));
        listaComandos.add(new Servidor( "Fazer backup do sistema" ));
        listaComandos.add(new Servidor( "Atualizar Sistema Operativo" ));
        listaComandos.add(new Servidor( "Reiniciar servidor" ));
        
        Executor executorDeTarefas = new Executor(); 
        executorDeTarefas.executa(listaComandos);
         */
        
        
        // Demonstração do padrão Template
        
        
        CartaoCredito cartao; 
        
        cartao = new CartaoCreditoParticular(); 
        cartao.entregarCartao();
        
        cartao = new CartaoCreditoEmpresa(); 
        cartao.entregarCartao();
        
        
        
    }
    
}
