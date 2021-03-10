/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Ruben
 */
public class Estanque {
    private int idEstanque;
    private String nomEstan;
    private String tipoPez;
    private float dimen;
    
    //Métodos constructores
    public Estanque(){
        idEstanque=-1;
        nomEstan = "";
        tipoPez = "";
        dimen = -1;
    } 
        
    public Estanque(int idEstanque, String nomEstan, String tipoPez, float dimen) {
        this.idEstanque = idEstanque;
        this.nomEstan = nomEstan;
        this.tipoPez = tipoPez;
        this.dimen = dimen;
    }
    
    
    //Métodos analizadores
    public int getIdEstanque() {
        return idEstanque;
    }

    public String getNomEstan() {
        return nomEstan;
    }

    public String getTipoPez() {
        return tipoPez;
    }

    public float getDimen() {
        return dimen;
    }
    
    public float getCapacidadA(){
        float capacidad=0;   
        if(tipoPez.equals("Cachama")){
            capacidad=4*dimen;
        }
        else if(tipoPez.equals("Tilapia")){
            capacidad=5*dimen;
        }
        else{
            capacidad=6*dimen;
        }
        return capacidad;
    }
    
    public float getCantidadA( ){    
        float capacidad=getCapacidadA();
        float undMil=capacidad/1000;
        if(undMil<1)
            return 4;
        else
            return undMil*4;
    }
    
    //Métodos modificadores
    public void setIdEstanque(int idEstanque) {
        this.idEstanque = idEstanque;
    }

    public void setNomEstan(String nomEstan) {
        this.nomEstan = nomEstan;
    }

    public void setTipoPez(String tipoPez) {
        this.tipoPez = tipoPez;
    }

    public void setDimen(float dimen) {
        this.dimen = dimen;
    }        
    
    //Hola Mundo
    //Prueba Isa
    //Prueba Daniel
    //Castigo divino
    
}
