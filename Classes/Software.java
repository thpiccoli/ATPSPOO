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
public class Software {
    
    private int idSequencial;
    private String nomeSoftware;
    private String fabricanteSoftware;
    private int versaoSoftware;
    private int numeroNotaFiscal;
    private int DataAquisição;
    private int chaveLicenciamento;
    private int validadeChaveLicenciamento;
    private String classificacao;
    private Boolean backupCorporativo;    

    /**
     * @return the idSequencial
     */
    public int getIdSequencial() {
        return idSequencial;
    }

    /**
     * @param idSequencial the idSequencial to set
     */
    public void setIdSequencial(int idSequencial) {
        this.idSequencial = idSequencial;
    }

    /**
     * @return the nomeSoftware
     */
    public String getNomeSoftware() {
        return nomeSoftware;
    }

    /**
     * @param nomeSoftware the nomeSoftware to set
     */
    public void setNomeSoftware(String nomeSoftware) {
        this.nomeSoftware = nomeSoftware;
    }

    /**
     * @return the fabricanteSoftware
     */
    public String getFabricanteSoftware() {
        return fabricanteSoftware;
    }

    /**
     * @param fabricanteSoftware the fabricanteSoftware to set
     */
    public void setFabricanteSoftware(String fabricanteSoftware) {
        this.fabricanteSoftware = fabricanteSoftware;
    }

    /**
     * @return the versaoSoftware
     */
    public int getVersaoSoftware() {
        return versaoSoftware;
    }

    /**
     * @param versaoSoftware the versaoSoftware to set
     */
    public void setVersaoSoftware(int versaoSoftware) {
        this.versaoSoftware = versaoSoftware;
    }

    /**
     * @return the numeroNotaFiscal
     */
    public int getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    /**
     * @param numeroNotaFiscal the numeroNotaFiscal to set
     */
    public void setNumeroNotaFiscal(int numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    /**
     * @return the DataAquisição
     */
    public int getDataAquisição() {
        return DataAquisição;
    }

    /**
     * @param DataAquisição the DataAquisição to set
     */
    public void setDataAquisição(int DataAquisição) {
        this.DataAquisição = DataAquisição;
    }

    /**
     * @return the chaveLicenciamento
     */
    public int getChaveLicenciamento() {
        return chaveLicenciamento;
    }

    /**
     * @param chaveLicenciamento the chaveLicenciamento to set
     */
    public void setChaveLicenciamento(int chaveLicenciamento) {
        this.chaveLicenciamento = chaveLicenciamento;
    }

    /**
     * @return the validadeChaveLicenciamento
     */
    public int getValidadeChaveLicenciamento() {
        return validadeChaveLicenciamento;
    }

    /**
     * @param validadeChaveLicenciamento the validadeChaveLicenciamento to set
     */
    public void setValidadeChaveLicenciamento(int validadeChaveLicenciamento) {
        this.validadeChaveLicenciamento = validadeChaveLicenciamento;
    }

    /**
     * @return the classificacao
     */
    public String getClassificacao() {
        return classificacao;
    }

    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    /**
     * @return the backupCorporativo
     */
    public Boolean getBackupCorporativo() {
        return backupCorporativo;
    }

    /**
     * @param backupCorporativo the backupCorporativo to set
     */
    public void setBackupCorporativo(Boolean backupCorporativo) {
        this.backupCorporativo = backupCorporativo;
    }
    
}
