package pe.edu.cibertec.app_pregunta2_Pena.queue.consumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RabbitMQConsumer {

    @RabbitListener(queues = "notificacion_queue")
    public void consumirMensaje(String mensaje){
        log.info("Mensaje recibido "+mensaje+", inicio de operación");
    }
}
