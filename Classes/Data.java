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
    private List<Colaborador> dataColaborador = new ArrayList<>();
    private Software[] dataSoftware;
    private Departamento[] dataDepartamento;
    private int equipamentoCont = 0;
    private int softwareCont = 0;
    private int colaboradorCont = 0;
    private int departamentoCont = 0;

    
    
    public void addColaborador(Colaborador colaborador, int tipotrabalho) {
        int cont = 0;
       int matricula;
        for (Colaborador c : getDataColaborador()) {
             matricula = cont + tipotrabalho;
            if (c.getMatricula() == matricula) {
                cont++;
            } else {
                colaborador.setMatricula(matricula);
                setDataColaborador(colaborador);
            }

        }
    }
 
    /**
     *
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
     * Sobrecarga 
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

    /**
     * @return the dataColaborador
     */
    public List<Colaborador> getDataColaborador() {
        return dataColaborador;
    }

    /**
     * @param dataColaborador the dataColaborador to set
     */
    public void setDataColaborador(Colaborador dataColaborador) {
        getDataColaborador().add(dataColaborador);
    }

    

    
    
    
}
