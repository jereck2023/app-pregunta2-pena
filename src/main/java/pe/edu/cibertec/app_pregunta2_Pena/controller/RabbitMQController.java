package pe.edu.cibertec.app_pregunta2_Pena.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_pregunta2_Pena.queue.producer.RabbitMQProducer;

@RequiredArgsConstructor
@RestController
public class RabbitMQController {
    private final RabbitMQProducer rabbitMQProducer;

    @GetMapping("/enviar")
    public String enviarMensaje(@RequestParam String mensaje){
        rabbitMQProducer.enviarMensaje(mensaje);
        return "Notificación de contenido nuevo enviado a RabbitMQ: " + mensaje;
    }
}
