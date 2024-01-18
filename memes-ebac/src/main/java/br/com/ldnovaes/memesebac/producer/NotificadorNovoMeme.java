package br.com.ldnovaes.memesebac.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NotificadorNovoMeme {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${spring.rabbitmq.queue}")
    private String QUEUE_NAME;

    public void enviarMensagem(String mensagem) {
        rabbitTemplate.convertAndSend(QUEUE_NAME, mensagem);
        logger.info(" [x] Mensagem enviada: '" + mensagem + "'");
    }
}
