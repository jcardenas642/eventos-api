/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.eventosapi.controladores;

import co.edu.unab.sebca.eventosapi.modelos.Cliente;
import co.edu.unab.sebca.eventosapi.modelos.Salon;
import co.edu.unab.sebca.eventosapi.modelos.Servicio;
import co.edu.unab.sebca.eventosapi.servicios.ClienteService;
import co.edu.unab.sebca.eventosapi.servicios.SalonService;
import co.edu.unab.sebca.eventosapi.servicios.ServicioService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sebca
 */
@RestController
@CrossOrigin
@RequestMapping("/salon")
public class SalonController {
    
    @Autowired
    private SalonService salonService;
    
    @GetMapping( path = "/{id}")
    public Optional<Salon> getPorId(@PathVariable("id") Long id){
        return salonService.getPorId(id);
    }
    
    @GetMapping(path = "/todos")
    public ArrayList<Salon> getTodos(){
        return salonService.getTodos();
    }
    
    @PostMapping()
    public Salon registrar(@RequestBody Salon miSalon){
        return salonService.crear(miSalon);
    }
    
}
