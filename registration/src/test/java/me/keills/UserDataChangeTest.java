package me.keills;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserDataChangeTest {

    @Mock
    UserDataChange userDataChange;

    @Test
    void changeUserPassword() {
        UserData userData = new UserData("test","123456","test",new Date());
        doAnswer(invocationOnMock -> {
            userData.setPassword("222222");
            return true;
        }).when(userDataChange).changeUserPassword(userData,"222222");
        userDataChange.changeUserPassword(userData,"222222");
        assertEquals(userData.getPassword(),"222222");
    }

    @Test
    void changeUserLogin() {
        UserData userData = new UserData("test","123456","test",new Date());
        doAnswer(invocationOnMock -> {
            userData.setLogin("testNew");
            return true;
        }).when(userDataChange).changeUserLogin(userData,"testNew");
        userDataChange.changeUserLogin(userData,"testNew");
        assertEquals(userData.getLogin(),"testNew");
    }
}