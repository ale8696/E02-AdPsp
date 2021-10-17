package salesianos.dam.e02Tema2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Table(name = "Product")
public class Producto {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    @Lob
    private String imagen, descripcion;
    private double precio;


}
