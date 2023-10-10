package enums;

import lombok.Getter;

public enum LoginCredentials {

    johnUserName("John"),
    johnPassword("HelloWorld312!");
    @Getter
    String credential;

    LoginCredentials(String credential){
        this.credential = credential;

    }
}
