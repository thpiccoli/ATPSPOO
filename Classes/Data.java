/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo2;

import java.util.ArrayList;
import java.util.List;

/**
 *  
 * @author Diego Itacolomy
 */
public class Data {
    
       
    private final List<Equipamento> dataEquipamento = new ArrayList<>();
    private Software[] dataSoftware;
    private Colaborador[] dataColaborador;
    private Departamento[] dataDepartamento;
    private int equipamentoCont = 0;
    private int softwareCont = 0;
    private int colaboradorCont = 0;
    private int departamentoCont = 0;

    /**
     * @Author Diego Itacolomy
     * @Date 06/09/2014
     * @versao 1
     * @param equipamento - enviar o objeto do tipo equipamento para ser cadastrado //Diego Itacolomy    
     */
    public void addEquipamento (Equipamento equipamento){
        int cont =1;
        for(Equipamento eq : getDataEquipamento()){
            if(eq.getAnoAquisicao() == equipamento.getAnoAquisicao()){
                cont++;
            }
        }
        if(cont < 10){
            equipamento.setCodigoPatrimonial(equipamento.getAnoAquisicao()+"00"+cont); //Seta codigo patrimonial
        }else if (cont < 100){
            equipamento.setCodigoPatrimonial(equipamento.getAnoAquisicao()+"0"+cont); //Seta codigo patrimonial
        }else{
            equipamento.setCodigoPatrimonial(equipamento.getAnoAquisicao()+""+cont); //Seta codigo patrimonial
        }
        equipamento.setIdSequencial(getEquipamentoCont());
        setDataEquipamento(equipamento);
        setEquipamentoCont();        
    }   
    
    
     /**
     * @Author Diego Itacolomy
     * @Date 06/09/2014
     * @versao 1 
     * @param id - enviar o numero do ID do equipamento que devera ser encontrado //Diego Itacolomy
     * @return the dataEquipamento - retorna um objeto do tipo equipamento que corresponda o ID do parametro enviado.  //Diego Itacolomy
     */
    public Equipamento getDataEquipamento(int id) {
        for(int i = 0; i < getDataEquipamento().size(); i++) {
            Equipamento equip = getDataEquipamento().get(i);
            if(equip.getIdSequencial() == id){
                return equip;
            }
        }        
        return null;
    }
    
    /**
     * @return the dataEquipamento
     */
    public List<Equipamento> getDataEquipamento() {
        return dataEquipamento;
    }
    
        
    /**
     * @Author Diego Itacolomy
     * @Date 07/09/2014
     * @versao 1
     * @return the dataEquipamento - como array. //Diego Itacolomy
     */
    public Equipamento[] getDataEquipamentoArray() {
        
        Equipamento []equipamento = new Equipamento[getDataEquipamento().size()];
        getDataEquipamento().toArray(equipamento);
        return equipamento;    
        
    }
    
    
    public void setDataEquipamento(Equipamento a) {
        getDataEquipamento().add(a);
        
    }

 
    public Software getDataSoftware(int i) {
        return dataSoftware[i];
    }

    /**
     * @param dataSoftware the dataSoftware to set
     * @param i
     */
    public void setDataSoftware(Software dataSoftware, int i) {
        this.dataSoftware[i] = dataSoftware;
    }

    /**
     * @param i
     * @return the dataColaborador
     */
    public Colaborador getDataColaborador(int i) {
        return dataColaborador[i];
    }

    /**
     * @param dataColaborador the dataColaborador to set
     * @param i
     */
    public void setDataColaborador(Colaborador dataColaborador, int i) {
        this.dataColaborador[i] = dataColaborador;
    }

    /**
     * @param i
     * @return the dataDepartamento
     */
    public Departamento getDataDepartamento(int i) {
        return dataDepartamento[i];
    }

    /**
     * @param dataDepartamento the dataDepartamento to set
     * @param i
     */
    public void setDataDepartamento(Departamento dataDepartamento, int i) {
        this.dataDepartamento[i] = dataDepartamento;
    }

    /**
     * @return the equipamentoCont
     */
    public int getEquipamentoCont() {
        return equipamentoCont;
    }

    /**
     */
    public void setEquipamentoCont() {
        this.equipamentoCont++;
    }

    /**
     * @return the softwareCont
     */
    public int getSoftwareCont() {
        return softwareCont;
    }

    /**
     */
    public void setSoftwareCont() {
        this.softwareCont++;
    }

    /**
     * @return the colaboradorCont
     */
    public int getColaboradorCont() {
        return colaboradorCont;
    }

    /**
     */
    public void setColaboradorCont() {
        this.colaboradorCont++;
    }

    /**
     * @return the departamentoCont
     */
    public int getDepartamentoCont() {
        return departamentoCont;
    }

    /**
     */
    public void setDepartamentoCont() {
        this.departamentoCont++;
    }

    

    
    
    
}
