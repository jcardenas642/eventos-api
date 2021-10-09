/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.eventosapi.repositorios;

import co.edu.unab.sebca.eventosapi.modelos.Evento;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sebca
 */
@Repository
public interface EventoRepository extends CrudRepository<Evento, Long>{
    
    @Query(value =  "SELECT * FROM eventos WHERE cliente_id=?1", nativeQuery = true)
    public ArrayList<Evento> getPorCliente(Long id);
}
