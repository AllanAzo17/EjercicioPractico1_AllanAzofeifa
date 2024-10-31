/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_AllanAzofeifa.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="farmacia")
public class Farmacia implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_farmacia")
    private Long idFarmacia;
    private String descripcion;
    private String rutaImagen;
    

    public Farmacia() {
    }

    public Farmacia(Long idFarmacia, String descripcion, String rutaImagen) {
        this.idFarmacia = idFarmacia;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
    }

    

   
    
}
