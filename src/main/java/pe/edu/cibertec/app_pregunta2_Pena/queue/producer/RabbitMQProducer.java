package pe.edu.cibertec.app_pregunta2_Pena.queue.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RabbitMQProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    private static final String EXCHANGE= "notificacion_exchange";
    private static final String ROUTING_KEY= "notificacion_routing";

    public void enviarMensaje(String mensaje){
        rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, mensaje);
        log.info("Notificacion construida y enviado a RabbitMQ " +mensaje);
    }
}