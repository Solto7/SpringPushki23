package selenium.helper.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {

    private String userName;
    private String userEmail;
    private String userCurrentAddress;
    private String userPermanentAddress;

}