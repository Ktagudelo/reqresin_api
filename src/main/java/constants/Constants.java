package constants;

import lombok.Data;

@Data
public class Constants {

    private static final String URL_BASE_USER = "https://reqres.in";
    private static final String GET_USERS = "/api/users?page=2";
    public static int CODE=200;

    public static String getUrlBaseUser() {
        return URL_BASE_USER;
    }
    public static String getUser2() {
        return GET_USERS;
    }
    public static int getCodeUser() {
        return CODE;
    }
}
