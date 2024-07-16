package med.voll.api.domain.topico;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "topicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String autor;

    @NotBlank
    private String mensaje;

    @NotBlank
    private String curso;

    private LocalDateTime fechaCreacion;

    private boolean activo = true;

    public Topico(String titulo, String autor, String mensaje, String curso, LocalDateTime fechaCreacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.mensaje = mensaje;
        this.curso = curso;
        this.fechaCreacion = fechaCreacion;
    }

    public void actualizarDatos(DatosTopicoActualizar datosTopicoActualizar) {
        if (datosTopicoActualizar.titulo() != null) {
            this.titulo = datosTopicoActualizar.titulo();
        }
        if (datosTopicoActualizar.mensaje() != null) {
            this.mensaje = datosTopicoActualizar.mensaje();
        }

    }

    public void desactivarTopico() {
        this.activo = false;
    }
}