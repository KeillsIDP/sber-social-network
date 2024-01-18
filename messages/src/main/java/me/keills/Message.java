package me.keills;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Setter
@Getter
public class Message {
    private UserData sender;
    private UserData receiver;
    private String text;
    @Setter(AccessLevel.PRIVATE)
    private Date sendTime;
}
