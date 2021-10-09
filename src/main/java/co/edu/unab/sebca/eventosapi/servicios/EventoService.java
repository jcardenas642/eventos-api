/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.eventosapi.servicios;

import co.edu.unab.sebca.eventosapi.modelos.Evento;
import co.edu.unab.sebca.eventosapi.modelos.Servicio;
import co.edu.unab.sebca.eventosapi.repositorios.EventoRepository;
import co.edu.unab.sebca.eventosapi.repositorios.ServicioRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sebca
 */
@Service
public class EventoService {
    
    @Autowired
    private EventoRepository eventoRepository;
    
    public Optional<Evento> getPorId(Long id){
        return eventoRepository.findById(id);
    }
    
    public ArrayList<Evento> getTodos(){
        return (ArrayList<Evento>) eventoRepository.findAll();
    }
    
    public Evento crear(Evento miEvento){
        return eventoRepository.save(miEvento);
    }
    
    public ArrayList<Evento> getPorCliente(Long id){
        return eventoRepository.getPorCliente(id);
    }
    
}
