/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadroes;

import composto.Composto;
import composto.Simples;
import observer.Aluno;
import observer.Professor;
import singleton.AppDespertador;
import singleton.Singleton;

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
    }
    
}
