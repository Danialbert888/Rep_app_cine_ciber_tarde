package pe.eu.cibertec.appcinecibertectarde.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")
public class Estado {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer idestado;
    @Column(name = "descestado")
    private String descestado;
}
