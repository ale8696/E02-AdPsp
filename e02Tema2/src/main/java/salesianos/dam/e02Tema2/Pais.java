package salesianos.dam.e02Tema2;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
@Table(name = "Country")
public class Pais {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;

}
