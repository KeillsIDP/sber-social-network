package me.keills;

public interface MessageSender {
    Message sendMessage(String text, UserData sender, UserData receiver);
}
