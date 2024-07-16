package med.voll.api.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DatosTopicoRegistro(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String curso) {
}




