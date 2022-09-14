package com.pablovass.pojo;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

//import javax.persistence.Id;

/**clase que representa la tabla Cliente
 * @author pablovass
 *
 */
@Data
@Document
public class Cliente {
    @Id
    private String idCli;
    private String nombreCli;
    private String apellidoCli;
    private String identificacionCli;
    private String direccionCli;
    private String telefonoCli;
    private String emailCli;
    @OneToMany(mappedBy = "cliente")
    private Set<Reserva> reserva;

    public Cliente() {}
}
