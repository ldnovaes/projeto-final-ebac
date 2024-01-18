package br.com.ldnovaes.usuarioebac.consumer;

import br.com.ldnovaes.usuarioebac.service.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConsumer {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private UsuarioService service;

    public UsuarioConsumer(UsuarioService service) {
        this.service = service;
    }

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload String mensagem) {
        logger.info(mensagem);
    }
}
