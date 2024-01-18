package me.keills;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Profile {
    private String profilePicturePath;
    private String bio;
    private ProfilePrivacyLevel privacyLevel;

    @Setter(AccessLevel.PRIVATE)
    private List<Message> messages;

    @Setter(AccessLevel.NONE)
    private UserData user;
}
