package ufro.isoft.desafio1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ufro.isoft.desafio1.model.Automovil;
import ufro.isoft.desafio1.service.GeneratorService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/automoviles")
@CrossOrigin("http://localhost:8081/")
public class InitController {
    @Autowired
    GeneratorService generatorService;

    ArrayList<Automovil> autitosBrum=new ArrayList<>();

    @GetMapping("/listar")
    public List<Automovil> listar(){
       return  this.autitosBrum;
    }


    @RequestMapping("/generar")
    @ResponseBody
    public List<Automovil> generar(@RequestParam("cantidad") int cantidad){
        this.autitosBrum=generatorService.generarAutomoviles(cantidad);
       return  this.autitosBrum;
    }

    @RequestMapping("/filtrar/menores")
    @ResponseBody
    public List<Automovil> filtrarMenores(@RequestParam("precio") int precio) {

        return generatorService.filtrarPrecioMenor(precio,this.autitosBrum);
    }
    @RequestMapping("/filtrar/mayores")
    @ResponseBody
    public List<Automovil> filtrarMayores(@RequestParam("precio") int precio) {
        return generatorService.filtrarPrecioMayor(precio,this.autitosBrum);
    }
}
