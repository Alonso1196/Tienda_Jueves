
package com.Tienda.service.Impl;
import com.Tienda.dao.ProductoDao;
import com.Tienda.domain.Producto;
import com.Tienda.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alons
 */
@Service
public class ProductoServiceImpl implements ProductoService{
    
    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductos(boolean activos) {
        var lista = productoDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }
    
    // Lista de productos con precio entre ordendados por descripción
    // ConsultaAmpliada

    @Override
    @Transactional(readOnly=true)

            public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup) {

                return productoDao.findByPrecioBetweenOrderByDescripcion(precioInf, precioSup);
            }
}

    

