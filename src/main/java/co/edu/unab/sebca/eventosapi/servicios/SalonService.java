/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.eventosapi.servicios;

import co.edu.unab.sebca.eventosapi.modelos.Salon;
import co.edu.unab.sebca.eventosapi.repositorios.SalonRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sebca
 */
@Service
public class SalonService {
    
    @Autowired
    private SalonRepository salonRepository;
    
    public Optional<Salon> getPorId(Long id){
        return salonRepository.findById(id);
    }
    
    public ArrayList<Salon> getTodos(){
        return (ArrayList<Salon>) salonRepository.findAll();
    }
    
    public Salon crear(Salon miSalon){
        return salonRepository.save(miSalon);
    }
    
}
