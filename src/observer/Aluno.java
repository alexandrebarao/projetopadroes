/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Administrator
 */
public class Aluno implements Observer  {
    private int numeroAluno; 
    Observable umProfessor;
  
    public Aluno(Observable umProfessor) {
        
        this.umProfessor = umProfessor;
        umProfessor.addObserver(this);
    }

    @Override
    public void update(Observable object, Object arg1) {
        
        if (object instanceof Professor) {
            
            Professor a = (Professor) object;
            
            System.out.println("Aluno " + getNumeroAluno() + ": recebi " + a.getTituloConteudo());
        }
    }
    public int getNumeroAluno() {
        return numeroAluno;
    }
    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

}
