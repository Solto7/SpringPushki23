package enums;

import lombok.Getter;

public class RegistrationFormEnum {

    @Getter
    String userExample;

    RegistrationFormEnum(String userExample){
        this.userExample = userExample;
    }
}
