package me.keills;

public interface Authorization {
    boolean authorize(UserData user);
    boolean deauthorize(UserData user);
}
