package me.keills;

import lombok.*;

import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserData {
    @NonNull
    private String login;
    @NonNull
    private String password;
    @NonNull
    private String email;

    private boolean authorized = false;

    @NonNull
    @Setter(AccessLevel.PRIVATE)
    private Date registrationDate;
}
