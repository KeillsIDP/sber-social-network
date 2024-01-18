package me.keills;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RegistrationTest {
    @Mock
    Registration registration;

    @org.junit.jupiter.api.Test
    void registration() {
        Date currentDate = new Date();
        when(registration.registration("test@mail.org", "123456", "test"))
                .thenReturn(new UserData("test", "123456", "test@mail.org", currentDate));
        UserData user = registration.registration("test@mail.org", "123456", "test");
        assertEquals(user.getEmail(),"test@mail.org");
        assertEquals(user.getPassword(),"123456");
        assertEquals(user.getLogin(),"test");
        assertEquals(user.getRegistrationDate(),currentDate);
    }
}