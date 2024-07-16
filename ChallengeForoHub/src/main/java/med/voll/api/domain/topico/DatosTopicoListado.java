package med.voll.api.domain.topico;

import java.time.LocalDateTime;

public record DatosTopicoListado(Long id, String titulo, String autor, String mensaje, String curso, LocalDateTime fechaCreacion) {

    public DatosTopicoListado(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getAutor(), topico.getMensaje(), topico.getCurso(), topico.getFechaCreacion());
    }
}




