package selenium.config;

import com.github.javafaker.Faker;
import selenium.helper.models.UserWebTablesForm;

public class FakeDataProvider {

    Faker faker = new Faker();

    public String generateFakeFullName() {
        return faker.name().firstName();
    }

    public String generateFakeEmail() {
        return faker.internet().emailAddress();
    }

    public String generateFakeAddress() {
        return faker.address().fullAddress();
    }

    public String generateFakePermanentAddress() {
        return faker.address().secondaryAddress();
    }
    public String generateFakePassword(){
        return faker.internet().password(8, 20);
    }
    public UserWebTablesForm generateUserForWebTables(){
        return UserWebTablesForm.builder()
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .email(faker.internet().emailAddress())
                .age(String.valueOf(faker.number().numberBetween(12,60)))
                .salary(String.valueOf(faker.number().numberBetween(5000,100000)))
                .department("Insurance")
                .build();

    }
}
