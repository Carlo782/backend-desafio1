package ufro.isoft.desafio1.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor

public class Sedan extends Automovil{


    private String tipo;

    public Sedan(int id,String marca, int anio, String color, String precio, boolean turbo, String motor,String popularidad, String tipo){
        super( id, marca, anio, color, precio, turbo, motor, popularidad);
        this.tipo = tipo;
    }
}
