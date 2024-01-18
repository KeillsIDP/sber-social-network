package me.keills;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProfileViewTest {

    @Mock
    ProfileView profileView;

    @Test
    void showUserProfile() {
        UserData userData = new UserData();
        when(profileView.showUserProfile(userData)).thenReturn(
                new Profile("/","user profile",ProfilePrivacyLevel.PUBLIC,new ArrayList<>(),userData,new ArrayList<>())
        );
        Profile profile = profileView.showUserProfile(userData);
        assertEquals("/",profile.getProfilePicturePath());
        assertEquals("user profile",profile.getBio());
        assertEquals(ProfilePrivacyLevel.PUBLIC,profile.getPrivacyLevel());
        assertEquals(userData,profile.getUser());
    }
}