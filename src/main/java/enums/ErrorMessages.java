package enums;

import lombok.Getter;

public abstract class ErrorMessages {

//    loginValidationError("Invalid username or password!");

    @Getter
    String errorMessage;

    ErrorMessages(String errorMessage){
        this.errorMessage=errorMessage;
    }
}
