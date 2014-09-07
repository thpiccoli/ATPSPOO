/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo2;

/**
 *
 * @author Diego
 */
public class Colaborador {
    private int matricula;
    private String nome;
    private String localTrabalho; // interno ou externo

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the localTrabalho
     */
    public String getLocalTrabalho() {
        return localTrabalho;
    }

    /**
     * @param localTrabalho the localTrabalho to set
     */
    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }
}
