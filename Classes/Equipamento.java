/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo2;

/**
 *
 * @author PauloMagno
 */
public class Equipamento {

        
    private int idSequencial;
    private String codigoPatrimonial;// Gerado a partir da junção do IdSequencial e do AnoAquisição.
    private String tipoEquipamento; //Portatil ou fixo
    private String acessorios;
    private String tipoUso; //Coletivo ou individual
    private String acessoRede; //Wireless, radio, fixo
    //Se tipoUso individual
    private int matricula;
    //Se tipoUso Coletivo
    private int CentroCusto;
    private int anoAquisicao; 


    public int getIdSequencial() {
        return idSequencial;
    }

    public void setIdSequencial(int idSequencial) {
        this.idSequencial = idSequencial;
    }

    public String getCodigoPatrimonial() {
        return codigoPatrimonial;
    }

    public void setCodigoPatrimonial(String codigoPatrimonial) {
        this.codigoPatrimonial = codigoPatrimonial;
    }

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }

    public String getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }

    public String getAcessoRede() {
        return acessoRede;
    }

    public void setAcessoRede(String acessoRede) {
        this.acessoRede = acessoRede;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCentroCusto() {
        return CentroCusto;
    }

    public void setCentroCusto(int CentroCusto) {
        this.CentroCusto = CentroCusto;
    }

    public int getAnoAquisicao() {
        return anoAquisicao;
    }

    public void setAnoAquisicao(int anoAquisicao) {
        this.anoAquisicao = anoAquisicao;
    }
}
