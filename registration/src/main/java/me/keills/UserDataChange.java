package me.keills;

public interface UserDataChange {
    boolean changeUserPassword(UserData user, String password);
    boolean changeUserLogin(UserData user, String login);
}
