package fr.piman.notification.service;

import fr.piman.notification.domain.NotificationType;
import fr.piman.notification.domain.Recipient;

import javax.mail.MessagingException;
import java.io.IOException;

public interface EmailService {

	void send(NotificationType type, Recipient recipient, String attachment) throws MessagingException, IOException;

}
