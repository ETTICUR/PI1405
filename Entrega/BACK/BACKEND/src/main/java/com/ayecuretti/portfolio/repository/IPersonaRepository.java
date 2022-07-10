
package com.ayecuretti.portfolio.repository;

import com.ayecuretti.portfolio.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aye
 */
@Repository
public interface IPersonaRepository extends JpaRepository <Persona,long> { 

    /**
     *
     * @return
     */
    @Override
    public List<Persona> findAll();

    public Persona fyndById(Long id);
}
