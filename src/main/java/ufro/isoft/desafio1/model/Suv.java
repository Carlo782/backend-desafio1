package ufro.isoft.desafio1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Suv extends Automovil{
 
   
    private String tipo;
   
    private boolean sunroof;

    public Suv(int id,String marca, int anio, String color, String precio, boolean turbo, String motor,String popularidad, String tipo, boolean sunroof){
        super(id,marca, anio, color, precio, turbo, motor, popularidad);
        this.tipo = tipo;
        this.sunroof = sunroof;
    }
}
