package me.keills;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MessageSenderTest {

    @Mock
    MessageSender messageSender;

    @Test
    void sendMessage() {
        String messageText = "message";
        UserData sender = new UserData();
        UserData receiver = new UserData();

        when(messageSender.sendMessage(messageText,sender,receiver)).thenReturn(new Message(sender,receiver,messageText,new Date()));
        Message message = messageSender.sendMessage(messageText,sender,receiver);

        assertEquals(sender,message.getSender());
        assertEquals(receiver,message.getReceiver());
    }
}