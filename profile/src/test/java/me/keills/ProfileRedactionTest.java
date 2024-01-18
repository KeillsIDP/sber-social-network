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
class ProfileRedactionTest {

    @Mock
    ProfileRedaction profileRedaction;
    Profile profile = new Profile("/","new profile",ProfilePrivacyLevel.PUBLIC,new ArrayList<>(),null,new ArrayList<>());

    @Test
    void changeBio() {
        String newBio = "updated";
        doAnswer(invocationOnMock -> {
            profile.setBio(newBio);
            return true;
        }).when(profileRedaction).changeBio(profile,newBio);
        profileRedaction.changeBio(profile,newBio);

        assertEquals(profile.getBio(),newBio);
    }

    @Test
    void changeProfilePicture() {
        String picturePath = "/new/path";
        doAnswer(invocationOnMock -> {
            profile.setProfilePicturePath(picturePath);
            return true;
        }).when(profileRedaction).changeProfilePicture(profile,picturePath);
        profileRedaction.changeProfilePicture(profile,picturePath);

        assertEquals(profile.getProfilePicturePath(),picturePath);
    }

    @Test
    void changeProfilePrivacyLevel() {
        doAnswer(invocationOnMock -> {
            profile.setPrivacyLevel(ProfilePrivacyLevel.PUBLIC);
            return true;
        }).when(profileRedaction).changeProfilePrivacyLevel(profile,ProfilePrivacyLevel.PUBLIC);
        profileRedaction.changeProfilePrivacyLevel(profile,ProfilePrivacyLevel.PUBLIC);

        assertEquals(profile.getPrivacyLevel(),ProfilePrivacyLevel.PUBLIC);
    }
}