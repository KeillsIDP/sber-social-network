package me.keills;

public interface ProfileRedaction {
    boolean changeBio(Profile profile, String newBio);
    boolean changeProfilePicture(Profile profile, String picturePath);
    boolean changeProfilePrivacyLevel(Profile profile, ProfilePrivacyLevel level);
}
