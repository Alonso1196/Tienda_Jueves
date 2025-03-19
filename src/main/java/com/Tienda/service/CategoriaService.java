
package com.Tienda.service;
import com.Tienda.domain.Categoria;
import java.util.List;
/**
 *
 * @author Alons
 */
public interface CategoriaService {
    
    //Se obtiene listado de la BD
    
    public List<Categoria> getCategorias(boolean activos);

}
