package ufro.isoft.desafio1.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Automovil {

    private int id;
    
    private String marca;

    private int anio;

    private String color;

    private String precio;

    private boolean turbo;

    private String motor;

    private String popularidad;

}
