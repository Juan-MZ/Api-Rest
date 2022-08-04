package co.unicauca.apirestful.product.access.dao;

import org.springframework.data.repository.CrudRepository;
import co.unicauca.apirestful.product.domain.entity.Product;

/**
 * Interfaces DAO de productos
 * 
 * @author JuanMZ
 *
 */
public interface IProductDao extends CrudRepository<Product, Long> {

}