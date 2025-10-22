package domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import java.time.LocalDateTime;

/**
 *
 * @author kathe
 */
@Entity
@Table(name = "queja")
@Data
public class Queja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCliente;
    private String email;
    private String telefono;

    @Enumerated(EnumType.STRING)
    private TipoQueja tipo;

    private String asunto;

    @NotBlank
    private String mensaje;

    private Boolean tratado;
}
