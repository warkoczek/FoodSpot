package pl.warkoczewski.foodspot.service.message;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final MessageSource messageSource;

    public MessageService(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
}
