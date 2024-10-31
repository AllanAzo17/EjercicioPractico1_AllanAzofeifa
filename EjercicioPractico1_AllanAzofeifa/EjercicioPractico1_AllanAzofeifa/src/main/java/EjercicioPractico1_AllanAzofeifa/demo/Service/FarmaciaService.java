/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EjercicioPractico1_AllanAzofeifa.demo.Service;

import EjercicioPractico1_AllanAzofeifa.demo.domain.Farmacia;
import java.util.List;


public interface FarmaciaService {
    
    // Se obtiene un listado de categorias en un List
    public List<Farmacia> getFarmacia();
    
    // Se obtiene un Categoria, a partir del id de una categoria
    public Farmacia getFarmacia(Farmacia Farmacia);
    
    // Se inserta un nueva categoria si el id de la categoria esta vacio
    //Se actualiza una categoria si el id de la categoria NO esta vacia
    public void save(Farmacia Farmacia);
    
    // Se elimina la categoria que tiene el id pasado por parámetro
    public void delete(Farmacia Farmacia);
    
}
