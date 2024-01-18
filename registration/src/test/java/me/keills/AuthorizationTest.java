package me.keills;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AuthorizationTest {

    @Mock
    Authorization authorization;

    UserData user = new UserData("test", "123456", "test@mail.org", new Date());

    @Test
    void authorize_User_Authorized() {
        user.setAuthorized(true);
        when(authorization.authorize(user)).thenReturn(false);
        assertFalse(authorization.authorize(user));
    }

    @Test
    void authorize_User_Not_Authorized() {
        user.setAuthorized(false);
        when(authorization.authorize(user)).thenReturn(true);
        assertTrue(authorization.authorize(user));
    }

    @Test
    void deauthorize_User_Authorized() {
        user.setAuthorized(true);
        when(authorization.deauthorize(user)).thenReturn(true);
        assertTrue(authorization.deauthorize(user));
    }

    @Test
    void deauthorize_User_Not_Authorized() {
        user.setAuthorized(false);
        when(authorization.deauthorize(user)).thenReturn(false);
        assertFalse(authorization.deauthorize(user));
    }
}