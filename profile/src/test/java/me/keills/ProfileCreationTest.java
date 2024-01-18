package me.keills;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProfileCreationTest {

    @Mock
    ProfileCreation profileCreation;

    @Test
    void createProfile() {
        UserData userData = new UserData();
        when(profileCreation.createProfile(userData)).thenReturn(new Profile(
                "/","new profile",ProfilePrivacyLevel.PUBLIC,new ArrayList<>(),userData,new ArrayList<>()
        ));
        Profile newProfile = profileCreation.createProfile(userData);
        assertEquals(newProfile.getProfilePicturePath(),"/");
        assertEquals(newProfile.getBio(),"new profile");
        assertEquals(newProfile.getPrivacyLevel(),ProfilePrivacyLevel.PUBLIC);
        assertEquals(newProfile.getUser(),userData);
    }
}