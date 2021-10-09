/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.eventosapi.controladores;

import co.edu.unab.sebca.eventosapi.modelos.Evento;
import co.edu.unab.sebca.eventosapi.servicios.EventoService;
import java.util.ArrayList;
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
@RequestMapping("/evento")
public class EventoController {
    
    @Autowired
    private EventoService eventoService;
    
    @GetMapping(path = "/todos")
    public ArrayList<Evento> getTodos(){
        return eventoService.getTodos();
    }
    
    @PostMapping()
    public Evento registrar(@RequestBody Evento miEvento){
        
       return eventoService.crear(miEvento);
    }
    
    @GetMapping(path = "/cliente/{id}")
    public ArrayList<Evento> getPorCliente(@PathVariable("id") Long id){
        return eventoService.getPorCliente(id);
    }
    
}
