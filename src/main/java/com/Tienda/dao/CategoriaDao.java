package com.Tienda.dao;
import com.Tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Alons
 */
public interface CategoriaDao extends JpaRepository <Categoria, Long>  {
    
    

}
