
package com.construccion.tuercaTornillo.repository;

import com.construccion.tuercaTornillo.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author nava
 */
public interface UsuariosRepository extends JpaRepository<Usuarios, Long>{
    
}


